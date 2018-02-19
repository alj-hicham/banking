package com.azzus.services;

import com.azzus.Entity.User;

/**
 * Created by azzus on 2/18/2018.
 */
public interface UserService {
    User findByUsername (String username);

    User findByEmail(String email);
    boolean checkUserExists(String username, String email);
    boolean checkUsernameExists(String username);
    boolean checkEmailExists(String email);
    void save(User user);
}
