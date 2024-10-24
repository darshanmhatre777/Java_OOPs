package day11;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.Period;
import java.time.temporal.ChronoUnit;
import java.util.function.Predicate;
import java.util.stream.Stream;

public class DemoLocalDate {
	public static void main(String[] args) {
		LocalDate today=LocalDate.now();
		System.out.println(today);
		
		LocalDate christmas = LocalDate.of(2024, 12, 25);
		Period timetochristmas=today.until(christmas);
		System.out.println("Time to christmas"+ timetochristmas.getYears()+"years,"+timetochristmas.getDays()+"days");
		LocalDate nextweek=today.plusWeeks(1);
		System.out.println(nextweek);
		
		LocalDate nextmonth=today.plus(1,ChronoUnit.MONTHS);
		System.out.println(nextmonth);
		
		if(today.isBefore(christmas))
			System.out.println("still have time");
		System.out.println(today.getDayOfMonth());
		System.out.println(today.getDayOfWeek());
		System.out.println(today.getMonth());
		System.out.println(today.getMonthValue());
		System.out.println(today.getYear());
	
	
		Stream<LocalDate> thisyear = LocalDate.of(2024,1,1).datesUntil(LocalDate.of(2025,1,1));
		Predicate<LocalDate> friday = (dt) -> dt.getDayOfWeek().equals(DayOfWeek.FRIDAY);
		
		
		
		
	}

}
