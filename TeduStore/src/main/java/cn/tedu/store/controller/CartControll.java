package cn.tedu.store.controller;

import java.util.List;

import javax.annotation.Resource;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

import cn.tedu.store.bean.Cart;
import cn.tedu.store.bean.ResponseResult;
import cn.tedu.store.service.CartService;
import cn.tedu.store.vo.CartVo;

@RequestMapping("/cart")
@Controller
public class CartControll extends BeanController {
    @Resource
    private CartService cartService;

    @RequestMapping("/showCart.do")
    public String showCart(HttpSession session, ModelMap map){
        //调用业务层方法，返回list
        List<CartVo> list = cartService.getByUid(this.getId(session));
        map.addAttribute("listVo",list);
        return "cart";
    }

    @RequestMapping("/addCart.do")
    public ResponseResult<Void> addCart(
            HttpSession session,
            String goodsId,
            Integer num
    ) {
        ResponseResult<Void> rr = null;
        Cart cart = new Cart();
        cart.setGoodsId(goodsId);
        cart.setNum(num);
        cartService.addCart(cart);
        try {
            rr = new ResponseResult<Void>(1, "添加购物车成功");
        } catch (RuntimeException ex) {
            rr = new ResponseResult<Void>(0, ex.getMessage());
        }
        return rr;
    }

    @RequestMapping("/removeByIds")
    public String removeByIds(Integer[] ids){
        cartService.removeByIds(ids);
        return "redirect:../cart/showCart.do";
    }
}
