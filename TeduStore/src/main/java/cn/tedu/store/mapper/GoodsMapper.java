package cn.tedu.store.mapper;

import cn.tedu.store.bean.Goods;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface GoodsMapper {
    /**
     * 通过分类id进行查询
     *
     * @param categoryId 分类id
     * @param offset 回滚事务
     * @param count
     * @return
     */
    List<Goods> selectByCategoryId(
            @Param("categoryId") Integer categoryId,
            @Param("offset") Integer offset,
            @Param("count") Integer count
    );
}
