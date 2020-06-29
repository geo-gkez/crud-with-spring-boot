/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.crud.trainer.services;

import com.crud.trainer.model.Trainer;
import com.crud.trainer.repository.TrainerRepository;
import java.util.List;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

/**
 *
 * @author georg
 */
@Service
public class TrainerService implements TrainerServiceInterface  {
    
    @Autowired
    private TrainerRepository repo;
    
    @Override
    public List<Trainer> allTrainer(){ 
    return repo.findAll(Sort.by("surname").ascending().and(Sort.by("subject")));
    }
    
    @Override
    @Transactional
    public void insertTrainer(Trainer t){
    repo.save(t);
    }
    
    @Override
    public Trainer getTrainer(String name,String surname,String subject){
       
    return repo.findTrainer(name, surname, subject);      
    }

    @Override
    @Transactional
    public void delete(int trainerId) {
    repo.deleteById(trainerId);
    }

    @Override
    public Trainer findById(int id) {
      
   return repo.findById(id).get();
    }
    
}
