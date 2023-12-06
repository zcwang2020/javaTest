package com.eli.springbootvue;

import com.eli.springbootvue.data.DataUploadBatchDTO;
import com.eli.springbootvue.data.DataUploadDTO;
import com.eli.springbootvue.data.TuiBeiDataTO;
import com.eli.springbootvue.util.DateUtils;
import com.eli.springbootvue.util.TuiBeiMd5Utils;
import org.assertj.core.util.Lists;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.*;
import java.util.stream.Collectors;

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
}
