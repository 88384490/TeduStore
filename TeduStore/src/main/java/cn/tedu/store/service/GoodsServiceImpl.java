package cn.tedu.store.service;

import cn.tedu.store.bean.Goods;
import cn.tedu.store.mapper.GoodsMapper;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;
@Service
public class GoodsServiceImpl implements GoodsService{
    @Resource
    private GoodsMapper gm;
    @Override
    public List<Goods> getByCategoryId(Integer categoryId, Integer offset, Integer count) {

        return null;
    }
}
