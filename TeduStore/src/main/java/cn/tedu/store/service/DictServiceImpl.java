package cn.tedu.store.service;

import cn.tedu.store.bean.Area;
import cn.tedu.store.bean.City;
import cn.tedu.store.bean.Province;
import cn.tedu.store.mapper.DictMapper;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;
@Service
public class DictServiceImpl implements DictService{
    @Resource
    private DictMapper mapper;

    /**
     * 获取所有省份编号
     *
     * @return
     */
    @Override
    public List<Province> getProvince() {
        List<Province> list = mapper.selectProvince();
        return list;
    }

    /**
     * 通过省份编号获取城市名称和编号
     *
     * @param provinceCode 省份编号
     * @return 返回城市名称和编号
     */
    @Override
    public List<City> getCity(String provinceCode) {
        List<City> list = mapper.selectCity(provinceCode);
        return list;
    }

    @Override
    public List<Area> getArea(String cityCode) {
        List<Area> list = mapper.selectArea(cityCode);
        return list;
    }

}
