package com.EverydaySurvival.EverydaySurvival.service

import com.cloudinary.Cloudinary
import com.cloudinary.api.ApiResponse
import com.cloudinary.utils.ObjectUtils
import org.springframework.stereotype.Service

@Service
class CloudinaryService(private val cloudinary: Cloudinary) {
    fun getAllImages(): ApiResponse? {
        val params = ObjectUtils.asMap(
            "resource_type", "image",
            "max_results", 500
        )
        return cloudinary.api().resources(params)
    }
}