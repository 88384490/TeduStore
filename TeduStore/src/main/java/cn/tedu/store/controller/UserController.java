package cn.tedu.store.controller;

import cn.tedu.store.bean.ResponseResult;
import cn.tedu.store.bean.User;
import cn.tedu.store.service.UserServiceImpl;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import javax.annotation.Resource;
import javax.servlet.http.HttpSession;
import java.io.File;
import java.io.IOException;

@Controller
@RequestMapping("/user")
public class UserController extends BeanController {
    @Resource
    private UserServiceImpl service;

    /**
     * 显示注册的页面
     */
    @RequestMapping("/showRegister.do")
    public String showRegister() {
        return "register";
    }

    /**
     * 显示登录的页面
     */
    @RequestMapping("/showLogin.do")
    public String showLogin() {
        return "login";
    }

    /**
     * 验证用户名是否已注册
     *
     * @param username
     */
    @RequestMapping("/checkUsername.do")
    @ResponseBody
    public ResponseResult<Void> checkUsername(String username) {
        ResponseResult<Void> rr = null;
        boolean b = service.checkUsername(username);
        if (b) {
            // 如果b返回true，定义状态码为0，返回信息：用户名已注册
            rr = new ResponseResult<Void>(0, "用户名已注册");
        } else {
            // 如果b返回false，定义状态吗为1，返回信息：用户名可使用
            rr = new ResponseResult<Void>(1, "用户名可使用");
        }
        return rr;
    }

    /**
     * 验证邮箱是否已注册
     *
     * @param email
     */
    @RequestMapping("/checkEmail.do")
    @ResponseBody
    public ResponseResult<Void> checkEmail(String email) {
        ResponseResult<Void> rr = null;// 申明rr对象
        boolean b = service.checkEmail(email);// 将service的结果返回给b
        if (b) {
            // 如果b返回true，定义状态码为0，返回信息：邮箱已注册
            rr = new ResponseResult<Void>(0, "邮箱已注册");
        } else {
            // 如果b返回false，定义状态码为1，返回信息：邮箱可使用
            rr = new ResponseResult<Void>(1, "邮箱可使用");
        }
        return rr;
    }

    /**
     * 验证手机是否已注册
     *
     * @param phone
     */
    @RequestMapping("/checkPhone.do")
    @ResponseBody
    public ResponseResult<Void> checkPhone(String phone) {
        ResponseResult<Void> rr = null;
        boolean b = service.checkPhone(phone);
        if (b) {
            rr = new ResponseResult<Void>(0, "手机已注册");
        } else {
            rr = new ResponseResult<Void>(1, "手机未注册");
        }
        return rr;
    }

    /**
     * 异步提交注册
     *
     * @param username
     * @param password
     */

    @RequestMapping("/register.do")
    @ResponseBody
    public ResponseResult<Void> register(
            @RequestParam("uname") String username,
            @RequestParam("upwd") String password, String email,
            String phone) {
        User user = new User();
        user.setUsername(username);
        user.setPassword(password);
        user.setEmail(email);
        user.setPhone(phone);
        System.out.println(user);
        ResponseResult<Void> rr = null;
        service.addUser(user);
        try {
            rr = new ResponseResult<Void>(1, "添加数据成功");
        } catch (RuntimeException ex) {
            rr = new ResponseResult<Void>(0, ex.getMessage());
        }
        return rr;
    }

    /**
     * 异步提交登录
     *
     * @param username
     * @param password
     * @param session
     */
    @RequestMapping("/login.do")
    @ResponseBody
    public ResponseResult<Void> login(String username,
                                      String password, HttpSession session) {
        ResponseResult<Void> rr = null;
        try {
            User user = service.login(username, password);
            session.setAttribute("user", user);
            rr = new ResponseResult<Void>(1, "登录成功");
        } catch (RuntimeException e) {
            rr = new ResponseResult<Void>(0, e.getMessage());
        }
        return rr;
    }

    /**
     * 退出登录
     */
    @RequestMapping("/exit.do")
    public String exit(HttpSession session) {
        // 1. 使session失效
        session.invalidate();
        // 2. 重定向到index.jsp
        return "redirect:../user/showLogin.do";
    }

    /**
     * 跳转到用户密码界面
     *
     * @return personal_password:用户密码页面
     */
    @RequestMapping("/showPassword.do")
    public String showPassword() {
        return "personal_password";
    }

    /**
     * 用户修改密码
     *
     * @param newPassword 新密码
     * @param oldPassword 旧密码
     * @param session     session节点
     * @return
     */
    @RequestMapping("/updatePassword.do")
    @ResponseBody
    public ResponseResult<Void> updatePassword(
            String newPassword, String oldPassword,
            HttpSession session
    ) {
        ResponseResult<Void> rr = null;
        try {
            //1. 建立rr的实例
            User user = new User();
            int id = Integer.parseInt(session.getId());
            //2. 调用业务层方法
            service.changePassword(id, oldPassword, newPassword);
            //3. 返回状态：修改密码成功
            rr = new ResponseResult<Void>(1, "密码修改成功");
        } catch (RuntimeException e) {
            rr = new ResponseResult<Void>(0, e.getMessage());
        }
        return rr;
    }

    /**
     * 跳转到用户信息页面
     *
     * @return 用户信息页面
     */
    @RequestMapping("/showPersonpage.do")
    public String showPersonpage() {
        return "personpage";
    }

    /**
     * 上传头像图片并修改数据库image字段
     *
     * @param file 图片文件
     * @return 返回创建成功与否
     */
    @RequestMapping("/getImage.do")
    @ResponseBody
    public ResponseResult<Void> getImage(MultipartFile file, HttpSession session) throws Exception {
        //1. 创建rr实例
        ResponseResult<Void> rr = null;
        //2. 创建状态1 message:"上传成功"
        /**
         * 获取当前应用的真实路径
         */
        String path = session.getServletContext().getRealPath("/");
        System.out.println(path);
        rr = new ResponseResult<Void>(1, "上传成功");
        file.transferTo(
            new File(
                path,
                "/upload/" + file.getOriginalFilename()
            )
        );
        service.updateImage(
            this.getId(session),
            "/upload/" + file.getOriginalFilename()
        );
        return rr;
    }


}
