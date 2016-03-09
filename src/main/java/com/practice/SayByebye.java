package com.practice;

import org.springframework.stereotype.Component;

/**
 * Created by chaoqun.zhu on 2016/3/9.
 */
@Component
public class SayByebye implements SaySomething {
    public void sayBlablabla() {
        System.out.println("Bye bye...");
    }
}
