package com.in60minutes.service;

import com.in60minutes.entity.User;
import com.in60minutes.exception.UserNotFoundException;
import com.in60minutes.repository.UserReoo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {

    @Autowired
    UserReoo userReoo;

    public User saveUser(User user){
        return userReoo.save(user);
    }

    public List<User> getAllUsers(){
        return userReoo.findAll();
    }

    public User getUser(int id) throws UserNotFoundException{
        User user = userReoo.findByUserId(id);
        if(user!=null){
            return user;
        }else{
            throw new UserNotFoundException("user not found with id :"+id);
        }
    }
}
