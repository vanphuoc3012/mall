package com.ph.mall.mbg.model.ums;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;

import java.io.Serializable;
import java.util.Date;

@Data
public class UmsRole implements Serializable {
    private static final long serialVersionUID = 1L;

    private Long id;

    @Schema(description = "name")
    private String name;

    @Schema(description = "description")
    private String description;

    @Schema(description = "adminCount")
    private Integer adminCount;

    @Schema(description = "createdTime")
    private Date createdTime;

    @Schema(description = "Enabled state: 0->disabled; 1->enabled")
    private Integer status;

    private Integer sort;

}
