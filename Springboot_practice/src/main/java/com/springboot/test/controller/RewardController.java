package com.springboot.test.controller;


import com.springboot.test.model.Reward;
        import com.springboot.test.repository.RewardRepository;
        import com.springboot.test.service.RewardService;
        import org.springframework.beans.factory.annotation.Autowired;
        import org.springframework.web.bind.annotation.*;

        import java.util.List;

@RestController
@RequestMapping
public class RewardController {

    @Autowired
    private RewardRepository rewardRepository;

    @Autowired
    private RewardService rewardService;

    @RequestMapping(value = "/rewards", method = RequestMethod.GET)
    public List<Reward> getAll() {
        return rewardRepository.findAll();
    }

    @RequestMapping(value = "/reward/{id}", method = RequestMethod.GET)
    public Reward get(@PathVariable long id) {
        return rewardRepository.findOne(id);
    }

    @RequestMapping(value = "/reward/{year}", method = RequestMethod.GET)
    public List<Reward> findRewardByYear(@RequestParam(name = "value") int year) {
        return rewardService.getRewardByYear(year);
    }

    @RequestMapping(value = "/reward/{title}", method = RequestMethod.GET)
    public List<Reward> findRewardByTitle(@RequestParam(name = "value") String title) {
        return rewardService.getRewardByTitle(title);
    }

    @RequestMapping(value = "/reward", method = RequestMethod.POST)
    public void create(@RequestBody Reward reward) {
        rewardRepository.saveAndFlush(reward);
    }

    @RequestMapping(value = "/reward", method = RequestMethod.PUT)
    public void update(@RequestBody Reward reward) {
        Reward rewardInDb = rewardRepository.findOne(reward.getId());
        rewardRepository.saveAndFlush(rewardInDb);
    }
}
