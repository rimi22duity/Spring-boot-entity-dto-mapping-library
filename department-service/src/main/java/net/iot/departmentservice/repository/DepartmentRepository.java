package net.iot.departmentservice.repository;

import net.iot.departmentservice.entity.Department;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author duity
 * @since 8/31/23
 */

public interface DepartmentRepository extends JpaRepository<Department, Long> {

    Department findDepartmentByDepartmentCode(String code);
}
