package com.example.demo.Controller;

import com.example.demo.Service.CatService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.io.IOException;

@Controller
public class HelloWorldController {

    private String text;
    CatService cat = new CatService();



    @RequestMapping(value = "/", method = RequestMethod.GET)
    @ResponseBody
    public String frontPage() {
        return "Hej og velkommen til CatFacts";
    }

    @GetMapping("/getSingle")
    @ResponseBody
    public String getSingle() throws IOException {
        return cat.getSingle();
    }

    @GetMapping("/getTen")
    @ResponseBody
    public String getTen() throws IOException {
        return cat.getTen();
    }

    public String getTenSortByDate() {
        return text;
    }

    @GetMapping("/contains")
    @ResponseBody
    public String getContains(@RequestParam char c,@RequestParam int amount) throws IOException {
        return text;
    }


    @GetMapping("/getSorted")
    @ResponseBody
    public String getSorted() throws IOException {
    return cat.getSorted();
    }

}