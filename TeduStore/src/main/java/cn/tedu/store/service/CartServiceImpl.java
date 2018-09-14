package cn.tedu.store.service;

import cn.tedu.store.bean.Cart;
import cn.tedu.store.mapper.CartMapper;
import cn.tedu.store.vo.CartVo;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class CartServiceImpl implements CartService {
    @Resource
    CartMapper mapper;

    @Override
    public void addCart(Cart cart) {
        mapper.insertCart(cart);
    }

    @Override
    public List<CartVo> getByUid(Integer uid) {
        List<CartVo> list = mapper.selectByUid(uid);
        return list;
    }

    @Override
    public void removeByIds(Integer[] ids) {
        mapper.deleteByIds(ids);
    }
}
