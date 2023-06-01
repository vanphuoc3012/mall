package com.ph.mall.mbg.model.brand;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;
import lombok.ToString;

import java.io.Serializable;

@Data
@ToString
public class PmsBrand implements Serializable {
    private static final long serialVersionUID = 1L;
    private Long id;

    private String name;

    @Schema(allowableValues = {"0", "1"}, description = "Alias")
    private String firstLetter;

    private Integer sort;

    @Schema(allowableValues = {"0", "1"}, description = "??")
    private Integer factoryStatus;

    private Integer showStatus;

    @Schema(description = "Quantity")
    private Integer productCount;

    @Schema(description = "Total product reviews")
    private Integer productCommentCount;

    @Schema(description = "Brand Logo")
    private String logo;

    @Schema(description = "Big pic")
    private String bigPic;

    @Schema(description = "Brand story")
    private String brandStory;
}
