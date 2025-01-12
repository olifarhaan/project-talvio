package com.talvio.user.controllers;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.talvio.user.clients.JobSeekerClient;
import com.talvio.user.dto.JobSeekerDTO;

@RestController
@RequestMapping("/api/v1/users")
public class UserController {

    @Autowired
    private JobSeekerClient jobSeekerClient;

    private final Map<String, String> jobSeekerUser = Map.of(
            "id", "1",
            "name", "John Doe",
            "email", "john.doe@example.com");

    private final Map<String, String> employerUser = Map.of(
            "id", "2",
            "name", "Jane Doe",
            "email", "jane.doe@example.com");

    @GetMapping("/{id}")
    public Map<String, Object> getUser(@PathVariable Long id) {
        Map<String, Object> response = new HashMap<>();

        if (id.equals(1L)) {
            response.putAll(jobSeekerUser);
            JobSeekerDTO jobSeekerDetails = jobSeekerClient.getJobSeeker(id);
            response.put("jobSeekerDetails", jobSeekerDetails);
        } else {
            response.putAll(employerUser);
        }

        return response;
    }
}
