package com.lucy.study.springboot.web;

import com.lucy.study.springboot.web.dto.ItemDto;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MainController {

    @GetMapping({"/main"})
    public String main(){
        return "main";
    }

    @GetMapping("/item")
    public ItemDto getItemDto(@RequestParam("name") String name, @RequestParam("amount") int amount) {
        return new ItemDto(name, amount);
    }
}
