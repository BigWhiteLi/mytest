package com.example.demo;

import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
@Slf4j
@SpringBootTest
class DemoApplicationTests {

    @Test
    void contextLoads() {
        log.info("-------------测试--------------------");
        System.out.println("测试方法");
    }
    /**
     * @desc 数字字符串排序处理,结果为逗号分割的排序字符串
     * @param "12365984"
     * @param endStamp
     * @param codeList
     * @return
     */
    @Test
    public void strIntToInt(){
//        String str_int = "12365984";
//        String[] str_int_array = str_int.split("");
        String str_int = "19 21 31 26 45 29 90 84";
        String[] str_int_array = str_int.split(" ");
//        Arrays.sort(str_int_array);//升序
//        List<String>
        System.out.println(str_int_array);
        StringBuilder stringBuilder = new StringBuilder();

//        for (String s : str_int_array) {
//            stringBuilder.append(s+",");
//        }
        List<String> list = Arrays.stream(str_int_array).sorted().collect(Collectors.toList());
        System.out.println(stringBuilder);
    }

}
