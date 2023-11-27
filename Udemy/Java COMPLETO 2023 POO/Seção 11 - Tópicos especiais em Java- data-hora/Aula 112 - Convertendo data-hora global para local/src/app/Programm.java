package app;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;

public class Programm {

	public static void main(String[] args) {
		LocalDate d04 = LocalDate.parse("2023-11-27");
		LocalDateTime d05 = LocalDateTime.parse("2023-11-27T01:30:26");
		Instant d06 = Instant.parse("2023-11-27T01:30:26Z");
		
		LocalDate r1 = LocalDate.ofInstant(d06, ZoneId.systemDefault());
		LocalDate r2 = LocalDate.ofInstant(d06, ZoneId.of("Portugal"));
		LocalDateTime r3 = LocalDateTime.ofInstant(d06, ZoneId.systemDefault());
		LocalDateTime r4 = LocalDateTime.ofInstant(d06, ZoneId.of("Portugal"));

		for (String s : ZoneId.getAvailableZoneIds()) {
			System.out.println(s);
		}
		
		System.out.println("r1 = " + r1);
		System.out.println("r2 = " + r2);
		System.out.println("r3 = " + r3);
		System.out.println("r4 = " + r4);
		
		System.out.println("d04 dia = " + d04.getDayOfMonth());
		System.out.println("d04 dia = " + d04.getMonthValue());
		System.out.println("d04 dia = " + d04.getYear());

		System.out.println("d05 hora = " + d05.getHour());
		System.out.println("d05 hora = " + d05.getMinute());

	}

}
