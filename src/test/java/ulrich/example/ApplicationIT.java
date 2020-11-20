package ulrich.example;


import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.integration.test.context.SpringIntegrationTest;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.junit4.SpringRunner;

@ActiveProfiles("integration-test")
@SpringBootTest(classes = {Application.class})
@RunWith(SpringRunner.class)
@SpringIntegrationTest
public class ApplicationIT {
    @Autowired
    private ApplicationContext applicationContext;

    @Test
    public void testCtx() throws Exception {
        Assert.assertNotNull(applicationContext);
    }
}
