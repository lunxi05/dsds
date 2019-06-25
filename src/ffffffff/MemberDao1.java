package ffffffff;

import java.util.List;

import com.funding.web.entity.Member;

public interface MemberDao1 {
	
	List<Member1> getList() throws Exception;	//관리자-회원리스트
	List<Member1> getList(int page) throws Exception;	//관리자-회원리스트(페이지 넘기기)
	List<Member1> getList(int page, String field, String query) throws Exception;	//관리자-회원리스트(검색)
	
	Member1 get(String mail) throws Exception;	//회원정보 상세보기
	
	int insert(Member1 member) throws Exception;	//회원가입
	int update(Member1 member) throws Exception;	//마이페이지-정보수정
	List<Member1> getUK() throws Exception;
	

}
