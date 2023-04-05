package com.snva.apisoap.service;

import java.util.*;
import com.snva.apisoap.model.User;

public interface IUserService {
    Optional<User> getUserByName(String name);
    List<User> getAllUsers();

    User addUser(User user);
}
