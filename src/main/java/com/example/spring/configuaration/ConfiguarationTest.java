package com.example.spring.configuaration;

import org.springframework.boot.SpringBootConfiguration;
import org.springframework.context.annotation.Bean;

import java.util.HashMap;
import java.util.Map;

@SpringBootConfiguration
public class ConfiguarationTest {
    @Bean
    public Map create(){
        Map<String,String> map = new HashMap<>();
        map.put("name","002");
        map.put("age","22");

        return map;

    }
}
