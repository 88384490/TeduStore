package cn.tedu.store.controller;

import cn.tedu.store.bean.Area;
import cn.tedu.store.bean.City;
import cn.tedu.store.bean.Province;
import cn.tedu.store.bean.ResponseResult;
import cn.tedu.store.service.DictService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import java.util.List;

@Controller
@RequestMapping("/dict")
public class DictController {
    @Resource
    private DictService service;

    @RequestMapping("/getProvince.do")
    @ResponseBody
    public ResponseResult<List<Province>> getProvince() {
        ResponseResult<List<Province>> rr = null;
        List<Province> list =service.getProvince();
        rr = new ResponseResult<List<Province>>(list);
        return rr;
    }

    @RequestMapping("/getCity.do")
    @ResponseBody
    public ResponseResult<List<City>> getCity(String provinceCode){
        ResponseResult<List<City>> rr = null;
        List<City> list = service.getCity(provinceCode);
        rr = new ResponseResult<List<City>>(list);
        return rr;
    }

    @RequestMapping("/getArea.do")
    @ResponseBody
    public ResponseResult<List<Area>> getArea(String cityCode){
        ResponseResult<List<Area>> rr = null;
        List<Area> list = service.getArea(cityCode);
        rr = new ResponseResult<List<Area>>(list);
        return rr;
    }
}
