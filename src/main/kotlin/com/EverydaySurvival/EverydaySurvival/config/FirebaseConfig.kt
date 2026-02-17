package com.EverydaySurvival.EverydaySurvival.config

import com.google.auth.oauth2.GoogleCredentials
import com.google.firebase.FirebaseApp
import com.google.firebase.FirebaseOptions
import jakarta.annotation.PostConstruct
import org.springframework.context.annotation.Configuration
import org.springframework.core.io.ClassPathResource

@Configuration
class FirebaseConfig {
    @PostConstruct
    fun initFirebase() {
        if (FirebaseApp.getApps().isNotEmpty()) {
            return
        }
        val resource = ClassPathResource("firebase/serviceAccountKey.json")
        val credentials = GoogleCredentials.fromStream(resource.inputStream)
        val options = FirebaseOptions.builder()
            .setCredentials(credentials)
            .build()
        FirebaseApp.initializeApp(options)
        println("🔥 Firebase INITIALIZED SUCCESSFULLY")
    }
}