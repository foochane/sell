package com.chane.VO;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

import java.util.List;

/**
 * 商品包含类目
 * Created by chane on 2017/9/10.
 */
@Data
public class ProductVO {

    @JsonProperty("name") //返回前端事的字段为name
    private String categoryName;

    @JsonProperty("type")
    private Integer categoryType;

    @JsonProperty("foods")
    private List<ProductInfoVO> productInfoVOList;

}
