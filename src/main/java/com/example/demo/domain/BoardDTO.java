package com.example.demo.domain;


import java.time.LocalDateTime;

import lombok.Getter;
import lombok.Setter;

// 롬복(Lombok)이라는 라이브러리에서 제공해주는 기능
@Getter
@Setter
public class BoardDTO {

	/** 번호 (PK) */
	private Long idx;

	/** 제목 */
	private String title;

	/** 내용 */
	private String content;

	/** 작성자 */
	private String writer;

	/** 조회 수 */
	private int viewCnt;

	/** 공지 여부 */
	private String noticeYn;

	/** 비밀 여부 */
	private String secretYn;

	/** 삭제 여부 */
	private String deleteYn;

	/** 등록일 */
	private LocalDateTime insertTime;

	/** 수정일 */
	private LocalDateTime updateTime;

	/** 삭제일 */
	private LocalDateTime deleteTime;

}