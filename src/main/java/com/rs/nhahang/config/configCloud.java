package com.rs.nhahang.config;

import com.cloudinary.Cloudinary;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.HashMap;
import java.util.Map;

@Configuration
public class configCloud {

    @Bean
    public Cloudinary cloudinaryConfig() {
        Cloudinary cloudinary = null;
        Map config = new HashMap();
        config.put("cloud_name", "dayqinody");
        config.put("api_key", "281459253657469");
        config.put("api_secret", "lK3YG8y8qq3Ho8cvnrfPsJEyj9o");
        cloudinary = new Cloudinary(config);
        return cloudinary;
    }
}
