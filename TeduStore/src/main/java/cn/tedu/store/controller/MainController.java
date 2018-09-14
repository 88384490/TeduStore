package cn.tedu.store.controller;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

import cn.tedu.store.bean.Goods;
import cn.tedu.store.bean.GoodsCategory;
import cn.tedu.store.service.GoodsCategoryServiceImpl;
import cn.tedu.store.service.GoodsServiceImpl;

@Controller
@RequestMapping("/main")
public class MainController {
    @Resource
    private GoodsCategoryServiceImpl goodsCategoryService;

    @Resource
    private GoodsServiceImpl goodsService;
    /**
     * 显示网站首页
     */
    @RequestMapping("/showIndex.do")
    public String showIndex(ModelMap map) {
        //list2=调用业务层getByParentId(161.0.3)
        List<GoodsCategory> list2 = goodsCategoryService.getByParentId(161,0,3);
        //list3=list<list<goodscategory>>
        List<List<GoodsCategory>> list3 = new ArrayList<List<GoodsCategory>>();
        //遍历list2,得到goodstegory的id值
        for (GoodsCategory gc : list2) {
            Integer id = gc.getId();
            // 调用业务层方法getByParentId,返回list,并把list添加list3
            List<GoodsCategory> list = goodsCategoryService
                    .getByParentId(163, 0, 3);
            list3.add(list);
        }
        // 获得热卖商品的集合
        List<Goods> goodsList = goodsService.getByCategoryId(163, 0,
                3);
        //把list2和list3加入到map中
        map.addAttribute(list2);
        map.addAttribute(list3);
        map.addAttribute("goodsList", goodsList);
        return "index";
    }
}
