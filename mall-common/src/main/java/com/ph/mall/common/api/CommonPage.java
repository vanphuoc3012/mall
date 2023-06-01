package com.ph.mall.common.api;

import java.util.List;

public class CommonPage<T> {
    private Integer pageNum;
    private Integer pageSize;
    private Integer totalPage;
    private Long total;
    private List<T> data;
}
