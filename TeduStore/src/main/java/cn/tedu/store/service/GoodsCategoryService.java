package cn.tedu.store.service;

import cn.tedu.store.bean.GoodsCategory;

import java.util.List;

public interface GoodsCategoryService {
    List<GoodsCategory> getByParentId(int parentId,int offset,int count);
}
