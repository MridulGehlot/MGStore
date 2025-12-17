package com.mg.store.beans;

public class PurchaseOrderBean {
    private Long id;
    private java.sql.Date orderDate;
    private Long customerCode;
    private java.math.BigDecimal totalAmount;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public java.sql.Date getOrderDate() {
        return orderDate;
    }

    public void setOrderDate(java.sql.Date orderDate) {
        this.orderDate = orderDate;
    }

    public Long getCustomerCode() {
        return customerCode;
    }

    public void setCustomerCode(Long customerCode) {
        this.customerCode = customerCode;
    }

    public java.math.BigDecimal getTotalAmount() {
        return totalAmount;
    }

    public void setTotalAmount(java.math.BigDecimal totalAmount) {
        this.totalAmount = totalAmount;
    }

}
