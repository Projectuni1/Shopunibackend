package com.example.mohandesinarm.Repository;

import com.example.mohandesinarm.DBEntity.UsersEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface UsersRepository extends JpaRepository<UsersEntity,Integer> {
    Optional<UsersEntity> findByEmailAddress(String emailAddress);
}