//package com.myRetail.model;
//
//import com.sun.istack.NotNull;
//
//import javax.persistence.*;
//import java.util.Set;
//
//@Entity
//public class Role {
//
//    @Id
//    @GeneratedValue
//    private Long roleId;
//
//    @NotNull
//    private String roleName;
//
//    @OneToMany(targetEntity = User.class, mappedBy = "role", fetch = FetchType.LAZY, cascade = CascadeType.ALL)
//    private Set<User> userSet;
//
//
//    public Long getRoleId() {
//        return roleId;
//    }
//
//    public void setRoleId(Long roleId) {
//        this.roleId = roleId;
//    }
//
//    public String getRoleName() {
//        return roleName;
//    }
//
//    public void setRoleName(String roleName) {
//        this.roleName = roleName;
//    }
//}
