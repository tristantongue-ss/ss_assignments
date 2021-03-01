package dayfive;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;
import java.time.ZoneId;
import java.time.ZoneOffset;
import java.time.OffsetDateTime;

public class DateTimeAPI {
	
	
	
	public static LocalDateTime getBirthday() {
		LocalDateTime birthday;
		birthday = LocalDateTime.of(1998, Month.DECEMBER, 9, 4, 23, 30, 50);
		System.out.println(birthday);
		return birthday;
	}
	
	public static void main(String[] args) {
		getBirthday();
		
		LocalDateTime today = LocalDateTime.now();
		System.out.println("Current DateTime="+today);

	}

}
