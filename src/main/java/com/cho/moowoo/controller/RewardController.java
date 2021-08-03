package com.cho.moowoo.controller;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cho.moowoo.service.RewardService;
import com.cho.moowoo.vo.RewardVO;

@CrossOrigin("*")
@RestController
@RequestMapping(value = "/reward")
public class RewardController {
	
	@Resource
	private RewardService rewardService;

	@GetMapping("/list")
	public List<RewardVO> getRewardList(){
		return rewardService.selectRewardList();
	}
}