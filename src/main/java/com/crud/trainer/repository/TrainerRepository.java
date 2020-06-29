/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.crud.trainer.repository;

import com.crud.trainer.model.Trainer;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

/**
 *
 * @author georg
 */
@Repository
public interface TrainerRepository extends JpaRepository<Trainer,Integer> {
    
    @Query(value=" SELECT * FROM trainer t where t.name= :name and t.surname= :surname and t.subject= :subject limit 1; ",nativeQuery=true)
    Trainer findTrainer(@Param ("name") String name, @Param("surname") String surname,@Param("subject") String subject);

// List <Trainer> findByOrderBySurnameAsc();

}
