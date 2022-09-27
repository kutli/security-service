package com.kutli.securityserver.service;

import com.kutli.securityserver.model.User;

public interface UserService {

//    User saveUser(User user);

    User getByUsername(String username);
}
