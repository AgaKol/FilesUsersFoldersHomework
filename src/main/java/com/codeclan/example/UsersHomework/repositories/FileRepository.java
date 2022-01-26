package com.codeclan.example.UsersHomework.repositories;

import com.codeclan.example.UsersHomework.models.File;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FileRepository extends JpaRepository<File, Long> {
}
