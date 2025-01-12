package com.talvio.job.controllers;

import java.util.Map;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/jobs")
public class JobController {

    @GetMapping("/{id}")
    public Map<String, String> getJob(@PathVariable String id) {
        return Map.of("title", "Software Engineer", "description", "Developing software applications", "location",
                "New York, NY", "salary", "$100,000 - $120,000 per year", "company", "Google", "position", "Full-time",
                "postedById", "1");
    }
}
