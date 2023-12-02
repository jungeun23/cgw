package com.toy.cgw.screening.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.Comment;

import java.util.Date;

@Entity
@Table(name = "TB_SCREENING")
@Getter
@NoArgsConstructor
public class Screening {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column
    @Comment("상영번호")
    private Long screeningNo;

    @Temporal(TemporalType.TIME)
    @Comment("상영시작시간")
    private Date screenStartTime;

    @Column(length = 10 )
    @Comment("상영관번호")
    private String screenNo;

    @Column
    @Comment("영화번호")
    private Long movieNo;
}
