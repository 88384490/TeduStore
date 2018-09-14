package dict;

import cn.tedu.store.mapper.DictMapper;
import cn.tedu.store.service.DictServiceImpl;
import org.junit.Test;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class testDict {
    @Test
    public void testgetProvince(){
        AbstractApplicationContext ac =
                new ClassPathXmlApplicationContext(
    "application-dao.xml",
                "application-service.xml");
        DictServiceImpl dsi = ac.getBean("dictServiceImpl",DictServiceImpl.class);
        System.out.println(dsi.getProvince());
    }

    @Test
    public void testGetCity(){
        AbstractApplicationContext ac =
                new ClassPathXmlApplicationContext(
                  "application-dao.xml",
                  "application-service.xml"
                );
        DictServiceImpl dsi = ac.getBean("dictServiceImpl",DictServiceImpl.class);
        System.out.println(dsi.getCity("110000"));
    }

    @Test
    public void testGetArea(){
        AbstractApplicationContext ac =
                new ClassPathXmlApplicationContext(
                        "application-dao.xml",
                        "application-service.xml"
                );
        DictMapper dm = ac.getBean("dictMapper",DictMapper.class);
        System.out.println(dm.selectArea("330100"));
    }

    @Test
    public void testGetArea2(){
        AbstractApplicationContext ac =
                new ClassPathXmlApplicationContext(
                        "application-dao.xml",
                        "application-service.xml"
                );
        DictServiceImpl dsi = ac.getBean("dictServiceImpl",DictServiceImpl.class);
        System.out.println(dsi.getArea("330100"));
    }
}
