//package com.myRetail.service;
//
//import com.myRetail.model.User;
//import com.myRetail.repository.IUserRepo;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Service;
//
//import java.util.Collection;
//import java.util.Optional;
//
//@Service
//public class UserServiceImpl {
//
//    @Autowired
//    private IUserRepo iUserRepo;
//
//    public Collection<User> findAll(){
//        return iUserRepo.findAll();
//    }
//
//    public Optional<User> findById(Long userId){
//        return iUserRepo.findById(userId);
//    }
//
//    public User saveOrUpdate(User user){
//        return iUserRepo.saveAndFlush(user);
//    }
//
//    public String deleteById(Long userId){
//        try{
//            iUserRepo.deleteById(userId);
//            return "User deleted || "+userId;
//        }catch (Exception exception){
//            exception.printStackTrace();
//        }
//        return "Unable to delete the user ||" +userId;
//    }
//}
