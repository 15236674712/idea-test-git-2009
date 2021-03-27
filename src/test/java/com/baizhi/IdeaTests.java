package com.baizhi;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class IdeaTests {

    @Test
    void contextLoads() {
        System.out.println("====");
        int a=10;
        int b=20;
    }

    public static void main(String[] args) {
        int a=20;
        String str="lalala";
        int b=30;
        System.out.println(a+b);
        System.out.println(str);
    }
}
