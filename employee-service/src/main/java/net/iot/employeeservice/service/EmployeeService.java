package net.iot.employeeservice.service;

import lombok.AllArgsConstructor;
import net.iot.employeeservice.dto.EmployeeDto;
import net.iot.employeeservice.entity.Employee;
import net.iot.employeeservice.mapper.EmployeeMapper;
import net.iot.employeeservice.repository.EmployeeRepository;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

/**
 * @author duity
 * @since 8/31/23
 */

@Service
@AllArgsConstructor
public class EmployeeService {

    private EmployeeRepository employeeRepository;

    private ModelMapper modelMapper;

    public EmployeeDto saveEmployee(EmployeeDto employeeDto) {
//        Employee employee = modelMapper.map(employeeDto, Employee.class);
        Employee employee = EmployeeMapper.EMPLOYEE_MAPPER.toEmployee(employeeDto);
        Employee savedEmployee = employeeRepository.save(employee);
//        EmployeeDto savedEmployeeDto = modelMapper.map(savedEmployee, EmployeeDto.class);
        EmployeeDto savedEmployeeDto = EmployeeMapper.EMPLOYEE_MAPPER.toEmployeeDto(savedEmployee);
        return savedEmployeeDto;
    }

    public EmployeeDto getEmployeeById(Long id) {
        Employee employee = employeeRepository.findById(id).get();
//        EmployeeDto employeeDto = modelMapper.map(employee, EmployeeDto.class);
        EmployeeDto employeeDto = EmployeeMapper.EMPLOYEE_MAPPER.toEmployeeDto(employee);

        return employeeDto;
    }
}
