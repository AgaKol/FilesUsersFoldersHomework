package com.codeclan.example.UsersHomework.repositories;

import com.codeclan.example.UsersHomework.models.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
}
