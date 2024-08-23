package org.example;

import org.example.pojo.University;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.Arrays;
import java.util.List;

@RestController
@RequestMapping(value = "/university")
public class controller {
    @GetMapping
    public University[] getAll(){
        String uri = "http://universities.hipolabs.com/search";
        RestTemplate rt = new RestTemplate();
        University[] res = rt.getForObject(uri, University[].class);
        return res;
    }

    @GetMapping("/unitedkingdom")
    public University[] unitedkingdom(){
        String uri = "http://universities.hipolabs.com/search?country=United+Kingdom";
        RestTemplate rt = new RestTemplate();
        University[] res = rt.getForObject(uri, University[].class);
        return res;
    }

    @GetMapping("/brazil")
    public University[] brazil(){
        String uri = "http://universities.hipolabs.com/search?country=Brazil";
        RestTemplate rt = new RestTemplate();
        University[] res = rt.getForObject(uri, University[].class);
        return res;
    }
}

