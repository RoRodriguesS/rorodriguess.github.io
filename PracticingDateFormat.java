/* Exercise proposed by Digital Innovation One (DIO) as part of their Inter Java Developer Bootcamp
 * Using SimpleDateFormat
 * Simple exercise of conversion from the pattern "dd/MM/yyyy" to the patern dd/MM/yyyy HH:mm:ss:mmm.
 * Use of the right symbols (letters in lower or upper case) so the output can be shown properly. 
 * 
 */

package practicingdate;
import java.util.Date;
import java.text.SimpleDateFormat;


public class PracticingDateFormat {
	public static void main(String args[]) {
		
		Date date = new Date();
		String dateToStr;
		
		//Create a SimpleDateFormat object that receives a pattern as parameter and "support" to default date format symbols for the default FORMAT locale.
		SimpleDateFormat formatter  = new SimpleDateFormat("dd/MM/yyyy");
		
		//Date to string
		dateToStr = formatter.format(date);
		
		System.out.println(dateToStr);
		
		//Apply a new pattern to the SimpleDateFormat formatter.
		formatter.applyPattern("dd/MM/YYYY HH:mm:ss:mmm");
		dateToStr = formatter.format(date);
		
		System.out.println(dateToStr);
	}
}
