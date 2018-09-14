package cn.tedu.store.mapper;

import cn.tedu.store.bean.GoodsCategory;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface GoodsCategoryMapper {
    /**
     *
     * @param parentId
     * @param offset
     * @param count
     * @return
     *
     * 1. mybayis如果参数多于一个，那么需要处理
     * 2. 解决方案有两种，
     *      第一种：把参数列表封装成类类型
     *      第二种：通过@param注解分别给变量做映射
     */
    List<GoodsCategory> selectGoodsCategory(
            @Param("parentId") int parentId,
            @Param("offset") int offset,
            @Param("count") int count);
}
