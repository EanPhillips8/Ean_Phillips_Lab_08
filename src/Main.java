import java.util.Scanner;

public class Main {


    public static void main(String[] args) {

        double price = 0;
        double total =+ price;
        boolean done = false;
        Scanner in = new Scanner(System.in);



        {
            String userName = SafeInput.getNonZerolength(in, "What is your username?");
            System.out.println("Your username is: " + userName);
        }
        int favNum =SafeInput.getInt(in,"What is your favorite number");
        System.out.println("Your favorite number is: " + favNum);
        {
            double favDouble = SafeInput.getDouble(in, "What is your favorite double");
            System.out.println("Your favorite double is: " + favDouble);
        }
        {
            int birthYear = SafeInput.getRangedInt(in, "What year were you born", 1950, 2010);
            int birthMonth = SafeInput.getRangedInt(in, "What month were your born", 1, 12);
            int birthDay = SafeInput.getRangedInt(in, "What day were you born", 1, 30);
            int birthHour =SafeInput.getRangedInt(in,"What hour were you born",1,24);
            int birthMinute =SafeInput.getRangedInt(in,"What minute were you born",1,59);
            System.out.println("Your approximate date and time of birth is: " + birthMonth + "/" + birthDay+ "/" + birthYear+ " at " + birthHour+ ":" + birthMinute);
        }
        {
            String ssn = SafeInput.getRegExString(in, "Enter your ss number", "\\d{3}-\\d{2}-\\d{4}");
            System.out.println("Your ssn is " + ssn);
        }
        String mNum = SafeInput.getRegExString(in, "Enter your M number",  "(M|m)\\d{5}");
        System.out.println("Your M number is: " + mNum);
        {
        String menu = SafeInput.getRegExString(in, "Choose one of the following options, Open-Save-View-Quit ", "[OoSsVvQq]");
            System.out.println("Loading...");
        }
        {
            double temp=SafeInput.CtoF(in,"What is the temp in Celsius");
            System.out.println("Your temp in fahrenheit is " + temp);
        }
    }
}