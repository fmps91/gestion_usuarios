package com.example.demo.repository;

import java.util.Collection;

import java.util.List;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import org.springframework.data.repository.query.Param;

import com.example.demo.model.User;

@Repository
public interface UserRepository extends JpaRepository<User, Long>{
   
    
/* 
forma 1
@Query(
    value = 
    "SELECT "+
    " users.id, "+
    " users.first_name, "+
    " users.last_name, "+
    " users.email_address, "+
    " rol.name "+
    " FROM "+
    " users "+
    " FULL JOIN rol "+
    " ON rol.id_usuario = users.id  "+
    " where users.email_address = :email and users.password = :password ", 
    nativeQuery = true)
  
  Object transactions(@Param("email") String email,@Param("password") String password ); */

  //forma 2
@Query(
    value = 
    "SELECT "+
    " u.id, "+
    " u.first_name, "+
    " u.last_name, "+
    " u.email_address,"+
    " r.name"+
    " FROM "+
    " users as u "+
    " FULL JOIN rol as r "+
    " ON r.id_usuario = u.id  "+
    " where u.email_address = :email and u.password = :password ", 
    nativeQuery = true)
    Object transactions(@Param("email") String email,@Param("password") String password );




}
