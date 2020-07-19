package net.guides.springboot2.crud.repository;

import org.springframework.boot.autoconfigure.data.web.SpringDataWebProperties.Pageable;
import org.springframework.data.domain.Page;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
//import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;
import net.guides.springboot2.crud.model.Rol;

@Repository
public interface RolRepository extends JpaRepository<Rol, Long>{
    
    
}
