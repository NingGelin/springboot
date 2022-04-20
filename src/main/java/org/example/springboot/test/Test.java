package org.example.springboot.test;

/**
 * <p>测试</p>
 *
 * @author : ninggelin
 * @date : 2022-04-20 10:57
 **/
public class Test {

    public static void main(String[] args) {
        System.out.println(getInfo(""));
    }

    @TakeTime
    public static String getInfo(String name) {
        return "111";
    }
}
