package net.iot.employeeservice.repository;

import net.iot.employeeservice.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author duity
 * @since 8/31/23
 */

public interface EmployeeRepository extends JpaRepository<Employee, Long> {
}
