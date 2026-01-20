package Module1Introduction.Module1Introduction.repositories;

import Module1Introduction.Module1Introduction.entities.EmployeeEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepository extends JpaRepository<EmployeeEntity,Long> {

}
