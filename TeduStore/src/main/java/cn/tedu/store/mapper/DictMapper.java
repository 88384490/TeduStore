package cn.tedu.store.mapper;

import java.util.List;

import cn.tedu.store.bean.Address;
import cn.tedu.store.bean.Area;
import cn.tedu.store.bean.City;
import cn.tedu.store.bean.Province;

public interface DictMapper {
    /**
     * 查询所有省份信息
     *
     * @return 所有省份的列表
     */
    List<Province> selectProvince();

    /**
     * 查询所有城市信息
     *
     * @param provinceCode 省份号码
     * @return 所有城市的列表
     */
    List<City> selectCity(String provinceCode);

    /**
     * 查询所有城市区域信息
     *
     * @param cityCode 城市号码
     * @return 所有区域的列表
     */
    List<Area> selectArea(String cityCode);

    /**
     * 根据省编号查询省的名称
     *
     * @param prvoinceCode 省编号
     * @return 返回省的名称
     */
    String selectByProvinceCode(String prvoinceCode);

    /**
     * 根据城市编号查询城市的名称
     *
     * @param cityCode 城市编号
     * @return 返回城市的名称
     */
    String selectByCityCode(String cityCode);

    /**
     * 根据区编号查询区的名称
     *
     * @param areaCode 区编号
     * @return 返回区的名称
     */
    String selectByAreaCode(String areaCode);

    /**
     * 根据id查询用户地址
     *
     * @param id UserID
     * @return 返回用户的所有地址信息
     */
    String selectByUserId(Integer id);
}
