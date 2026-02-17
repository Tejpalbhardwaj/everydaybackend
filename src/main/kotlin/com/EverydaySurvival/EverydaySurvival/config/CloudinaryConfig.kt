package com.EverydaySurvival.EverydaySurvival.config

import com.cloudinary.Cloudinary
import com.cloudinary.utils.ObjectUtils
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration

@Configuration
class CloudinaryConfig {
    @Bean
    fun cloudinary(): Cloudinary {
        return Cloudinary(
            "cloudinary://${API.CLOUD_API}:${API.CLOUD_API_SECRET}@dzbzcmohu"
            )
    }
}