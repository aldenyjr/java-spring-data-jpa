package dio.aulaspringdatajpa.repository;

import dio.aulaspringdatajpa.model.Log;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface LogRepository extends JpaRepository<Log, Integer> {
    List<Log> findByPlaca(String placa);
    List<Log> findAllByIp(String ip);
//



}
