package Module1Introduction.Module1Introduction.services;

import Module1Introduction.Module1Introduction.config.ModelMapperConfig;
import Module1Introduction.Module1Introduction.dto.EmployeeDto;
import Module1Introduction.Module1Introduction.entities.EmployeeEntity;
import Module1Introduction.Module1Introduction.repositories.EmployeeRepository;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class EmployeeServices {
    private final EmployeeRepository employeeRepository;
    private final ModelMapper modelMapper ;

    public EmployeeServices(EmployeeRepository employeeRepository, ModelMapper modelMapper) {
        this.employeeRepository = employeeRepository;
        this.modelMapper = modelMapper;
    }

    public EmployeeDto getEmployeeById(Long Id) {
       EmployeeEntity employeeEntity=employeeRepository.findById(Id).orElse(null);
       return modelMapper.map(employeeEntity,EmployeeDto.class);
    }

    public List<EmployeeDto> getMydata() {
      List<EmployeeEntity> employeeEntities= employeeRepository.findAll();
     return employeeEntities.stream()
              .map(employeeEntity -> modelMapper.map(employeeEntities,EmployeeDto.class))
              .collect(Collectors.toList());
    }

    public EmployeeDto createNewEmployee(EmployeeDto inputEmployee) {
        EmployeeEntity toSaveEntity=modelMapper.map(inputEmployee,EmployeeEntity.class);
       EmployeeEntity savedEmployeeEntity= employeeRepository.save(toSaveEntity);
       return modelMapper.map(savedEmployeeEntity,EmployeeDto.class);
    }
}
