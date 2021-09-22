package com.codecentric.sample;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

import java.nio.charset.StandardCharsets;
import java.util.Arrays;
import java.util.Locale;

@SpringBootApplication
@ComponentScan("de.codecentric.sample")
public class SampleApplication {
    public static void main(String[] args) {
        SpringApplication.run(SampleApplication.class, args);
    }

    public static void main1(String[] args) {
        System.out.println("Hello");
    }
}


///
class EEEE{
    public static void main(String[] args) {
        System.out.println("Hello");
        String aaa = "ddd".toLowerCase();
        System.out.println("Hi, " + aaa);
        System.out.println("Lol");
    }
    //
}
//
//
//
//

