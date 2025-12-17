package com.mg.store.dl.pojo;
import jakarta.persistence.*;
@Entity(name="feed_back")
public class Feedback {
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    @Column(name="id")
    private Long id;
    @Column(name="given_on")
    private java.sql.Date givenOn;
    @Column(name="customer_code")
    private Long customerCode;
    @Column(name="product_code")
    private Long productCode;
    @Column(name="feed_back")
    private String feedback;
    public Feedback() {
    }
    public Feedback(java.sql.Date givenOn, Long customerCode, Long productCode, String feedback) {
        this.givenOn = givenOn;
        this.customerCode = customerCode;
        this.productCode = productCode;
        this.feedback = feedback;
    }
    public void setId(Long id) {
        this.id = id;
    }
    public Long getId() {
        return this.id;
    }
    public void setGivenOn(java.sql.Date givenOn) {
        this.givenOn = givenOn;
    }
    public java.sql.Date getGivenOn() {
        return this.givenOn;
    }
    public void setCustomerCode(Long customerCode) {
        this.customerCode = customerCode;
    }
    public Long getCustomerCode() {
        return this.customerCode;
    }
    public void setProductCode(Long productCode) {
        this.productCode = productCode;
    }
    public Long getProductCode() {
        return this.productCode;
    }
    public void setFeedback(String feedback) {
        this.feedback = feedback;
    }
    public String getFeedback() {
        return this.feedback;
    }
}