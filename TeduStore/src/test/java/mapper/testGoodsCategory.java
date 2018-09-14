package mapper;

import cn.tedu.store.mapper.GoodsCategoryMapper;
import cn.tedu.store.mapper.GoodsMapper;
import cn.tedu.store.service.GoodsCategoryServiceImpl;
import org.junit.Test;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.SortedMap;

public class testGoodsCategory {
    @Test
    public void testSelectGoodsCategory() {
        AbstractApplicationContext ac = new ClassPathXmlApplicationContext("application-dao.xml");
        GoodsCategoryMapper cm = ac.getBean("goodsCategoryMapper", GoodsCategoryMapper.class);
        System.out.println(
                cm.selectGoodsCategory(161, 0, 4));
    }

    @Test
    public void testGetByParentId() {
        AbstractApplicationContext ac = new ClassPathXmlApplicationContext("application-dao.xml",
                "application-service.xml");
        GoodsCategoryServiceImpl csi = ac.getBean("goodsCategoryServiceImpl",
                GoodsCategoryServiceImpl.class);
        System.out.println(
                csi.getByParentId(161, 0, 3));
    }

    @Test
    public void testSelectByCategoryId(){
        AbstractApplicationContext ac = new ClassPathXmlApplicationContext("application-dao.xml");
        GoodsMapper mapper = ac.getBean("goodsMapper",GoodsMapper.class);
        System.out.println(mapper.selectByCategoryId(163,0,1));
    }
}
