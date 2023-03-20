/**
 * @(#)CountTest.java, 2023/3/7.
 * <p/>
 * Copyright 2023 Netease, Inc. All rights reserved.
 * NETEASE PROPRIETARY/CONFIDENTIAL. Use is subject to license terms.
 */
package work;

import java.util.List;
import java.util.stream.Collectors;

import com.alibaba.fastjson.JSON;

/**
 * @Author zcwang
 * @Date 2023/3/7
 */
public class CountTest {

    public static void main(String[] args) {


        String json = "[{\"level\":1,\"upgradeQuantity\":2500,\"upgradeAward\":5},{\"level\":2,\"upgradeQuantity\":10000,\"upgradeAward\":5},{\"level\":3,\"upgradeQuantity\":20000,\"upgradeAward\":10},{\"level\":4,\"upgradeQuantity\":80000,\"upgradeAward\":10},{\"level\":5,\"upgradeQuantity\":180000,\"upgradeAward\":15},{\"level\":6,\"upgradeQuantity\":500000,\"upgradeAward\":15},{\"level\":7,\"upgradeQuantity\":900000,\"upgradeAward\":20},{\"level\":8,\"upgradeQuantity\":1400000,\"upgradeAward\":20},{\"level\":9,\"upgradeQuantity\":1900000,\"upgradeAward\":25},{\"level\":10,\"upgradeQuantity\":2500000,\"upgradeAward\":25},{\"level\":11,\"upgradeQuantity\":3100000,\"upgradeAward\":30},{\"level\":12,\"upgradeQuantity\":3700000,\"upgradeAward\":30},{\"level\":13,\"upgradeQuantity\":4400000,\"upgradeAward\":35},{\"level\":14,\"upgradeQuantity\":5100000,\"upgradeAward\":35},{\"level\":15,\"upgradeQuantity\":5900000,\"upgradeAward\":40},{\"level\":16,\"upgradeQuantity\":6800000,\"upgradeAward\":40},{\"level\":17,\"upgradeQuantity\":7800000,\"upgradeAward\":45},{\"level\":18,\"upgradeQuantity\":8800000,\"upgradeAward\":45},{\"level\":19,\"upgradeQuantity\":10000000,\"upgradeAward\":50},{\"level\":20,\"upgradeQuantity\":11200000,\"upgradeAward\":50},{\"level\":21,\"upgradeQuantity\":12600000,\"upgradeAward\":55},{\"level\":22,\"upgradeQuantity\":14100000,\"upgradeAward\":60},{\"level\":23,\"upgradeQuantity\":15600000,\"upgradeAward\":65},{\"level\":24,\"upgradeQuantity\":17300000,\"upgradeAward\":70},{\"level\":25,\"upgradeQuantity\":19100000,\"upgradeAward\":75},{\"level\":26,\"upgradeQuantity\":21000000,\"upgradeAward\":80},{\"level\":27,\"upgradeQuantity\":23000000,\"upgradeAward\":85},{\"level\":28,\"upgradeQuantity\":25200000,\"upgradeAward\":90},{\"level\":29,\"upgradeQuantity\":27500000,\"upgradeAward\":95},{\"level\":30,\"upgradeQuantity\":29900000,\"upgradeAward\":100},{\"level\":31,\"upgradeQuantity\":32500000,\"upgradeAward\":105},{\"level\":32,\"upgradeQuantity\":35200000,\"upgradeAward\":110},{\"level\":33,\"upgradeQuantity\":38000000,\"upgradeAward\":115},{\"level\":34,\"upgradeQuantity\":41100000,\"upgradeAward\":120},{\"level\":35,\"upgradeQuantity\":44200000,\"upgradeAward\":125},{\"level\":36,\"upgradeQuantity\":47500000,\"upgradeAward\":130},{\"level\":37,\"upgradeQuantity\":51000000,\"upgradeAward\":135},{\"level\":38,\"upgradeQuantity\":54700000,\"upgradeAward\":140},{\"level\":39,\"upgradeQuantity\":58500000,\"upgradeAward\":145},{\"level\":40,\"upgradeQuantity\":62500000,\"upgradeAward\":150},{\"level\":41,\"upgradeQuantity\":66700000,\"upgradeAward\":160},{\"level\":42,\"upgradeQuantity\":71000000,\"upgradeAward\":170},{\"level\":43,\"upgradeQuantity\":75500000,\"upgradeAward\":180},{\"level\":44,\"upgradeQuantity\":80300000,\"upgradeAward\":190},{\"level\":45,\"upgradeQuantity\":85200000,\"upgradeAward\":200},{\"level\":46,\"upgradeQuantity\":90300000,\"upgradeAward\":210},{\"level\":47,\"upgradeQuantity\":95600000,\"upgradeAward\":220},{\"level\":48,\"upgradeQuantity\":101200000,\"upgradeAward\":230},{\"level\":49,\"upgradeQuantity\":106900000,\"upgradeAward\":240},{\"level\":50,\"upgradeQuantity\":112800000,\"upgradeAward\":250},{\"level\":51,\"upgradeQuantity\":119000000,\"upgradeAward\":260},{\"level\":52,\"upgradeQuantity\":125400000,\"upgradeAward\":270},{\"level\":53,\"upgradeQuantity\":132000000,\"upgradeAward\":280},{\"level\":54,\"upgradeQuantity\":138800000,\"upgradeAward\":290},{\"level\":55,\"upgradeQuantity\":145900000,\"upgradeAward\":300},{\"level\":56,\"upgradeQuantity\":153200000,\"upgradeAward\":310},{\"level\":57,\"upgradeQuantity\":160800000,\"upgradeAward\":320},{\"level\":58,\"upgradeQuantity\":168500000,\"upgradeAward\":330},{\"level\":59,\"upgradeQuantity\":176600000,\"upgradeAward\":340},{\"level\":60,\"upgradeQuantity\":184900000,\"upgradeAward\":350},{\"level\":61,\"upgradeQuantity\":193400000,\"upgradeAward\":360},{\"level\":62,\"upgradeQuantity\":202200000,\"upgradeAward\":370},{\"level\":63,\"upgradeQuantity\":211300000,\"upgradeAward\":380},{\"level\":64,\"upgradeQuantity\":220600000,\"upgradeAward\":390},{\"level\":65,\"upgradeQuantity\":230200000,\"upgradeAward\":400},{\"level\":66,\"upgradeQuantity\":240100000,\"upgradeAward\":410},{\"level\":67,\"upgradeQuantity\":250200000,\"upgradeAward\":420},{\"level\":68,\"upgradeQuantity\":260700000,\"upgradeAward\":430},{\"level\":69,\"upgradeQuantity\":271400000,\"upgradeAward\":440},{\"level\":70,\"upgradeQuantity\":282400000,\"upgradeAward\":450},{\"level\":71,\"upgradeQuantity\":293700000,\"upgradeAward\":460},{\"level\":72,\"upgradeQuantity\":305300000,\"upgradeAward\":470},{\"level\":73,\"upgradeQuantity\":317300000,\"upgradeAward\":480},{\"level\":74,\"upgradeQuantity\":329500000,\"upgradeAward\":490},{\"level\":75,\"upgradeQuantity\":342000000,\"upgradeAward\":500},{\"level\":76,\"upgradeQuantity\":354800000,\"upgradeAward\":520},{\"level\":77,\"upgradeQuantity\":368000000,\"upgradeAward\":540},{\"level\":78,\"upgradeQuantity\":381500000,\"upgradeAward\":560},{\"level\":79,\"upgradeQuantity\":395300000,\"upgradeAward\":580},{\"level\":80,\"upgradeQuantity\":409400000,\"upgradeAward\":600},{\"level\":81,\"upgradeQuantity\":423900000,\"upgradeAward\":640},{\"level\":83,\"upgradeQuantity\":453800000,\"upgradeAward\":660},{\"level\":84,\"upgradeQuantity\":469300000,\"upgradeAward\":680},{\"level\":85,\"upgradeQuantity\":485100000,\"upgradeAward\":700},{\"level\":86,\"upgradeQuantity\":501300000,\"upgradeAward\":720},{\"level\":87,\"upgradeQuantity\":517900000,\"upgradeAward\":740},{\"level\":88,\"upgradeQuantity\":534800000,\"upgradeAward\":760},{\"level\":89,\"upgradeQuantity\":552100000,\"upgradeAward\":780},{\"level\":90,\"upgradeQuantity\":569700000,\"upgradeAward\":800},{\"level\":91,\"upgradeQuantity\":587700000,\"upgradeAward\":820},{\"level\":92,\"upgradeQuantity\":606100000,\"upgradeAward\":840},{\"level\":93,\"upgradeQuantity\":624800000,\"upgradeAward\":860},{\"level\":94,\"upgradeQuantity\":644000000,\"upgradeAward\":880},{\"level\":95,\"upgradeQuantity\":663500000,\"upgradeAward\":900},{\"level\":96,\"upgradeQuantity\":683400000,\"upgradeAward\":920},{\"level\":97,\"upgradeQuantity\":703800000,\"upgradeAward\":940},{\"level\":98,\"upgradeQuantity\":724500000,\"upgradeAward\":960},{\"level\":99,\"upgradeQuantity\":745600000,\"upgradeAward\":980},{\"level\":100,\"upgradeQuantity\":767100000,\"upgradeAward\":1000}]";
        List<BoomConfig> boomConfigList = JSON.parseArray(json, BoomConfig.class);
        int index = 0;
        long hasUseBoom = 14681121287L - 590828787L;
        Long needBoom = 0L;
        Long totalBoom = 14681121287L;
        while (index < boomConfigList.size()) {
            //升级所需的繁荣度
            Long upgradeQuantity = boomConfigList.get(index).getUpgradeQuantity();
            //升级奖励的存款值
            Long upgradeAward = boomConfigList.get(index).getUpgradeAward();
            needBoom = needBoom + upgradeQuantity;
            if (needBoom > hasUseBoom && totalBoom >= needBoom) {
                System.out.println("升级");
            }
            if(needBoom > totalBoom){
                break;
            }
            index ++;
        }

        System.out.println("boomConfigList.size() = " + boomConfigList.size());
        long upgradeQuantity = boomConfigList.stream().mapToLong(BoomConfig::getUpgradeQuantity).sum();
        System.out.println("upgradeQuantity = " + upgradeQuantity);
        List<BoomConfig> collect = boomConfigList.stream().filter(boomConfig -> boomConfig.getLevel() <= 91).collect(Collectors.toList());
        long sum50 = collect.stream().mapToLong(BoomConfig::getUpgradeQuantity).sum();
        System.out.println("sum50 = " + sum50);
        long awardSum50 = collect.stream().mapToLong(BoomConfig::getUpgradeAward).sum();
        System.out.println("awardSum50 = " + awardSum50);
        long upgradeAward = boomConfigList.stream().mapToLong(BoomConfig::getUpgradeAward).sum();
        System.out.println("upgradeAward = " + upgradeAward);


    }
}