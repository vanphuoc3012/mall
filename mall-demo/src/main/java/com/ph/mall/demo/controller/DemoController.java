package com.ph.mall.demo.controller;

import com.ph.mall.common.api.CommonResult;
import com.ph.mall.demo.dto.PmsBrandDto;
import com.ph.mall.demo.service.DemoService;
import com.ph.mall.mbg.model.brand.PmsBrand;
import io.swagger.v3.oas.annotations.Operation;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/brand")
@Slf4j
@RequiredArgsConstructor
public class DemoController {
    private final DemoService demoService;

    @GetMapping(value = "/listAll")
    @Operation(description = "List all brand")
    public CommonResult<List<PmsBrand>> getBrandList() {
        return CommonResult.success(demoService.listAllBrand());
    }

    @PostMapping
    @Operation(description = "Create brand")
    public CommonResult<?> createBrand(@RequestBody @Validated PmsBrandDto pmsBrandDto) {
        CommonResult<?> commonResult;
        int count = demoService.createBrand(pmsBrandDto);
        if (count == 1) {
            commonResult = CommonResult.success(pmsBrandDto);
            log.debug("createBrand success:{}", pmsBrandDto);
        } else {
            commonResult = CommonResult.failed("Failed to create brand");
            log.debug("createBrand failed:{}", pmsBrandDto);
        }
        return commonResult;
    }
}
