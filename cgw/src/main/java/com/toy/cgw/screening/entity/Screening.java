package com.toy.cgw.screening.entity;

import com.toy.cgw.movie.entity.Movie;
import com.toy.cgw.screen.entity.Screen;
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

    @ManyToOne
    @JoinColumn(name = "screenNo")
    private Screen screen;

    @ManyToOne
    @JoinColumn(name = "movieNo")
    private Movie  movie;
}
