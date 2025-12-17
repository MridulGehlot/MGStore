package com.mg.store.services;
import com.mg.store.dl.*;
import com.mg.store.dl.pojo.*;
import com.mg.store.beans.*;
import org.springframework.stereotype.*;
import org.springframework.web.bind.annotation.*;
import org.springframework.beans.factory.annotation.*;
@Controller
public class ProductService
{
@Autowired
private ProductRepository productRepository;

@ResponseBody
@GetMapping("/addProduct")
public ProductBean addProduct(ProductBean productBean)
{
Product p=new Product(productBean.getName(),productBean.getPrice(),productBean.getIsAvailable());
productRepository.save(p);
productBean.setCode(p.getCode());
return productBean;
}
}