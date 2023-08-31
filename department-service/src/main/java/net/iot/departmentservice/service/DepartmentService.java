package net.iot.departmentservice.service;

import lombok.AllArgsConstructor;
import net.iot.departmentservice.dto.DepartmentDto;
import net.iot.departmentservice.entity.Department;
import net.iot.departmentservice.mapper.DepartmentMapper;
import net.iot.departmentservice.repository.DepartmentRepository;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

/**
 * @author duity
 * @since 8/31/23
 */

@Service
@AllArgsConstructor
public class DepartmentService {

    private DepartmentRepository departmentRepository;

    private ModelMapper modelMapper;

    public DepartmentDto saveDepartment(DepartmentDto departmentDto) {
//        Department department = modelMapper.map(departmentDto, Department.class);
        Department department = DepartmentMapper.DEPARTMENT_MAPPER.toDepartment(departmentDto);
        Department savedDepartment =  departmentRepository.save(department);
//        DepartmentDto savedDepartmentDto = modelMapper.map(savedDepartment, DepartmentDto.class);
        DepartmentDto savedDepartmentDto = DepartmentMapper.DEPARTMENT_MAPPER.toDepartmentDto(savedDepartment);

        return savedDepartmentDto;
    }

    public DepartmentDto getDepartmentByCode(String code) {
        Department department = departmentRepository.findDepartmentByDepartmentCode(code);

//        DepartmentDto departmentDto = modelMapper.map(department, DepartmentDto.class);
        DepartmentDto departmentDto = DepartmentMapper.DEPARTMENT_MAPPER.toDepartmentDto(department);

        return departmentDto;
    }
}
