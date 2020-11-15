package com.cykj;

import java.text.SimpleDateFormat;
import java.time.LocalTime;

public class Test {

    @org.junit.jupiter.api.Test
    public void test1(){
        SimpleDateFormat bf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");//多态
        System.out.println(bf.format(LocalTime.now()));
    }

}
