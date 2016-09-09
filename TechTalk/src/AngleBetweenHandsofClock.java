import java.util.HashMap;


public class AngleBetweenHandsofClock {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int h = 2;
		int	m = 20;
		
		//The hour hand of a normal 12-hour analogue clock turns 360° in 12 hours (720 minutes) or 0.5°per minute. 
		double hour_angle = 0.5 * (h*60 + m);
		
		//The minute hand rotates through 360° in 60 minutes or 6° per minute.
	    double minute_angle = 6*m;
	 
	    // Find the difference between two angles
	    double angle = Math.abs(hour_angle - minute_angle);
	    
	    // Return the smaller angle of two possible angles
	    angle = Math.min(360-angle, angle);

		angle = Math.min(360-angle, angle);
		System.out.println("->"+angle);
	}

}
