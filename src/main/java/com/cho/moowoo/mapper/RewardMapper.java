package com.cho.moowoo.mapper;

import java.util.List;

import org.mybatis.spring.annotation.MapperScan;

import com.cho.moowoo.vo.RewardVO;

@MapperScan
public interface RewardMapper {
	public List<RewardVO> selectRewardList();
}