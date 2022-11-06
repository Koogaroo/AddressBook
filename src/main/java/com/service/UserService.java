package com.service;

import com.entity.User;

public interface UserService {
    Integer checkLogin(String number, String password);

    User getUserByNumber(String number);
}
