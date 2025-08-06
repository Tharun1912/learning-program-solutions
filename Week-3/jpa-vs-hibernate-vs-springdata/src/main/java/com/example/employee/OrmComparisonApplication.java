package com.example.employee;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class OrmComparisonApplication {

    public static void main(String[] args) {
        ApplicationContext context = SpringApplication.run(OrmComparisonApplication.class, args);

        EmployeeService service = context.getBean(EmployeeService.class);
        Employee emp = new Employee();
        emp.setName("John Doe");
        emp.setDepartment("Engineering");
        service.addEmployee(emp);

        System.out.println("Employee added successfully.");
    }
}
