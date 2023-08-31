package net.iot.employeeservice.controller;

import lombok.AllArgsConstructor;
import net.iot.employeeservice.dto.EmployeeDto;
import net.iot.employeeservice.service.EmployeeService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

/**
 * @author duity
 * @since 8/31/23
 */

@RestController
@RequestMapping("api/employees")
@AllArgsConstructor
public class EmployeeController {

    private EmployeeService employeeService;


    @PostMapping
    public ResponseEntity<EmployeeDto> saveEmployee(@RequestBody EmployeeDto employeeDto) {
        EmployeeDto savedEmployeeDto = employeeService.saveEmployee(employeeDto);

        return new ResponseEntity<>(savedEmployeeDto, HttpStatus.CREATED);
    }

    @GetMapping("{employee-id}")
    public ResponseEntity<EmployeeDto> getEmployeeById(@PathVariable("employee-id") Long id) {
        EmployeeDto employeeDto = employeeService.getEmployeeById(id);

        return new ResponseEntity<>(employeeDto, HttpStatus.OK);
    }
}
