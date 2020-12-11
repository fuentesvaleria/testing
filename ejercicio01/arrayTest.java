import static org.junit.Assert.*;
import org.junit.*;
import java.util.*;

public class arrayTest
{
   // this test passes
   @Test public void PositiveElement() 
   {
      int arr[] = {-1, 0, 3,-8,4,5};
      assertEquals("non four element", 4, array.countPositive(arr));
   }

    // this test passes
   @Test public void negativeElement() 
   {
      int arr[] = {-1, -1, -1};
      assertEquals("non element", 0, array.countPositive(arr));
   }
   //test que fallaba porque no tenia el control del nullpointerexcetion
   @Test (expected = NullPointerException.class)
    public void testForSoloNullElement()
    {
    	int arr[]= null;
	array.countPositive(arr);
    }
}
