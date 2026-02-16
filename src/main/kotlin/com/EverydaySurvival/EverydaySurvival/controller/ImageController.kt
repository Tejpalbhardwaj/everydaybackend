package com.EverydaySurvival.EverydaySurvival.controller

import com.EverydaySurvival.EverydaySurvival.model.ImageResponse
import com.EverydaySurvival.EverydaySurvival.service.ImageService
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class ImageController(
    private val imageService: ImageService
) {

    @GetMapping("images")
    fun getImages(): List<ImageResponse> {
        return imageService.getAllImages()
    }

}