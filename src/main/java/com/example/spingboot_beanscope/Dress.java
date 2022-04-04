package com.example.spingboot_beanscope;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
//@Scope("singleton")
public class Dress {
    public void wear() {
        System.out.println("Dress::wear() method");
    }
}
