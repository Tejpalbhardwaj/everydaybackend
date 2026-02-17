package com.EverydaySurvival.EverydaySurvival.controller

import com.EverydaySurvival.EverydaySurvival.model.ImageResponse
import com.EverydaySurvival.EverydaySurvival.service.CloudinaryService
import com.EverydaySurvival.EverydaySurvival.service.ImageService
import com.cloudinary.api.ApiResponse
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class MainController(
    private val imageService: ImageService,
    private val cloudservices: CloudinaryService
) {

    @GetMapping("images")
    fun getImages(): List<ImageResponse> {
        return imageService.getAllImages()
    }
    @GetMapping("loadImages")
    fun getTestImages(): ApiResponse {
        return cloudservices.getAllImages() !!
    }
}