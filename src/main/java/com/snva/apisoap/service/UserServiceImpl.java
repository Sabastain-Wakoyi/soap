package com.snva.apisoap.service;

import com.snva.apisoap.model.User;
import com.snva.repository.UserRepository;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
@Transactional
public class UserServiceImpl implements IUserService {

    @Autowired
   private UserRepository userRepository;

   // public UserServiceImpl(UserRepository userRepository) {
     //   this.userRepository = userRepository;
   // }
    @Override
    public User getUserByEmail(String email){

return null;

        //return userRepository.findByEmail(email);
    }

    @Override
   public List<User> getAllUsers(){
//return  null;
        return userRepository.findAll();
   }

}
