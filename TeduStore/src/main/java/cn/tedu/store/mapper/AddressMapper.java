package cn.tedu.store.mapper;

import java.util.List;

import cn.tedu.store.bean.Address;

public interface AddressMapper {
    /**
     * 添加地址信息
     * 
     * @param address
     *            地址信息
     */
    Integer insertAddress(Address address);


    /**
     * 根据用户id进行回滚
     * 
     * @param uid
     *            用户id
     */
    Integer updataByUid(Integer uid);

    /**
     * 根据id进行回滚
     * 
     * @param id
     */
    Integer updateById(Integer id);

    /**
     * 根据id进行地址信息查询
     * 
     * @param id
     * @return
     */
    Address selectById(Integer id);

    /**
     * 根据uid进行地址信息查询
     *
     * @param uid 用户id
     * @return
     */
    List<Address> selectByUid(Integer uid);

    /**
     * 通过id修改收货人信息
     * @param address
     */
    void updateAddressById(Address address);
}
