package com.snva.apisoap.service;

import com.snva.apisoap.model.User;
import  static org.mockito.BDDMockito.*;
import static org.assertj.core.api.Assertions.*;
import com.snva.apisoap.repository.UserRepository;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import org.mockito.junit.jupiter.MockitoSettings;
import org.mockito.quality.Strictness;

import java.util.Optional;

import static org.junit.jupiter.api.Assertions.*;

@ExtendWith(MockitoExtension.class)
@MockitoSettings(strictness = Strictness.LENIENT)
class UserServiceImplTest {
    @Mock
    private UserRepository  userRepository;

    @InjectMocks
    private UserServiceImpl  userService;

    private User user;

    @BeforeEach
    void setUp() {
        user = User.builder()
                .course("JAVA AWS")
                .address("SOME ADRS")
                .contact("1234567")
                .dob("03/03/03")
                .email("some@gmail.com")
                .name("KK")
                .build();
    }

    @Test
    void getUserByName() {
    }

    @Test
    void getAllUsers() {
    }

    @Test
    @DisplayName("Soap for save method test")
    void addUser() {
        given(userRepository.findUserByName(user.getName())).willReturn(Optional.empty());
        given(userRepository.save(user)).willReturn(user);
        System.out.println("userRepository " + userRepository);
        System.out.println("userService " + userService);
        User user1 = userService.addUser(user);
        System.out.println("user" + user1);
        assertThat(user1).isNotNull();
    }
}