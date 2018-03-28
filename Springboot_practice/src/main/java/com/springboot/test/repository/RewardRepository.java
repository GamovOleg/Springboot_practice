package com.springboot.test.repository;

import com.springboot.test.model.Reward;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface RewardRepository extends JpaRepository<Reward, Long> {

    List<Reward> findRewardByYear(int year);

    List<Reward> findRewardByTitle(String title);

}