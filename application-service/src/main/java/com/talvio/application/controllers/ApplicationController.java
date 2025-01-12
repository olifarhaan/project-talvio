package com.talvio.application.controllers;

import java.util.Map;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/applications")
public class ApplicationController {

    @GetMapping("/{id}")
    public Map<String, String> getApplication(@PathVariable String id) {
        return Map.of("jobId", id, "jobSeekerId", "1", "status", "pending", "createdAt", "2024-01-01",
                "updatedAt", "2024-01-01");
    }
}
