package day11;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Period;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class DateAssignment {
	public static void main(String[] args) {
		LocalDate today=LocalDate.now();
		System.out.println(today);
		
		LocalDate birthdate = LocalDate.of(2002, 05, 29);
		Period age=birthdate.until(today);
		System.out.println("Your Age is "+ age.getYears() +" years "+ age.getMonths() +" months "+ age.getDays()+" days");
		
		Stream<LocalDate> thisyear = LocalDate.of(2024,1,1).datesUntil(LocalDate.of(2025,1,1));
		Predicate<LocalDate> predicate = ((dt) -> dt.getDayOfYear() == 256);// predicate is used to pass only values that are true for the condition
		List<LocalDate> programmersday = thisyear.filter(predicate).collect(Collectors.toList());
		System.out.println("programmers day : " + programmersday);
		///////////////////////////////////
//		leave at12::00 pm from mumbai at reached at 4:40 pm in london
		LocalDateTime dt=LocalDateTime.of(today, );
		System.out.println(dt);
		ZonedDateTime newyork=ZonedDateTime.of(dt,ZoneId.of("America/New_York"));
		System.out.println(newyork);
		
		Instant nyccurrent=newyork.toInstant();
		ZonedDateTime india=nyccurrent.atZone(ZoneId.of("Asia/Calcutta"));
		System.out.println(india);
		///////////////////////////////////
	}
	
}
