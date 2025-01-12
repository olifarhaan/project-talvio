package com.talvio.user.clients;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.talvio.user.dto.JobSeekerDTO;

@FeignClient(name = "job-seeker-service", path = "/api/v1/job-seekers")
public interface JobSeekerClient {

    @GetMapping("/{id}")
    JobSeekerDTO getJobSeeker(@PathVariable Long id);
}