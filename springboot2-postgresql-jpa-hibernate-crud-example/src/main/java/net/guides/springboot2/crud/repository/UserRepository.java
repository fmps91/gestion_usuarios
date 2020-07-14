package net.guides.springboot2.crud.repository;

import java.util.List;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import org.springframework.data.repository.query.Param;

import net.guides.springboot2.crud.model.User;

@Repository
public interface UserRepository extends JpaRepository<User, Long>{
   
    @Query(value = "select * from users where users.id = :id ", nativeQuery = true)
    public List<User> transactions(@Param("id") Long id);

}
