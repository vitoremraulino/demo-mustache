package com.example.demo.controller;

import com.example.demo.model.Sample;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

@Controller
public class HelloController {

    @GetMapping("/")
    public String index(final Model model){
        return "index";
    }

    @GetMapping("/hello")
    public String getCandidates(final Model model){

//        List<Sample> candidateList = IntStream.range(0, 7)
//                .mapToObj(this::getSample)
//                .collect(Collectors.toList());
        List<Sample> candidateList = new ArrayList<>();
        for(int i = 0; i < 7; i++){
            candidateList.add(new Sample("Sample Name " + i,
                    20 + i,   // Assuming an initial age for the example
                    "Phone Number " + i,
                    "EmailId" + i + "@example.com"));
        }
        model.addAttribute("listaDeExemplo", candidateList);
        return "sample";
    }

    private Sample getSample(int i) {
        return new Sample("Sample Name " + i,
                20 + i,   // Assuming an initial age for the example
                "Phone Number " + i,
                "EmailId" + i + "@example.com");
    }
}