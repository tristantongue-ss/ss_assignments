package dayfive;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;
import java.time.ZoneId;
import java.time.ZoneOffset;
import java.time.temporal.TemporalAdjuster;
import java.time.OffsetDateTime;

public class DateTimeAPI {
	
	
	
	public static LocalDateTime getBirthday() {
		LocalDateTime birthday;
		birthday = LocalDateTime.of(1998, Month.DECEMBER, 9, 4, 23, 30, 50);
		System.out.println(birthday);
		return birthday;
	}
	
	public TemporalAdjuster previousThursday(LocalDate randomDate) {
		LocalDate date = randomDate;
		TemporalAdjuster prevThur = date.with(TemporalAdjuster.previous(DayOfWeek.THURSDAY));
		return prevThur;
	}
	
	public static void main(String[] args) {
		getBirthday();
		

	}

}
