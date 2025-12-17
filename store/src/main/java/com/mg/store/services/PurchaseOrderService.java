package com.mg.store.services;
import com.mg.store.dl.*;
import com.mg.store.dl.pojo.*;
import com.mg.store.beans.*;
import org.springframework.stereotype.*;
import org.springframework.web.bind.annotation.*;
import org.springframework.beans.factory.annotation.*;
import java.sql.Date;
import java.time.LocalDate;

@Controller
public class PurchaseOrderService {
    @Autowired
    private PurchaseOrderRepository purchaseOrderRepository;

    @ResponseBody
    @GetMapping("/addPurchaseOrder")
    public PurchaseOrderBean addPurchaseOrder(PurchaseOrderBean purchaseOrderBean) {
        PurchaseOrder purchaseOrder = new PurchaseOrder(Date.valueOf(LocalDate.now()), purchaseOrderBean.getCustomerCode(), purchaseOrderBean.getTotalAmount());
        purchaseOrderRepository.save(purchaseOrder);
        purchaseOrderBean.setId(purchaseOrder.getId());
        return purchaseOrderBean;
    }
    
}
