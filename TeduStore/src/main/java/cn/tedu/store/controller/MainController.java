package cn.tedu.store.controller;

import cn.tedu.store.bean.GoodsCategory;
import cn.tedu.store.service.GoodsCategoryServiceImpl;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;
import java.util.List;

@Controller
@RequestMapping("/main")
public class MainController {
    @Resource
    private GoodsCategoryServiceImpl goodsCategoryService;
    /**
     * 显示网站首页
     */
    @RequestMapping("/showIndex.do")
    public String showIndex(ModelMap map) {
        //list2=调用业务层getByParentId(161.0.3)
        List<GoodsCategory> list2 = goodsCategoryService.getByParentId(161,0,3);
        //list3=list<list<goodscategory>>
        //遍历list2,得到goodstegory的id值
        //调用业务层方法getByParentId,返回list,并把list添加list3
        //把list2和list3加入到map中
        return "index";
    }
}
