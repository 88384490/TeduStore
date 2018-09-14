package cn.tedu.store.mapper;

import cn.tedu.store.bean.Cart;
import cn.tedu.store.vo.CartVo;

import java.util.List;

public interface CartMapper {
    /**
     * 添加购物车
     * @param cart 购物车实体类
     */
    void insertCart(Cart cart);

    /**
     * 通过uid进行查询
     * @param uid
     * @return
     */
    List<CartVo> selectByUid(Integer uid);


    void deleteByIds(Integer[] ids);

    void deleteById(Integer id);
}
