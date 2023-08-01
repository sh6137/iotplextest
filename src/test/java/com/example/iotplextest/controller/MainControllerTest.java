package com.example.iotplextest.controller;

import com.example.iotplextest.service.TestService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class MainControllerTest {
    @Autowired
    private TestService testService;

    @Test
    void service(){
        String strA = "AAA@@0101234567809901230724142504A1535.86216128.715090631580070032100000581674214405010012086.980";
        String strB = "BBB@@01012345678Y114400";
        String strC = "CCC@@01011112222YB036.50428127.265280100002";
        String strD = "DDD@@01012345678Y1";

        System.out.println("AAA");
        testService.parser(strA);
        System.out.println("BBB");
        testService.parser(strB);
        System.out.println("CCC");
        testService.parser(strC);
        System.out.println("DDD");
        testService.parser(strD);
    }
}
