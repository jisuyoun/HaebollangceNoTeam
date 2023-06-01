package com.sist.haebollangce.lounge.service;

import java.util.List;
import java.util.Map;

import com.sist.haebollangce.lounge.model.LoungeBoardDTO;

public interface InterLoungeService {

	// === #2. 게시판 글쓰기 완료 요청 ===
	int loungeAdd(LoungeBoardDTO lgboarddto) throws Exception;

	// --- #3-1. 페이징 처리 안한 검색어 없는 전체 글 목록 보기 ---
	List<LoungeBoardDTO> lgboardListNoSearch();

	// --- #4-1. 글 조회수 증가와 함께 글 1개를 조회 해주는 것 ---
	LoungeBoardDTO lggetView(Map<String, String> paraMap);

	// --- #4-2. 글 조회수 증가는 없고, 단순히 글 1개만 조회해주는 것 ---
	LoungeBoardDTO lggetViewWithNoAddCount(Map<String, String> paraMap);

	// === #6. 라운지 글 수정 페이지 요청 완료 ===
	int lgedit(LoungeBoardDTO lgboarddto);

	// === #8. 라운지 글 삭제 페이지 요청 완료 ===
	int lgdel(Map<String, String> paraMap);

}