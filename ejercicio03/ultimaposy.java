import java.util.*;

public class ultimaposy
{
  /**
    * Find last index of element
    * @param x array to search
    * @param y value to look for
    * @return last index of y in x; -1 if absent
    * @throws NullPointerException if x is null
    */
   public static int findLast(int[]x, int y)
	{
		if(x == null) throw new NullPointerException("ultimaposy.findLast"); //modificacion para que cumpla todas las especificaciones
		for(int i=x.length-1; i>=0; i--) //falla porque no tiene en cuenta la primera poscion por eso tiene que ser i hasta 0
		{
			if(x[i] == y)
			{
				return i;
			}
		}
		return -1;
	}
}

