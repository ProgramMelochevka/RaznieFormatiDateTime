package by.home.maxzzzit;

import java.text.SimpleDateFormat;
import java.util.Date;

public class RaznieFormatiDateTime {

	public static void main(String[] args) {
		// Создается объект Date и выполняется печать в формате по умолчанию
		Date today = new Date();
		System.out.println("Дата: " + today);

		// Формат, который выводит дату в виде 10-08-11
		SimpleDateFormat sdf = new SimpleDateFormat("MM-dd-yy");
		String formattedDate = sdf.format(today);
		System.out.println("Дата(мм-дд-гг): " + formattedDate);
		
		// Формат, который выводит дату в виде 08-10-2011
		sdf = new SimpleDateFormat("dd-MM-yyyy");
		formattedDate = sdf.format(today);
		System.out.println("Дата(дд-мм-гггг): " + formattedDate);
		
		// Формат, который выводит дату в виде Пт, окт 27, ‘11
		sdf = new SimpleDateFormat("EEE, MMM d, ''yy");
		formattedDate = sdf.format(today);
		System.out.println("Дата (день недели, мес д, 'гг) " + formattedDate);
		
		// Формат, который выводит время в виде 07:18:51 AM
		sdf = new SimpleDateFormat("hh:mm:ss a");
		formattedDate = sdf.format(today);
		System.out.println("Время (чч:мм:сс) " + formattedDate);
		
		// Значением текущей даты и времени
		Date d = new Date();
		System.out.println(d.toString());
		System.out.println(d.getTime());
		
		// Вывод текущей даты в привычном формате
		Date dat = new Date();
		System.out.printf("%1$td.%1$tm.%1$tY", dat);
		
		// Вывод текущего времени
		Date da = new Date();
		System.out.println();
		System.out.printf("%tH:%<tM:%<tS", da);
	}
}
