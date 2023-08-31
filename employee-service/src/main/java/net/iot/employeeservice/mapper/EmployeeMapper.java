package net.iot.employeeservice.mapper;

import net.iot.employeeservice.dto.EmployeeDto;
import net.iot.employeeservice.entity.Employee;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

/**
 * @author duity
 * @since 8/31/23
 */

@Mapper
public interface EmployeeMapper {

    EmployeeMapper EMPLOYEE_MAPPER = Mappers.getMapper(EmployeeMapper.class);

    EmployeeDto toEmployeeDto(Employee employee);

    Employee toEmployee(EmployeeDto employeeDto);
}
