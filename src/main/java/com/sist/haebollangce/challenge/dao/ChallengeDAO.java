package com.sist.haebollangce.challenge.dao;

<<<<<<< HEAD




import java.util.List;

import javax.annotation.Resource;

import org.mybatis.spring.SqlSessionTemplate;
=======
import com.sist.haebollangce.challenge.dto.ChallengeDTO;
import com.sist.haebollangce.common.mapper.InterMapper;
import com.sist.haebollangce.user.dao.InterUserDAO;
import com.sist.haebollangce.user.dto.UserDTO;

import java.util.List;
import java.util.Map;

>>>>>>> refs/heads/main
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import com.sist.haebollangce.common.mapper.InterMapper;


@Repository
public class ChallengeDAO implements InterChallengeDAO {

<<<<<<< HEAD
=======
    @Autowired
    private InterMapper mapper;
    
    // 참가중인 챌린지 리스트 가져오기
 	@Override
 	public List<ChallengeDTO> getJoinedChaList() {
 		List<ChallengeDTO> chaList = mapper.getJoinedChaList();
 		return chaList;
 	}
>>>>>>> refs/heads/main

<<<<<<< HEAD
	@Autowired
    private InterMapper mapper;
	
	// 챌린지 불러오기
	@Override
	public List<challengeVO> challengeList() {
	    
		return mapper.challengeList();
	}

	// 카테고리 불러오기
	@Override
	public List<challengeVO> categoryList() {
		
		
		return mapper.categoryList();
	}

	// 카테고리별 챌린지 불러오기
	@Override
	public List<challengeVO> challengelist() {
		
		
		return mapper.challengelist();
	}

	

    
=======
 	// 인증빈도 리스트 가져오기
 	@Override
 	public List<ChallengeDTO> getfreq() {
 		
 		List<ChallengeDTO> freqList = mapper.getfreq();
 		
 		return freqList;
 	}

 	// 챌린지 기간 가져오기 
 	@Override
 	public List<ChallengeDTO> getduring() {
 		
 		List<ChallengeDTO> duringList = mapper.getduring();
 		
 		return duringList;
 	}

 	// 챌린지 등록하기 
	@Override
	public int addChallenge(ChallengeDTO challengedto) {
		
		int n = mapper.addChallenge(challengedto);
		
		return n;
	}
	
	// 인증 가능 시간 등록하기 
	@Override
	public int addCertifyHour(ChallengeDTO challengedto) {
		int n = mapper.addCertifyHour(challengedto);
		return n;
	}

	// 인증 예시 등록하기
	@Override
	public int addCertifyExam(ChallengeDTO challengedto) {
		int n = mapper.addCertifyExam(challengedto);
		return n;
	}

	// 챌린지 게시글 조회하기
	@Override
	public ChallengeDTO getview(Map<String, String> paraMap) {
		
		ChallengeDTO challengedto = mapper.getview(paraMap);
		
		return challengedto;
	}

	@Override
	public List<ChallengeDTO> getcategoryList() {
		List<ChallengeDTO> categoryList = mapper.getcategoryList();
				
		return categoryList;
	}

	
>>>>>>> refs/heads/main
}
