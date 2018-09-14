package cn.tedu.store.service;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import cn.tedu.store.bean.User;
import cn.tedu.store.mapper.UserMapper;
import cn.tedu.store.service.ex.PasswordNotFoundException;
import cn.tedu.store.service.ex.UserNotFoundException;
import cn.tedu.store.service.ex.UsernameAlreadyExistException;

@Service
public class UserServiceImpl implements UserService {
    @Resource
    private UserMapper mapper;

    /**
     * 加入用户
     */
    public void addUser(User user) {
        //调用持久层方法
        User user1 = mapper.selectByName(user.getUsername());
        /**
         * 对返回结果进行判断，如果用户名为空，调用持久层的创建用户方法<br>
         * 如果用户名不为空，抛出自定义异常(用户名已存在)
         */
        if (user1 == null) {
            mapper.insertUser(user);
        }
        //如果
        if (user1 != null) {
            throw new UsernameAlreadyExistException("用户名已存在！");
        }
    }

    /**
     * 验证邮箱
     */
    public boolean checkEmail(String email) {
        //调用持久层的方法
        int emailInSql = mapper.selectByEmail(email);
        /**
         * 对获取的eamil进行判断
         */

        if (emailInSql > 0){
            return true;
        }else {
            return false;
        }
    }

    /**
     * 验证手机
     */
    public boolean checkPhone(String phone) {
        int phoneInSql = mapper.selectByPhone(phone);
        /**
         * 对获取的手机号进行判断
         */

        if (phoneInSql > 0){
            return true;
        } else {
            return false;
        }
    }

    /**
     * 验证用户名
     */
    public boolean checkUsername(String username) {
        User usernameInSql = mapper.selectByName(username);
        if (usernameInSql != null){
            return true;
        } else {
            return false;
        }
    }

    /**
     * 用户登录
     */
    public User login(String username, String password) {
        User user = mapper.selectByName(username);
        if (user == null) {
            throw new UserNotFoundException("账号不正确");
        } else {
            if (user.getPassword().equals(password)) {
                return user;
            } else {
                throw new PasswordNotFoundException("密码不正确");
            }
        }
    }

    /**
     * 修改用户密码
     */
    public void changePassword(Integer id, String oldPassword,
                               String newPassword) {
        //取得数据库中的用户数据
        User user = mapper.selectById(id);
        //进行判断，如果user不为空
        if (user!=null){
            //从user内取出密码判断密码是否正确
            if (user.getPassword().equals(oldPassword)){
                User user1 = new User();
                user1.setId(id);
                user1.setPassword(newPassword);
                System.out.println(user1);
                mapper.updateUser(user1);
            }else{
                throw new PasswordNotFoundException("密码不正确");
            }
        } else {
            throw new UserNotFoundException("用户名不存在");
        }

    }

    /**
     * 修改用户信息
     * @param id 用户id
     * @param username 用户名
     * @param gender 用户性别
     * @param email 用户邮箱
     * @param phone 用户电话号码
     */
    @Override
    public void changeUser(Integer id, String username, Integer gender, String email,
                           String phone) {
        //1. 调用持久层的方法,通过id返回user对象
        User user1 = mapper.selectById(id);
        //2. 验证当前用户id是否存在，不为null表示存在
        if (user1!=null) {
            //2.2 如果用户存在，验证用户名是否正确
            User user2 = mapper.selectByName(username);
            System.out.println(username.equals(user1.getUsername()));
            if(user2!=null && !username.equals(user1.getUsername())) {
                //2.3 用户名不为null表示存在，并且，和页面输入的用户名相同，抛出用户名异常
                throw new UsernameAlreadyExistException("用户名已存在");
            } else {
                //2.4 如果用户名未使用，那么修改用户名
                User user = new User();
                user.setUsername(username);
                user.setGender(gender);
                user.setEmail(email);
                user.setPhone(phone);
                System.out.println(user);
                mapper.updateUser(user);
            }
        } else {
            //3. 抛出用户名未存在的异常，表示用户不存在
            throw new UserNotFoundException("用户不存在");
        }
    }

    @Override
    public User getUserById(Integer id) {
        User user = mapper.selectById(id);
        return user;
    }

    @Override
    public void updateImage(Integer id, String image) {
        mapper.updateImage(id,image);
    }

}
