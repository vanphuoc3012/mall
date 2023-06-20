package com.ph.mall.admin.dto.request;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Getter;
import lombok.Setter;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotEmpty;

@Getter
@Setter
public class UmsAdminRequestParam {
    @NotEmpty
    @Schema(description = "username", requiredMode = Schema.RequiredMode.REQUIRED)
    private String username;
    @NotEmpty
    @Schema(description = "password", requiredMode = Schema.RequiredMode.REQUIRED)
    private String password;
    @Schema(description = "icon")
    private String icon;
    @Email
    @Schema(description = "email")
    private String email;
    @Schema(description = "nickName")
    private String nickName;
    @Schema(description = "note")
    private String note;
}
