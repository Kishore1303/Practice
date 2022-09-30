package takesscreenshot;

import java.time.LocalDateTime;

public class ToCaptureSystemDateTime {
	public static void main(String[] args) {
		//to capture system date and time
		LocalDateTime ldt=LocalDateTime.now();
		//current date and time in : character
		//to replace ":" with other special character "-" use replace()
		String timeStamp=ldt.toString().replace(":", "-");
		System.out.println(timeStamp);
	}
}
