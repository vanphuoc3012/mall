package com.ph.mall.mbg.mapper.pms;

import com.ph.mall.mbg.model.category.PmsProductCategory;
import org.apache.ibatis.annotations.Param;

public interface PmsProductCategoryMapper {
    PmsProductCategory selectByPrimaryKey(@Param("id") Long id);
}
