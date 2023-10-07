package com.example.furama_resort_module4.controller.employee;

import com.example.furama_resort_module4.dto.employee.EmployeeDto;
import com.example.furama_resort_module4.entity.employeeFurama.Employee;
import com.example.furama_resort_module4.service.contract.itf.ContractService;
import com.example.furama_resort_module4.service.employee.itf.DivisionService;
import com.example.furama_resort_module4.service.employee.itf.EducationDegreeService;
import com.example.furama_resort_module4.service.employee.itf.EmployeeService;
import com.example.furama_resort_module4.service.employee.itf.PositionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

@Controller
@RequestMapping("/employee")
public class EmployeeController {
    @Autowired
    private EmployeeService employeeService;

    @Autowired
    private PositionService positionService;

    @Autowired
    private EducationDegreeService educationDegreeService;

    @Autowired
    private DivisionService divisionService;

    @Autowired
    private ContractService contractService;


    @GetMapping("/list")
    public String displayEmployee(Model model) {
        model.addAttribute("employees", employeeService.findAllByStatus());
        return "furama/employee/list";
    }

    @GetMapping("/create")
    public String viewCreate(Model model) {
        Employee employee = new Employee();
        model.addAttribute("employee", employee);
        model.addAttribute("positions", positionService.findAll());
        model.addAttribute("divisions", divisionService.findAll());
        model.addAttribute("educationDegrees", educationDegreeService.findAll());
        return "furama/employee/create";
    }

    @PostMapping("/create")
    public String doCreate(@Validated @ModelAttribute("employee") EmployeeDto employee, BindingResult bindingResult ,
                           Model model) {
        if (bindingResult.hasErrors()) {
            model.addAttribute("positions", positionService.findAll());
            model.addAttribute("divisions", divisionService.findAll());
            model.addAttribute("educationDegrees", educationDegreeService.findAll());
            return "furama/employee/create";
        }

        Employee employee1 = convertEmployeeDto(employee);
//        Integer idEmp = Integer.valueOf("NV-" + ( (Math.random() * 10000)));
//        employee1.setEmployeeId(idEmp);
        employeeService.create(employee1);
        return "redirect:/employee/listPaging";
    }

    //int employeeId, String name, Date birthday, String card, Double salary, String phone, String email, String address
    public Employee convertEmployeeDto(EmployeeDto employeeDto) {
        Employee employee = new Employee();
        employee.setEmployeeId(employeeDto.getEmployeeId());
        employee.setName(employeeDto.getName());
        employee.setBirthday(employeeDto.getBirthday());
        employee.setCard(employeeDto.getCard());
        employee.setSalary(employeeDto.getSalary());
        employee.setPhone(employeeDto.getPhone());
        employee.setEmail(employeeDto.getEmail());
        employee.setAddress(employeeDto.getAddress());
        employee.setPosition(employeeDto.getPosition());
        employee.setDivision(employeeDto.getDivision());
        employee.setEducationDegree(employeeDto.getEducationDegree());
        employee.setStatus(employeeDto.isStatus());
        return employee;
    }

    @GetMapping("/update")
    public String viewUpdate(@RequestParam(value = "employeeId") Integer employeeId, Model model) {
        model.addAttribute("employee", employeeService.findById(employeeId));
        model.addAttribute("position", positionService.findAll());
        model.addAttribute("division", divisionService.findAll());
        model.addAttribute("educationDegree", educationDegreeService.findAll());
        return "furama/employee/update";
    }

    @PostMapping("/update")
    public String doUpdate(EmployeeDto employeeDto) {
        Employee employee1 = convertEmployeeDto(employeeDto);
        employeeService.update(employee1);
        return "redirect:/employee/listPaging";
    }

    @GetMapping("/listPaging")
    public String displayEmployeePaging(Model model,
                                        @RequestParam(value = "page") Optional<Integer> page,
                                        @RequestParam(value = "size") Optional<Integer> size,
                                        @RequestParam("sort") Optional<String> sort) {
        int currentPage = page.orElse(1);
        int pageSize = size.orElse(3);
        String sortField = sort.orElse("name");
        Pageable pageable = PageRequest.of(currentPage - 1, pageSize, Sort.by(sortField).ascending());
        Page<Employee> employees = employeeService.findAllPaging(pageable);
        model.addAttribute("employees", employees);
        int totalPage = employees.getTotalPages();
        if (totalPage > 1) {
            List<Integer> pageNumbers = IntStream.rangeClosed(1, totalPage)
                    .boxed()
                    .collect(Collectors.toList());
            model.addAttribute("pageNumbers", pageNumbers);
        }
        return "furama/employee/list";
    }

    @GetMapping("/delete")
    public String doDelete(@RequestParam Integer employeeId) {
        employeeService.delete(employeeId);
        return "redirect:/employee/list";

//        employeeService.deleteEmployeeByStatus(status,employeeId);
//        return "redirect:/furama/employee/list";

    }


}
