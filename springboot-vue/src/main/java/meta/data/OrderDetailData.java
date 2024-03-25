package meta.data;

import com.alibaba.fastjson.JSONObject;
import lombok.Data;

import java.util.List;

@Data
public class OrderDetailData {

    private Long order_id;

    private String order_source;

    private List<OrderDetailPriceData> detail_price;

    private Double order_price;

    private Long order_timestamp;

    private OrderUserData user_info;

    private JSONObject ext_info;

    private String newsDevice;
}
