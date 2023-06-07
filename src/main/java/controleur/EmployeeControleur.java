package controleur;

import model.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import service.EmployeeSer;
import service.EmployeeService;

import java.util.List;

@RestController
@RequestMapping("/employe")
public class EmployeeControleur {

    @Autowired
    private EmployeeSer employeeSer;

    @GetMapping("/list")
    public List<Employee> getEmployee() {
        return employeeSer.findAll();
    }
}
