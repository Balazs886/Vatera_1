package eu.devforest.VateraTool;

import eu.devforest.VateraTool.entity.Deal;
import eu.devforest.VateraTool.entity.User;
import eu.devforest.VateraTool.repository.DealRepository;
import eu.devforest.VateraTool.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.slf4j.Logger;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.List;

import static org.slf4j.LoggerFactory.getLogger;

@SpringBootApplication
@RequiredArgsConstructor
public class VateraToolApplication implements CommandLineRunner {
    /*
          https://www.vatera.hu/user/rating/rating.php?id=383691
          itt vannak a vateras felhasznalok adatlapjai
          itt látszik kikkel volt
          adásvételük
          tervezz egy olyan adatstruktúrát
          amiben
          el tudod tárolni
          hogy ki kivel volt üzleti kapcsolatban
          első fázis ez a struktúra


          következő
          perzisztálni valahogy ezt a strutkúrát
          harmadik fázis meg feltölteni automatikusan
       */
    private final DealRepository dealRepository;
    private final UserRepository userRepository;
    private static final Logger LOGGER = getLogger(VateraToolApplication.class);

    public static void main(String[] args) {
        LOGGER.info("STARTING THE APPLICATION");
        SpringApplication.run(VateraToolApplication.class, args);
        LOGGER.info("APPLICATION FINISHED");
    }

    @Override
    public void run(String... args) {
        var users = List.of(new User().setName("Sándor"),
                new User().setName("József"),
                new User().setName("Benedek"),
                new User().setName("István"));
        userRepository.saveAll(users);

        var deals = List.of(new Deal().setBuyer("Sándor").setSeller("József").setDetails("kávégép"),
                new Deal().setBuyer("Sándor").setSeller("Benedek").setDetails("táska"),
                new Deal().setBuyer("István").setSeller("Sándor").setDetails("csavar"),
                new Deal().setBuyer("Benedek").setSeller("István").setDetails("hajvágó"));
        dealRepository.saveAll(deals);

    }

}
