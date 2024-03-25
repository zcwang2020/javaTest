package meta.data;

import lombok.Data;

@Data
public class OrderDetailPriceData {

    private Double price;

    private Long goodsid;

    private Long skuid;

    private Integer count;
}
