package cn.tedu.store.service;

import cn.tedu.store.bean.Goods;

import java.util.List;

public interface GoodsService {
    /**
     * 查询商品信息
     * @param categoryId 分类id
     * @param offset 事务回滚
     * @param count 每页输出多少行
     * @return
     */
    List<Goods> getByCategoryId(
            Integer categoryId,
            Integer offset,
            Integer count
    );
}
