package package1;
import org.junit.Test;
import static org.junit.Assert.assertEquals;
public class practice1 {
   @Test
   public void testSetup() {
      String str= "I am done with Junit setup";
      assertEquals("I am done with Junit setup",str);
      String krc = "I am learning Junit";
      assertEquals("I am learning Junt",krc);
   }
}
