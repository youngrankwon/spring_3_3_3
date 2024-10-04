package com.example.spring_3_3_3.jdbc;

import lombok.Data;

import java.time.LocalDateTime;

@Data
public class JdbcModel {
    /**
     * 그룹 코드
     */
    private String grpCd;

    /**
     * 상세 코드
     */
    private String dtlCd;

    /**
     * 코드 명
     */
    private String cdNm;

    /**
     * 코드 상세 내용
     */
    private String cdDesc;

    /**
     * 사용 여부
     */
    private String useYn;


    /**
     * 정렬 순번
     */
    private Integer srtNo;

    /**
     * 비고
     */
    private String rmk;

    /**
     * 등록일시
     */
    private LocalDateTime regDttm;

    /**
     * 등록 사용자 아이디
     */
    private String regUsrId;

    /**
     * 등록 사용자 아이피
     */
    private String regUsrIp;

    /**
     * 수정일시
     */
    private LocalDateTime updDttm;

    /**
     * 수정 사용자 아이디
     */
    private String updUsrId;

    /**
     * 수정 사용자 아이피
     */
    private String updUsrIp;
}
