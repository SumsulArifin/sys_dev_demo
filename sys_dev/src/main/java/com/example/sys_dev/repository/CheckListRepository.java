package com.example.sys_dev.repository;
import com.example.sys_dev.entity.model.CheckList;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CheckListRepository extends JpaRepository<CheckList,Integer> {
}
