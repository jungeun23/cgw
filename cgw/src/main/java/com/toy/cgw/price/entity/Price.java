package com.toy.cgw.price.entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.Comment;

@Entity
@Table(name = "TB_PRICE")

@Getter
@NoArgsConstructor
public class Price {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Comment("가격등급번호")
    private Long priceNo;

    @NotNull
    @Column(length = 10)
    @Comment("가격")
    private int price;

    @NotNull
    @Column(length = 15)
    @Comment("등급")
    private String grade;
}
