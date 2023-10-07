package com.example.furama_resort_module4.controller.contract;

import com.example.furama_resort_module4.entity.contractFurama.Contract;
import com.example.furama_resort_module4.service.contract.itf.ContractService;
import com.example.furama_resort_module4.service.contractDetail.ContractDetailService;
import com.example.furama_resort_module4.service.customer.itf.CustomerService;
import com.example.furama_resort_module4.service.employee.itf.EmployeeService;
import com.example.furama_resort_module4.service.serviceFurama.itf.ServiceFuramaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/contract")
public class ContractController {
    @Autowired
    private ContractService contractService;

    @Autowired
    private EmployeeService employeeService;

    @Autowired
    private ServiceFuramaService serviceFuramaService;

    @Autowired
    private CustomerService customerService;

    @Autowired
    private ContractDetailService contractDetailService;

    @GetMapping("/list")
    public String displayContract(Model model) {
        model.addAttribute("contracts", contractService.findAllByCustomer());
        return "furama/contract/list";
    }

    @GetMapping("/create")
    public String viewCreate(Model model){
        Contract contract = new Contract();
        model.addAttribute("contract",contract);
        model.addAttribute("employees",employeeService.findAll());
        model.addAttribute("customers",customerService.findAll());
        model.addAttribute("services",serviceFuramaService.findAll());
        return "furama/contract/create";
    }

    @PostMapping("/create")
    public String doCreate(@ModelAttribute("contract")Contract contract){
        contractService.createContract(contract);
        return "redirect:/contract/list";
    }

    @GetMapping("/update")
    public String viewUpdate(@RequestParam("contract") Integer contractId ,Model model){
        model.addAttribute("contract",contractService.findById(contractId));
        model.addAttribute("employees",employeeService.findAll());
        model.addAttribute("customers",customerService.findAll());
//        model.addAttribute("contractDetail",contractDetailService.findAll());
        model.addAttribute("services",serviceFuramaService.findAll());
        return "furama/contract/update";
    }

    @PostMapping("/update")
    public String doUpdate(Contract contract){
        contractService.updateContract(contract);
        return "redirect:/contract/list";
    }



    @GetMapping("/delete")
    public String doDelete(@RequestParam("contractId") Integer contractId) {
        contractService.deleteContract(contractId);
        return "redirect:/contract/list";
    }








}
