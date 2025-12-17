package com.mg.store.services;
import com.mg.store.dl.*;
import com.mg.store.dl.pojo.*;
import com.mg.store.beans.*;
import org.springframework.web.bind.annotation.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.*;
@Controller
public class CustomerService {
    @Autowired
    private CustomerRepository customerRepository;

    @ResponseBody
    @GetMapping("/addCustomer")
    public CustomerBean addCustomer(CustomerBean customerBean) {
        Customer c = new Customer(customerBean.getName(), customerBean.getEmail(), customerBean.getPassword(),
                customerBean.getPasswordKey(), customerBean.getDateOfRegistration());
        customerRepository.save(c);
        customerBean.setCode(c.getCode());
        return customerBean;
    }

}
