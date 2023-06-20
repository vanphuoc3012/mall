package com.ph.mall.admin.service.ums;

import com.ph.mall.admin.dto.request.UmsAdminRequestParam;
import com.ph.mall.mbg.model.ums.UmsAdmin;

public interface UmsAdminService {
    UmsAdmin register(UmsAdminRequestParam umsAdminRequestParam);
}
