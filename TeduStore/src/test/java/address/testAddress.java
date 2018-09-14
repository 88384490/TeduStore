package address;

import cn.tedu.store.bean.Address;
import cn.tedu.store.mapper.AddressMapper;
import cn.tedu.store.service.AddressService;
import cn.tedu.store.service.AddressServiceImpl;
import org.junit.Test;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class testAddress {
    private AddressMapper mapper;

    @Test
    public void testSelectById() {
        AbstractApplicationContext ac =
                new ClassPathXmlApplicationContext("application-dao.xml");
        mapper = ac.getBean("addressMapper",AddressMapper.class);
        System.out.println(mapper.selectById(2));
    }

    @Test
    public void testInsertAddress() {
        AbstractApplicationContext ac =
                new ClassPathXmlApplicationContext("application-dao.xml");
        mapper = ac.getBean("addressMapper", AddressMapper.class);
        Address address = new Address();
        address.setuId(1);
        address.setRecvName("周毅");
        address.setRecvProvince("浙江");
        address.setRecvCity("浙江");
        address.setRecvArea("江干区");
        address.setRecvDistrict("null");
        address.setRecvAddress("三里家园");
        address.setRecvPhone("13456768768");
        address.setRecvTel("null");
        address.setRecvZip("310000");
        address.setRecvTag("home");
        address.setIsDefault(1);
        //  将地址信息加入到数据库中
        System.out.println(mapper.insertAddress(address));
        ac.close();
    }

    @Test
    public void testAddAddress(){
        AbstractApplicationContext ac =
                new ClassPathXmlApplicationContext(
                        "application-dao.xml",
                        "application-service.xml"
                );
        AddressServiceImpl addressService = ac.getBean("addressServiceImpl",AddressServiceImpl
                .class);
        Address address = new Address();
        address.setuId(3);
        address.setRecvName("joe");
        address.setRecvProvince("浙江省");
        address.setRecvCity("杭州市");
        address.setRecvArea("江干区");
        address.setRecvAddress("三里家园");
        address.setRecvPhone("14698715693");
        address.setRecvZip("310000");
        address.setRecvTag("家");
        addressService.addAddress(address);
    }

    @Test
    public void testSelectByUid(){
        AbstractApplicationContext ac =
                new ClassPathXmlApplicationContext("application-dao.xml");
        mapper = ac.getBean("addressMapper",AddressMapper.class);
        System.out.println(mapper.selectByUid(8));
    }

    @Test
    public void testSelectByiId(){
        AbstractApplicationContext ac =
                new ClassPathXmlApplicationContext("application-dao.xml");
        mapper = ac.getBean("addressMapper",AddressMapper.class);
        System.out.println(
                mapper.selectById(3)
        );
    }

    @Test
    public void testgetByUid(){
        AbstractApplicationContext ac =
                new ClassPathXmlApplicationContext("application-dao.xml","application-service" +
                        ".xml");
        AddressServiceImpl addressService = ac.getBean("addressServiceImpl",AddressServiceImpl
                .class);
        System.out.println(addressService.getByUid(8));
    }

    @Test
    public void testGetById(){
        AbstractApplicationContext ac =
                new ClassPathXmlApplicationContext("application-dao.xml","application-service.xml");
        AddressServiceImpl addressService = ac.getBean("addressServiceImpl",
            AddressServiceImpl.class);
        System.out.println(
                addressService.getById(1)
        );
    }

    @Test
    public void testUpdateByUid(){
        AbstractApplicationContext ac =
                new ClassPathXmlApplicationContext("application-dao.xml");
        mapper = ac.getBean("addressMapper",AddressMapper.class);
        mapper.updataByUid(8);
    }

    @Test
    public void testSetDefault(){
        AbstractApplicationContext ac =
                new ClassPathXmlApplicationContext("application-dao.xml","application-service.xml");
        AddressServiceImpl addressService = ac.getBean("addressServiceImpl",AddressServiceImpl
                .class);
        addressService.setDefault(3,0);
    }

    @Test
    public void testTwoSeach(){
        int[] data = {2,4,65,1,6,7,3,9,18,20,45};
        int n = Arrays.binarySearch(data,3);
        System.out.println(n);
        n = Arrays.binarySearch(data,55);
        System.out.println(n);
        List list = new ArrayList();
        int i;
        for (i=0;i<data.length;i++){
            list.add(data[i]);
        }
        System.out.println(
         Collections.binarySearch(list,9));
        System.out.println(
                Collections.binarySearch(list,100)
        );
    }

    @Test
    public void testUpdateAddressById(){
        AbstractApplicationContext ac =
                new ClassPathXmlApplicationContext("application-dao.xml");
        mapper = ac.getBean("addressMapper",AddressMapper.class);
        Address address = new Address();
        address.setRecvName("max");
        address.setRecvProvince("江苏省");
        address.setRecvCity("南京市");
        address.setRecvArea("玄武区");
        address.setRecvAddress("新街口");
        address.setRecvPhone("15957177023");
        address.setRecvZip("210000");
        address.setRecvTag("家");
        address.setId(3);
        mapper.updateAddressById(address);
    }
    /*
    public String toString(){
        String head = "222";
        if (head==null){
            return "[]";
        }else{
            StringBuilder buf = new StringBuilder("[");
            buf.append(head.data);
            node n = head;
            while(n.next!=head){
                n = n.next;
                buf.append(", ").append(n.data);
            }
            buf.append("]");
            return buf.toString();
        }
    }
    */
}
