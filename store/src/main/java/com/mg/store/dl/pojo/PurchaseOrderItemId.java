package com.mg.store.dl.pojo;
import java.io.Serializable;
import java.util.Objects;

public class PurchaseOrderItemId implements Serializable {

    private Long orderId;
    private Long productCode;

    public PurchaseOrderItemId() {}

    public PurchaseOrderItemId(Long orderId, Long productCode) {
        this.orderId = orderId;
        this.productCode = productCode;
    }

    // equals and hashCode are REQUIRED

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof PurchaseOrderItemId that)) return false;
        return Objects.equals(orderId, that.orderId)
                && Objects.equals(productCode, that.productCode);
    }

    @Override
    public int hashCode() {
        return Objects.hash(orderId, productCode);
    }
}