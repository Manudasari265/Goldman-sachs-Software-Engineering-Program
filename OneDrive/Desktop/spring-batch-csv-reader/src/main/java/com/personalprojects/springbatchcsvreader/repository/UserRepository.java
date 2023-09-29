package com.personalprojects.springbatchcsvreader.repository;

import com.personalprojects.springbatchcsvreader.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Integer> {
}
