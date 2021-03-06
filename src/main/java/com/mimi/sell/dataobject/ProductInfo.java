package com.mimi.sell.dataobject;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.math.BigDecimal;

/**
 * 商品
 * @author yami fang
 * @since 22:13 2018/3/14
 */

@Entity
@Data
public class ProductInfo {
    @Id
    private String productId;
    /** 名字. */
    private String productName;
    /** 单价. */
    private BigDecimal productPrice;
    /** 库存 */
    private Integer productStock;
    /** 描述. */
    private String productDescription;
    /** 图片. */
    private String productIcon;
    /** 状态.0正常，1下架 */
    private String productStatus;
    /** 类目编号. */
    private Integer categoryType;
}
