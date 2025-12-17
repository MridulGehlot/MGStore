package com.mg.store.services;
import org.springframework.stereotype.*;
import org.springframework.web.bind.annotation.*;
import org.springframework.beans.factory.annotation.*;
import com.mg.store.dl.*;
import com.mg.store.beans.*;
import com.mg.store.dl.pojo.*;

@Controller
public class AdministratorService {
    @Autowired
    private AdministratorRepository administratorRepository;

    @ResponseBody
    @GetMapping("/addAdministrator")
    public AdministratorBean addAdministrator(AdministratorBean administratorBean) {
        Administrator administrator = new Administrator(administratorBean.getUsername(), administratorBean.getPassword(), administratorBean.getPasswordKey());
        administratorRepository.save(administrator);
        return administratorBean;
    }    
}
