package com.toy.cgw.boxoffice.entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.Comment;

import java.util.Date;

@Entity
@Table(name = "boxOffice")
@Getter
@NoArgsConstructor
public class BoxOffice {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column
    @Comment("박스오피스번호 시퀀스")
    private Long boxOfficeNo;

    @NotNull
    @Column(length = 200 )
    @Comment("영화제목")
    private String movieNm;

    @NotNull
    @Temporal(TemporalType.DATE)
    @Comment("개봉일")
    private Date openDt; 

    @Column(length = 3 )
    @Comment("박스오피스순위")
    private int boxOfficeRank;

    @Column (length = 1 )
    @Comment("신규진입여부")
    private String rankNewYn;

}
