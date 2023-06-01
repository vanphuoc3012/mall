package com.ph.mall.demo.service.impl;

import com.ph.mall.demo.dto.PmsBrandDto;
import com.ph.mall.demo.service.DemoService;
import com.ph.mall.mbg.mapper.PmsBrandMapper;
import com.ph.mall.mbg.model.brand.PmsBrand;
import com.ph.mall.mbg.model.brand.PmsBrandExample;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class DemoServiceImpl implements DemoService {
    private final PmsBrandMapper brandMapper;
    @Override
    public List<PmsBrand> listAllBrand() {
        return brandMapper.selectByExample(new PmsBrandExample());
    }

    @Override
    public int createBrand(PmsBrandDto pmsBrandDto) {
        PmsBrand brand = new PmsBrand();
        BeanUtils.copyProperties(pmsBrandDto, brand);
        return brandMapper.insertSelective(brand);
    }

    @Override
    public int updateBrand(Long id, PmsBrandDto pmsBrandDto) {
        return 0;
    }

    @Override
    public int deleteBrand(Long id) {
        return 0;
    }

    @Override
    public List<PmsBrand> listBrand(int pageNum, int pageSize) {
        return null;
    }

    @Override
    public PmsBrand getBrand(Long id) {
        return null;
    }
}
