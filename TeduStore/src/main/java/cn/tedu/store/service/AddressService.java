package cn.tedu.store.service;

import cn.tedu.store.bean.Address;
import cn.tedu.store.mapper.AddressMapper;

import java.util.List;

/**
 * 收货人的业务层
 *
 * @author zhouyi
 */
public interface AddressService {
    /**
     * 添加地址
     *
     * @param address
     */
    void addAddress(Address address);

    /**
     * 通过uid获取地址信息
     *
     * @param uId
     * @return
     */
    List<Address> getByUid(Integer uId);

    /**
     * 设置默认地址
     *
     * @param uid
     * @param id
     */
    void setDefault(Integer uid, Integer id);

    /**
     * 通过用户id获取地址
     *
     * @param id
     * @return
     */
    Address getById(Integer id);

    /**
     * 修改用户地址资料
     *
     * @param address
     */
    void updateAddress(Address address);

    /**
     * 通过省份+城市+区域获取省市区详细地址
     * @param address
     * @return
     */
    String getDistrict(Address address);
}
