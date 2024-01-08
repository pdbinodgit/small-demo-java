package com.onetoone.onetoone.user.service;

import com.onetoone.onetoone.response.CustomResponse;
import com.onetoone.onetoone.user.model.User;

import java.util.List;

public interface UserService {

    public CustomResponse<User> saveUser(User user);

    public CustomResponse<List<User>> get();



}
