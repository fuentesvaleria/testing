import static org.junit.Assert.*;
import org.junit.*;
import java.util.*;

public class imporposTest
{
   // this test ko no tenia en cuenta los valores negativos como impares
   @Test public void ImparNegativeElement() 
   {
      int arr[] = {1, 2, 3,-1,-4,-6};
      assertEquals("non four element", 4, imporpos.oddOrPos(arr));
   }

    // this test passes
   @Test public void ImparElement() 
   {
      int arr[] = {1, 1, 1};
      assertEquals("tres elementos impares", 3, imporpos.oddOrPos(arr));
   }
   //test que fallaba porque no tenia el control del nullpointerexcetion
   @Test (expected = NullPointerException.class)
    public void testForNullElement()
    {
    	int arr[]= null;
	imporpos.oddOrPos(arr);
    }
}
