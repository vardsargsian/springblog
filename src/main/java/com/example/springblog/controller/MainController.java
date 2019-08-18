package com.example.springblog.controller;

import com.example.springblog.model.Post;
import com.example.springblog.repository.PostRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
public class MainController {
    @Autowired
    private PostRepository postRepository;

    @GetMapping("/")
    public String main(ModelMap map) {
        List<Post> all = postRepository.findAll();
        map.addAttribute("posts", all);
        return "index";
    }
}
