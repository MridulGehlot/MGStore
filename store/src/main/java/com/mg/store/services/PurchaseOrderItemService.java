package com.mg.store.services;
import org.springframework.stereotype.*;
import org.springframework.web.bind.annotation.*;
import org.springframework.beans.factory.annotation.*;
import com.mg.store.dl.*;
import com.mg.store.beans.*;
import com.mg.store.dl.pojo.*;
@Controller
public class PurchaseOrderItemService {
    @Autowired
    private PurchaseOrderItemRepository purchaseOrderItemRepository;

    @ResponseBody
    @GetMapping("/addPurchaseOrderItem")
    public PurchaseOrderItemBean addPurchaseOrderItem(PurchaseOrderItemBean purchaseOrderItemBean) {
        PurchaseOrderItem purchaseOrderItem = new PurchaseOrderItem(purchaseOrderItemBean.getOrderId(), purchaseOrderItemBean.getProductCode(), purchaseOrderItemBean.getQuantity(), purchaseOrderItemBean.getPrice());
        purchaseOrderItemRepository.save(purchaseOrderItem);
        return purchaseOrderItemBean;
    }

}
