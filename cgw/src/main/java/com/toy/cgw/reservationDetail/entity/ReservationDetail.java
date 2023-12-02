package com.toy.cgw.reservationDetail.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.Comment;

@Entity
@Table(name = "TB_RESERVATION_DETAIL")

@Getter
@NoArgsConstructor
public class ReservationDetail {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Comment("예약상세번호")
    private Long resDetailNo;

    @Column(length = 5)
    @Comment("좌석번호")
    private String seatNo;

}
