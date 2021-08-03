package com.cho.moowoo.service;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.cho.moowoo.mapper.RewardMapper;
import com.cho.moowoo.vo.RewardVO;

@Service
public class RewardService {

	@Resource
	private RewardMapper rewardMapper;
	
	public List<RewardVO> selectRewardList() {
		return rewardMapper.selectRewardList();
	}
}