package com.backinformal.BackInFormal_Backend.controller;

import com.backinformal.BackInFormal_Backend.service.CloudinaryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.util.Map;

@RestController
@RequestMapping("/cloudinary/upload")
@CrossOrigin
public class CloudinaryController {

    @Autowired
    private CloudinaryService cloudinaryImageService;

    @PostMapping
    ResponseEntity<Map> uploadImage(@RequestParam("image") MultipartFile file) {

        Map data = cloudinaryImageService.upload(file);

        return new ResponseEntity<>(data, HttpStatus.OK);

    }

}
