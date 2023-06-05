package com.ph.mall.admin.service.impl;

import com.ph.mall.admin.service.PmsProductCategoryService;
import com.ph.mall.common.exception.ItemNotFoundException;
import com.ph.mall.mbg.mapper.pms.PmsProductCategoryMapper;
import com.ph.mall.mbg.model.category.PmsProductCategory;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.Objects;

@Service
@RequiredArgsConstructor
@Slf4j
public class PmsProductCategoryServiceImpl implements PmsProductCategoryService {
    private final PmsProductCategoryMapper pmsProductCategoryMapper;

    @Override
    public PmsProductCategory getItem(Long id) {
        var result = pmsProductCategoryMapper.selectByPrimaryKey(id);
        if (Objects.isNull(result)) {
            throw new ItemNotFoundException("Item not found");
        }
        log.debug("Item: {}", result);
        return result;
    }
}
