package com.example.springtickets.dao;

import com.example.springtickets.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

import java.util.UUID;

@Component
@RequiredArgsConstructor
@Slf4j
public class UserDao {

    private final UserRepository userRepository;

    public UUID getUserIdByName(String userName){
        return userRepository.findByName(userName).orElseThrow().getUserId();
    }



}
