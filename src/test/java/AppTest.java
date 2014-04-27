import com.sun.jersey.api.client.Client;
import com.sun.jersey.api.client.WebResource;
import org.junit.Assert;
import org.junit.Test;

import javax.ws.rs.core.MediaType;

/**
 * Unit test for simple App.
 */
public class AppTest{
        @Test
        public void AppTester(){
            Client c = Client.create();
            WebResource wb = c.resource("http://localhost:8080/API-ToNaFila/api/teste");
            String response = wb.accept(MediaType.APPLICATION_JSON).get(String.class);
            Assert.assertEquals("{\"nome\":\"Patrick\"}", response);
        }
        

        
   }
