package com.snva.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.snva.apisoap.model.*;

@Repository
public interface UserRepository extends JpaRepository<User, String> {

    User findUserByFirstName(String firstName);


}