package com.travelBnb.controller;

import com.travelBnb.service.BucketService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

@RestController
@RequestMapping("/api/v1/bucket")
@CrossOrigin("*")
public class BucketController {
    @Autowired
    private BucketService service;

    @PostMapping(path = "/upload/file/{bucketName}",consumes = MediaType.MULTIPART_FORM_DATA_VALUE,produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<?> uploadFile(@RequestParam MultipartFile file,
                                        @PathVariable String bucketName){
        return new ResponseEntity<>(service.uploadFile(file, bucketName), HttpStatus.OK);
    }
}