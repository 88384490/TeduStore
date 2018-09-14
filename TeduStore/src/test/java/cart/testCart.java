package cart;

import cn.tedu.store.bean.Cart;
import cn.tedu.store.mapper.CartMapper;
import cn.tedu.store.service.CartServiceImpl;
import cn.tedu.store.vo.CartVo;
import org.junit.Test;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

public class testCart {
    @Test
    public void testInsertCart() {
        AbstractApplicationContext ac =
                new ClassPathXmlApplicationContext("application-dao.xml");
        CartMapper mappeer = ac.getBean("cartMapper", CartMapper.class);
        Cart cart = new Cart();
        cart.setuId(1);
        cart.setGoodsId("22222");
        cart.setNum(11);
        cart.setCreatedUser("admin");

        mappeer.insertCart(cart);
    }

    @Test
    public void testAddCart() {
        AbstractApplicationContext ac =
                new ClassPathXmlApplicationContext(
                        "application-dao.xml",
                        "application-service.xml");
        CartServiceImpl cartService = ac.getBean("cartServiceImpl", CartServiceImpl.class);
        Cart cart = new Cart();
        cart.setuId(2);
        cart.setGoodsId("33333");
        cart.setNum(20);
        cart.setCreatedUser("admin");
        cartService.addCart(cart);
    }

    @Test
    public void testSelectByUid() {
        AbstractApplicationContext ac =
                new ClassPathXmlApplicationContext("application-dao.xml");
        CartMapper cm = ac.getBean("cartMapper",CartMapper.class);
        System.out.println(cm.selectByUid(1));
    }

    @Test
    public void testGetByUid(){
        AbstractApplicationContext ac =
                new ClassPathXmlApplicationContext(
                        "application-dao.xml",
                        "application-service.xml"
                );
        CartServiceImpl csi = ac.getBean("cartServiceImpl",CartServiceImpl.class);

        List<CartVo> list = csi.getByUid(1);
        System.out.println(list);
        ac.close();
    }

    @Test
    public void testDeleteByIds(){
        AbstractApplicationContext ac =
                new ClassPathXmlApplicationContext("application-dao.xml");
        CartMapper cm = ac.getBean("cartMapper",CartMapper.class);
        Integer[] array = {1,2,4};
        cm.deleteByIds(array);
    }

    @Test
    public void testRemoveByIds(){
        AbstractApplicationContext ac =
                new ClassPathXmlApplicationContext(
                        "application-dao.xml",
                        "application-service.xml"
                );
        CartServiceImpl csi = ac.getBean("cartServiceImpl",CartServiceImpl.class);
        Integer[] array = {1,2,3};
        csi.removeByIds(array);
    }
}
