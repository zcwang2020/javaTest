package com.eli.springbootvue;

import com.alibaba.fastjson.JSON;
import com.eli.springbootvue.data.CalendarBO;
import com.eli.springbootvue.data.WeekInfoBO;
import com.eli.springbootvue.util.DateUtils;
import lombok.extern.slf4j.Slf4j;
import meta.test.ArrayAlg;
import org.junit.jupiter.api.Test;
import org.junit.platform.commons.util.StringUtils;
import org.springframework.boot.test.context.SpringBootTest;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
@Slf4j
@SpringBootTest
class SpringbootVueApplicationTests {

    @Test
    void contextLoads() {
    }

    /*@Test
    void getString() {

        DataUploadDTO dataUploadDTO = new DataUploadDTO();
        DataUploadBatchDTO dataUploadBatchDTO = new DataUploadBatchDTO();
        dataUploadBatchDTO.setCrowdIds("cxw_test");
        dataUploadBatchDTO.setBatchId("1");
        dataUploadBatchDTO.setDeviceIds("10000001");
        dataUploadBatchDTO.setDeviceType("iemi");
        List<DataUploadBatchDTO> dataUploadBatchDTOS = Lists.newArrayList(dataUploadBatchDTO);
        dataUploadDTO.setBatchDTOList(dataUploadBatchDTOS);

        ArrayList<TuiBeiDataTO> arrayList = Lists.newArrayList();
        for (DataUploadBatchDTO dataUploadBatchTO : dataUploadBatchDTOS) {
            TuiBeiDataTO tuiBeiDataTO = new TuiBeiDataTO();
            tuiBeiDataTO.setCrowId(dataUploadBatchTO.getCrowdIds());
            tuiBeiDataTO.setBatchId(dataUploadBatchTO.getBatchId());
            tuiBeiDataTO.setDeviceType(dataUploadBatchTO.getDeviceType());
            tuiBeiDataTO.setDeviceId(dataUploadBatchTO.getDeviceIds());
            arrayList.add(tuiBeiDataTO);
        }

        List<String> deviceIdList = arrayList.stream().map(TuiBeiDataTO::getDeviceId).toList();
        List<String> MD5DeviceIdList = deviceIdList.stream().map(TuiBeiMd5Utils::computeMD5).toList();

        Map<String, String> param = new HashMap<>();
        String join = String.join(",", MD5DeviceIdList);
        param.put("deviceIds", join);

        System.out.println("join = " + join);

        System.out.println("param = " + param);
    }*/

    @Test
    void testTime() {
        int monthOfYear = DateUtils.getMonthOfYear(1704081600000L);
        System.out.println("monthOfYear = " + monthOfYear);
        long monthsDelayTime = DateUtils.getMonthsDelayTime(1704081600000L, -1);

        int lastMonth = DateUtils.getMonthOfYear(monthsDelayTime);
        System.out.println("lastMonth = " + lastMonth);

        int year = DateUtils.getYear(System.currentTimeMillis());
        System.out.println("year = " + year);

        String format = String.format("%02d", 1);
        System.out.println("format = " + format);

        int lastDayOfMonth = DateUtils.getLastDayOfMonth(1675224000000L);
        System.out.println("lastDayOfMonth = " + lastDayOfMonth);
    }

    @Test
    void testMyPair() {
        LocalDate[] birthdays = {
                LocalDate.of(1906, 12, 9),
                LocalDate.of(1815, 12, 10),
                LocalDate.of(1903, 12, 3),
                LocalDate.of(1910, 6, 22),
        };
        ArrayAlg.MyPair<LocalDate> minmax = ArrayAlg.minmax(birthdays);
        System.out.println("minmax = " + minmax);
        // 打印最大值和最小值
        System.out.println("minmax.getFirst() = " + minmax.getFirst());
        System.out.println("minmax.getSecond() = " + minmax.getSecond());
    }

    @Test
    void testA() {
        int i = DateUtils.monthInterval("2023-08", "2024-01");
        System.out.println("i = " + i);
    }

