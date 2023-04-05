package com.snva.apisoap.service;

import java.util.*;
import com.snva.apisoap.model.User;

public interface IUserService {
    User getUserByEmail(String email);
    List<User> getAllUsers();
}
