package com.example.Lecture_25.repositories;

import com.example.Lecture_25.model.user.UserEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<UserEntity, Long> {
}
