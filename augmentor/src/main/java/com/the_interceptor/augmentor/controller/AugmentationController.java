package com.the_interceptor.augmentor.controller;

import lombok.extern.java.Log;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Log
public class AugmentationController {
    @GetMapping("/augmentor/augment")
    AugmentationResponse augment(AugmentationRequest request) {
        log.info("Serving augmentation request");
        return new AugmentationResponse();
    }
}
