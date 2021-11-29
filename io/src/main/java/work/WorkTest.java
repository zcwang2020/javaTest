package work;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.junit.platform.commons.util.CollectionUtils;

import util.BeanUtil;

/**
 * @Author Tmind
 * @Date 2021/11/5
 */
public class WorkTest {
    public static void main(String[] args) {
       /* ArrayList<Red> sesameRedPacketEntities = new ArrayList<>();
        Set<Integer> redPacketSers = new HashSet<>();
        sesameRedPacketEntities.forEach(redPacketEntity -> redPacketSers.add(redPacketEntity.getStr()));
        System.out.println(redPacketSers);
        List<Integer> integers = Arrays.asList(1, 2, 3);
        redPacketSers.addAll(integers);
        System.out.println(redPacketSers.contains(1));*/

        System.out.println("----------------------------");
        // 数据库数据
        Wei a = new Wei("a", 1, 12);
        Wei b = new Wei("b", 1, 15);
        Wei c = new Wei("c", 1, 8);
        Wei d = new Wei("d", 2, 6);
        Wei e = new Wei("e", 3, 5);
        Wei f = new Wei("f", 4,3);

        List<Wei> list = Arrays.asList(a, b, c, d, e, f);
        Map<Integer, List<Wei>> map = new HashMap<>();
        for (Wei w : list) {
            List<Wei> weiList = map.get(w.getAge());
            if (weiList != null) {
                weiList.add(w);
            }else {
                weiList = new ArrayList<>();
                weiList.add(w);
            }
            map.put(w.getAge(), weiList);
        }
        System.out.println(map);

        List<WeiInfo> weiInfoList = new ArrayList<>();
        Set<Map.Entry<Integer, List<Wei>>> entries = map.entrySet();
        for (Map.Entry<Integer, List<Wei>> entry : entries) {
            WeiInfo weiInfo = new WeiInfo();
            weiInfo.setAge(entry.getKey());
            List<Wei> value = entry.getValue();
            weiInfo.setWeiList(value);
            long asLong = value.stream().mapToLong(Wei::getAccount).max().getAsLong();
            System.out.println("----------------------------");
            System.out.println("max"+asLong);
            long asLong1 = value.stream().mapToLong(Wei::getAccount).min().getAsLong();
            System.out.println("----------------------------");
            System.out.println("min"+asLong1);
            weiInfoList.add(weiInfo);
        }
        System.out.println(weiInfoList);

        Person person = new Person();
        person.setType(2);
        Wei copy = BeanUtil.copy(person, Wei.class);
        System.out.println(copy.getType());
    }
}