    @Test
    void timeTest() {
        /**奇数图片*/
        String oddStr = "[{\"subject\":\"杏色\",\"remark\":\"奇月Day1. 拥有一个神奇的电蒸锅，/n懒觉和早餐都不误。\",\"itemGroup\":null,\"picUrl\":\"https://yanxuan.nosdn.127.net/static-union/1682047184acfa91.jpg\",\"signInIntegral\":1,\"consecutivePoint\":1,\"linkUrl\":null,\"buttonMsg\":null},{\"subject\":\"黄色\",\"remark\":\"奇月Day2. 对半切开，/n就可以像西瓜一样直接啃着吃。\",\"itemGroup\":null,\"picUrl\":\"https://yanxuan.nosdn.127.net/static-union/1682047184cafb30.jpg\",\"signInIntegral\":1,\"consecutivePoint\":1,\"linkUrl\":null,\"buttonMsg\":null},{\"subject\":\"绿色\",\"remark\":\"奇月Day3. 记得在房间里保留一扇窗，/n远处的绿是眼睛转晴的开关。\",\"itemGroup\":null,\"picUrl\":\"https://yanxuan.nosdn.127.net/static-union/1682047184ae5662.jpg\",\"signInIntegral\":1,\"consecutivePoint\":1,\"linkUrl\":null,\"buttonMsg\":null},{\"subject\":\"蓝色\",\"remark\":\"奇月Day4. 我把属于春天的花仔细拓印，/n编写一曲不停吟唱的田园牧歌。\",\"itemGroup\":null,\"picUrl\":\"https://yanxuan.nosdn.127.net/static-union/168204718462bf1e.jpg\",\"signInIntegral\":1,\"consecutivePoint\":1,\"linkUrl\":null,\"buttonMsg\":null},{\"subject\":\"橙色\",\"remark\":\"奇月Day5. 柠檬汁水带回久违的食欲，/n融化38度高温下疯长的烦恼。\",\"itemGroup\":null,\"picUrl\":\"https://yanxuan.nosdn.127.net/static-union/16820471848df7b7.jpg\",\"signInIntegral\":1,\"consecutivePoint\":1,\"linkUrl\":null,\"buttonMsg\":null},{\"subject\":\"粉色\",\"remark\":\"奇月Day6. 云朵偷喝了四月的樱花酒，/n留下整片雾粉色的天空。\",\"itemGroup\":null,\"picUrl\":\"https://yanxuan.nosdn.127.net/static-union/16820471849414a8.jpg\",\"signInIntegral\":1,\"consecutivePoint\":1,\"linkUrl\":null,\"buttonMsg\":null},{\"subject\":\"薄荷绿\",\"remark\":\"奇月Day7. 和猫咪趣味互动，/n治愈一整天的疲惫。\",\"itemGroup\":null,\"picUrl\":\"https://yanxuan.nosdn.127.net/static-union/1682047185edab7b.jpg\",\"signInIntegral\":1,\"consecutivePoint\":1,\"linkUrl\":null,\"buttonMsg\":null},{\"subject\":\"白色\",\"remark\":\"奇月Day8. 勇敢咬下去才有机会知晓，/n生活给的糖是什么味道。\",\"itemGroup\":null,\"picUrl\":\"https://yanxuan.nosdn.127.net/static-union/1683280453f3ccdd.jpg\",\"signInIntegral\":1,\"consecutivePoint\":1,\"linkUrl\":null,\"buttonMsg\":null},{\"subject\":\"绿色\",\"remark\":\"奇月Day9. 十月的桂雨被小心珍藏，/n打开时便来到秋风下的江南。\",\"itemGroup\":null,\"picUrl\":\"https://yanxuan.nosdn.127.net/static-union/1683280453156005.jpg\",\"signInIntegral\":1,\"consecutivePoint\":1,\"linkUrl\":null,\"buttonMsg\":null},{\"subject\":\"橙色\",\"remark\":\"奇月Day10. 谁会拒绝夏日的橙花香气，/n像极了百灵鸟的吟唱。\",\"itemGroup\":null,\"picUrl\":\"https://yanxuan.nosdn.127.net/static-union/1683280453799bad.jpg\",\"signInIntegral\":1,\"consecutivePoint\":1,\"linkUrl\":null,\"buttonMsg\":null},{\"subject\":\"蓝色\",\"remark\":\"奇月Day11. 光影与玻璃合作一场魔术，/n在方寸间倒映出无限斑斓。\",\"itemGroup\":null,\"picUrl\":\"https://yanxuan.nosdn.127.net/static-union/1683280453d0096e.jpg\",\"signInIntegral\":1,\"consecutivePoint\":1,\"linkUrl\":null,\"buttonMsg\":null},{\"subject\":\"灰色\",\"remark\":\"奇月Day12. 允许自己躺平一秒，/n积蓄起对抗焦虑和困境的力量。\",\"itemGroup\":null,\"picUrl\":\"https://yanxuan.nosdn.127.net/static-union/1683280453032b2c.jpg\",\"signInIntegral\":1,\"consecutivePoint\":1,\"linkUrl\":null,\"buttonMsg\":null},{\"subject\":\"黄色\",\"remark\":\"奇月Day13. 有蛋糕的日子都不算太坏，/n用仪式感添加少许多巴胺。\",\"itemGroup\":null,\"picUrl\":\"https://yanxuan.nosdn.127.net/static-union/168328045318e299.jpg\",\"signInIntegral\":1,\"consecutivePoint\":1,\"linkUrl\":null,\"buttonMsg\":null},{\"subject\":\"棕色\",\"remark\":\"奇月Day14. 一支香里流淌了千年的古朴诗意，/n营造一段30分钟的时光旅行。\",\"itemGroup\":null,\"picUrl\":\"https://yanxuan.nosdn.127.net/static-union/1683280454fe5df2.jpg\",\"signInIntegral\":1,\"consecutivePoint\":1,\"linkUrl\":null,\"buttonMsg\":null},{\"subject\":\"粉色\",\"remark\":\"奇月Day15. 粉色柔软且玫瑰脆弱，/n却把坚定不移的爱意娓娓诉说。\",\"itemGroup\":null,\"picUrl\":\"https://yanxuan.nosdn.127.net/static-union/16832804548cda81.jpg\",\"signInIntegral\":1,\"consecutivePoint\":1,\"linkUrl\":null,\"buttonMsg\":null},{\"subject\":\"红色\",\"remark\":\"奇月Day16. 当你以微笑面对镜子，/n世界便盛开了另一朵笑容。\",\"itemGroup\":null,\"picUrl\":\"https://yanxuan.nosdn.127.net/static-union/168328045430e62f.jpg\",\"signInIntegral\":1,\"consecutivePoint\":1,\"linkUrl\":null,\"buttonMsg\":null},{\"subject\":\"紫色\",\"remark\":\"奇月Day17. 成年人的世界里没有童话，/n但有不凋谢的花和为你筑梦的人。\",\"itemGroup\":null,\"picUrl\":\"https://yanxuan.nosdn.127.net/static-union/1683280454ae5662.jpg\",\"signInIntegral\":1,\"consecutivePoint\":1,\"linkUrl\":null,\"buttonMsg\":null},{\"subject\":\"金色\",\"remark\":\"奇月Day18. 是微小而精致的日用之物，/n让普通日常闪出细碎的光。\",\"itemGroup\":null,\"picUrl\":\"https://yanxuan.nosdn.127.net/static-union/168328045462bf1e.jpg\",\"signInIntegral\":1,\"consecutivePoint\":1,\"linkUrl\":null,\"buttonMsg\":null},{\"subject\":\"青色\",\"remark\":\"奇月Day19. 青涩凶猛被时间浸润成蜜糖，/n留下脱胎换骨后的清甜。\",\"itemGroup\":null,\"picUrl\":\"https://yanxuan.nosdn.127.net/static-union/16832804548df7b7.jpg\",\"signInIntegral\":1,\"consecutivePoint\":1,\"linkUrl\":null,\"buttonMsg\":null},{\"subject\":\"白色\",\"remark\":\"奇月Day20. 闭上眼放空一切感官，/n感受风播种的花草香。\",\"itemGroup\":null,\"picUrl\":\"https://yanxuan.nosdn.127.net/static-union/16832804559414a8.jpg\",\"signInIntegral\":1,\"consecutivePoint\":1,\"linkUrl\":null,\"buttonMsg\":null},{\"subject\":\"黑色\",\"remark\":\"奇月Day21. 干杯庆祝每个微小愿望的达成，/n也庆祝这不曾虚度的周末。\",\"itemGroup\":null,\"picUrl\":\"https://yanxuan.nosdn.127.net/static-union/1683280455edab7b.jpg\",\"signInIntegral\":1,\"consecutivePoint\":1,\"linkUrl\":null,\"buttonMsg\":null},{\"subject\":\"粉色\",\"remark\":\"奇月Day22. 水蜜桃味儿的空气和记忆关联，/n渲染成一个又一个粉色梦境。\",\"itemGroup\":null,\"picUrl\":\"https://yanxuan.nosdn.127.net/static-union/1683341350d19b36.jpg\",\"signInIntegral\":1,\"consecutivePoint\":1,\"linkUrl\":null,\"buttonMsg\":null},{\"subject\":\"蓝色\",\"remark\":\"奇月Day23. 收集了天空的蓝和果冻的软，/n织出冰凉凉的夏被和一夜安睡。\",\"itemGroup\":null,\"picUrl\":\"https://yanxuan.nosdn.127.net/static-union/16833413502dc4fc.jpg\",\"signInIntegral\":1,\"consecutivePoint\":1,\"linkUrl\":null,\"buttonMsg\":null},{\"subject\":\"橙色\",\"remark\":\"奇月Day24. 冰箱里不断货的蜜桔罐头，/n给人随时拥有满分心情的能力。\",\"itemGroup\":null,\"picUrl\":\"https://yanxuan.nosdn.127.net/static-union/16833413501a7bd7.jpg\",\"signInIntegral\":1,\"consecutivePoint\":1,\"linkUrl\":null,\"buttonMsg\":null},{\"subject\":\"银灰色\",\"remark\":\"奇月Day25. 酷酷的银灰色自带科技感，/n心安理得做聪明懒人吧！\",\"itemGroup\":null,\"picUrl\":\"https://yanxuan.nosdn.127.net/static-union/1683341350ad7b10.jpg\",\"signInIntegral\":1,\"consecutivePoint\":1,\"linkUrl\":null,\"buttonMsg\":null},{\"subject\":\"紫色\",\"remark\":\"奇月Day26. 听说0度的冰面包没有热量，/n让甜蜜在嘴里爆炸。\",\"itemGroup\":null,\"picUrl\":\"https://yanxuan.nosdn.127.net/static-union/1683341350864522.jpg\",\"signInIntegral\":1,\"consecutivePoint\":1,\"linkUrl\":null,\"buttonMsg\":null},{\"subject\":\"黄色\",\"remark\":\"奇月Day27. 谁能抵挡深夜的一碗面，/n提供热气腾腾的补给。\",\"itemGroup\":null,\"picUrl\":\"https://yanxuan.nosdn.127.net/static-union/1683341350bfa08a.jpg\",\"signInIntegral\":1,\"consecutivePoint\":1,\"linkUrl\":null,\"buttonMsg\":null},{\"subject\":\"绿色\",\"remark\":\"奇月Day28. 用心的摆盘提升食物的风味，/n漂亮的杯子把凉白开变甘露。\",\"itemGroup\":null,\"picUrl\":\"https://yanxuan.nosdn.127.net/static-union/16833413505d802a.jpg\",\"signInIntegral\":1,\"consecutivePoint\":1,\"linkUrl\":null,\"buttonMsg\":null},{\"subject\":\"咖色\",\"remark\":\"奇月Day29. 调一杯满杯冰块冷萃，/n即刻领取夏日入场券。\",\"itemGroup\":null,\"picUrl\":\"https://yanxuan.nosdn.127.net/static-union/1683341350090c65.jpg\",\"signInIntegral\":1,\"consecutivePoint\":1,\"linkUrl\":null,\"buttonMsg\":null},{\"subject\":\"金色\",\"remark\":\"奇月Day30. 倘若不能时时被光照亮，/n我便追着光，我便成为光。\",\"itemGroup\":null,\"picUrl\":\"https://yanxuan.nosdn.127.net/static-union/1683341350b19973.jpg\",\"signInIntegral\":1,\"consecutivePoint\":1,\"linkUrl\":null,\"buttonMsg\":null},{\"subject\":\"粉色\",\"remark\":\"奇月Day31. 粉色心事摇摇晃晃的消了又长，/n铺陈一地惆怅。\",\"itemGroup\":null,\"picUrl\":\"https://yanxuan.nosdn.127.net/static-union/16833413507d471e.jpg\",\"signInIntegral\":1,\"consecutivePoint\":1,\"linkUrl\":null,\"buttonMsg\":null},{\"subject\":\"绿色\",\"remark\":\"偶月Day1. 去年酿的青梅酒还没喝完，/n微醺不打烊。\",\"itemGroup\":null,\"picUrl\":\"https://yanxuan.nosdn.127.net/static-union/16833413505f8295.jpg\",\"signInIntegral\":1,\"consecutivePoint\":1,\"linkUrl\":null,\"buttonMsg\":null},{\"subject\":\"黄色\",\"remark\":\"偶月Day2. 神医也治不好的起床气，/n会被带有魔力的芝士小饼干治愈。\",\"itemGroup\":null,\"picUrl\":\"https://yanxuan.nosdn.127.net/static-union/16833413504479ca.jpg\",\"signInIntegral\":1,\"consecutivePoint\":1,\"linkUrl\":null,\"buttonMsg\":null},{\"subject\":\"蓝色\",\"remark\":\"偶月Day3. 征服美食宇宙的漫漫长路，/n每一餐都应不被辜负。\",\"itemGroup\":null,\"picUrl\":\"https://yanxuan.nosdn.127.net/static-union/1683341350ce046c.jpg\",\"signInIntegral\":1,\"consecutivePoint\":1,\"linkUrl\":null,\"buttonMsg\":null},{\"subject\":\"紫色\",\"remark\":\"偶月Day4. 当你的床上躺着一只猫，/n现在的世界只剩柔软。\",\"itemGroup\":null,\"picUrl\":\"https://yanxuan.nosdn.127.net/static-union/168334135029e794.jpg\",\"signInIntegral\":1,\"consecutivePoint\":1,\"linkUrl\":null,\"buttonMsg\":null},{\"subject\":\"蓝色\",\"remark\":\"偶月Day5. 洗过的头发充满清冽的海洋味道，/n就好像今天去了海边。\",\"itemGroup\":null,\"picUrl\":\"https://yanxuan.nosdn.127.net/static-union/16722989436cc273.jpg\",\"signInIntegral\":1,\"consecutivePoint\":1,\"linkUrl\":null,\"buttonMsg\":null},{\"subject\":\"红色\",\"remark\":\"偶月Day6. 把生活过得热气腾腾的人，/n最懂藏在红色里的生机与火热。\",\"itemGroup\":null,\"picUrl\":\"https://yanxuan.nosdn.127.net/static-union/1673404162fc7aae.jpg\",\"signInIntegral\":1,\"consecutivePoint\":1,\"linkUrl\":null,\"buttonMsg\":null}]";
        List<CalendarBO> oddPicList = JSON.parseArray(oddStr, CalendarBO.class);

        /**偶数图片*/
        String evenStr = "[{\"subject\":\"绿色\",\"remark\":\"偶月Day1. 去年酿的青梅酒还没喝完，/n微醺不打烊。\",\"itemGroup\":null,\"picUrl\":\"https://yanxuan.nosdn.127.net/static-union/16833413505f8295.jpg\",\"signInIntegral\":1,\"consecutivePoint\":1,\"linkUrl\":null,\"buttonMsg\":null},{\"subject\":\"黄色\",\"remark\":\"偶月Day2. 神医也治不好的起床气，/n会被带有魔力的芝士小饼干治愈。\",\"itemGroup\":null,\"picUrl\":\"https://yanxuan.nosdn.127.net/static-union/16833413504479ca.jpg\",\"signInIntegral\":1,\"consecutivePoint\":1,\"linkUrl\":null,\"buttonMsg\":null},{\"subject\":\"蓝色\",\"remark\":\"偶月Day3. 征服美食宇宙的漫漫长路，/n每一餐都应不被辜负。\",\"itemGroup\":null,\"picUrl\":\"https://yanxuan.nosdn.127.net/static-union/1683341350ce046c.jpg\",\"signInIntegral\":1,\"consecutivePoint\":1,\"linkUrl\":null,\"buttonMsg\":null},{\"subject\":\"紫色\",\"remark\":\"偶月Day4. 当你的床上躺着一只猫，/n现在的世界只剩柔软。\",\"itemGroup\":null,\"picUrl\":\"https://yanxuan.nosdn.127.net/static-union/168334135029e794.jpg\",\"signInIntegral\":1,\"consecutivePoint\":1,\"linkUrl\":null,\"buttonMsg\":null},{\"subject\":\"蓝色\",\"remark\":\"偶月Day5. 洗过的头发充满清冽的海洋味道，/n就好像今天去了海边。\",\"itemGroup\":null,\"picUrl\":\"https://yanxuan.nosdn.127.net/static-union/16722989436cc273.jpg\",\"signInIntegral\":1,\"consecutivePoint\":1,\"linkUrl\":null,\"buttonMsg\":null},{\"subject\":\"红色\",\"remark\":\"偶月Day6. 把生活过得热气腾腾的人，/n最懂藏在红色里的生机与火热。\",\"itemGroup\":null,\"picUrl\":\"https://yanxuan.nosdn.127.net/static-union/1673404162fc7aae.jpg\",\"signInIntegral\":1,\"consecutivePoint\":1,\"linkUrl\":null,\"buttonMsg\":null},{\"subject\":\"绿色\",\"remark\":\"偶月Day7. 明前头采的龙井是限量的，/n但不妨多看几眼无限碧绿的春光。\",\"itemGroup\":null,\"picUrl\":\"https://yanxuan.nosdn.127.net/static-union/1673404162dbf304.jpg\",\"signInIntegral\":1,\"consecutivePoint\":1,\"linkUrl\":null,\"buttonMsg\":null},{\"subject\":\"黄色\",\"remark\":\"偶月Day8. 不惧怕成为耀眼的中心，/n成为永不熄灭的小小太阳吧。\",\"itemGroup\":null,\"picUrl\":\"https://yanxuan.nosdn.127.net/static-union/16734041610034b1.jpg\",\"signInIntegral\":1,\"consecutivePoint\":1,\"linkUrl\":null,\"buttonMsg\":null},{\"subject\":\"紫色\",\"remark\":\"偶月Day9. 如果长时间凝视紫色，/n你会得到整个宇宙的浪漫。\",\"itemGroup\":null,\"picUrl\":\"https://yanxuan.nosdn.127.net/static-union/1673404161bccce8.jpg\",\"signInIntegral\":1,\"consecutivePoint\":1,\"linkUrl\":null,\"buttonMsg\":null},{\"subject\":\"白色\",\"remark\":\"偶月Day10. 无论有多少种颜色，/n都无可比拟白色蕴藏的无限想象。\",\"itemGroup\":null,\"picUrl\":\"https://yanxuan.nosdn.127.net/static-union/1673404162dc8157.jpg\",\"signInIntegral\":1,\"consecutivePoint\":1,\"linkUrl\":null,\"buttonMsg\":null},{\"subject\":\"金色\",\"remark\":\"偶月Day11. 如同真金坚不可摧，/n金灿灿的晨光总会如约而至。\",\"itemGroup\":null,\"picUrl\":\"https://yanxuan.nosdn.127.net/static-union/16734041626bd4da.jpg\",\"signInIntegral\":1,\"consecutivePoint\":1,\"linkUrl\":null,\"buttonMsg\":null},{\"subject\":\"粉色\",\"remark\":\"偶月Day12. 樱花凋谢了仍会再开，/n关于粉色的浪漫永不落幕。\",\"itemGroup\":null,\"picUrl\":\"https://yanxuan.nosdn.127.net/static-union/1673404162dfd3c0.jpg\",\"signInIntegral\":1,\"consecutivePoint\":1,\"linkUrl\":null,\"buttonMsg\":null},{\"subject\":\"蓝色\",\"remark\":\"偶月Day13. 今晚枕着蓝色入睡，/n做一个克莱因蓝般温柔的梦。\",\"itemGroup\":null,\"picUrl\":\"https://yanxuan.nosdn.127.net/static-union/16734041624e7ebf.jpg\",\"signInIntegral\":1,\"consecutivePoint\":1,\"linkUrl\":null,\"buttonMsg\":null},{\"subject\":\"棕色\",\"remark\":\"偶月Day14. 木头的纹理，/n是大自然写给人类不会变质的情书。\",\"itemGroup\":null,\"picUrl\":\"https://yanxuan.nosdn.127.net/static-union/1673404162adb6c6.jpg\",\"signInIntegral\":1,\"consecutivePoint\":1,\"linkUrl\":null,\"buttonMsg\":null},{\"subject\":\"橙色\",\"remark\":\"偶月Day15. 吃下一口鲜甜水灵的春日滋味，/n生活由此明亮起来。\",\"itemGroup\":null,\"picUrl\":\"https://yanxuan.nosdn.127.net/static-union/1673404162007b09.jpg\",\"signInIntegral\":1,\"consecutivePoint\":1,\"linkUrl\":null,\"buttonMsg\":null},{\"subject\":\"红色\",\"remark\":\"偶月Day16. 新的一天以寓意着幸运的红色开场，/n祈愿美好时常发生。\",\"itemGroup\":null,\"picUrl\":\"https://yanxuan.nosdn.127.net/static-union/16734041626f60a8.jpg\",\"signInIntegral\":1,\"consecutivePoint\":1,\"linkUrl\":null,\"buttonMsg\":null},{\"subject\":\"绿色\",\"remark\":\"偶月Day17. 为自己种下一片小森林，/n绿意滋长生命蓬勃向上。\",\"itemGroup\":null,\"picUrl\":\"https://yanxuan.nosdn.127.net/static-union/1673404162967b9b.jpg\",\"signInIntegral\":1,\"consecutivePoint\":1,\"linkUrl\":null,\"buttonMsg\":null},{\"subject\":\"灰色\",\"remark\":\"偶月Day18. 任世界多么鲜艳，/n灰色仍然保留不过时的高级和低调。\",\"itemGroup\":null,\"picUrl\":\"https://yanxuan.nosdn.127.net/static-union/167340416223580d.jpg\",\"signInIntegral\":1,\"consecutivePoint\":1,\"linkUrl\":null,\"buttonMsg\":null},{\"subject\":\"天青色\",\"remark\":\"偶月Day19. 一碗甜糯汤圆，/n寄托着天下游子的情思\",\"itemGroup\":null,\"picUrl\":\"https://yanxuan.nosdn.127.net/static-union/1676014310f8735d.jpg\",\"signInIntegral\":1,\"consecutivePoint\":1,\"linkUrl\":null,\"buttonMsg\":null},{\"subject\":\"棕色\",\"remark\":\"偶月Day20. 米食忆江南，/n江南暖人间\",\"itemGroup\":null,\"picUrl\":\"https://yanxuan.nosdn.127.net/static-union/1676014310649977.jpg\",\"signInIntegral\":1,\"consecutivePoint\":1,\"linkUrl\":null,\"buttonMsg\":null},{\"subject\":\"红色\",\"remark\":\"偶月Day21. 清冷淡雅的腊梅香，/n有种似曾相识的熟悉感\",\"itemGroup\":null,\"picUrl\":\"https://yanxuan.nosdn.127.net/static-union/167601431044b029.jpg\",\"signInIntegral\":1,\"consecutivePoint\":1,\"linkUrl\":null,\"buttonMsg\":null},{\"subject\":\"灰色\",\"remark\":\"偶月Day22. 咸香的蛋黄搭配清新的绿茶，/n每一口都想私藏\",\"itemGroup\":null,\"picUrl\":\"https://yanxuan.nosdn.127.net/static-union/1676014310b957b2.jpg\",\"signInIntegral\":1,\"consecutivePoint\":1,\"linkUrl\":null,\"buttonMsg\":null},{\"subject\":\"靛蓝色\",\"remark\":\"偶月Day23. 印花布上的蓝白剪影，/n让人一眼回到江南水乡\",\"itemGroup\":null,\"picUrl\":\"https://yanxuan.nosdn.127.net/static-union/16760143112746e2.jpg\",\"signInIntegral\":1,\"consecutivePoint\":1,\"linkUrl\":null,\"buttonMsg\":null},{\"subject\":\"白色\",\"remark\":\"偶月Day24. 芝香浓郁一口酥，/n还原旧时好味道\",\"itemGroup\":null,\"picUrl\":\"https://yanxuan.nosdn.127.net/static-union/167601431138d6e7.jpg\",\"signInIntegral\":1,\"consecutivePoint\":1,\"linkUrl\":null,\"buttonMsg\":null},{\"subject\":\"金黄色\",\"remark\":\"偶月Day25. 圆滚滚的肚子包藏精华，/n是你的抗饿能量包\",\"itemGroup\":null,\"picUrl\":\"https://yanxuan.nosdn.127.net/static-union/167601430925902e.jpg\",\"signInIntegral\":1,\"consecutivePoint\":1,\"linkUrl\":null,\"buttonMsg\":null},{\"subject\":\"原木色\",\"remark\":\"偶月Day26. 走进这日式慵懒的枕边，/n体验忘记时间的裸睡感\",\"itemGroup\":null,\"picUrl\":\"https://yanxuan.nosdn.127.net/static-union/16760143095cb6a4.jpg\",\"signInIntegral\":1,\"consecutivePoint\":1,\"linkUrl\":null,\"buttonMsg\":null},{\"subject\":\"米白色\",\"remark\":\"偶月Day27. 日式敞口大碗，/n吃面才会更畅快\",\"itemGroup\":null,\"picUrl\":\"https://yanxuan.nosdn.127.net/static-union/1676014309e13e1b.jpg\",\"signInIntegral\":1,\"consecutivePoint\":1,\"linkUrl\":null,\"buttonMsg\":null},{\"subject\":\"青色\",\"remark\":\"偶月Day28. 搭配莫兰迪色，/n随手一拍都是时尚大片\",\"itemGroup\":null,\"picUrl\":\"https://yanxuan.nosdn.127.net/static-union/1676014309cea4d1.jpg\",\"signInIntegral\":1,\"consecutivePoint\":1,\"linkUrl\":null,\"buttonMsg\":null},{\"subject\":\"焦黄色\",\"remark\":\"偶月Day29. 酥脆的声音总是惹人爱，/n一口伴着海鲜的原香回味无穷\",\"itemGroup\":null,\"picUrl\":\"https://yanxuan.nosdn.127.net/static-union/16760143090228f7.jpg\",\"signInIntegral\":1,\"consecutivePoint\":1,\"linkUrl\":null,\"buttonMsg\":null},{\"subject\":\"粉色\",\"remark\":\"偶月Day30. 小小的身体，/n却能清除一天的污垢\",\"itemGroup\":null,\"picUrl\":\"https://yanxuan.nosdn.127.net/static-union/16760143090c823e.jpg\",\"signInIntegral\":1,\"consecutivePoint\":1,\"linkUrl\":null,\"buttonMsg\":null},{\"subject\":\"棕色\",\"remark\":\"偶月Day31. 轻松一滚，/n让美变得更加简单\",\"itemGroup\":null,\"picUrl\":\"https://yanxuan.nosdn.127.net/static-union/167601431059b8b5.jpg\",\"signInIntegral\":1,\"consecutivePoint\":1,\"linkUrl\":null,\"buttonMsg\":null},{\"subject\":\"柠檬黄\",\"remark\":\"偶月Day32. 工作再忙，/n它随时都会温暖你的胃\",\"itemGroup\":null,\"picUrl\":\"https://yanxuan.nosdn.127.net/static-union/16760143104e96eb.jpg\",\"signInIntegral\":1,\"consecutivePoint\":1,\"linkUrl\":null,\"buttonMsg\":null}]";
        List<CalendarBO> evenPicList = JSON.parseArray(evenStr, CalendarBO.class);
        String testDate = "2022-03-21";
        // 获取指定星期一及一周的日期集合
        LocalDate now = StringUtils.isBlank(testDate) ? LocalDate.now()
                : LocalDate.parse(testDate, DateTimeFormatter.ofPattern("yyyy-MM-dd"));
        LocalDate monday = now.with(DayOfWeek.MONDAY);
        System.out.println("monday = " + monday);
        List<LocalDate> thisWeekList = new ArrayList<>();
        for (int i = 0; i < 7; i++) {
            LocalDate localDate = monday.plusDays(i);
            thisWeekList.add(localDate);
        }
        System.out.println("thisWeekList = " + thisWeekList);
        // 循环thisWeekList将月份当作索引组装calendarBOS中id
        List<CalendarBO> currentCalendarList = new ArrayList<>(thisWeekList.size());
        for (LocalDate localDate : thisWeekList) {
            List<CalendarBO> calendarBOS;
            if (0 == localDate.getMonthValue() % 2) {
                calendarBOS = evenPicList;
            } else {
                calendarBOS = oddPicList;
            }
            int dayOfMonth = localDate.getDayOfMonth();
            CalendarBO calendarBO = calendarBOS.get(dayOfMonth - 1);
            // 为calendarBO设置id(年+月+日转long)及日期(年-月-日)
            long idFormat = Long.parseLong(localDate.format(DateTimeFormatter.ofPattern("yyyyMMdd")));
            calendarBO.setId(idFormat);
            log.info("idFormat = {}", idFormat);
            String dateFormat = localDate.format(DateTimeFormatter.ofPattern("yyyy-MM-dd"));
            calendarBO.setDate(dateFormat);
            currentCalendarList.add(calendarBO);
        }
        System.out.println("currentCalendarList = " + JSON.toJSONString(currentCalendarList));
        List<CalendarBO> thisWeek = currentCalendarList;
        List<CalendarBO> calendarBOList = thisWeek.stream().sorted(Comparator.comparing(CalendarBO::getId))
                .collect(Collectors.toList());
        List<WeekInfoBO> weekInfoBOList;
        long currentTime = DateUtils.getCurrentTime();
        weekInfoBOList = calendarBOList.stream().map(c -> {
            WeekInfoBO weekInfoBO = new WeekInfoBO();
            weekInfoBO.setDate(c.getDate());
            weekInfoBO.setAttendancePoint(c.getSignInIntegral());
            // 判断是否是当日
            weekInfoBO.setIsToday(DateUtils.getToDayStr().equals(c.getDate()));
            return weekInfoBO;
        }).collect(Collectors.toList());
        System.out.println("weekInfoBOList = " + JSON.toJSONString(weekInfoBOList));
    }

    public static void main(String[] args) {

    }
}
