package com.ph.mall.admin.controller;

import com.ph.mall.admin.service.pms.PmsProductCategoryService;
import com.ph.mall.common.api.CommonPage;
import com.ph.mall.common.api.CommonResult;
import com.ph.mall.mbg.model.category.PmsProductCategory;
import com.ph.mall.admin.dto.PmsProductCategoryRequestDto;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@RestController
@RequestMapping("/productCategories")
@Tag(name = "PmsProductCategoryController", description = "Category management")
@RequiredArgsConstructor
@Slf4j
public class PmsProductCategoryController {
    private final PmsProductCategoryService productCategoryService;
    @GetMapping("/{id}")
    public CommonResult<PmsProductCategory> getById(@PathVariable("id") Long id) {

        return CommonResult.success(productCategoryService.getItem(id));
    }

    @GetMapping("/list/{parentId}")
    public CommonResult<CommonPage<PmsProductCategory>> getSubCategories(@PathVariable("parentId") Long parentId,
                                                     @RequestParam(value = "pageSize", defaultValue = "5") Integer pageSize,
                                                     @RequestParam(value = "pageNum", defaultValue = "1") Integer pageNum) {
        return null;
    }

    @PostMapping
    public CommonResult create(@RequestBody @Valid PmsProductCategoryRequestDto productCategory) {
        return null;
    }

    @PutMapping
    public CommonResult update() {
        return null;
    }

    @DeleteMapping("/{id}")
    public CommonResult delete() {
        return null;
    }

    @PutMapping("/navStatus")
    public CommonResult updateNavStatus() {
        return null;
    }

    @PutMapping("/showStatus")
    public CommonResult updateShowStatus() {
        return null;
    }

    @GetMapping("/withChildren")
    public CommonResult getWithChildren() {
        return null;
    }
}
