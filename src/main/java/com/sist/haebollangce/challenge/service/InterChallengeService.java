package com.sist.haebollangce.challenge.service;

import java.util.List;
import java.util.Map;

import com.sist.haebollangce.challenge.dao.challengeVO;
import com.sist.haebollangce.challenge.dto.ChallengeDTO;

public interface InterChallengeService {
	
	// ===================================================================================================
	
	// 인증빈도 리스트 가져오기
	List<ChallengeDTO> getfreq();

	// 챌린지 기간 가져오기 
	List<ChallengeDTO> getduring();

	// 챌린지 등록 하기 
	int addChallenge(ChallengeDTO challengedto);

	// 챌린지 게시글 조회하기
	ChallengeDTO getview(Map<String, String> paraMap);

	// 카테고리 리스트 가져오기 
	List<ChallengeDTO> getcategoryList();

	
	// 챌린지 불러오기
	List<challengeVO> challengeList();

	// 카테고리 불러오기
	List<challengeVO> categoryList();

	// 카테고리별 챌린지 불러오기
	List<challengeVO> challengelist();
}