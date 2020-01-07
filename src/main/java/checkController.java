/**
 * 公司
 * 文件名 checkController
 * 作者 Excellenthabit
 * 日期 2019/9/27 11:10
 */

import org.hibernate.validator.constraints.Email;
import org.hibernate.validator.constraints.NotBlank;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

@RestController
@Validated
public class checkController {

    @GetMapping("test1")
    public String test1(
            @NotBlank(message = "fnewi") String name,
            @Email(message = "{invalid}") String email) {
        System.out.println("check");
        return "success";
    }

//    @GetMapping("test2")
//    public String test2(@Valid Student student, BindingResult bindingResult) {
//        return "success";
//    }

    @GetMapping("test3")
    public String test3() {
        return "success";
    }
}
