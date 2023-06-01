package com.ph.mall.demo.service;

import com.ph.mall.demo.dto.PmsBrandDto;
import com.ph.mall.mbg.model.brand.PmsBrand;

import java.util.List;

public interface DemoService {
    List<PmsBrand> listAllBrand();

    int createBrand(PmsBrandDto pmsBrandDto);

    int updateBrand(Long id, PmsBrandDto pmsBrandDto);

    int deleteBrand(Long id);

    List<PmsBrand> listBrand(int pageNum, int pageSize);

    PmsBrand getBrand(Long id);
}
