package tyme.plan;


import java.time.*;

/**
 * Created by infer on 12/14/2017.
 */

public class sleepData {
	int hours;
	int minutes;
	Clock stamp;
	public sleepData(int hours, int minutes){
		stamp = java.time.Clock.systemUTC();
		this.hours = hours;
		this.minutes = minutes;
		//For now, we will allow self reporting to only report sleep right after they've woken up.
	}

}
