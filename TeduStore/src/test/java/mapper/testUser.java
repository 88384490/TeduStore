package mapper;

import cn.tedu.store.bean.Province;
import cn.tedu.store.mapper.DictMapper;
import cn.tedu.store.service.DictServiceImpl;
import org.junit.Test;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import cn.tedu.store.bean.User;
import cn.tedu.store.mapper.UserMapper;
import cn.tedu.store.service.UserServiceImpl;

public class testUser {

    public void testInsert() {
        // 获取spring容器
        AbstractApplicationContext ac = new ClassPathXmlApplicationContext(
                "application-dao.xml");
        // 获取bean对象
        // 获取持久层的对象
        UserMapper mapper = ac.getBean("userMapper",
                UserMapper.class);
        // 调用方法进行测试
        User user = new User();
        user.setUsername("chinajoy");
        user.setPassword("123456");
        user.setEmail("56262462@163.com");
        user.setPhone("18984845843");
        user.setGender(1);
        mapper.insertUser(user);
        ac.close();
    }

    public void testSelectByUsername() {
        AbstractApplicationContext ac = new ClassPathXmlApplicationContext(
                "application-dao.xml");
        UserMapper mapper = ac.getBean("userMapper",
                UserMapper.class);
        User user = mapper.selectByName("孙倩倩2");
        System.out.println(user.toString());
        ac.close();
    }

    public void testServiceAddUser() {
        AbstractApplicationContext ac = new ClassPathXmlApplicationContext(
                "application-dao.xml", "application-service.xml");

        UserServiceImpl service = ac.getBean("userServiceImpl",
                UserServiceImpl.class);
        User user = new User();
        user.setUsername("周毅");
        user.setPassword("123456");
        user.setEmail("joe@163.com");
        user.setPhone("15464884");
        service.addUser(user);
    }

    public void testSelectByEmail() {
        AbstractApplicationContext ac = new ClassPathXmlApplicationContext(
                "application-dao.xml");
        UserMapper mapper = ac.getBean("userMapper",
                UserMapper.class);
        Integer number = mapper.selectByEmail("joe@163.com");
        System.out.println(number);
    }

    public void testSelectByPhone() {
        AbstractApplicationContext ac = new ClassPathXmlApplicationContext(
                "application-dao.xml");
        UserMapper mapper = ac.getBean("userMapper",
                UserMapper.class);
        Integer number = mapper.selectByPhone("1594687841");
        System.out.println(number);
    }


    public void testEmail() {
        AbstractApplicationContext ac = new ClassPathXmlApplicationContext(
                "application-dao.xml", "application-service.xml");
        UserServiceImpl service = ac.getBean("userServiceImpl",
                UserServiceImpl.class);
        System.out.println(service.checkEmail("joe@163.com"));
    }

    public void testCheckUsername() {
        AbstractApplicationContext ac = new ClassPathXmlApplicationContext(
                "application-dao.xml", "application-service.xml");
        UserServiceImpl service = ac.getBean("userServiceImpl",
                UserServiceImpl.class);
        System.out.println(service.checkUsername("孙倩倩"));
    }

    @Test
    public void testLogin() {
        AbstractApplicationContext ac = new ClassPathXmlApplicationContext(
                "application-dao.xml", "application-service.xml");
        UserServiceImpl service = ac.getBean("userServiceImpl",
                UserServiceImpl.class);
        System.out.println(service.login("corbet", "1234567"));
    }


    @Test
    public void testUpdateUser() {
        AbstractApplicationContext ac = new ClassPathXmlApplicationContext(
                "application-dao.xml",
                "application-service.xml"
        );
        UserMapper mapper = ac.getBean("userMapper", UserMapper.class);
        User user = new User();
        user.setId(1);
        user.setPassword("11111111");
        user.setUsername("小白");
        user.setEmail("xiaobai@163.com");
        user.setPhone("1234345");
        mapper.updateUser(user);
        ac.close();
    }

    @Test
    public void testSelectById() {
        AbstractApplicationContext ac = new ClassPathXmlApplicationContext(
                "application-dao.xml"
        );
        UserMapper mapper = ac.getBean("userMapper", UserMapper.class);
        System.out.println(mapper.selectById(1));
    }

    @Test
    public void testChangePassword() {
        AbstractApplicationContext ac = new ClassPathXmlApplicationContext(
                "application-dao.xml",
                "application-service.xml"
        );
        UserServiceImpl service = ac.getBean("userServiceImpl",
                UserServiceImpl.class);
        service.changePassword(3, "123456", "11111111");
        ac.close();
    }

    @Test
    public void testChangeUserInfo() {
        AbstractApplicationContext ac = new ClassPathXmlApplicationContext(
                "application-dao.xml",
                "application-service.xml"
        );
        UserServiceImpl service = ac.getBean("userServiceImpl", UserServiceImpl.class);
        service.changeUser(2, "admin3", 0, "admin@sina.com", "12345678");
        ac.close();
    }

    @Test
    public void testSelectProvince() {
        AbstractApplicationContext ac = new ClassPathXmlApplicationContext("application-dao.xml");
        DictMapper mapper = ac.getBean("dictMapper", DictMapper.class);
        Province province = new Province();
        System.out.println(
                mapper.selectProvince());
    }

    @Test
    public void testDictService() {
        AbstractApplicationContext ac = new ClassPathXmlApplicationContext("application-dao.xml",
                "application-service.xml");
        DictServiceImpl service = ac.getBean("dictServiceImpl", DictServiceImpl.class);

        System.out.println(service.getProvince());
    }

    @Test
    public void testSelectCity() {
        AbstractApplicationContext ac = new ClassPathXmlApplicationContext("application-dao.xml",
                "application-service.xml");
        DictMapper mapper = ac.getBean("dictMapper", DictMapper.class);
        System.out.println(mapper.selectCity("130000"));
    }

    @Test
    public void testSelectArea() {
        AbstractApplicationContext ac = new ClassPathXmlApplicationContext("application-dao.xml",
                "application-service.xml");
        DictMapper mapper = ac.getBean("dictMapper", DictMapper.class);
        System.out.println(mapper.selectByAreaCode("110100"));
    }

    @Test
    public void testSelectByUid(){
        AbstractApplicationContext ac =
                new ClassPathXmlApplicationContext("application-dao.xml");
        DictMapper mapper=ac.getBean("dictMapper",DictMapper.class);
        System.out.println(mapper.selectByUserId(1));
    }

    @Test
    public void testUpdateImage(){
        AbstractApplicationContext ac =
                new ClassPathXmlApplicationContext("application-dao.xml");
        DictMapper mapper = ac.getBean("dictMapper",DictMapper.class);

    }
}
