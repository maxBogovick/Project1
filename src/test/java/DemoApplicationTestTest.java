import model.StreetEntity;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import repository.StreetRepository;

@RunWith(SpringRunner.class)
@SpringBootTest
public class DemoApplicationTestTest {
@Autowired
    StreetRepository streetRepository;
@Test
    public void contexLoads(){
    final StreetEntity streetEntity = new StreetEntity();
    streetEntity.setDescription("The main street");
    streetEntity.setStreetName("AppleStreet");
    streetEntity.setTownId(2);
    streetRepository.save(streetEntity);
}
}
