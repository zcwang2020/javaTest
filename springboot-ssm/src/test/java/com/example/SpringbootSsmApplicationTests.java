package com.example;

import java.util.Date;
import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.example.dao.AttendanceMapper;
import com.example.dao.BookMapper;
import com.example.domain.AttendanceInfo;
import com.example.util.DateUtils;

@SpringBootTest
class SpringbootSsmApplicationTests {

    @Autowired
    private BookMapper bookMapper;

    @Autowired
    private AttendanceMapper attendanceMapper;

    @Test
    void contextLoads() {
        System.out.println("bookService.getAll() = " + bookMapper.selectList(null));
    }

    @Test
    void compare() {
        List<AttendanceInfo> attendanceInfos = attendanceMapper.selectList(null);
        AttendanceInfo attendanceInfo = attendanceInfos.get(0);
        Date createTime = attendanceInfo.getCreateTime();
        System.out.println(createTime.getTime());
    }
}
