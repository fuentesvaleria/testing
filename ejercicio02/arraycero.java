import java.util.*;

public class arraycero
{
  /**
    * Find last index zero
    * @param x array to search
    * @return number of last 0 in x; -1 if absent
    * @throws NullPointerException if x is null
    */
    public static int lastZero(int[]x)
	{
		if(x == null) throw new NullPointerException("arraycero.lastZero"); //modificacion para que cumpla todas las especificaciones
		int aux = -1; //modificacion me creo un aux asignando a -1 si la poscion x[i] tiene un 0 cambio aux por i sino retornara -1
		for(int i=0; i<x.length; i++)
		{
			if(x[i] == 0)
			{
				aux = i;
				//return i;
			}
		}
		return aux;
	}
}
