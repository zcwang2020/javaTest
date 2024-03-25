package meta.data;

import lombok.Data;

@Data
public class OrderData {

    private Integer datatype = 1;

    private OrderDetailData data;
}
