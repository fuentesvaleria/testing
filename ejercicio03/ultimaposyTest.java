import static org.junit.Assert.*;
import org.junit.*;
import java.util.*;

public class ultimaposyTest
{
   // this test ok
   @Test public void LastElement() 
   {
      int arr[] = {3,4, 5,5,8,5};
      int a = 5;
      assertEquals("non last five element", 5, ultimaposy.findLast(arr,a));
   }

    // this test ko porque no me devuelve la poscicion 0
   @Test public void FirtsElement() 
   {
      int arr[] = {5, 1, 1};
      int a = 5;
      assertEquals("non pos zero", 0, ultimaposy.findLast(arr,a));
   }
   //nok pero devuelve bien -1
   @Test public void nonElement() 
   {
      int arr[] = {1, 1, 1};
      int a = 5;
      assertEquals("non element", -1, ultimaposy.findLast(arr,a));
   }
   //test que fallaba porque no tenia el control del nullpointerexcetion
   @Test (expected = NullPointerException.class)
    public void testForNullElement()
    {
    	int arr[]= null;
    	int a = 5;
	ultimaposy.findLast(arr,a);
    }
}
