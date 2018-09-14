package cn.tedu.store.service;

import cn.tedu.store.bean.User;

public interface UserService {
    /**
     * 添加用户信息
     *
     * @param user UserBean对象
     */
    void addUser(User user);

    /**
     * 验证用户邮箱
     *
     * @param email 用户邮箱
     * @return true:邮箱已注册 false:邮箱未注册
     */
    boolean checkEmail(String email);

    /**
     * 验证电话是否存在
     *
     * @param phone 用户电话
     * @return true:电话已存在 false:电话未存在
     */
    boolean checkPhone(String phone);

    /**
     * 验证用户名是否已注册
     *
     * @param username 用户名
     * @return true:用户名已注册 false:用户名未注册
     */
    boolean checkUsername(String username);

    /**
     * 用户登录
     *
     * @param username 用户名
     * @param password 用户密码
     * @return 返回用户登录的信息 <br>
     * 登录成功:返回用户信息 <br>
     * 登录不成功：密码错误or用户名错误 <br>
     */
    User login(String username, String password);

    /**
     * 修改立马
     *
     * @param id          用户ID
     * @param oldPassword 用户旧密码
     * @param newPassword 用户新密码
     */
    void changePassword(Integer id, String oldPassword, String newPassword);

    /**
     * 修改用户信息
     *
     * @param id 用户id
     * @param username 用户名
     * @param gender 用户性别
     * @param email 用户邮箱
     * @param phone 用户电话
     */
    void changeUser(Integer id, String username, Integer gender, String email, String phone);

    /**
     * 根据用户id查询用户信息
     *
     * @param id 用户id
     * @return 返回用户信息
     */
    User getUserById(Integer id);

    /**
     * 修改用户头像
     *
     * @param id 用户id
     * @param image 图片地址
     */
    void updateImage(Integer id,String image);
}
