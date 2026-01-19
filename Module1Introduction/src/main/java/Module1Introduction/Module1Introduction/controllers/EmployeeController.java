package Module1Introduction.Module1Introduction.controllers;

import Module1Introduction.Module1Introduction.dto.EmployeeDto;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;
@RestController
@RequestMapping(path = "/employees")
public class EmployeeController {
//@GetMapping(path="/sunil")
//public String getmymessage(){
//    return "hii i am sunil";
//}
    @GetMapping(path = "/{employeeId}")
    public EmployeeDto getEmployeeById(@PathVariable (name="employeeId")long Id){
        return new EmployeeDto(Id,"sunil",23, LocalDate.of(2022,12,2),true);
    }
    public String getMyData(@RequestParam (required = false)int age,
                            @RequestParam (required = false) String sortby){
        return "hii my age is :- "+ age + sortby;
    }
//    @PostMapping
//    public String postData(){
//        return "hii i am post some data";
//    }
    @PutMapping
    public String pathData(){
        return "hii i am patching the data";
    }
    @PostMapping
    public EmployeeDto createNewEmployee(@RequestBody EmployeeDto inputEmployee){
        inputEmployee.setId(200L);
        return inputEmployee;
    }

}
