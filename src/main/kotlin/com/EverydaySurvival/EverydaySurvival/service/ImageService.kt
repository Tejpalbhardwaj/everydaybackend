package com.EverydaySurvival.EverydaySurvival.service


import com.EverydaySurvival.EverydaySurvival.model.ImageResponse
import com.EverydaySurvival.EverydaySurvival.model.ResBody
import com.cloudinary.Cloudinary
import com.google.firebase.cloud.FirestoreClient
import org.springframework.core.io.ResourceLoader
import org.springframework.stereotype.Service

@Service
class ImageService(
    private val cloudinary: Cloudinary,
    private val cloudinaryService: CloudinaryService,
) {

    fun getAllImages(): List<ImageResponse> {
        val db = FirestoreClient.getFirestore()
        val images = mutableListOf<ImageResponse>()

        val documents = db.collection("images").get().get()

        for (doc in documents) {
            images.add(
                ImageResponse(
                    title = doc.getString("title") ?: "",
                    desc = doc.getString("desc") ?: "",
                    url = doc.getString("url") ?: ""
                )
            )
        }
        return images
    }



//    fun addImagesToFirebase() : ResBody<String>{
//        val loadedImages = cloudinaryService.getAllImages()
//        loadedImages.map
//    }
}