package com.gabor.SpringSec.repo;

import com.gabor.SpringSec.model.Users;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepo extends JpaRepository<Users, Long> {


    Users findByUsername(String username);
}
