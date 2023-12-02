package com.toy.cgw.screen.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.Comment;

@Entity
@Table(name = "screen")
@Getter
@NoArgsConstructor
public class Screen {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column
    @Comment("상영번호")
    private String screenNo;

    @Column (length = 3 )
    @Comment("좌석행")
    private int seatX;

    @Column(length = 3 )
    @Comment("좌석열")
    private int seatY;

    @Column(length = 4 )
    @Comment("좌석개수")
    private int seatCnt;

}
