package com.example.demo.mapper;


import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.example.demo.domain.BoardDTO;


//XML Mapper에서 메서드의 이름과 일치하는 SQL 문을 찾아 실행합니다.
@Mapper
public interface BoardMapper {

	public int insertBoard(BoardDTO params);

	public BoardDTO selectBoardDetail(Long idx);

	public int updateBoard(BoardDTO params);

	public int deleteBoard(Long idx);

	public List<BoardDTO> selectBoardList();

	public int selectBoardTotalCount();

}