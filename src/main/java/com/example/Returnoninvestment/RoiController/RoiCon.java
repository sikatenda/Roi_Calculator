package com.example.Returnoninvestment.RoiController;

import com.example.Returnoninvestment.RoiDomain.Roi;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class RoiCon {

    //start the application on the first page (index.html)
    @GetMapping
    public String getInput(Model model){
        model.addAttribute("roi", new Roi());
        return "index";
    }

    //send the results to the other page (result.html)
    @PostMapping("/result")
    public String getResult(@ModelAttribute Roi roi, BindingResult result, Model model){
        model.addAttribute("roi", roi);
        return "result";
    }

    //return to the first page (index.html)
   @PostMapping("/")
    public String moveBack(Roi roi){
     return "redirect:/";
    }

}
