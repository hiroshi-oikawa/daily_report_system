package actions.views;

import java.time.LocalDateTime;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstrector
@AllArgsConstrector

public class EmployeeView {

    private Integer id;


    private String code;


    private String name;


    private String password;


    private Integer adminFlag;


    private LocalDateTime createdAt;


    private LocalDateTime updatedAt;


    private Integer deleteFlag;


}
