//package com.myRetail.config;
//
//import com.myRetail.model.Role;
//import com.myRetail.model.User;
//import com.myRetail.service.RoleServiceImpl;
//import com.myRetail.service.UserServiceImpl;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.security.core.AuthenticationException;
//import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
//import org.springframework.security.web.authentication.www.BasicAuthenticationEntryPoint;
//import org.springframework.stereotype.Component;
//
//import javax.servlet.ServletException;
//import javax.servlet.http.HttpServletRequest;
//import javax.servlet.http.HttpServletResponse;
//import java.io.IOException;
//import java.io.PrintWriter;
//
//@Component
//public class AuthenticationEntryPointConfig extends BasicAuthenticationEntryPoint {
//
//    @Override
//    public void commence(HttpServletRequest request, HttpServletResponse response, AuthenticationException authException) throws IOException{
//        response.addHeader("WWW-Authenticate", "Basic Realm - " + getRealmName());
//        response.setStatus(HttpServletResponse.SC_UNAUTHORIZED);
//        PrintWriter writer = response.getWriter();
//        writer.println("HTTP Status 401 - "+ authException.getMessage());
//    }
//
//    @Override
//    public void afterPropertiesSet(){
//        setRealmName("myRetail");
//        super.afterPropertiesSet();
//    }
//}
