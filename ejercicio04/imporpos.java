import java.util.*;

public class imporpos
{
  /**
    * Count odd or positive elements in an array
    * @param x array to search
    * @return count of odd or positive elements in x
    * @throws NullPointerException if x is null
    */
   public static int oddOrPos(int[]x)
	{
		if(x == null) throw new NullPointerException("imporpos.oddOrPos"); //modificacion para que cumpla todas las especificaciones
		int count=0;
		for(int i=0; i<x.length; i++)
		{
			if(((x[i]%2==1)||(x[i]%2==-1))||x[i]>0) //tambien debe valer para valores negativos 
			{
				count++;
			}
		}
		return count;
	}
}

