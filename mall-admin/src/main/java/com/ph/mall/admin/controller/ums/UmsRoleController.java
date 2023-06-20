package com.ph.mall.admin.controller.ums;

import com.ph.mall.admin.service.ums.UmsRoleService;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/role")
@RequiredArgsConstructor
@Tag(name = "UmsRoleController", description = "Role management")
@Slf4j
public class UmsRoleController {
    private UmsRoleService umsRoleService;
}
