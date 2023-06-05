package com.ph.mall.mbg.model.category;

import lombok.Data;

import java.io.Serializable;

@Data
public class PmsProductCategory implements Serializable {
    private static final long serialVersionUID = 1L;

    private Long id;

    private Long parentId;

    private String name;

    private Integer level;

    private Integer productCount;

    private String productUnit;

    private Integer navStatus;

    private Integer showStatus;

    private Integer sort;

    private String icon;

    private String keywords;

    private String description;
}
