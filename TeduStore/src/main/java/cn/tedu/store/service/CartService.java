package cn.tedu.store.service;

import cn.tedu.store.bean.Cart;
import cn.tedu.store.vo.CartVo;

import java.util.List;

public interface CartService {
    /**
     * 添加购物车
     *
     * @param cart 购物车信息
     */
    void addCart(Cart cart);

    /**
     * 通过用户的id查找其购物车的商品
     *
     * @param uid 用户id
     * @return 返回商品列表
     */
    List<CartVo> getByUid(Integer uid);

    /**
     *
     * @param ids
     */
    void removeByIds(Integer[] ids);
}
