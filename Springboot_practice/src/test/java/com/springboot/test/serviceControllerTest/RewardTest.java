package com.springboot.test.serviceControllerTest;


import com.springboot.test.controller.RewardController;
import com.springboot.test.model.Reward;
import com.springboot.test.repository.RewardRepository;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class RewardTest {

    @InjectMocks
    private RewardController rewardController;

    @Mock
    private RewardRepository rewardRepository;

    @Test
    public void getRewardTest() throws Exception{
        Reward reward = new Reward();
        reward.setId(1L);

        when(rewardRepository.findOne(1L)).thenReturn(reward);

        Reward rwd = rewardController.get(1L);

        verify(rewardRepository).findOne(1L);

        assertThat(rwd.getId(), is(1L));
    }

}
