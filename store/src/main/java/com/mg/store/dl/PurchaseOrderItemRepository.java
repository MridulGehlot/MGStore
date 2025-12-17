package com.mg.store.dl;
import org.springframework.data.repository.CrudRepository;
import com.mg.store.dl.pojo.*;
public interface PurchaseOrderItemRepository extends CrudRepository<PurchaseOrderItem, PurchaseOrderItemId> {
}