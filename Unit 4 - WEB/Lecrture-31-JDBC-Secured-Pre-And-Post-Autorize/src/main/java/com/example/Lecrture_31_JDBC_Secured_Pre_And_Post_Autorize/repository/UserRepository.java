package com.example.Lecrture_31_JDBC_Secured_Pre_And_Post_Autorize.repository;

import com.example.Lecrture_31_JDBC_Secured_Pre_And_Post_Autorize.model.entity.MyUser;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface UserRepository extends JpaRepository<MyUser, Long> {

    @Query("SELECT m FROM MyUser m WHERE m.username = :userName")
    Optional<MyUser> findByUserName(String userName);

}
