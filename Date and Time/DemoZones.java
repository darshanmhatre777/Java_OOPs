package day11;

import java.time.Duration;
import java.time.Instant;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.util.Set;

public class DemoZones {
	public static void main(String[] args) {
		Set<String> zones=ZoneId.getAvailableZoneIds();
		System.out.println(zones);
		
		//asia/calcutta
		//America/New_york
		LocalDateTime dt=LocalDateTime.now();
		System.out.println(dt);
		ZonedDateTime newyork=ZonedDateTime.of(dt,ZoneId.of("America/New_York"));
		System.out.println(newyork);
		
		Instant nyccurrent=newyork.toInstant();
		ZonedDateTime india=nyccurrent.atZone(ZoneId.of("Asia/Calcutta"));
		System.out.println(india);
		
		LocalDateTime indialocal=india.toLocalDateTime();
		LocalDateTime nyclocal=india.toLocalDateTime();
		
		Duration interval=Duration.between(indialocal,nyclocal);
		System.out.println(interval);
		
		
		
		
	}
}
