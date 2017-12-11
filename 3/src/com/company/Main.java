import entity.Developer;

import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {
        Developer developer = new Developer();
        System.out.println("Enter first name of developer: ");
        Scanner fname = new Scanner(System.in);
        developer.setFname(fname.next());
        System.out.println("Enter date, when you got a task. EXAMPLE: 11-11-2011 14:23:");
        Date date = null;
        do {
            Scanner achiveTask = new Scanner(System.in);
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd-MM-yyyy hh:mm");
            try {
                date = simpleDateFormat.parse(achiveTask.nextLine());
            } catch (ParseException e) {
                System.out.println("Please, type valid date!");
            }
        } while (date == null);
        developer.setAchiveTaskDate(date);
        System.out.println(developer);
    }
}