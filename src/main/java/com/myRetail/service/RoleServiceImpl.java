//package com.myRetail.service;
//
//import com.myRetail.model.Role;
//import com.myRetail.repository.IRoleRepo;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Service;
//
//import java.util.Collection;
//import java.util.Optional;
//
//@Service
//public class RoleServiceImpl {
//
//    @Autowired
//    IRoleRepo iroleRepo;
//
//    public Collection<Role> findAll(){
//        return iroleRepo.findAll();
//    }
//
//    public Optional<Role> findById(Long roleId){
//        return iroleRepo.findById(roleId);
//    }
//
//    public Role saveOrUpdate(Role role){
//        return iroleRepo.saveAndFlush(role);
//    }
//
//    public String deleteById(Long roleId){
//        try{
//            iroleRepo.deleteById(roleId);
//            return "Role deleted || "+roleId;
//        }catch (Exception exception){
//            exception.printStackTrace();
//        }
//        return "Unable to delete the role ||" +roleId;
//    }
//}
