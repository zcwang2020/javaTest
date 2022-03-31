package work;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.Set;
import java.util.stream.Collectors;

import org.springframework.util.StringUtils;

import util.BeanUtil;

/**
 * @Author Tmind
 * @Date 2021/11/5
 */
public class WorkTest {
    public static void main(String[] args) {
        //        String name = "恶魔\uD83D\uDE04";
        //        String name = "te)stsda";
        //        System.out.println(encodeNickName(name, 1));
        //        System.out.println(getUserName(name, 1));

        String name = "12哦37)574578485sa";
        System.out.println(name.substring(4));
        System.out.println(name.replace(name.substring(4), "..."));
        /*
         * long time = 1648014740856L; String format = "yyyy-MM-dd"; SimpleDateFormat mydate = new
         * SimpleDateFormat(format); System.out.println(mydate.format(new Date(time)));
         */

        /*
         * ArrayList<Red> sesameRedPacketEntities = new ArrayList<>(); Set<Integer> redPacketSers = new HashSet<>();
         * sesameRedPacketEntities.forEach(redPacketEntity -> redPacketSers.add(redPacketEntity.getStr()));
         * System.out.println(redPacketSers); List<Integer> integers = Arrays.asList(1, 2, 3);
         * redPacketSers.addAll(integers); System.out.println(redPacketSers.contains(1));
         */

        /*
         * Long a = null; Long b = null; Long c = null; Long d = null; List al = new ArrayList(); al.add(a); al.add(b);
         * al.add(c); al.add(d); System.out.println(al);
         */
        /*
         * Integer a1 = 1; Integer b2 = 9; Integer c3 = 10; Integer d4 = 16; Integer e5 = 23; Integer f6 = 33; Integer
         * g7 = 80; List<Integer> ilist = Arrays.asList(a1, b2, c3, d4, e5, f6, g7); Integer changeLevel = 10; Integer
         * maxShapeLevel = 4; for (Integer integer: ilist) { int shapeLevel = integer % changeLevel >= 0 ? integer /
         * changeLevel + 1 : integer / changeLevel; if (shapeLevel >= maxShapeLevel) { shapeLevel = maxShapeLevel; }
         * System.out.println("nowlevel:" + integer + "change =" + shapeLevel); }
         */

        System.out.println("---------------※-------------");
        // 数据库数据

        Wei a = new Wei("2022-04-28", 1, 12);
        Wei b = new Wei("2022-03-29", 1, 15);
        Wei c = new Wei("2022-03-30", 1, 8);
        Wei d = new Wei("2022-03-31", 2, 6);
        Wei e = new Wei("2022-04-01", 3, 5);
        Wei f = new Wei("2022-04-02", 4, 5);


        List<Wei> list = Arrays.asList(a, b, c, d, e, f);
        list = null;
        Optional<Wei> min = list.stream().min(Comparator.comparing(Wei::getName));

        System.out.println(min.get());
        /*Set<Integer> collect = list.stream().map(Wei::getAccount).collect(Collectors.toSet());
        System.out.println(list.size());
        System.out.println(collect.size());
        System.out.println("==================");
        Map<Integer, List<Wei>> map = new HashMap<>();
        for (Wei w: list) {
            List<Wei> weiList = map.get(w.getAge());
            if (weiList != null) {
                weiList.add(w);
            } else {
                weiList = new ArrayList<>();
                weiList.add(w);
            }
            map.put(w.getAge(), weiList);
        }
        System.out.println(map);
        List<WeiInfo> weiInfoList = new ArrayList<>();
        Set<Map.Entry<Integer, List<Wei>>> entries = map.entrySet();
        for (Map.Entry<Integer, List<Wei>> entry: entries) {
            WeiInfo weiInfo = new WeiInfo();
            weiInfo.setAge(entry.getKey());
            List<Wei> value = entry.getValue();
            weiInfo.setWeiList(value);
            long asLong = value.stream().mapToLong(Wei::getAccount).max().getAsLong();
            System.out.println("----------------------------");
            System.out.println("max" + asLong);
            long asLong1 = value.stream().mapToLong(Wei::getAccount).min().getAsLong();
            System.out.println("----------------------------");
            System.out.println("min" + asLong1);
            weiInfoList.add(weiInfo);
        }
        System.out.println(weiInfoList);
        Person person = new Person();
        person.setType(2);
        Wei copy = BeanUtil.copy(person, Wei.class);
        System.out.println(copy.getType());*/

    }

    public static String getUserName(String name, Integer nameLengthUpper) {
        if (name.length() <= nameLengthUpper) {
            return name;
        }
        return name.replaceFirst(name.substring(nameLengthUpper), "...");
    }

    public static String encodeNickName(String nickName, Integer nameLengthUpper) {
        if (StringUtils.isEmpty(nickName)) {
            return "*";
        }
        List<Integer> point = new ArrayList<>();
        char[] chars = nickName.toCharArray();
        System.out.println("chars" + chars.length);
        int i = 0;
        while (chars.length > i) {
            int j = nickName.offsetByCodePoints(i, 1);
            System.out.println(j);
            point.add(i);
            i = j;
        }
        String name = "";
        if (point.size() > nameLengthUpper) {
            name = nickName.substring(point.get(0), point.get(nameLengthUpper)) + "***";
        } else {
            name = nickName;
        }
        return name;
    }
}
