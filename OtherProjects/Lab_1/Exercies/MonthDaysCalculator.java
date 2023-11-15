import java.util.Scanner;

public class MonthDaysCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        while (true) {
            System.out.print("Enter a month (e.g., January, Jan., Jan, or 1): ");
            String monthInput = scanner.nextLine().trim().toLowerCase();
            
            int month = getMonthFromInput(monthInput);
            if (month == -1) {
                System.out.println("Invalid month input. Please try again.");
                continue;
            }
            
            System.out.print("Enter a year (e.g., 1999): ");
            int year = scanner.nextInt();
            scanner.nextLine(); // Consume the newline character
            
            if (year <= 0 || year > 9999) {
                System.out.println("Invalid year input. Please enter a non-negative four-digit year.");
                continue;
            }
            
            int daysInMonth = getDaysInMonth(month, year);
            System.out.println("There are " + daysInMonth + " days in " + getMonthName(month) + " " + year + ".");
            
            System.out.print("Do you want to calculate another month? (yes/no): ");
            String anotherCalculation = scanner.nextLine().trim().toLowerCase();
            if (!(anotherCalculation.equals("yes")||(anotherCalculation.equals("y")))) {
                break;
            }
        }
        
        scanner.close();
    }
    
    public static int getMonthFromInput(String input) {
        switch (input) {
            case "january":
            case "jan.":
            case "jan":
            case "1":
                return 1;
            case "february":
            case "feb.":
            case "feb":
            case "2":
                return 2;
            case "march":
            case "mar.":
            case "mar":
            case "3":
                return 3;
            case "april":
            case "apr.":
            case "apr":
            case "4":
                return 4;
            case "may":
            case "5":
                return 5;
            case "june":
            case "jun.":
            case "jun":
            case "6":
                return 6;
            case "july":
            case "jul.":
            case "jul":
            case "7":
                return 7;
            case "august":
            case "aug.":
            case "aug":
            case "8":
                return 8;
            case "september":
            case "sept.":
            case "sept":
            case "9":
                return 9;
            case "october":
            case "oct.":
            case "oct":
            case "10":
                return 10;
            case "november":
            case "nov.":
            case "nov":
            case "11":
                return 11;
            case "december":
            case "dec.":
            case "dec":
            case "12":
                return 12;
            default:
                return -1;
        }
    }
    
    public static int getDaysInMonth(int month, int year) {
        switch (month) {
            case 4:
            case 6:
            case 9:
            case 11:
                return 30;
            case 2:
                return isLeapYear(year) ? 29 : 28;
            default:
                return 31;
        }
    }
    
    public static boolean isLeapYear(int year) {
        return (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
    }
    
    public static String getMonthName(int month) {
        switch (month) {
            case 1:
                return "January";
            case 2:
                return "February";
            case 3:
                return "March";
            case 4:
                return "April";
            case 5:
                return "May";
            case 6:
                return "June";
            case 7:
                return "July";
            case 8:
                return "August";
            case 9:
                return "September";
            case 10:
                return "October";
            case 11:
                return "November";
            case 12:
                return "December";
            default:
                return "Invalid Month";
        }
    }
}
