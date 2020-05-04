package com.example.prelab3.Repository;

import com.example.prelab3.Entity.Jobs;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface JobsRepository extends JpaRepository<Jobs,String> {
}
