package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(DemoApplication.class, args);
    }

    public void a (){

        boolean jaipasenvie2travailler = true;
        boolean jenesuispasfatiguee = false;
        int c = 0;

        if (jaipasenvie2travailler == jenesuispasfatiguee ){

            while (true){
                c = c + 2;
            }

        }else{
            c = c - 1;

        }
    }


}
