package com.simon.pojo;

import org.apache.ibatis.type.Alias;

@Alias("goods")
public class Goods {
    private Integer id;
    private String goodName;
    private Integer goodPrice;
    private String description;
}
