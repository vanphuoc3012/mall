package com.ph.mall.mbg.model.ums;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;

import java.io.Serializable;
import java.util.Date;

@Data
public class UmsAdmin implements Serializable {
    private static final long serialVersionUID = 1L;

    private Long id;

    private String username;

    private String password;

    @Schema(description = "avatar")
    private String icon;

    @Schema(description = "mail")
    private String email;

    @Schema(description = "nick name")
    private String nickName;

    @Schema(description = "note")
    private String note;

    @Schema(description = "created time")
    private Date createTime;

    @Schema(description = "last login time")
    private Date loginTime;

    @Schema(description = "Account enabled status: 0->disabled; 1->enabled")
    private Integer status;
}
