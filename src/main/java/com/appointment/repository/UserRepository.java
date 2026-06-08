package com.appointment.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.appointment.entity.User;

public interface UserRepository extends JpaRepository<User,Long>{

}
