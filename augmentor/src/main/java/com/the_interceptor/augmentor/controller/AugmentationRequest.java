package com.the_interceptor.augmentor.controller;

import lombok.Data;

import java.util.Map;

@Data
public class AugmentationRequest {
    private String url;
    private Map<String, String> headers;
}
