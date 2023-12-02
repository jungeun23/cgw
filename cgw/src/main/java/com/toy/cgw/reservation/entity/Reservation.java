package com.toy.cgw.reservation.entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.Comment;

import java.util.Date;

@Entity
@Table(name = "TB_RESERVATION")

@Getter
@NoArgsConstructor
public class Reservation {

    @Id
    @NotNull
    @Column(length = 10)
    @Comment("예약번호")
    private Long resvNo;

    @NotNull
    @Column(length = 15)
    @Comment("좌석번호")
    private String seatNo;

    @NotNull
    @Temporal(TemporalType.TIMESTAMP)
    @Comment("예약일자")
    private Date resvDt;

    @NotNull
    @Column(length = 500)
    @Comment("QR")
    private String qr;

}
