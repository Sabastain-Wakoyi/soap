package com.snva.apisoap.service;

import com.snva.apisoap.model.User;
import com.snva.apisoap.repository.UserRepository;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@Transactional
public class UserServiceImpl implements IUserService {



    @Autowired
   private UserRepository userRepository;


    @Override
    public Optional<User> getUserByName(String name){

        return userRepository.findUserByName(name);
    }

    @Override
   public List<User> getAllUsers(){
        return userRepository.findAll();
   }

    @Override
    public User addUser(User user) {
        return userRepository.save(user);
    }

}
