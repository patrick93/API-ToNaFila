import org.junit.Assert;
import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class AppTest{
        @Test
        public void AppTester(){
            Assert.assertTrue(true);
        }
        
        @Test
        public void secondTestesr(){
        	Assert.assertEquals("ola", "ola");
        }

        @Test
        public void thirdTester(){
            int k = 1;
            Assert.assertEquals(1,k);
        }
        
   }
