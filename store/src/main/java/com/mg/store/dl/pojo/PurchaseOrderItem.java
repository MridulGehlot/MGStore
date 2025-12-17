package com.mg.store.dl.pojo;
import jakarta.persistence.*;
@Entity(name="purchase_order_item")
public class PurchaseOrderItem {
    @Column(name="order_id")
    @Id
    private Long orderId;
    @Column(name="product_code")
    @Id
    private Long productCode;
    private Integer quantity;
    private java.math.BigDecimal price;
    public PurchaseOrderItem() {
    }
    public PurchaseOrderItem(Long orderId, Long productCode, Integer quantity, java.math.BigDecimal price) {
        this.orderId = orderId;
        this.productCode = productCode;
        this.quantity = quantity;
        this.price = price;
    }
    public void setOrderId(Long orderId) {
        this.orderId = orderId;
    }
    public Long getOrderId() {
        return this.orderId;
    }
    public void setProductCode(Long productCode) {
        this.productCode = productCode;
    }
    public Long getProductCode() {
        return this.productCode;
    }
    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }
    public Integer getQuantity() {
        return this.quantity;
    }
    public void setPrice(java.math.BigDecimal price) {
        this.price = price;
    }
    public java.math.BigDecimal getPrice() {
        return this.price;
    }
}
