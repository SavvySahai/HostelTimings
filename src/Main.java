import java.time.LocalTime;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Scanner;

public class Main {

    public static void firstNames(String fname){
        System.out.println(fname);
    }

    public void fingerprintMatch(){
        System.out.println("Identity matched");
    }

    public void fingerprintMisMatch(){
        System.out.println("Stranger!");
    }

    public static void timing(){
        Scanner s  = new Scanner(System.in);
        Calendar cal = new GregorianCalendar();

        System.out.println("Hours : ");
        int t1 = s.nextInt();
        System.out.println("Minutes : ");
        int t2 = s.nextInt();

        LocalTime time1 = LocalTime.of(t1, t2);
        System.out.println("The time right now :-");
        System.out.print(cal.get(Calendar.HOUR) + ":");
        System.out.print(cal.get(Calendar.MINUTE));

        LocalTime time2 = LocalTime.of(cal.get(Calendar.HOUR), cal.get(Calendar.MINUTE));
        //timeClass tc = new timeClass();

        System.out.println("Hours : ");
        int t3 = s.nextInt();
        System.out.println("Minutes : ");
        int t4 = s.nextInt();

        LocalTime time3 = LocalTime.of(t3,t4);

        int displayTime =  time1.compareTo(time2);
        int displayTime2 = time1.compareTo(time3);

        if(displayTime==7 || displayTime2 ==7){
            System.out.println("\nEntry denied");
        } else if (displayTime<7 || displayTime2<7) {
            System.out.println("\nEntry permitted");
        }else {
            System.out.println("\nEntry denied");
        }
    }


    public static void main(String[] args) {

        System.out.println("Students of GH6 : ");
        firstNames("Savvy");
        firstNames("Sanjana");
        firstNames("Supriya");

        Main obj = new Main();
        Scanner sc = new Scanner(System.in);

        System.out.println("\nID card reading : ");     //enter the name of the student ~ when we scan the id card and it reads.
        String name = sc.nextLine();                    //user inputs the name ~ when the id card has been scanned; here the name will be saved in name
        System.out.println("Name displayed : " + name);

        if(name.equalsIgnoreCase("Savvy") || name.equalsIgnoreCase("Sanjana") || name.equalsIgnoreCase("Supriya")){
            obj.fingerprintMatch();
        }else{
            obj.fingerprintMisMatch();
        }

        timing();

    }
}