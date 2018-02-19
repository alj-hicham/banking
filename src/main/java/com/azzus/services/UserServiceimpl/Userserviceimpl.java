package com.azzus.services.UserServiceimpl;

import com.azzus.DAO.UserDao;
import com.azzus.Entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.azzus.services.UserService;

/**
 * Created by azzus on 2/18/2018.
 */
@Service
public class Userserviceimpl implements UserService{
@Autowired
    private UserDao userDao;

public void save(User user){
    userDao.save(user);
}

public User findByUsername(String username){

return userDao.findByUsername(username);



}


public User findByEmail(String email){
    return userDao.findByEmail(email);
}
public boolean checkUserExists(String username, String email){
    if(checkUsernameExists(username) || checkEmailExists(username)){
        return true;
    }else{
        return false;

    }
}

    public boolean checkUsernameExists(String username) {

if(null!=findByUsername(username)){
    return true;
}return false;

}

    public boolean checkEmailExists(String email) {
    if(null!=findByEmail(email)){
        return true;
    }
return false;
}
}
