package cn.tedu.store.mapper;

import cn.tedu.store.bean.User;
import org.apache.ibatis.annotations.Param;

/**
 * teduStore of User interface 学子商城用户管理接口
 *
 * @author zhouyi
 */
public interface UserMapper {
    // 插入一条用户信息
    /**
     * 添加用户信息
     *
     * @param user
     */
    void insertUser(User user);
    //根据用户id查询，把结果封装成User对象

    /**
     * 根据用户ID查询数据库
     *
     * @param id
     * @return User对象，如果查到id存在，就会返回User对象。如果没有查到，返回为null
     */
    User selectById(Integer id);

    // 根据用户名查询，把结果封装成User对象
    /***
     * 根据用户名查询数据库
     *
     * @param username
     * @return User对象 如果查到username存在，就会返回User对象。 如果没有查到，返回为null。
     */
    User selectByName(String username);

    //根据邮箱查询，返回邮箱的数量
    /**
     * 根据邮箱查询数据库
     *
     * @param email
     * @return Integer对象，如果查到email存在，会返回1。如果没有查到，返回null。
     */
    Integer selectByEmail(String email);

    /**
     * 根据手机号查询数据库
     *
     * @param phone
     * @return Integer对象，如果查到手机号存在，返回1。如果没有查到，返回null。
     */
    Integer selectByPhone(String phone);

    /**
     *修改用户信息
     *
     * @param user
     */
    void updateUser(User user);

    /**
     * 修改用户图片
     * @param id
     * @param image
     */
    void updateImage(
            @Param("id") Integer id,
            @Param("image") String image
    );
}
