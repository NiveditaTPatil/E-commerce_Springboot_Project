package com.ECommerce.ECommerce.Repositary;



import org.springframework.data.jpa.repository.JpaRepository;

import com.ECommerce.ECommerce.Model.User;


public interface Erepositary extends JpaRepository <User,String> {

  
    
}
