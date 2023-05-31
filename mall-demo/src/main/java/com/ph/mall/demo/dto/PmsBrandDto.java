package com.ph.mall.demo.dto;

import com.ph.mall.demo.validator.FlagValidator;
import lombok.Data;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;

@Data
public class PmsBrandDto {
    @NotNull
    private String name;

    @NotNull
    private String firstLetter;

    @Min(0)
    private Integer sort;

    @FlagValidator(value = {"1", "0"})
    private Integer factoryStatus;

    @FlagValidator(value = {"1", "0"})
    private Integer showStatus;

    private String bigPic;


    private String brandStory;
}
