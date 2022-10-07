package com.example.mvc202210061hyeseong.controller;

import com.example.mvc202210061hyeseong.dto.TestReqDto;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class PageController {
      @GetMapping("/test1")
    public String test1(){

        return "test_page1";
    }
    @ResponseBody
    @GetMapping("/test2")
    public String test2(){
          return "test_page1";
    }
     @GetMapping("test3")
    public String test3(Model model, @RequestParam String str,@RequestParam String name){
         System.out.println(str);
         System.out.println(name);
         model.addAttribute("data",str);
         model.addAttribute("name",name);
         return "test/test_page2";
     }
     @GetMapping("test4")
 public String test4(Model model, TestReqDto testReqDto){
         System.out.println(testReqDto);
         model.addAttribute("data", testReqDto.getStr());
         model.addAttribute("name",testReqDto.getName());
         model.addAttribute("number",testReqDto.getNumber());

          return "test/test_page3";
     }
}
