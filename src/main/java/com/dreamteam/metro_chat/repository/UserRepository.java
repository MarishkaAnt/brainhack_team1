package com.dreamteam.metro_chat.repository;

import com.dreamteam.metro_chat.models.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Integer>{
}
