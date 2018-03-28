package com.springboot.test.service;


import com.springboot.test.model.Reward;
import com.springboot.test.repository.RewardRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RewardService {

    @Autowired
    private RewardRepository rewardRepository;


    public List<Reward> getRewardByYear(int year) {
        return rewardRepository.findRewardByYear(year);
    }

    public List<Reward> getRewardByTitle(String title) {
        return rewardRepository.findRewardByTitle(title);
    }
}
