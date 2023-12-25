package com.example.mohandesinarm.Repository;

import com.example.mohandesinarm.DBEntity.ItemEntity;
import com.example.mohandesinarm.DBEntity.UsersEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ItemRepository extends JpaRepository<ItemEntity,Integer> {

    ItemEntity findById(int id);
    List<ItemEntity> findAll();

    List<ItemEntity> findByTitleContaining(String title);

    @Query("SELECT Top(10) , avg(r) as f FROM RateEntity r inner join " +
            "r.item on r.item.id = r.id where r.createdAt between ?1 and ?2 order by f desc ")
    List<ItemEntity> findAllMostRated(java.sql.Timestamp startDate , java.sql.Timestamp endDate);
}
