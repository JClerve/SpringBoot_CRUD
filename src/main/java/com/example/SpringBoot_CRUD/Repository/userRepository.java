package com.example.SpringBoot_CRUD.Repository;

import com.example.SpringBoot_CRUD.Entity.userEntity;
import org.springframework.data.jpa.repository.JpaRepository;


//Here in this entity, going to give the 2 arguments entity name, ID type that mention in entity
public interface userRepository extends JpaRepository <userEntity,Long> {

}
