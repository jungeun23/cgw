package com.toy.cgw.movie.entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.Comment;

import java.util.Date;

@Entity
@Table(name = "TB_MOVIE")

@Getter
@NoArgsConstructor
public class Movie {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Comment("영화번호")
    private Long movieNo;

    @NotNull
    @Column(length = 100)
    @Comment("영화명")
    private String title;

    @NotNull
    @Temporal(TemporalType.TIMESTAMP)
    @Comment("개봉일")
    private Date openDt;

    @Column(length = 30)
    @Comment("감독명")
    private String directorNm;

    @Column(length = 30)
    @Comment("배우명")
    private String actorNm;

    @Column(length = 10)
    @Comment("장르")
    private String genre;

    @Column(length = 500)
    @Comment("포스터")
    private String kmdbUrl;

    @Column(length = 10)
    @Comment("키워드")
    private String keywords;

    @Column(length = 1000)
    @Comment("줄거리")
    private String plot;

    @Column(length = 200)
    @Comment("대표관람등급")
    private String rating;

    @Column(length = 4)
    @Comment("대표상영시간")
    private int runtime;

    @Column(length = 200)
    @Comment("국가")
    private String nation;


}
