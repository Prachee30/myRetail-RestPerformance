//package com.myRetail.service;
//
//import com.myRetail.model.User;
//import com.myRetail.repository.IUserRepo;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.security.core.GrantedAuthority;
//import org.springframework.security.core.authority.SimpleGrantedAuthority;
//import org.springframework.security.core.userdetails.UserDetails;
//import org.springframework.security.core.userdetails.UserDetailsService;
//import org.springframework.security.core.userdetails.UsernameNotFoundException;
//import org.springframework.stereotype.Service;
//
//import java.util.ArrayList;
//import java.util.Collection;
//
//@Service
//public class UserDetailsServiceImpl implements UserDetailsService {
//
//    @Autowired
//    IUserRepo iUserRepo;
//
//    @Override
//    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
//
//        User user = iUserRepo.findByUsername(username);
//        if(user==null){
//            throw new UsernameNotFoundException("Username "+username+ " not found");
//        }
//        return new org.springframework.security.core.userdetails.User(user.getUsername(), user.getPassword(), getGrantedAuthority(user));
//    }
//
//    private Collection<GrantedAuthority> getGrantedAuthority(User user){
//
//        Collection<GrantedAuthority> authorities = new ArrayList<>();
//        if(user.getRole().getRoleName().equals("admin")){
//            authorities.add(new SimpleGrantedAuthority("ROLE_ADMIN"));
//        }
//        authorities.add(new SimpleGrantedAuthority("ROLE_USER"));
//        return authorities;
//    }
//}
