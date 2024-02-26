package com.eli.springbootvue.exception;

/**
 * @author zhonghaishi
 */
public enum ServiceCode {

    SUCCESS(200, "成功"),
    DEFAULT_ERROR(400, "系统错误"),
    PARAM_ERROR(401, "参数错误"),

    WX_RPC_ERROR(402, "调用微信失败"),

    // 业务错误码
    ACTIVITY_NOT_FOUND(601, "先享卡活动不存在"),
    ACTIVITY_INVALID(602, "无效的先享卡活动"),
    CARD_NOT_FOUND(603, "先享卡订单不存在"),
    CARD_INVALID(604, "先享卡已失效"),
    WECHAT_UPDATE_ERR(605, "微信更新先享卡失败"),
    BENEFIT_REFUND_ERR(606, "权益逆向异常"),

    PAYSCORE_ORDER_STATUS_ERR(607, "支付分订单状态非进行中"),
    PAYSCORE_ORDER_ERR(608, "支付分订单不存在"),
    //支付分订单
    DUPLICATE(700, "重复操作订单"),
    WX_ORDER_FAIL(701, "微信下单失败"),
    WX_ORDER_NOT_FOUND(702, "记录不存在"),
    WX_ORDER_STATUS_INVALID(703, "订单状态不满足操作要求"),
    WX_ORDER_CANCEL_ERR(704, "取消订单失败"),
    WX_ORDER_SETTLE_ERR(705, "发起结算失败"),
    WX_ORDER_MODIFY_ERR(706, "修改订单失败"),
    USER_NO_AUTH(707, "用户未授权"),
    USER_AUTH_OPENID(708, "授权用户openId为空"),
    //进行中订单超过3笔
    WX_ORDER_FAIL_FOR_UN_FINISH_ORDER(709, "下单失败，存在未完结订单"),
    //存在待支付订单，支付分提高门槛等情况
    WX_ORDER_FAIL_NO_PASS(710, "下单失败，综合评估不通过"),

    // alipay
    SYSTEM_ERROR(20000, "服务不可用"),
    PERMISSION_INSUFFICIENT(20001, "授权权限不足"),
    INVALID_PARAMETER(40001, "缺少必选参数"),
    ILLEGAL_PARAMETER(40002, "非法的参数"),
    BUSINESS_ERROR(40004, "业务处理失败"),
    AGREEMENT_BAO(40005, "调用频次超限"),
    NO_PERMISSION(40006, "权限不足"),

    //alipay jobworth
    JOB_WORTH_SIGN_ERROR(50001,"支付宝授权sign调用失败"),
    JOB_WORTH_QUERY_ERROR(50002,"支付宝授权身份查询失败"),
    //drawcamp trigger
    DRAW_CAMP_TRIGGER_ERROR(50003, "营销抽奖活动触发抽奖失败"),
    CRETE_ORDER_FAIL(50004, "订单创建失败"),
    CRETE_ITEM_FAIL(50005, "商品创建失败"),
    UPDATE_FILE_ERR(50006, "图片上传失败"),
    ;

    private int code;

    private String msg;

    public static ServiceCode genEnumByIntValue(int value) {
        for (ServiceCode item: ServiceCode.values()) {
            if (item.getCode() == value) {
                return item;
            }
        }
        return DEFAULT_ERROR;
    }

    ServiceCode(int code, String msg) {
        this.code = code;
        this.msg = msg;
    }

    public int getCode() {
        return code;
    }

    public String getMsg() {
        return msg;
    }
}
