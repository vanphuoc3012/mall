package com.ph.mall.demo.controller;

import com.ph.mall.common.api.CommonResult;
import com.ph.mall.demo.service.DemoService;
import com.ph.mall.mbg.model.brand.PmsBrand;
import io.swagger.v3.oas.annotations.Operation;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
@RequestMapping("/brand")
@Slf4j
@RequiredArgsConstructor
public class DemoController {
    private final DemoService demoService;

    @GetMapping("/listAll")
    @ResponseBody
    @Operation(description = "List all brand")
    public CommonResult<List<PmsBrand>> getBrandList() {
        return CommonResult.success(demoService.listAllBrand());
    }
}
