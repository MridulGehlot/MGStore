package com.mg.store.dl.pojo;
import jakarta.persistence.*;
import java.math.*;
@Entity(name="purchase_order")
public class PurchaseOrder {
    @Id
    private Long id;
    @Column(name="order_date")
    private java.sql.Date orderDate;
    @Column(name="customer_code")
    private Long customerCode;
    @Column(name="total_amount")
    private BigDecimal totalAmount;
    public PurchaseOrder() {
    }
    public PurchaseOrder(java.sql.Date orderDate, Long customerCode, BigDecimal totalAmount) {
        this.orderDate = orderDate;
        this.customerCode = customerCode;
        this.totalAmount = totalAmount;
    }
    public void setId(Long id) {
        this.id = id;
    }
    public Long getId() {
        return this.id;
    }
    public void setOrderDate(java.sql.Date orderDate) {
        this.orderDate = orderDate;
    }
    public java.sql.Date getOrderDate() {
        return this.orderDate;
    }
    public void setCustomerCode(Long customerCode) {
        this.customerCode = customerCode;
    }
    public Long getCustomerCode() {
        return this.customerCode;
    }
    public void setTotalAmount(BigDecimal totalAmount) {
        this.totalAmount = totalAmount;
    }
    public BigDecimal getTotalAmount() {
        return this.totalAmount;
    }
}