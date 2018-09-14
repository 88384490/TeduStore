package cn.tedu.store.service;

import cn.tedu.store.bean.Address;
import cn.tedu.store.mapper.AddressMapper;
import cn.tedu.store.mapper.DictMapper;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class AddressServiceImpl implements AddressService {
    @Resource
    private AddressMapper mapper;
    @Resource
    private DictMapper dictMapper;

    @Override
    public void addAddress(Address address) {
        //1. 给address对象的recvDistrict设置值
        /**
         * 把省市区的字符串作为District的属性值
         * dictMapper.selectProvince()+
         */
        address.setRecvDistrict(
                dictMapper.selectByProvinceCode(address.getRecvProvince()) +
                        dictMapper.selectByCityCode(address.getRecvCity()) +
                        dictMapper.selectByAreaCode(address.getRecvArea())
        );
        //2. 给address对象的isDefault设置值
        Integer count = mapper.selectByUid(address.getuId()).size();
        if (count == 0) {
            address.setIsDefault(1);
        } else {
            address.setIsDefault(0);
        }
        mapper.insertAddress(address);
    }

    @Override
    public List<Address> getByUid(Integer uId) {
        return mapper.selectByUid(uId);
    }

    @Override
    public void setDefault(Integer uid, Integer id) {
        Integer uid1 = mapper.updataByUid(uid);
        if (uid1 == 0) {
            throw new RuntimeException("uid修改错误");
        }

        Integer id1 = mapper.updateById(id);
        if (id1 == 0) {
            throw new RuntimeException("id修改错误");
        }
    }

    @Override
    public Address getById(Integer id) {
        return mapper.selectById(id);
    }

    @Override
    public void updateAddress(Address address) {
        Address address1 = mapper.selectById(address.getId());
        //1 给recvDistrict进行赋值
        address.setRecvDistrict(this.getDistrict(address));
        mapper.updateAddressById(address);
    }

    @Override
    public String getDistrict(Address address) {
        return dictMapper.selectByProvinceCode(address.getRecvProvince()) +
                dictMapper.selectByCityCode(address.getRecvCity()) +
                dictMapper.selectByAreaCode(address.getRecvArea());
    }


}
