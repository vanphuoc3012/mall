package com.ph.mall.admin.controller.ums;

import com.ph.mall.admin.dto.request.UmsAdminRequestParam;
import com.ph.mall.admin.service.UmsAdminService;
import com.ph.mall.common.api.CommonResult;
import com.ph.mall.mbg.model.ums.UmsAdmin;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

@RestController
@Tag(name = "UmsAdminController", description = "Admin user management")
@RequestMapping("/admin")
@RequiredArgsConstructor
public class UmsAdminController {
    private final UmsAdminService umsAdminService;

    @PostMapping("/register")
    public CommonResult<UmsAdmin> register(@Valid @RequestBody UmsAdminRequestParam umsAdminRequestParam) {
        UmsAdmin savedAdmin = umsAdminService.register(umsAdminRequestParam);
        return CommonResult.success(savedAdmin);
    }
}
