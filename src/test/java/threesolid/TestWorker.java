package threesolid;
/* Adding comment to kick off  a build */

// Junit 5 tests, won't work with below Gradle 4.6
import org.junit.jupiter.api.BeforeAll;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;


public class TestWorker {

   Worker w = new Worker();

   @Test
 //  @DisplayName is a feature with Junit5
   @DisplayName("No Name Test")
   public void testWorkerWithNoName()
   {
      assertEquals(w.getName(),"");
      assertEquals(w.work(),"I'm working already!");
   }
   

   @Test
//  @DisplayName is a feature with Junit5
   @DisplayName("A + B")
   public void testAandB()
   {
      assertTrue((w.addpositive(1,4)));
   }


   @Test
//  @DisplayName is a feature with Junit5
   @DisplayName("With Name Test")
   public void testWorkerWithName()
   {
      w.setName("Corvus Glaive");
      assertEquals(w.getName(),"Corvus Glaive");
      assertEquals(w.work(),"Corvus Glaive is working very hard!");
   }

}