//package com.myRetail.repository;
//
//import com.myRetail.model.User;
//import org.springframework.data.jpa.repository.JpaRepository;
//import org.springframework.data.jpa.repository.Query;
//import org.springframework.data.repository.query.Param;
//import org.springframework.stereotype.Repository;
//
//@Repository
//public interface IUserRepo extends JpaRepository<User, Long> {
//
//    @Query("FROM User WHERE username=:username")
//    User findByUsername(@Param("username") String username);
//}
//
