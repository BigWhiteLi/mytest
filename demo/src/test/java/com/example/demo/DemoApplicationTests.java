package com.example.demo;

import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.Arrays;
import java.util.Comparator;
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
     * @return
     */
    @Test
    public void strIntToInt(){
//        String str_int = "12365984";
//        String[] str_int_array = str_int.split("");
        String str_int = "19 21 31 26 45 29 90 84";
        String[] str_int_array = str_int.split(" ");
        Arrays.sort(str_int_array);//升序
        StringBuilder stringBuilder = new StringBuilder();
        for (String s : str_int_array) {
            stringBuilder.append(s+",");
        }
        System.out.println("升序后结果："+stringBuilder);

//        降序排序
        List<String> list = Arrays.stream(str_int_array).sorted(Comparator.reverseOrder()).collect(Collectors.toList());
        System.out.println("降序后结果："+list.stream().collect(Collectors.joining(",")));
    }
    /**
     * @desc 字符数字混合字符串处理：数字提取出来并排序
     * @param "12we3aaa6ijk59df8ertyu4m"
     * @return
     */
    @Test
    public void strIntStrToIntOrder(){
        String str = "12we3aaa6ijk59df8ertyu4m";

        //正则表达式：数字（\d）,非数字（\D）
        String[] str_array = str.replaceAll("\\D"," ").trim().split(" ");
        //String[] 转list
        List<String> str_list = Arrays.asList(str_array);
        //升序
        str_list.stream().sorted().collect(Collectors.toList());
        System.out.println("处理后升序结果："+str_list.stream().collect(Collectors.joining(",")));


    }

}
