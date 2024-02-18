package com.example.ddd.entity;

@Entity
@Table(name = "purchase_order")
@Access(AccessType.FIELD)
public class Order {
    @EmbeddedId
    private OrderNo number;//OrderNo가 식별자 타입
}
