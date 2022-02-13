package Groovy

import java.text.SimpleDateFormat;

class datecreate {

	static void main(args) {
		
		      Calendar cal = Calendar.getInstance();
			  cal.add(Calendar.DATE, 2); 
			  new SimpleDateFormat("yyyy-MM-dd").format(cal.getTime());
			 
		
	}
}
