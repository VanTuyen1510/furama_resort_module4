package com.example.furama_resort_module4.controller.contractDetail;

import com.example.furama_resort_module4.service.contractDetail.ContractDetailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/contractDetail")
public class ContracDetailController {
    @Autowired
    private ContractDetailService contractDetailService;

    @GetMapping("/list")
    public String displayContractDetail(Model model){
        model.addAttribute("contractDetails", contractDetailService.findAll());
        return "furama/contractDetail/list";
    }

    @GetMapping("/delete")
    public String doDelete(@RequestParam Integer contractDetailId){
        contractDetailService.deleteById(contractDetailId);
        return "redirect:/contractDetail/list";
    }

}
