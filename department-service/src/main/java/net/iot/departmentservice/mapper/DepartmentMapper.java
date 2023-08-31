package net.iot.departmentservice.mapper;

import net.iot.departmentservice.dto.DepartmentDto;
import net.iot.departmentservice.entity.Department;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

/**
 * @author duity
 * @since 8/31/23
 */

@Mapper
public interface DepartmentMapper {

    DepartmentMapper DEPARTMENT_MAPPER = Mappers.getMapper(DepartmentMapper.class);

    DepartmentDto toDepartmentDto(Department department);

    Department toDepartment(DepartmentDto departmentDto);
}
