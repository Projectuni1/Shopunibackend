package com.example.mohandesinarm.Repository;

import com.example.mohandesinarm.DBEntity.ItemEntity;
import com.example.mohandesinarm.DBEntity.UsersEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ItemRepository extends JpaRepository<ItemEntity,Integer> {

    ItemEntity findById(int id);
    List<ItemEntity> findAll();
}
