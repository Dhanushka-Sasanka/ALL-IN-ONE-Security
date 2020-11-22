package lk.dhanush.springbootrestservices.config;

import lk.dhanush.springbootrestservices.entity.User;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

public class CustomUserDetails implements UserDetails {

    private String userName;
    private String pasword;
    private boolean active;
    private List<GrantedAuthority> authorities;


    public CustomUserDetails(User user) {

      this.userName = user.getUserName();
      this.pasword = user.getPassword();
      this.active = user.isActive();
      this.authorities = Arrays.stream(user.getRole().split(","))
                    .map(SimpleGrantedAuthority::new)
                    .collect(Collectors.toList());
    }

    public CustomUserDetails() {   }

    @Override
    public Collection<? extends GrantedAuthority> getAuthorities() {
        return this.authorities;
    }

    @Override
    public String getPassword() {
        return this.pasword;
    }

    @Override
    public String getUsername() {
        return this.userName;
    }

    @Override
    public boolean isAccountNonExpired() {
        return true;
    }

    @Override
    public boolean isAccountNonLocked() {
        return true;
    }

    @Override
    public boolean isCredentialsNonExpired() {
        return true;
    }

    @Override
    public boolean isEnabled() {
        return this.active;
    }
}

//First Step
//without JPA spring default behavior


//public class CustomUserDetails implements UserDetails {
//
//    private String userName ;
//
//    CustomUserDetails(String userName){
//        this.userName = userName;
//    }
//
//    CustomUserDetails(){
//
//    }
//    @Override
//    public Collection<? extends GrantedAuthority> getAuthorities() {
//        return Arrays.asList(
//                new SimpleGrantedAuthority("ROLE_USER"));
//    }
//
//    @Override
//    public String getPassword() {
//        return "PASS";
//    }
//
//    @Override
//    public String getUsername() {
//        return this.userName;
//    }
//
//    @Override
//    public boolean isAccountNonExpired() {
//        return true;
//    }
//
//    @Override
//    public boolean isAccountNonLocked() {
//        return true;
//    }
//
//    @Override
//    public boolean isCredentialsNonExpired() {
//        return true;
//    }
//
//    @Override
//    public boolean isEnabled() {
//        return true;
//    }
//}
