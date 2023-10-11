package dio.aulaspringdatajpa;

import dio.aulaspringdatajpa.model.Log;
import dio.aulaspringdatajpa.model.User;
import dio.aulaspringdatajpa.repository.LogRepository;
import dio.aulaspringdatajpa.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class StartApp implements CommandLineRunner {
    @Autowired
    private UserRepository repository;

    @Autowired
    private LogRepository logRepository;

    @Override
    public void run(String... args) throws Exception {
//
//        User user = new User();
//        user.setName("Aldeny Jr");
//        user.setUsername("aldenypassos");
//        user.setPassword("aldeny0427");
//
//        repository.save(user);
//
//        for (User u: repository.findAll()){
//            System.out.println(u);
//        }
        for (Log log: logRepository.findAllByIp("172.16.1.79")){
            System.out.println(log);
        }

    }
}
