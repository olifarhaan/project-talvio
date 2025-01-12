package com.talvio.job_seeker.controllers;

import java.util.Map;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/job-seekers")
public class JobSeekerController {

    @GetMapping("/{id}")
    public Map<String, String> getJobSeeker(@PathVariable Long id) {
        return Map.of("education", "Bachelor of Science in Computer Science", "skills", "Java, Python, JavaScript",
                "experience", "2 years of experience in software development", "location", "New York, NY");
    }
}
