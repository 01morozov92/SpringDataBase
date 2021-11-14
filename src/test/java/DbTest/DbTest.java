package DbTest;

import Entity.actor;
import Repos.ActorRepo;
import SpringApp.SpringBootMyTestApplication;
import lombok.extern.log4j.Log4j2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.testng.AbstractTestNGSpringContextTests;
import org.testng.annotations.Test;

import java.util.List;
import java.util.Optional;

@Log4j2
@SpringBootTest(classes = SpringBootMyTestApplication.class)
public class DbTest extends AbstractTestNGSpringContextTests {

    @Autowired
    ActorRepo actorRepo;

    @Test
    public void someTest() {

        Optional<actor> actor = actorRepo.findById(10L);
        System.out.println(actor.get().getLast_name());
    }

    @Test
    public void someTest1() {

        List<String> actor = actorRepo.selectIdWhereLastName("ED");
        System.out.println(actor);
    }

    @Test
    public void someTest2() {
        String actorsLastName = actorRepo.selectFirstNameWhereLastName("GABLE");
        System.out.println(actorsLastName);
    }
}
