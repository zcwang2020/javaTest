package com.example.properties;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

/**
 * @Author wzc
 * @Date 2022/10/29
 */
@ConfigurationProperties(prefix = "tools.ip")
@Component("ipProperties")
public class IpProperties {

    /**
     * 周期循环时间
     */
    private Integer cycle = 5;

    /**
     * 周期循环清空
     */
    private Boolean cycleReset = false;

    /**
     * 展示类型
     */
    private String model = modelEnum.DETAIL.type;

    public enum modelEnum {
        DETAIL("detail"),
        SIMPLE("simple");

        private String type;

        modelEnum(String type) {
            this.type = type;
        }

        public String getType() {
            return type;
        }
    }

    public Integer getCycle() {
        return cycle;
    }

    public void setCycle(Integer cycle) {
        this.cycle = cycle;
    }

    public Boolean getCycleReset() {
        return cycleReset;
    }

    public void setCycleReset(Boolean cycleReset) {
        this.cycleReset = cycleReset;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }
}
