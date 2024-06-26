package com.bezkoder.springjwt.entities;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.time.LocalDate;


@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter

@Entity
@Table(name = "payment")
public class Payment {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name ="idPayment")
    private long idPayment;

    @ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name = "idShoppingCart")
    @JsonIgnore
    private ShoppingCart shoppingCart;

    @ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name = "idVoucher")
    @JsonIgnore
    private Voucher voucher;

    @ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name = "idPaymentMethod")
    @JsonIgnore
    private PaymentMethod paymentMethod;

    @Column(name="status")
    private int status;

    @Column(name = "address")
    private String address;

    @Column(name = "createDate")
    private LocalDate createDate;

    @Column(name = "updateDate")
    private LocalDate updateDate;

    @Column(name = "transportFee")
    private int transportFee;

    @Column(name = "fullName")
    private String fullName;

    @Column(name = "phone")
    private String phone;

    public long getIdPayment() {
        return idPayment;
    }

    public void setIdPayment(long idPayment) {
        this.idPayment = idPayment;
    }
}
