package com.example.demo;

import com.example.demo.model.StreetEntity;
import com.example.demo.service.StreetServiceImpl;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest(/*classes = DemoApplication.class*/)
/*@ContextConfiguration*/
public class DemoApplicationTestTest {
    @Autowired
    StreetServiceImpl streetService;

    @Test
    public void contexLoads() {
        final StreetEntity streetEntity = new StreetEntity();
        streetEntity.setDescription("The main street");
        streetEntity.setStreetName("AppleStreet");
        streetEntity.setTownId(2);
        streetService.createOrUpdate(streetEntity);
    }
}
