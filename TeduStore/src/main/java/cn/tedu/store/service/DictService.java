package cn.tedu.store.service;

import cn.tedu.store.bean.Area;
import cn.tedu.store.bean.City;
import cn.tedu.store.bean.Province;

import java.util.List;

public interface DictService {
    //获取所有省编号
    List<Province> getProvince();

    //通过省编号获取城市编号
    List<City> getCity(String provinceCode);

    //通过城市编号查询区的名称
    List<Area> getArea(String cityCode);


}
