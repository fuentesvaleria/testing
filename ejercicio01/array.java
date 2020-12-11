import java.util.*;

public class array
{
  /**
    * Returns the mininum element in a list
    * @param x array to search
    * @return number of positive elements in x
    * @throws NullPointerException if x is null
    */
    public static int countPositive (int[]x) 
	{
		if(x == null) throw new NullPointerException("array.countPositive"); //modificacion para que cumpla todas las especificaciones
		int count = 0;
		for(int i=0; i<x.length; i++)
		{
			if(x[i]>= 0)
			{
				count++;
			}
		}
		return count;
	}
}

