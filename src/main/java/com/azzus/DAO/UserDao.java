package com.azzus.DAO;
import java.util.List;
import com.azzus.Entity.User;
import org.springframework.data.repository.CrudRepository;

/**
 * Created by azzus on 2/18/2018.
 */
public interface UserDao extends CrudRepository<User, Long> {
    User findByUsername(String username);
    User findByEmail(String Email);
}
