/**
 * @(#)DateTest.java, 2022/9/13.
 * <p/>
 * Copyright 2022 Netease, Inc. All rights reserved.
 * NETEASE PROPRIETARY/CONFIDENTIAL. Use is subject to license terms.
 */
package work;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

import org.junit.Test;

import util.DateUtils;

/**
 * @Author zcwang
 * @Date 2022/9/13
 */
public class DateTest {

    @Test
    public void testDate() throws ParseException {
        String dateStr = "Thu Dec 09 00:00:00 CST 2021";
        SimpleDateFormat sdf = new SimpleDateFormat("EEE MMM dd HH:mm:ss zzz yyyy", Locale.US);
        Date date = sdf.parse(dateStr);
        String s = DateUtils.parseDateToString(date, DateUtils.DATEFORMAT);
        System.out.println(Long.valueOf(s));
    }
}