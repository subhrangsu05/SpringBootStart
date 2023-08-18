package com.springboottutorial.springbootapp;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.view.RedirectView;

@Controller
public class HomeController {
    @RequestMapping(value = "/test")
    public String testPage(){
        System.out.println("test page is executing...");
        return "index";
    }
    @RequestMapping(value = "/saveData", method =RequestMethod.GET )
    public RedirectView saveData(@RequestParam("email") String email, @RequestParam("password") String password, @RequestParam("address") String address, @RequestParam("address2") String address2,@RequestParam("city") String city, @RequestParam("state") String state, @RequestParam("zip") int zip){
        System.out.println("SAVE DATA method is executing...");
        UserData userdata = new UserData(email, password, address, address2, city, state, zip);
        System.out.println(userdata);
        RedirectView redirectView = new RedirectView();
        redirectView.setUrl("/result/"+email+"/"+password+"/"+address+"/"+address2+"/"+city+"/"+state+"/"+zip);
        return redirectView;
    }
    @GetMapping(value = "/result/{email}/{password}/{address}/{address2}/{city}/{state}/{zip}")
    public ModelAndView resultPage(@PathVariable("email") String email,@PathVariable("password") String password,@PathVariable("address") String address,@PathVariable("address2") String address2,@PathVariable("city") String city,@PathVariable("state") String state,@PathVariable("zip")int zip){
        System.out.println("Result Page method is executing...");
        System.out.println(email);
        System.out.println(password);
        System.out.println(address);
        System.out.println(address2);
        System.out.println(city);
        System.out.println(state);
        System.out.println(zip);
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.addObject("email", email);
        modelAndView.addObject("password", password);
        modelAndView.addObject("address", address);
        modelAndView.addObject("address2", address2);
        modelAndView.addObject("city", city);
        modelAndView.addObject("state", state);
        modelAndView.addObject("zip", zip);
        modelAndView.setViewName("result");
        return modelAndView;
    }
}
