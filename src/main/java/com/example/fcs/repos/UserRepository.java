package com.example.fcs.repos;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.fcs.entities.Users;

public interface UserRepository extends JpaRepository<Users, Integer>{
}

//frontend