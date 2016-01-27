import java.util.Iterator;
import java.util.List;


public class Um {

		public static int sum(List list) {
		int sum = 0;
		for ( Iterator iter = list.iterator(); iter.hasNext(); ) {
		int i = ((Integer)iter.next()).intValue();
		sum += i;
		 }
		 return sum;
		}
		
}
