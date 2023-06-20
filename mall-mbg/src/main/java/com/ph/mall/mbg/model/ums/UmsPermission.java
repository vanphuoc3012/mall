package com.ph.mall.mbg.model.ums;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;

import java.io.Serializable;
import java.util.Date;

@Data
public class UmsPermission implements Serializable {
    private static final long serialVersionUID = 1L;
    
    private Long id;

    @Schema(description = "parent id")
    private Long pid;

    @Schema(description = "name")
    private String name;

    @Schema(description = "description")
    private String description;

    @Schema(description = "icon")
    private String icon;

    @Schema(description = "Permission type: 0->directory; 1->menu; 2->button (interface binding permission)")
    private Integer type;

    @Schema(description = "Front-end resource path")
    private String uri;

    @Schema(description = "Enabled state; 0->disabled; 1->enabled")
    private Integer status;

    @Schema(description = "creation time")
    private Date createTime;

    @Schema(description = "to sort")
    private Integer sort;

}
