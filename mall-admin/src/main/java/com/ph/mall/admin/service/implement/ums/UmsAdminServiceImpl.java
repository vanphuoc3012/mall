package com.ph.mall.admin.service.implement.ums;

import com.ph.mall.admin.dto.request.UmsAdminRequestParam;
import com.ph.mall.admin.service.ums.UmsAdminService;
import com.ph.mall.mbg.model.ums.UmsAdmin;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Component;

import java.util.Date;

@Component
@Slf4j
public class UmsAdminServiceImpl implements UmsAdminService {
    @Override
    public UmsAdmin register(UmsAdminRequestParam umsAdminRequestParam) {
        UmsAdmin umsAdmin = new UmsAdmin();
        BeanUtils.copyProperties(umsAdminRequestParam, umsAdmin);
        umsAdmin.setCreateTime(new Date());
        umsAdmin.setStatus(1);


        return null;
    }
}
