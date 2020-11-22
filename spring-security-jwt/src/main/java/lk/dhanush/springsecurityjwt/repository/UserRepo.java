package lk.dhanush.springsecurityjwt.repository;

import lk.dhanush.springsecurityjwt.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface UserRepo extends JpaRepository<User,Integer> {

    Optional<User> findByUserName(String userName);
}
