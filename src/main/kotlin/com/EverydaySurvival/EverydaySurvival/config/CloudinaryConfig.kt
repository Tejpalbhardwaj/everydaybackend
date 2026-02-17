package com.EverydaySurvival.EverydaySurvival.config

import com.cloudinary.Cloudinary
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration
import org.springframework.util.ObjectUtils


@Configuration
class CloudinaryConfig {
    @Bean
    fun cloudinary(): Cloudinary{
        return Cloudinary(ObjectUtils.asMap(
           ""

        ))
    }
}