package Module1Introduction.Module1Introduction.controllers;

import Module1Introduction.Module1Introduction.dto.EmployeeDto;
import Module1Introduction.Module1Introduction.entities.EmployeeEntity;
import Module1Introduction.Module1Introduction.repositories.EmployeeRepository;
import Module1Introduction.Module1Introduction.services.EmployeeServices;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;
import java.util.List;

@RestController
@RequestMapping(path = "/employees")
public class EmployeeController {
//@GetMapping(path="/sunil")
//public String getmymessage(){
//    return "hii i am sunil";
//}
    private final EmployeeServices employeeServices;

    public EmployeeController(EmployeeServices employeeServices) {
        this.employeeServices = employeeServices;
    }


    @GetMapping(path = "/{employeeId}")
    public EmployeeDto getEmployeeById(@PathVariable (name="employeeId")long Id){
       return employeeServices.getEmployeeById(Id);
    }
    @GetMapping
    public List<EmployeeDto> getMyData(
            @RequestParam(required = false) Integer age,
            @RequestParam(required = false) String sortby){
         return employeeServices.getMydata();
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
   return employeeServices.createNewEmployee(inputEmployee);
    }

}
