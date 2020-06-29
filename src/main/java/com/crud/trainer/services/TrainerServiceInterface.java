/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.crud.trainer.services;

import com.crud.trainer.model.Trainer;
import java.util.List;

/**
 *
 * @author georg
 */
public interface TrainerServiceInterface {
    
    public List<Trainer> allTrainer();
    
    public void insertTrainer(Trainer t);
    
    public Trainer getTrainer(String name,String surname,String subject);
    
    public Trainer findById(int id);
    
    public void delete (int trainerId);
}
