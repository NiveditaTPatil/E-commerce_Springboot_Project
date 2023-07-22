package com.ECommerce.ECommerce.Service;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ECommerce.ECommerce.Model.User;
import com.ECommerce.ECommerce.Repositary.Erepositary;

@Service
public class Eservice {

    @Autowired
    Erepositary repo;
    public Object add;

    public void add(User use) {
        repo.save(use);

    }
    public List<User> show(){
        return repo.findAll();
    }
    public void add(org.apache.catalina.User use) {
    }

}
