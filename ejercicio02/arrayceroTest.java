import static org.junit.Assert.*;
import org.junit.*;
import java.util.*;

public class arrayceroTest
{
   // this test passes
   @Test public void PosZero() 
   {
      int arr[] = {0, 1, 3,-8,4,5};
      assertEquals("non pos zero", 0, arraycero.lastZero(arr));
   }

    // this test ko devuelve 0 en vez de 2
   @Test public void LastPosZero() 
   {
      int arr[] = {0, 0, 0};
      assertEquals("non Zero element", 2, arraycero.lastZero(arr));
   }
   //test que fallaba porque no tenia el control del nullpointerexcetion
   @Test (expected = NullPointerException.class)
    public void testForNullElement()
    {
    	int arr[]= null;
	arraycero.lastZero(arr);
    }
}
