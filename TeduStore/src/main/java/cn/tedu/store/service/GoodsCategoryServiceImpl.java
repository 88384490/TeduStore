package cn.tedu.store.service;

import cn.tedu.store.bean.GoodsCategory;
import cn.tedu.store.mapper.GoodsCategoryMapper;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class GoodsCategoryServiceImpl implements GoodsCategoryService {
    @Resource
    private GoodsCategoryMapper goodsCategoryMapper;

    @Override
    public List<GoodsCategory> getByParentId(int parentId, int offset, int count) {
        return goodsCategoryMapper.selectGoodsCategory(parentId, offset, count);
    }
}
