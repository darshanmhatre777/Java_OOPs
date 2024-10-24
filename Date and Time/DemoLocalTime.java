package day11;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.Period;

public class DemoLocalTime {
	public static void main(String[] args) {
		LocalTime time=LocalTime.now();
		System.out.println(time);
		
		LocalTime tomorrow = LocalTime.of(12, 00);

		int gethour=time.getHour();
		System.out.println("Time remaining to change day "+ gethour+" hours"+ ",");
//		LocalDate nextweek=today.plusWeeks(1);
//		System.out.println(nextweek);
		int getMinute=time.getMinute();
		System.out.println("minutes =+"+ getMinute);

	}
}
