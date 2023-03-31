package com.in60minutes.repository;

import com.in60minutes.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserReoo extends JpaRepository<User,Integer> {
    User findByUserId(int id);
}
