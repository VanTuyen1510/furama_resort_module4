package com.example.furama_resort_module4.controller.serviceFurama;

import com.example.furama_resort_module4.entity.serviceFurama.Service;
import com.example.furama_resort_module4.service.serviceFurama.itf.ServiceFuramaService;
import com.example.furama_resort_module4.service.serviceType.itf.ServiceTypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.Optional;

@Controller
@RequestMapping("/service")
public class ServiceController {
    @Autowired
    private ServiceFuramaService serviceFuramaService;

    @Autowired
    private ServiceTypeService serviceTypeService;

    @GetMapping("/list")
    public String displayService(Model model){
        model.addAttribute("services",serviceFuramaService.findAll());
        return "furama/serviceFurama/list";
    }

    @GetMapping("/update")
    public String viewUpdate(Model model){
        Service service = new Service();
        model.addAttribute("service",service);
        model.addAttribute("service_type",serviceTypeService.findAll());
        return "furama/service/list";
    }

    @PostMapping("/update")
    public String doUpdate(@RequestParam("serviceId") Integer serviceId){
        Service service = serviceFuramaService.findById(serviceId).orElse(null);
        serviceFuramaService.update(service);
        return "redirect:/service/list";
    }


}
