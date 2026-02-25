package com.application.springcodespace.controller;

// import com.application.springcodespace.entity.Employee;
// import com.application.springcodespace.repo.EmployeeRepo;
// import org.springframework.beans.factory.annotation.Autowired;
// import org.springframework.http.HttpStatus;
// import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

// import java.util.List;
import org.springframework.web.bind.annotation.GetMapping;


@CrossOrigin("*")
@RestController
@RequestMapping("/api/v1/employees")
public class EmployeeController {

    // @Autowired
    // private EmployeeRepo employeeRepo;

    // @GetMapping
    // public List<Employee> getAllEmployees(){
    //     return employeeRepo.findAll();
    // }

    // @PostMapping
    // public Employee createEmployee(@RequestBody Employee employee){
    //     return employeeRepo.save(employee);
    // }

    // @GetMapping("{employeeId}")
    // public ResponseEntity<Employee> getEmployeeById(@PathVariable long employeeId) {
    //     Employee employee = employeeRepo.findById(employeeId).orElseThrow(() -> new RuntimeException("Employee not exist with id :" +employeeId));
    //     return ResponseEntity.ok(employee);
    // }

    // @PutMapping("{employeeId}")
    // public ResponseEntity<Employee> updateEmployee(@PathVariable long employeeId,@RequestBody Employee employeeDetails){
    //     Employee updateEmp = employeeRepo.findById(employeeId).orElseThrow(() -> new RuntimeException("Employee not exist with id :" +employeeId));
    //     updateEmp.setFirstName(employeeDetails.getFirstName());
    //     updateEmp.setLastName(employeeDetails.getLastName());
    //     updateEmp.setEmailId(employeeDetails.getEmailId());

    //     return ResponseEntity.ok(employeeRepo.save(updateEmp));
    // }

    // @DeleteMapping("{employeeId}")
    // public ResponseEntity<Employee> deleteEmployee(@PathVariable long employeeId){
    //     Employee employee = employeeRepo.findById(employeeId).orElseThrow(() -> new RuntimeException("Employee not exist with id :" +employeeId));
    //     employeeRepo.delete(employee);
    //     return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    // }

    @GetMapping("/path")
    public String getMethodName() {
        return "Hello message";
    }
    

}