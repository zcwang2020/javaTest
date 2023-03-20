/**
 * @(#)BoomConfig.java, 2023/3/7.
 * <p/>
 * Copyright 2023 Netease, Inc. All rights reserved.
 * NETEASE PROPRIETARY/CONFIDENTIAL. Use is subject to license terms.
 */
package work;

import lombok.Data;

/**
 * @Author zcwang
 * @Date 2023/3/7
 */
@Data
public class BoomConfig {

    private Integer level;

    private Long upgradeQuantity;

    private Long upgradeAward;
}