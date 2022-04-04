package com.example.spingboot_beanscope;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class App {

    public static void main(String[] args) {
        ApplicationContext context = SpringApplication.run(App.class, args);

        System.out.println();
        Dress dress_1 = context.getBean(Dress.class);
        Dress dress_2 = context.getBean(Dress.class);
        System.out.println(dress_1);
        System.out.println(dress_2);
        System.out.println();
        dress_1.wear();
        dress_2.wear();
    }

}
