package lk.dhanush.springbootrestservices.service;

import lk.dhanush.springbootrestservices.config.CustomUserDetails;
import lk.dhanush.springbootrestservices.entity.User;
import lk.dhanush.springbootrestservices.repository.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class MyUserDetailService implements UserDetailsService {


    @Autowired
    UserRepo userRepository;

    @Override
    public UserDetails loadUserByUsername(String userName) throws UsernameNotFoundException {
        Optional<User> user = userRepository.findByUserName(userName);

        user.orElseThrow(()->new UsernameNotFoundException("No User Like" + userName));

        return user.map(CustomUserDetails :: new).get();
    }

//    First Step

//    @Override
//    public UserDetails loadUserByUsername(String s) throws UsernameNotFoundException {
//        return new CustomUserDetails(s);
//    }
}
