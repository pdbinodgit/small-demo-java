package com.onetoone.onetoone.user.serviceImpl;

import com.onetoone.onetoone.response.CustomResponse;
import com.onetoone.onetoone.user.model.User;
import com.onetoone.onetoone.user.repository.UserRepository;
import com.onetoone.onetoone.user.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceIMPL implements UserService {

    @Autowired
    UserRepository userRepository;


    @Override
    public CustomResponse<User> saveUser(User user) {
        try {
            if (userRepository.existsByUsername(user.getUsername())){
                return new CustomResponse<>(HttpStatus.BAD_REQUEST, "username already exist", user);
            }
            User user1 = userRepository.save(user);
            return new CustomResponse<>(HttpStatus.OK, "save successfully", user1);
        } catch (Exception e) {
            return new CustomResponse<>(HttpStatus.BAD_REQUEST, "Failed to save", user);
        }
    }
    @Override
    public CustomResponse<List<User>> get() {
        return new CustomResponse<>(HttpStatus.OK,"success",userRepository.findAll());
    }
}
