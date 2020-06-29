/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.crud.trainer.controllers;

import com.crud.trainer.model.Trainer;
import com.crud.trainer.services.TrainerServiceInterface;
import java.util.List;
import javax.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;



/**
 *
 * @author georg
 */
@Controller
public class TrainerController {
    
    @Autowired
    private TrainerServiceInterface service;
    

    @GetMapping("/")
    public String viewHomePage(ModelMap mm){
        
        List <Trainer> allTrainers = service.allTrainer();
        
        
        
        mm.addAttribute("allTrainers",allTrainers);
        
        return "index";
    }
    
    @GetMapping("new")
    public String showInsertForm(ModelMap mm){
    
       mm.addAttribute("newtrainer",new Trainer());
        return "insertform";
    }
    
    
    @PostMapping("insert")
    public String insertTrainer(@Valid @ModelAttribute("newtrainer") Trainer t, 
              BindingResult result,
            ModelMap mm){
        
     
        
         Trainer test= service.getTrainer(t.getName(), t.getSurname(), t.getSubject());
         
        
         
        if(test != null){
        
            
            mm.addAttribute("newtrainer",new Trainer());
            mm.addAttribute("duplicate","Trainer:"+t.getName()+", "+t.getSurname()+", with subject "+t.getSubject() +" is already in database");
            
            return "insertform";
        }
        


     if(result.hasErrors()){
        return "insertform";
        }

      t.setName(t.getName().toUpperCase() );
      t.setSurname(t.getSurname().toUpperCase() );
      t.setSubject(t.getSubject().toUpperCase() );
       
    service.insertTrainer(t);
    return "redirect:/";
    }
    
    @GetMapping("edit/{name}/{surname}/{subject}")
    public String showEditForm( @PathVariable(name="name") String name, 
             @PathVariable(name = "surname") String surname, 
              @PathVariable(name="subject") String subject, 
             ModelMap mm){

        Trainer t= service.getTrainer(name, surname, subject);
        
        if(t==null){
        
        
        return "redirect:/";
        }
        
        mm.addAttribute("tr",t);
        
       return "update";
    }

    
    @PostMapping("update") 
    public String updateTrainer(@Valid @ModelAttribute("tr")Trainer t, 
      BindingResult result, 
      ModelMap mm){
       
       Trainer test =service.getTrainer(t.getName(), t.getSurname(), t.getSubject());
        
       
               if(test != null){
        
            
            mm.addAttribute("tr",service.findById(t.getTrainerid()));
            mm.addAttribute("duplicate","Trainer:"+t.getName()+", "+t.getSurname()+", with subject "+t.getSubject() +" is already in database");
            
            return "update";
        }
        
       
       
        if (result.hasErrors()) {
            return "update";
        }

      t.setName(t.getName().toUpperCase() );
      t.setSurname(t.getSurname().toUpperCase() );
      t.setSubject(t.getSubject().toUpperCase() );
      service.insertTrainer(t);
        
        return "redirect:/";
    }
    
    
    
    @GetMapping("kill/{name}/{surname}/{subject}")
    public String deleteRow(@PathVariable(name="name") String name, 
             @PathVariable(name = "surname") String surname, 
              @PathVariable(name="subject") String subject){
    
         Trainer t= service.getTrainer(name, surname, subject);
    
          if(t==null){
        
        
        return "redirect:/";
        }
         
         service.delete(t.getTrainerid());
         
       return "redirect:/";
    }
    
    
}
