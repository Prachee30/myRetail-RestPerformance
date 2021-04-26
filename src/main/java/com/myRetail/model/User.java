//package com.myRetail.model;
//
//
//
//
//import com.sun.istack.NotNull;
//
//import javax.persistence.*;
//
//@Entity
//public class User {
//
//    @Id
//    @GeneratedValue
//    private Long userId;
//
//    @NotNull
//    private String username;
//
//    @NotNull
//    private String password;
//
//    @ManyToOne
//    @JoinColumn(name = "roleId")
//    private Role role;
//
//
//    public Long getUserId() {
//        return userId;
//    }
//
//    public void setUserId(Long userId) {
//        this.userId = userId;
//    }
//
//    public String getUsername() {
//        return username;
//    }
//
//    public void setUsername(String username) {
//        this.username = username;
//    }
//
//    public String getPassword() {
//        return password;
//    }
//
//    public void setPassword(String password) {
//        this.password = password;
//    }
//
//    public Role getRole() {
//        return role;
//    }
//
//    public void setRole(Role role) {
//        this.role = role;
//    }
//}
