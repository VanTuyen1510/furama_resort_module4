package com.example.furama_resort_module4.controller.customer;

import com.example.furama_resort_module4.dto.customer.CustomerDto;
import com.example.furama_resort_module4.entity.customerFurama.Customer;
import com.example.furama_resort_module4.service.customer.itf.CustomerService;
import com.example.furama_resort_module4.service.customer.itf.CustomerTypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RestController
@RequestMapping("/customer")
public class CustomerController {
    @Autowired
    private CustomerService customerService;

    @Autowired
    private CustomerTypeService customerTypeService;

    @GetMapping("/list")
    public String displayCustomer(Model model) {
        model.addAttribute("customers", customerService.findAll());
        return "furama/customer/list";
    }

    @GetMapping("/create")
    public String viewCreate(Model model) {
        Customer customer = new Customer();
        model.addAttribute("customer", customer);
        model.addAttribute("customerTypes", customerTypeService.findAll());
        return "furama/customer/create";
    }

    @PostMapping("/create")
    public String doCreate(@ModelAttribute("customer") CustomerDto customer) {
        Customer customer1 = convertCustomerDto(customer);
//        Integer idCus = Integer.valueOf("KH-" + ( (Math.random() * 10000)));
//        customer.setCustomerId(idCus);
        customerService.create(customer1);
        return "redirect:/customer/list";
    }


//    Integer customerId, String name, Date birthday, Integer gender, String card, String phone, String email, String address, CustomerType customerType, Set<Contract> contractSet

    public Customer convertCustomerDto(CustomerDto customerDto) {
        Customer customer = new Customer();
        customer.setCustomerId(customerDto.getCustomerId());
        customer.setName(customerDto.getName());
        customer.setBirthday(customerDto.getBirthday());
        customer.setGender(customerDto.getGender());
        customer.setCard(customerDto.getCard());
        customer.setPhone(customerDto.getPhone());
        customer.setEmail(customerDto.getEmail());
        customer.setAddress(customerDto.getAddress());
        customer.setCustomerType(customerDto.getCustomerType());
//        customer.setStatus(customerDto.getStatus());
        return customer;
    }

    @GetMapping("/update")
    public String viewUpdate(@RequestParam Integer customerId,Model model){
        model.addAttribute("customer",customerService.findById(customerId));
        model.addAttribute("customerTypes",customerTypeService.findAll());
        return "furama/customer/update";
    }
    @PostMapping("/update")
    public String doUpdate(CustomerDto customerDto){
        Customer customer = convertCustomerDto(customerDto);
        customerService.update(customer);
        return "redirect:/customer/list";
    }

    @GetMapping("/delete")
    public String doDelete(@RequestParam Integer customerId ){
        customerService.delete(customerId);
        return "redirect:/customer/list";
    }


}
