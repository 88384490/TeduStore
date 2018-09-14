package cn.tedu.store.controller;

import cn.tedu.store.bean.User;

import javax.servlet.http.HttpSession;

/**
 * 管理用户的id
 */
public class BeanController {
    /**
     * 获取用户的id
     * @param session
     * @return
     */
    public Integer getId(HttpSession session){
        //从session中获取id
        Integer id = null;
        User user = (User) session.getAttribute("user");
        if (user!=null){
            id = user.getId();
        }
        return id;
    }
}
