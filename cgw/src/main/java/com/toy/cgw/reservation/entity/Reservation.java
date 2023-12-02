package com.toy.cgw.reservation.entity;

import com.toy.cgw.reservationDetail.entity.ReservationDetail;
import com.toy.cgw.screening.entity.Screening;
import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.Comment;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

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
    @Temporal(TemporalType.TIMESTAMP)
    @Comment("예약일자")
    private Date resvDt;

    @NotNull
    @Column(length = 500)
    @Comment("QR")
    private String qr;

    @ManyToOne
    @JoinColumn(name = "screeningNo")
    private Screening screening;

    @OneToMany(mappedBy = "reservation")
    private List<ReservationDetail> reservationDetails = new ArrayList<>();

}
