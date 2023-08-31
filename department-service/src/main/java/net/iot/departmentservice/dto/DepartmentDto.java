package net.iot.departmentservice.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/**
 * @author duity
 * @since 8/31/23
 */

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class DepartmentDto {

    private Long id;
    private String departmentName;
    private String departmentDescription;
    private String departmentCode;
}
