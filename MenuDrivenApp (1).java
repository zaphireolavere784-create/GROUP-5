package MenuDrivenApp;
import java.util.Scanner;
public class MenuDrivenApp {
	// ANSI Colors for Cyberpunk Theme
    public static final String RESET = "\u001B[0m";
    public static final String SILVER = "\u001B[37m";
    public static final String GREEN = "\u001B[32m";
    public static final String CYAN = "\u001B[36m";
    public static final String PURPLE = "\u001B[35m";
	public static final String LIGHT_RED = "\u001B[91m";


    public static void main(String[] args) throws InterruptedException {

        // (Your design section starts here – untouched)
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println(); 
        System.out.println();     
        System.out.println();     
        System.out.println();     
        System.out.println();     
        System.out.println();     
        System.out.println(CYAN + "                                                                   ██        ██████    ███   ██████   ██ ████    ██ ███████               " + RESET);
        System.out.println(CYAN + "                                                                   ██       ██    ██  ██ ██  ██   ██  ██ ██ ██   ██ ██                    " + RESET);     
        System.out.println(CYAN + "                                                                   ██       ██    ██ ██   ██ ██    ██ ██ ██  ██  ██ ██                    " + RESET);     
        System.out.println(CYAN + "                                                                   ██       ██    ██ ███████ ██    ██ ██ ██  ██  ██ ██  ████              " + RESET);     
        System.out.println(CYAN + "                                                                   ██       ██    ██ ██   ██ ██   ██  ██ ██   ██ ██ ██    ██              " + RESET);     
        System.out.println(CYAN + "                                                                   ████████  ██████  ██   ██ ██████   ██ ██    ████ ███████    "); 

        System.out.print(CYAN + "\n                                                                   █" + RESET);

        int total = 56; // Total width of loading bar
        for (int i = 0; i < total; i++) {
            System.out.print(CYAN + "█" + RESET);
            Thread.sleep(100); // Adjust animation speed
        }
        Thread.sleep(1500);
        Scanner sc = new Scanner(System.in);
        Intro(sc);
        }
        public static void Intro(Scanner sc) {
        	int choice;
        	
        	do {
        
        // Continue (your entire ASCII menu below)
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println(PURPLE + "                                        ███████████████████████████████████████████████████████████████████████████████████████████████████████████████████" + RESET);
        System.out.println(PURPLE + "                                        ██                                                                                                               ██" + RESET);
        System.out.println(PURPLE + "                                        ██                                                                                                               ██" + RESET);
        System.out.println(PURPLE + "                                        ██                                                                                                               ██" + RESET);
        System.out.println(PURPLE + "                                        ██                                                                                                               ██" + RESET);
        System.out.println(PURPLE + "                                        ██                                                                                                               ██" + RESET);
        System.out.println(PURPLE + "                                        ██                     " + SILVER + "██████ ███  ███ ██████  ██████ ██████   ██████   ███   ██      ██████                    " + PURPLE + " ██" + RESET);
        System.out.println(PURPLE + "                                        ██                    " + SILVER + "██       ██  ██  ██   ██ ██     ██   ██ ██       ██ ██  ██     ██                         " + PURPLE + " ██" + RESET);
        System.out.println(PURPLE + "                                        ██                    " + SILVER + "██        ████   ██████  █████  ██████  ██      ██   ██ ██     ██                         " + PURPLE + " ██" + RESET);
        System.out.println(PURPLE + "                                        ██                    " + SILVER + "██         ██    ██   ██ ██     ██   ██ ██      ███████ ██     ██                         " + PURPLE + " ██" + RESET);
        System.out.println(PURPLE + "                                        ██                     " + SILVER + "██████    ██    ██████  ██████ ██   ██  ██████ ██   ██ ██████  ██████                    " + PURPLE + " ██" + RESET);
        System.out.println(PURPLE + "                                        ██                                                                                                               ██" + RESET);
        System.out.println(PURPLE + "                                        ██                                             " + SILVER + "██   ██ ██      █████                                             " + PURPLE + "██" + RESET);
        System.out.println(PURPLE + "                                        ██                                             " + SILVER + "██   ██ ██     ██   ██                                            " + PURPLE + "██" + RESET);
        System.out.println(PURPLE + "                                        ██                                              " + SILVER + "██ ██  ██     ██   ██                                            " + PURPLE + "██" + RESET);
        System.out.println(PURPLE + "                                        ██                                               " + SILVER + "███   ██  ██  █████                                             " + PURPLE + "██" + RESET);
        System.out.println(PURPLE + "                                        ██                                                                                                               ██" + RESET);
        System.out.println(PURPLE + "                                        ██                                                                                                               ██" + RESET);
        System.out.println(PURPLE + "                                        ██                                         " + CYAN + "Enter a number to get started." + PURPLE + "                                        ██" + RESET);
        System.out.println(PURPLE + "                                        ██                                                                                                               ██" + RESET);
        System.out.println(PURPLE + "                                        ██                                                                                                               ██" + RESET);
        System.out.println(PURPLE + "                                        ██                                                " + CYAN + "1 :: CALCULATOR" + PURPLE + "                                                ██" + RESET);
        System.out.println(PURPLE + "                                        ██                                                " + CYAN + "2 :: CONVERSIONS" + PURPLE + "                                               ██" + RESET);
        System.out.println(PURPLE + "                                        ██                                                " + CYAN + "3 :: ABOUT US" + PURPLE + "                                                  ██" + RESET);
        System.out.println(PURPLE + "                                        ██                                                " + CYAN + "4 :: EXIT SYSTEM" + PURPLE + "                                               ██" + RESET);
        System.out.println(PURPLE + "                                        ██                                                                                                               ██" + RESET);
        System.out.println(PURPLE + "                                        ██                                                                                                               ██" + RESET);
        System.out.println(PURPLE + "                                        ██                                                                                                               ██" + RESET);
        System.out.println(PURPLE + "                                        ██                                                                                                               ██" + RESET);
        System.out.println(PURPLE + "                                        ██                                                                                                               ██" + RESET);
        System.out.println(PURPLE + "                                        ███████████████████████████████████████████████████████████████████████████████████████████████████████████████████" + RESET);
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();

        // === FIXED LOGIC BELOW ===
            choice = sc.nextInt();

            if (choice == 1) {
            	Spaces();
                CALCULATOR(sc);
                break;
            } else if (choice == 2) {
                CONVERSIONS(sc);
            } else if (choice == 3) {
            	Spaces();
                ABOUTUS(sc);
            } else if (choice == 4) {
           	 Spaces();
           	 exit();
            } else {
                error(sc);
            }
            System.out.println();
            System.out.println();
            System.out.println();
            System.out.println();
            System.out.println();

        } while (choice != 4);

        sc.close();
    }

    // Placeholder methods so code compiles
    public static void CALCULATOR(Scanner sc) {
    	int num;
    	
        System.out.println();
        System.out.println();
        System.out.println(SILVER + "                                       ███             ██████   ███   ██       ██████ ██   ██ ██        ███   ████████  ██████  ██████             ███  " + RESET);
        System.out.println(SILVER + "                                          ██          ██       ██ ██  ██      ██      ██   ██ ██       ██ ██     ██    ██    ██ ██   ██          ██    " + RESET);
        System.out.println(SILVER + "                                            ██        ██      ██   ██ ██      ██      ██   ██ ██      ██   ██    ██    ██    ██ ██████         ██      " + RESET);
        System.out.println(SILVER + "                                          ██          ██      ███████ ██      ██      ██   ██ ██      ███████    ██    ██    ██ ██   ██          ██    " + RESET);
        System.out.println(SILVER + "                                       ███             ██████ ██   ██ ███████  ██████  █████  ███████ ██   ██    ██     ██████  ██   ██            ███  " + RESET);
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.print(GREEN +   "                                                                   Enter first number: " + RESET);
        double a = sc.nextDouble();
        System.out.print(GREEN + "                                                                   Enter second number: " + RESET);
        double b = sc.nextDouble();
        System.out.print(GREEN + "                                                                   Choose operation (+, -, *, /): " + RESET);
        char op = sc.next().charAt(0);

        double result = 0;
        boolean valid = true;

        if (op == '+') result = a + b;
        else if (op == '-') result = a - b;
        else if (op == '*') result = a * b;
        else if (op == '/') {
            if (b != 0) result = a / b;
            else {
                System.out.println(CYAN + "                                                                   [ERROR] Division by zero!" + RESET);
                valid = false;
            }
        } else {
            System.out.println(CYAN + "                                                                   [ERROR] Invalid operator." + RESET);
            valid = false;
        }
        System.out.println();
        if (valid) {
            System.out.println(CYAN + "                                                                   >> RESULT = " + GREEN + result + RESET);
            System.out.println();
            System.out.println();
            System.out.println();
            System.out.println();
            System.out.println();
            System.out.println();
            System.out.println(PURPLE + "                                                       ████████████████████████████████████████████████████████████████████████████████");
            System.out.println("                                                       ██                                                                            ██");
            System.out.println("                                                       ██                 " + CYAN + "[1] BACK                          [2] EXIT                 " + PURPLE + "██" );
            System.out.println("                                                       ██                                                                            ██");
            System.out.println("                                                       ████████████████████████████████████████████████████████████████████████████████" + RESET);
            System.out.println();
            System.out.println();
            num = sc.nextInt();
            
             if (num == 1) {
            	 Intro(sc);
             } else if (num == 2) {
            	 Spaces();
            	 exit();
             } else {
                 error(sc);
             }
                 System.out.println();
                 System.out.println();
                 System.out.println();
                 System.out.println();
                 System.out.println();
                 
             
             }  
    }
    public static void CONVERSIONS(Scanner sc) {
    	int choice;
    	do {
        System.out.println(PURPLE + "[CONVERSIONS MODULE]" + RESET);
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println(PURPLE + "                                        ███████████████████████████████████████████████████████████████████████████████████████████████████████████████████" + RESET);
        System.out.println(PURPLE + "                                        ██                                                                                                               ██" + RESET);
        System.out.println(PURPLE + "                                        ██                                                                                                               ██" + RESET);
        System.out.println(PURPLE + "                                        ██                                                                                                               ██" + RESET);
        System.out.println(PURPLE + "                                        ██                                                                                                               ██" + RESET);
        System.out.println(PURPLE + "                                        ██                                                                                                               ██" + RESET);
        System.out.println(PURPLE + "                                        ██             " + SILVER + "██████  ██████  ███   ██ ██   ██ ██████ ██████   ██████ ██  ██████  ███   ██  ██████              " + PURPLE + "██" + RESET);
        System.out.println(PURPLE + "                                        ██            " + SILVER + "██      ██    ██ ████  ██ ██   ██ ██     ██   ██ ██      ██ ██    ██ ████  ██ ██                   " + PURPLE + "██" + RESET);
        System.out.println(PURPLE + "                                        ██            " + SILVER + "██      ██    ██ ██ ██ ██ ██   ██ █████  ██████  ██████  ██ ██    ██ ██ ██ ██ ██████               " + PURPLE + "██" + RESET);
        System.out.println(PURPLE + "                                        ██            " + SILVER + "██      ██    ██ ██  ████  ██ ██  ██     ██   ██      ██ ██ ██    ██ ██  ████      ██              " + PURPLE + "██" + RESET);
        System.out.println(PURPLE + "                                        ██             " + SILVER + "██████  ██████  ██   ███   ███   ██████ ██   ██ ██████  ██  ██████  ██   ███ ██████               " + PURPLE + "██" + RESET);
        System.out.println(PURPLE + "                                        ██                                                                                                               ██" + RESET);
        System.out.println(PURPLE + "                                        ██                                                                                                               ██" + RESET);
        System.out.println(PURPLE + "                                        ██                                                                                                               ██" + RESET);
        System.out.println(PURPLE + "                                        ██                                                                                                               ██" + RESET);
        System.out.println(PURPLE + "                                        ██                                         " + CYAN + "Enter a number to get started." + PURPLE + "                                        ██" + RESET);
        System.out.println(PURPLE + "                                        ██                                                                                                               ██" + RESET);
        System.out.println(PURPLE + "                                        ██                                                                                                               ██" + RESET);
        System.out.println(PURPLE + "                                        ██                                                                                                               ██" + RESET);
        System.out.println(PURPLE + "                                        ██                                       " + CYAN + "1 :: mm, cm, m" + PURPLE + "                                                          ██" + RESET);
        System.out.println(PURPLE + "                                        ██                                       " + CYAN + "2 :: Odd and Even" + PURPLE + "                                                       ██" + RESET);
        System.out.println(PURPLE + "                                        ██                                       " + CYAN + "3 :: Area & Circumference of a Circle" + PURPLE + "                                   ██" + RESET);
        System.out.println(PURPLE + "                                        ██                                       " + CYAN + "4 :: Back/Return" + PURPLE + "                                                        ██" + RESET);
        System.out.println(PURPLE + "                                        ██                                       " + CYAN + "5 :: EXIT SYSTEM" + PURPLE + "                                                        ██" + RESET);
        System.out.println(PURPLE + "                                        ██                                                                                                               ██" + RESET);
        System.out.println(PURPLE + "                                        ██                                                                                                               ██" + RESET);
        System.out.println(PURPLE + "                                        ██                                                                                                               ██" + RESET);
        System.out.println(PURPLE + "                                        ██                                                                                                               ██" + RESET);
        System.out.println(PURPLE + "                                        ██                                                                                                               ██" + RESET);
        System.out.println(PURPLE + "                                        ██                                                                                                               ██" + RESET);
        System.out.println(PURPLE + "                                        ███████████████████████████████████████████████████████████████████████████████████████████████████████████████████" + RESET);
        System.out.println();
        System.out.println();
        choice = sc.nextInt();

        if (choice == 1) {
        	Spaces();
            Converter(sc);
            break;
        } else if (choice == 2) {
        	Spaces();
            oddEven(sc);
        } else if (choice == 3) {
        	Spaces();
            circle(sc);
        } else if (choice == 4) {
        	Intro(sc);
        } else if (choice == 5) {
       	 Spaces();
       	 exit();
        } else {
            error(sc);
        }
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();

    } while (choice != 4);

    sc.close();
}

    public static void Converter(Scanner sc) {
    	int num;
    	System.out.println(SILVER + "                                                                             ██   ██ ███   ██ ██ ████████                                   ");
    	System.out.println("                                                                             ██   ██ ████  ██ ██    ██                                      "); 
    	System.out.println("                                                                             ██   ██ ██ ██ ██ ██    ██                                      ");
    	System.out.println("                                  ████                                       ██   ██ ██  ████ ██    ██                                          ████       ");
    	System.out.println("                                     ███                                      █████  ██   ███ ██    ██                                        ███          ");
    	System.out.println("                                       ███                                                                                                  ███            ");
    	System.out.println("                                     ███               ██████  ██████  ███   ██ ██   ██ ███████ ██████  ████████ ███████ ██████               ███          ");
    	System.out.println("                                  ████                ██      ██    ██ ████  ██ ██   ██ ██      ██   ██    ██    ██      ██   ██                ████       ");
    	System.out.println("                                                      ██      ██    ██ ██ ██ ██ ██   ██ ██████  ██████     ██    ██████  ██████             ");
    	System.out.println("                                                      ██      ██    ██ ██  ████  ██ ██  ██      ██   ██    ██    ██      ██   ██            ");
    	System.out.println("                                                       ██████  ██████  ██   ███   ███   ███████ ██   ██    ██    ███████ ██   ██            " + RESET);
    	System.out.println();
        System.out.println();
        System.out.println();
    	System.out.print(GREEN + "                                                                   Enter value: " + RESET);
        double value = sc.nextDouble();
        System.out.print(GREEN + "                                                                   Enter unit (mm, cm, m): " + RESET);
        String unit = sc.next().toLowerCase();

        double mm, cm, m;

        if (unit.equals("mm")) {
            mm = value;
            cm = value / 10.0;
            m = value / 1000.0;
        } else if (unit.equals("cm")) {
            cm = value;
            mm = value * 10.0;
            m = value / 100.0;
        } else if (unit.equals("m")) {
            m = value;
            cm = value * 100.0;
            mm = value * 1000.0;
        } else {
            System.out.println(PURPLE + "                                                                   [ERROR] Invalid unit!" + RESET);
            return;
        }
        System.out.println();
        System.out.println(CYAN + "                                                                   >> CONVERSIONS:" + RESET);
        System.out.println("                                                                   Millimeters: " + GREEN + mm + " mm" + RESET);
        System.out.println("                                                                   Centimeters: " + GREEN + cm + " cm" + RESET);
        System.out.println("                                                                   Meters     : " + GREEN + m + " m" + RESET);
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println(PURPLE + "                                                   ████████████████████████████████████████████████████████████████████████████████");
        System.out.println("                                                   ██                                                                            ██");
        System.out.println("                                                   ██                 " + CYAN + "[1] BACK                          [2] EXIT                 " + PURPLE + "██" );
        System.out.println("                                                   ██                                                                            ██");
        System.out.println("                                                   ████████████████████████████████████████████████████████████████████████████████" + RESET);
        System.out.println();
        System.out.println();
        num = sc.nextInt();
        
         if (num == 1) {
        	 CONVERSIONS(sc);
         } else if (num == 2) {
        	 Spaces();
        	 exit();
         } else {
             error(sc);
         }
             System.out.println();
             System.out.println();
             System.out.println();
             System.out.println();
             System.out.println();
             
         
         }
    public static void oddEven(Scanner sc) {
        char again;
        int num;
        System.out.println(SILVER +"                                  ███                 ██████  ██████  ██████       ███   ███   ██ ██████      ███████ ██   ██ ███████ ███   ██                ███      ");
        System.out.println("                                     ██              ██    ██ ██   ██ ██   ██     ██ ██  ████  ██ ██   ██     ██      ██   ██ ██      ████  ██              ██         ");
        System.out.println("                                       ██            ██    ██ ██   ██ ██   ██    ██   ██ ██ ██ ██ ██   ██     ██████  ██   ██ ██████  ██ ██ ██            ██           ");
        System.out.println("                                     ██              ██    ██ ██   ██ ██   ██    ███████ ██  ████ ██   ██     ██       ██ ██  ██      ██  ████              ██         ");
        System.out.println("                                  ███                 ██████  ██████  ██████     ██   ██ ██   ███ ██████      ███████   ███   ███████ ██   ███                ███      " + RESET);
        System.out.println();
        System.out.println();
        System.out.println();

        do {
            System.out.print(GREEN + "                                                                   Enter a number: " + RESET);
            int n = sc.nextInt();

            System.out.println();
            System.out.println();
            if (n % 2 == 0)
                System.out.println(CYAN + "                                                                   >> " + n + " is EVEN <<" + RESET);
            else
                System.out.println(CYAN + "                                                                   >> " + n + " is ODD <<" + RESET);

            System.out.println();
            System.out.print(GREEN + "                                                                   Try again? (y/n): " + RESET);
            again = sc.next().charAt(0);
            System.out.println();

        } while (again == 'y' || again == 'Y');
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println(PURPLE + "                                                         ████████████████████████████████████████████████████████████████████████████████");
        System.out.println("                                                         ██                                                                            ██");
        System.out.println("                                                         ██                 " + CYAN + "[1] BACK                          [2] EXIT                 " + PURPLE + "██" );
        System.out.println("                                                         ██                                                                            ██");
        System.out.println("                                                         ████████████████████████████████████████████████████████████████████████████████" + RESET);
        System.out.println();
        System.out.println();
        num = sc.nextInt();
        
         if (num == 1) {
        	 CONVERSIONS(sc);
         } else if (num == 2) {
        	 Spaces();
        	 exit();
         } else {
             error(sc);
         }
             System.out.println();
             System.out.println();
             System.out.println();
             System.out.println();
             System.out.println();

    }
 // Circle Calculator
    public static void circle(Scanner sc) {
    	int num;
        System.out.println(SILVER +"                                                                             ██████ ██ ██████   ██████ ██      ███████                                              ");
        System.out.println("                                                                            ██      ██ ██   ██ ██      ██      ██                                                   ");
        System.out.println("                                                                            ██      ██ ██████  ██      ██      ██████                                               ");
        System.out.println("                                     █████                                  ██      ██ ██   ██ ██      ██      ██                                          █████    ");
        System.out.println("                                         ███                                 ██████ ██ ██   ██  ██████ ███████ ███████                                   ███        ");
        System.out.println("                                           ███                                                                                                         ███          ");
    	System.out.println("                                         ███               ██████   ███   ██       ██████ ██   ██ ██        ███   ████████  ██████  ██████               ███        ");
        System.out.println("                                     █████                ██       ██ ██  ██      ██      ██   ██ ██       ██ ██     ██    ██    ██ ██   ██                █████    ");
        System.out.println("                                                          ██      ██   ██ ██      ██      ██   ██ ██      ██   ██    ██    ██    ██ ██████                          ");
        System.out.println("                                                          ██      ███████ ██      ██      ██   ██ ██      ███████    ██    ██    ██ ██   ██                         ");
        System.out.println("                                                           ██████ ██   ██ ███████  ██████  █████  ███████ ██   ██    ██     ██████  ██   ██                         " + RESET);
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.print(GREEN + "                                                                   Enter radius: " + RESET);
        double r = sc.nextDouble();

        System.out.println();
        System.out.println();
        System.out.println();
        if (r <= 0) {
            System.out.println(PURPLE + "                                                                   [ERROR] Radius must be positive." + RESET);
            return;
        }

        double area = Math.PI * r * r;
        double circ = 2 * Math.PI * r;

        System.out.println(CYAN + "                                                                   >> Area          = " + GREEN + area + RESET);
        System.out.println(CYAN + "                                                                   >> Circumference = " + GREEN + circ + RESET);
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println(PURPLE + "                                                           ████████████████████████████████████████████████████████████████████████████████");
        System.out.println("                                                           ██                                                                            ██");
        System.out.println("                                                           ██                 " + CYAN + "[1] BACK                          [2] EXIT                 " + PURPLE + "██" );
        System.out.println("                                                           ██                                                                            ██");
        System.out.println("                                                           ████████████████████████████████████████████████████████████████████████████████" + RESET);
        System.out.println();
        System.out.println();
        num = sc.nextInt();
        
         if (num == 1) {
        	 CONVERSIONS(sc);
         } else if (num == 2) {
        	 Spaces();
        	 exit();
         } else {
             error(sc);
         }
             System.out.println();
             System.out.println();
             System.out.println();
             System.out.println();
             System.out.println();

    }

    public static void ABOUTUS(Scanner sc) {
    	int choice;
    	do{
        System.out.println(PURPLE + "                                        ███████████████████████████████████████████████████████████████████████████████████████████████████████████████████" + RESET);
        System.out.println(PURPLE + "                                        ██                                                                                                               ██");
        System.out.println(PURPLE + "                                        ██                                                                                                               ██");
        System.out.println(PURPLE + "                                        ██      "+SILVER+"███   ██████   █████  ██   ██ ████████     ██████ ███████  ██████ ████████ ████████  ██████  ███   ██    "+PURPLE+"██");
        System.out.println(PURPLE + "                                        ██     "+SILVER+"██ ██  ██   ██ ██   ██ ██   ██    ██        ██     ██      ██         ██       ██    ██    ██ ████  ██    "+PURPLE+"██");
        System.out.println(PURPLE + "                                        ██    "+SILVER+"██   ██ ██████  ██   ██ ██   ██    ██        ██████ ██████  ██         ██       ██    ██    ██ ██ ██ ██    "+PURPLE+"██");
        System.out.println(PURPLE + "                                        ██    "+SILVER+"███████ ██   ██ ██   ██ ██   ██    ██            ██ ██      ██         ██       ██    ██    ██ ██  ████    "+PURPLE+"██");
        System.out.println(PURPLE + "                                        ██    "+SILVER+"██   ██ ██████   █████   █████     ██        ██████ ███████  ██████    ██    ████████  ██████  ██   ███    "+PURPLE+"██");
        System.out.println(PURPLE + "                                        ██                                                                                                               ██");
        System.out.println(PURPLE + "                                        ██                                                                                                               ██");
        System.out.println(PURPLE + "                                        ███████████████████████████████████████████████████████████████████████████████████████████████████████████████████" + RESET);
        System.out.println(PURPLE + "                                        ██                                                                                                               ██");
        System.out.println(PURPLE + "                                        ██                                                                                                               ██" + RESET);
        System.out.println(PURPLE + "                                        ██                                                                                                               ██" + RESET);
        System.out.println(PURPLE + "                                        ██                                           " + CYAN + "1 :: DEVELOPERS" + PURPLE + "                                                     ██" + RESET);
        System.out.println(PURPLE + "                                        ██                                           " + CYAN + "2 :: PROJECT DESCRIPTIONS" + PURPLE + "                                           ██" + RESET);
        System.out.println(PURPLE + "                                        ██                                           " + CYAN + "3 :: BACK TO MAIN MENU" + PURPLE + "                                              ██" + RESET);
        System.out.println(PURPLE + "                                        ██                                                                                                               ██" + RESET);
        System.out.println(PURPLE + "                                        ██                                                                                                               ██" + RESET);
        System.out.println(PURPLE + "                                        ██                                                                                                               ██" + RESET);
        System.out.println(PURPLE + "                                        ██                                                                                                               ██" + RESET);
        System.out.println(PURPLE + "                                        ██                                                                                                               ██" + RESET);
        System.out.println(PURPLE + "                                        ███████████████████████████████████████████████████████████████████████████████████████████████████████████████████" + RESET);
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        choice = sc.nextInt();

        if (choice == 1) {
        	Spaces();
            crew(sc);
            break;
        } else if (choice == 2) {
        	Spaces();
            description(sc);
        } else if (choice == 3) {
        	Spaces();
            CONVERSIONS(sc);
        } else {
           error(sc);
}
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();

    } while (choice != 4);

    sc.close();
}
    public static void crew(Scanner sc) {
    	int num;
        System.out.println(PURPLE + "                                        ███████████████████████████████████████████████████████████████████████████████████████████████████████████████████" + RESET);
        System.out.println(PURPLE + "                                        ██                                                                                                               ██");
        System.out.println(PURPLE + "                                        ██                                                                                                               ██");
        System.out.println(PURPLE + "                                        ██                     "+SILVER+"██████ ██████  ███████ ██         ██    ██       ██████   ██████  ██████                  "+PURPLE+"██");
        System.out.println(PURPLE + "                                        ██                    "+SILVER+"██      ██   ██ ██      ██    █    ██    ██      ██    ██ ██       ██                      "+PURPLE+"██");
        System.out.println(PURPLE + "                                        ██                    "+SILVER+"██      ██████  ██████  ██   ███   ██    ██      ██    ██ ██  ███  ██████                  "+PURPLE+"██");
        System.out.println(PURPLE + "                                        ██                    "+SILVER+"██      ██   ██ ██       ██ ██ ██ ██     ██      ██    ██ ██    ██     ██                  "+PURPLE+"██");
        System.out.println(PURPLE + "                                        ██                     "+SILVER+"██████ ██   ██ ███████   ███   ███      ███████  ██████   ██████  ██████                  "+PURPLE+"██");
        System.out.println(PURPLE + "                                        ██                                                                                                               ██");
        System.out.println(PURPLE + "                                        ██                                                                                                               ██");
        System.out.println(PURPLE + "                                        ███████████████████████████████████████████████████████████████████████████████████████████████████████████████████" + RESET);
        System.out.println(PURPLE + "                                        ██                                                                                                               ██");
        System.out.println(PURPLE + "                                        ██                                                                                                               ██");
        System.out.println(PURPLE + "                                        ██                                                                                                               ██");
        System.out.println(PURPLE + "                                        ██                            "+CYAN+"DEVELOPERS: GROUP 5                                                                "+PURPLE+"██");
        System.out.println(PURPLE + "                                        ██                            "+CYAN+"MEMBERS: Garcia, De Luna Jc, De vera, Olavere, Felisidario                         "+PURPLE+"██");
        System.out.println(PURPLE + "                                        ██                                                                                                               ██");
        System.out.println(PURPLE + "                                        ██                                                                                                               ██");
        System.out.println(PURPLE + "                                        ██                                                                                                               ██");
        System.out.println(PURPLE + "                                        ███████████████████████████████████████████████████████████████████████████████████████████████████████████████████" + RESET);
        System.out.println(PURPLE + "                                        ██                                                                                                               ██");
        System.out.println(PURPLE + "                                        ██                         "+CYAN+"[1] BACK                                           [2] EXIT                           "+PURPLE+"██");
        System.out.println(PURPLE + "                                        ██                                                                                                               ██");
        System.out.println(PURPLE + "                                        ███████████████████████████████████████████████████████████████████████████████████████████████████████████████████" + RESET);
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        num = sc.nextInt();
        
         if (num == 1) {
        	 Intro(sc);
         } else if (num == 2) {
        	 Spaces();
        	 exit();
         } else {
        	 error(sc);
         }
             System.out.println();
             System.out.println();
             System.out.println();
             System.out.println();
             System.out.println();


    }
    public static void description(Scanner sc) {
    	int num;
        System.out.println(PURPLE + "                                        ███████████████████████████████████████████████████████████████████████████████████████████████████████████████████" + RESET);
        System.out.println(PURPLE + "                                        ██                                                                                                               ██");
        System.out.println(PURPLE + "                                        ██                                                                                                               ██");
    	System.out.println(PURPLE + "                                        ██         "+SILVER+"██████  ███████ ██████  ██████ ██████  ████████ ███████  ████████ ████████  ██████  ███   ██          "+PURPLE+"██       ");
    	System.out.println(PURPLE + "                                        ██         "+SILVER+"██   ██ ██      ██     ██      ██   ██    ██    ██    ██    ██       ██    ██    ██ ████  ██          "+PURPLE+"██         ");
    	System.out.println(PURPLE + "                                        ██         "+SILVER+"██   ██ ██████  ██████ ██      ██████     ██    ███████     ██       ██    ██    ██ ██ ██ ██          "+PURPLE+"██          ");
    	System.out.println(PURPLE + "                                        ██         "+SILVER+"██   ██ ██          ██ ██      ██   ██    ██    ██          ██       ██    ██    ██ ██  ████          "+PURPLE+"██           ");
    	System.out.println(PURPLE + "                                        ██         "+SILVER+"██████  ███████ ██████  ██████ ██   ██ ████████ ██          ██    ████████  ██████  ██   ███          "+PURPLE+"██            ");
        System.out.println(PURPLE + "                                        ██                                                                                                               ██");
        System.out.println(PURPLE + "                                        ██                                                                                                               ██");
        System.out.println(PURPLE + "                                        ███████████████████████████████████████████████████████████████████████████████████████████████████████████████████" + RESET);
        System.out.println(PURPLE + "                                        ██                                                                                                               ██");
        System.out.println(PURPLE + "                                        ██                                                                                                               ██");
        System.out.println(PURPLE + "                                        ██           "+CYAN+"CyberCalc – The Hacker’s Calculator                                                                 "+PURPLE+"██");
        System.out.println(PURPLE + "                                        ██           "+CYAN+"Mission: Survive Java Programming                                                                   "+PURPLE+"██");
        System.out.println(PURPLE + "                                        ██                                                                                                               ██");
        System.out.println(PURPLE + "                                        ██       "+CYAN+"CyberCalc is a high-tech, hacker-themed calculator built to help coders survive the challenges          "+PURPLE+"██");
    	System.out.println(PURPLE + "                                        ██    "+CYAN+"of Java programming.                                                                                       "+PURPLE+"██");
        System.out.println(PURPLE + "                                        ██                                                                                                               ██");
    	System.out.println(PURPLE + "                                        ██       "+CYAN+"It’s more than just a calculator — it’s a digital ally for problem-solving, debugging, and navigating   "+PURPLE+"██");
        System.out.println(PURPLE + "                                        ██    "+CYAN+"the chaos of code with style and precision.                                                                "+PURPLE+"██");
        System.out.println(PURPLE + "                                        ██                                                                                                               ██");
        System.out.println(PURPLE + "                                        ██     "+CYAN+"Good Luck.                                                                                                "+PURPLE+"██");
        System.out.println(PURPLE + "                                        ██                                                                                                               ██");
        System.out.println(PURPLE + "                                        ██                                                                                                               ██");
        System.out.println(PURPLE + "                                        ███████████████████████████████████████████████████████████████████████████████████████████████████████████████████" + RESET);
        System.out.println(PURPLE + "                                        ██                                                                                                               ██");
        System.out.println(PURPLE + "                                        ██                         "+CYAN+"[1] BACK                                           [2] EXIT                           "+PURPLE+"██");
        System.out.println(PURPLE + "                                        ██                                                                                                               ██");
        System.out.println(PURPLE + "                                        ███████████████████████████████████████████████████████████████████████████████████████████████████████████████████" + RESET);
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        num = sc.nextInt();
        
         if (num == 1) {
        	 Intro(sc);
         } else if (num == 2) {
        	 Spaces();
        	 exit();
         } else {
        	 error(sc);
         }
             System.out.println();
             System.out.println();
             System.out.println();
             System.out.println();
             System.out.println();

    }
    public static void error(Scanner sc) {
    	char choice;
    	do {
        System.out.println(LIGHT_RED + "⠀⠀⠀⠀⠀                                        ⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢀⣀⣀⣀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀                                        ⠀⠀");
        System.out.println("⠀⠀⠀⠀                                        ⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⣠⣴⣶⣿⡿⣟⣿⣻⣿⣷⣦⣄⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀                                        ⠀⠀⠀⠀");
        System.out.println("⠀⠀⠀⠀                                        ⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢀⣴⣾⣿⣿⢯⣷⣿⣻⡟⠁⣷⡄⣸⠻⣧⡀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀                                        ⠀⠀⠀");
        System.out.println("⠀⠀⠀⠀                                        ⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⣠⣾⣿⣿⣿⣯⣿⣿⣿⣳⣿⡀⣼⡟⠹⠟⣧⠸⣷⡄⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀                                        ⠀⠀⠀⠀");
        System.out.println("⠀⠀⠀⠀⠀                                        ⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢀⣾⣿⣿⣿⣿⣯⣿⣿⣷⣿⢯⣿⣧⣙⣀⣀⡀⠹⣣⣿⣇⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀                > ERROR <                               ⠀⠀⠀⠀");
        System.out.println("⠀⠀⠀⠀⠀                                        ⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢠⣿⣿⣿⣿⣿⣿⣿⡟⣿⣾⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣶⣤⡄⠀⠀⠀⠀⠀⠀⠀⠀                                        ⠀⠀⠀⠀");
        System.out.println("⠀⠀⠀⠀⠀                                        ⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢠⣿⣿⣿⣿⣿⣿⣿⣻⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣷⡄⠀⠀⠀⠀⠀⠀⠀⠀      > Enter [B]ack to go back <                                  ⠀⠀⠀");
        System.out.println("⠀⠀⠀⠀⠀⠀⠀                                        ⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢀⣾⣿⣿⣿⣿⣿⣿⣿⣿⠿⠛⣿⡿⢿⡿⣿⣄⠈⠈⢉⣿⣿⣿⣿⣯⣿⣿⠇⠀⠀⠀⠀⠀⠀⠀                                        ⠀⠀⠀⠀");
        System.out.println("⠀⠀⠀⠀⠀⠀                                        ⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢸⣿⣿⣿⣿⣿⣿⣿⡟⣡⢂⠙⠉⣰⠖⠒⡪⡿⠇⢀⢸⡿⡍⢿⣿⡿⠟⠋⠀⠀⠀⠀⠀⠀⠀⠀                                        ⠀⠀⠀⠀");
        System.out.println("⠀⠀⠀⠀⠀⠀⠀⠀                                        ⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⣸⠿⡻⠿⣿⣿⣿⣿⣟⡰⠂⠄⠠⡇⢀⣿⣿⣷⠀⠀⣼⣷⣞⣹⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀                                        ");
        System.out.println("⠀⠀⠀⠀⠀⠀⠀⠀                                        ⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢸⣳⠟⡛⠷⣜⣿⣿⣿⣿⣧⢁⠂⡄⣇⠘⣾⣿⡯⣠⠶⠚⠉⠉⠉⠁⢢⡀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀                                        ⠀⠀");
        System.out.println("⠀⠀⠀⠀⠀⠀⠀⠀                                        ⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢸⡙⠂⠜⠛⢻⣿⣿⣿⡏⢍⠀⣾⣷⣼⣲⣬⢟⡵⣏⠧⣁⠂⠀⠀⠀⠀⢳⡄⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀                                        ⠀⠀");
        System.out.println("⠀⠀⠀⠀⠀⠀⠀⠀⠀                                        ⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠈⢣⡉⠄⡀⠙⣩⣿⢟⡸⢄⢂⠻⣿⣿⣿⣿⣿⣿⣜⡳⣆⢆⠠⠀⢄⣀⡿⠁⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀                                        ⠀⠀");
        System.out.println("⠀⠀⠀⠀⠀⠀⠀⠀⠀                                        ⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠙⠲⣦⣇⣷⣜⠮⣵⢊⠆⡄⢀⠀⢿⣿⣿⣿⣿⣷⣯⣮⣷⣽⣾⠋⠁⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀                                        ⠀⠀");
        System.out.println("⠀⠀⠀⠀⠀⠀⠀⠀⠀                                        ⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢿⣿⣿⣿⣝⢶⣋⡞⣜⡂⢆⠄⡉⠓⠛⡛⣛⢋⠻⢋⡭⠏⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀                                        ⠀⠀⠀");
        System.out.println("                                        ⢀⡠⠄⠀⠀⠄⠠⠄⠴⠒⠂⠉⠉⠉⠐⠂⠤⠔⠒⢤⢀⣀⡀⣀⢀⡀⣀⣀⣈⣉⣹⣿⣷⣽⣎⡷⣹⢎⡶⣡⠌⡐⠀⠀⢀⣶⣏⣁⣀⣠⣴⣖⡒⠋⠉⠈⠉⠁⠒⠒⠒⠒⠠⠄                                        ");
        System.out.println("                                        ⣿⡀⢠⡆⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠈⠂⠀⢿⣟⣿⣻⣟⡿⣿⣟⣿⣻⣟⡿⣿⣿⣿⣿⣿⣾⣵⣧⣟⣴⣽⣾⣿⡿⣟⣿⣿⣻⣟⡿⣿⣆⠀⠀⠀⠀⠀⣀⣀⣀⣠⠾                                        ");
        System.out.println("⠀                                        ⠉⠒⠻⠤⢀⣀⣄⣠⡄⠀⣀⠀⠀⡀⠀⠀⠀⠀⠀⢸⣿⢾⣽⡾⣿⣽⣾⡿⣽⣯⢿⣳⣿⣿⣿⣿⣿⣽⣾⣻⣟⡿⣿⣿⣿⡿⣽⣷⢿⣞⣿⣽⡇⠠⠀⠀⠀⠀⠙⠉⠉⠓⡄                                        ");
        System.out.println("                                        ⠀⠀⠀⠀⠀⠀⠀⠀⠀⢹⡆⠈⠉⠀⠀⠀⠀⠀⠠⠀⣸⣿⣯⣷⣿⢿⣾⣽⣿⣳⣿⣻⣿⢿⣿⣿⠿⢿⣿⣾⣯⣿⣿⣽⣿⣿⠿⢿⠾⠿⠿⣞⣏⠤⠦⣀⢠⡄⠤⠤⠤⠤⠔⠃                                        ");
        System.out.println("⠀                                        ⠀⠀⠀⠀⠀⠀⠀⠀⠸⡆⠀⠀⠀⠀⠀⠀⣰⠇⣰⡿⠏⠉⠉⠉⠉⠉⠿⣿⣿⣿⣿⣏⣿⣿⠇⠀⠀⠸⣿⣿⣿⣿⣿⣿⣿⠀⠈⡆⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀                                        ");
        System.out.println("⠀                                        ⠀⠀⠀⠀⠀⠀⠀⠀⠀⠉⠁⠁⠛⠁⠙⠚⠋⠉⠁⠀⠀⠀⠀⠀⠀⠀⣼⣿⣿⣿⣿⣿⣿⣿⣆⡘⢀⣸⣿⣿⣿⣿⣿⣿⣿⣷⣤⠃⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀                                        ⠀");
        System.out.println("⠀⠀                                        ⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⣼⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣽⣷⣿⣿⣿⣿⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀                                        ⠀");
        System.out.println("⠀⠀                                        ⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣯⣿⣿⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀                                        ⠀");
        System.out.println("⠀⠀                                        ⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢹⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣻⣷⣿⣿⣾⣿⣿⠏⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀                                        ⠀");
        System.out.println("⠀⠀                                        ⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⡟⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀                                        ⠀");
        System.out.println("⠀⠀                                        ⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⠇⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀                                        ⠀⠀");
        System.out.println("⠀⠀                                        ⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢺⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀                                        ⠀⠀⠀");
        System.out.println("⠀                                        ⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢻⣿⣿⣿⣿⣿⣿⣟⣿⣿⣿⣿⣿⣿⣿⣿⣷⣿⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀                                        ⠀⠀⠀⠀");
        System.out.println("⠀⠀                                        ⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢹⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣻⣿⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀                                        ⠀⠀⠀⠀");
        System.out.println("⠀⠀                                        ⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⣿⣿⣿⣿⣿⣿⣿⣿⣾⣿⣿⣿⣿⣿⣿⣿⣿⣿⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀                                        ⠀⠀⠀");
        System.out.println("⠀⠀                                        ⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⣿⣿⣿⣿⣿⣿⣿⣻⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀                                        ⠀⠀⠀⠀");
        System.out.println("⠀⠀                                        ⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣾⣿⣿⣆⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀                                        ⠀⠀");
        System.out.println("⠀⠀⠀                                        ⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⢿⣝⡳⣜⣎⡗⣦⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀                                        ⠀⠀⠀⠀⠀");
        System.out.println("⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀                                        ⠀⠀⠀⠀⠀⣿⣿⣿⣿⣿⣿⣟⡻⣬⢣⡝⡿⣿⣿⣞⡽⣣⢧⣝⣳⡼⣆⠀⠀⠀⠀⠀⠀⠀⠀⠀                                        ⠀⠀⠀⠀⠀");
        System.out.println("⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀                                        ⠀⠀⠀⠀⠀⣿⣿⣿⣿⣿⣷⣫⢗⣧⢻⣜⣳⡽⣿⣾⡿⣽⣳⣯⣷⣟⣿⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀                                        ⠀⠀⠀⠀");
        System.out.println("⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀                                        ⠀⠀⠀⠀⠘⣿⣿⣿⣿⣾⣽⢯⣞⣟⣾⣳⣿⣽⣿⣿⣿⣿⣷⣿⢿⠁⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀                                        ⠀⠀⠀⠀");
        System.out.println("⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀                                        ⠀⠀⠀⠀⠀⠀⠙⢻⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⠛⠛⠯⠽⠭⠓⠚⠁⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀                                        ⠀⠀⠀⠀");
        System.out.println("⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀                                        ⠀⠀⠀⠀⠀⠀⠀⠀⠙⠛⠿⢟⣻⣛⣯⠯⠵⠊⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀                                        ⠀⠀⠀" + RESET);
        choice = sc.next().charAt(0);
        
        if (choice == 'b' || choice == 'B') {
        	Spaces();
        	Intro(sc);
        	break;
        } else {
        	error(sc);
        }
    	} while(true);
    }
    public static void exit() {
    	System.out.println(SILVER + "⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢀⣀⣀⣀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀                                                                                                  ⠀");
    	System.out.println("⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢀⡤⠤⠤⠤⠴⠶⠶⠒⠚⠋⠉⠉⠉⠉⣷⢀⣀⡤⠤⠶⠶⠒⠛⢶⡄⠀             ████████ ██   ██   ███   ███   ██ ██   ██   ██  ██  ██████ ██   ██               ⠀⠀");
    	System.out.println("⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⣼⠁⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⣠⡀⠀⣿⠉⠀⠀⠀⠀⠀⠀⠀   ⠀⢿⡀⠀               ██    ██   ██  ██ ██  ████  ██ ██  ██    ██ ██  ██   ██ ██   ██                ⠀");
    	System.out.println("⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠰⣇⣾⠀⠀⠀⠀⣴⡄⢠⣿⣄⡀⣰⠏⠙⠛⠁⠀⠀⠀⠀⠀⠀⠀⠀⠀ ⠘⣧⠀                ██    ███████ ██   ██ ██ ██ ██ █████      ███   ██   ██ ██   ██                ⠀");
    	System.out.println("⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⣀⠤⠶⠚⠉⠉⠙⢦⣄⣀⣀⡟⠙⠋⠁⠈⠉⠁⠀⠀⠀⢢⡄⢀⣤⡂⠀⠀⠀⠀⠀⠀⢻⡀                ██    ██   ██ ███████ ██  ████ ██ ██      ██    ██   ██ ██   ██                ⠀");
    	System.out.println("⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢸⠇⠀⠀⠀⠀⠀⠀⠀⠈⠉⠁⠀⠀⠀⠀⠀⢀⠀⠀⡤⡀⠀⢯⣼⡇⠀⠀⠀⠀⠀⠀⠀ ⠘⣇⠀                ██    ██   ██ ██   ██ ██   ███ ██  ██     ██     ██████  █████                 ");
    	System.out.println("⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢸⡇⠀⠀⠀⠀⠀⠀⠠⡆⠀⠀⠀⠀⣀⣤⣤⣄⢙⡰⡏⢍⠆⠸⣿⡊⠵⣣⡄⠀⠀⠀⠀⠀⣿⠀                                                                                                ");
    	System.out.println("⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠘⣇⠠⠤⠶⣶⠙⠉⠁⣿⣀⠟⢇⢸⣇⠀⡜⣷⡄⠻⡆⠈⡇⠀⠙⠇⢀⠈⡁⠀⠀⠀⠀⢻⡀                                                          ████████  ██████  ██████     ██   ██ ███████ ████████ ███   ██ ███████    ");
    	System.out.println("⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⣿⠀⠀⠀⢢⡇⠀⠀⢹⡇⠀⠀⠇⠈⠉⠛⠁⠉⠀⠀⠀⠀⠀⠀⠀⠈⡄⠈⡄⠀⠀⠀⠀ ⢸⡇                                                          ██       ██    ██ ██   ██    ██   ██ ██         ██    ████  ██ ██         ");
    	System.out.println("⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢻⡀⠀⠀⠀⠿⠀⠀⠀⠁⠀⠀⠀⠀⣔⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠢⣏⡷⢳⠀⠀⠀  ⠀⠸⡇                                                          ██████   ██    ██ ██████     ██   ██ ██████     ██    ██ ██ ██ ██ ████    ");
    	System.out.println("⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⣿⡇⠀⠀⠀⠀⠀⠀⠀⣀⣢⢀⠀⠀⣕⠀⠀⠀⠀⠀⣤⠀⠀⢀⡄⠀⢚⣿⠼⠄⠀⠀⠀ ⠀⣧                         ⢀⡈⠛⠦⠀⠀⠀⠆⠀⠀⠀⠀⡀⠀⠐⠀⠀⠀⠀⠀⠀⡛⢱⣿⣿           ██       ██    ██ ██  ██     ██   ██     ██    ██     ██  ████ ██   ██    ");
    	System.out.println("⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢰⠇⣿⠀⠀⠀⠀⠀⠀⠀⠀⠈⠁⠛⠳⠷⣠⣶⡷⣤⣄⠨⡇⠀⢸⣟⡀⠘⡴⡇⠀⠀⠀⠀⠀⡿                      ⠠⣤⣴⠝⢛⠂⠀⠀⣐⣤⣠⣤⣰⣤⣜⢀⠀⢀⠀⠀⠀⠀⠀⠀⡅⣸⣿⣿          ██        ██████  ██   ██     █████  ██████  ███████  ██   ███ ██████     ");
    	System.out.println("⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⡿⠀⢿⡀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⣯⢸⣍⠀⠀⠙⣵⢹⣆⢈⡟⢂⠀⠹⠁⠈⠀⠀⠀ ⠀⡇                      ⢖⣂⠄⡀⣤⣶⣿⣿⣿⣿⣿⣿⣿⣿⣷⣦⡀⠀⠁⠀⠀⠀⠀⣇⣿⣿⣿⠀                                                                                    ");
    	System.out.println("⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢸⠇⠀⢸⡇⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠻⠀⠘⠩⡰⣢⣿⠀⠉⠉⠀⠹⠂⢀⠄⠀⠀⠀⠀ ⢸⡇                      ⣤⣶⣾⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⢿⣿⣿⣶⣦⠀⠀⠀⠀⢹⠹⣿⣿⠀         ██████ ██   ██ ██████  ███████ ██████   ██████   ███    ██       ██████    ");
    	System.out.println("⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⡟⠀⠀⠘⡇⠀⠀⠀⠀⠀⠀⠀⠀⢰⠿⡄⠀⠀⠀⠀⠀⠉⠁⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀  ⢸⠇                     ⣤⢻⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⢟⣽⡪⠽⠛⡛⠻⣿⣷⠠⠀⠀⠀⠀⢻⣿         ██       ██ ██  ██   ██ ██      ██   ██ ██       ██ ██   ██      ██        ");
    	System.out.println("⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢸⠇⠀⠀⠀⣿⠀⠀⢀⡟⡗⢄⠀⢀⢾⠀⠈⠷⡄⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀ ⣼⠀                      ⢦⣼⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⠟⠁⣠⣶⣾⣷⣤⡘⢟⡣⠀⠀⠀⠀⠘⣿         ██        ███   ██████  █████   ██████  ██      ██   ██  ██     ██         ");
    	System.out.println("⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⡾⠀⠀⠀⠀⢸⡄⠀⡸⠀⠀⠐⣕⠀⠈⠀⠀⠀⠁⠀⠀⠀⠀⠀⠀⠀⠀⠀ ⠀⠀⠀⠀⠀⢀⡠⠞⠁                       ⡞⠿⢿⣿⣿⣿⣿⡿⣿⡿⠋⠀⣠⠾⣻⣽⠾⠻⣿⣿⡜⡷⡀⠀⠀⠀⢶⣿⠀        ██         ██   ██   ██ ██      ██   ██ ██      ███████  ██      ██        ");
    	System.out.println("⠀⠀⠀⠀⠀⠀⠀⠀⠀⣰⠾⣦⠀⢸⡇⠀⠀⠀⠀⢸⡇⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀ ⠀⠀⠀⢀⣀⣠⡤⠔⠚⠉⠀⠀                        ⢠⣶⣤⣄⣀⠉⠻⢿⣶⡏⣡⡾⠗⣩⡀⣀⣶⣶⣾⣿⣿⡸⣧⠀⣢⠄⠸⣿         ██████    ██   ██████  ███████ ██   ██  ██████ ██   ██  ███████  ██████    ");
    	System.out.println("⠀⠀⣴⢦⣄⠀⠀⢀⣰⠏⠀⠘⣧⣿⠀⠀⠀⠀⢠⢾⡇⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀ ⠀⢀⣀⣀⡤⠴⠶⠒⠋⠉⠉⠀⠀⠀⠀⠀⠀                        ⠘⣿⠿⠛⠋⠋⠝⡃⣿⣿⣬⡻⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⡄⢰⡹⣼⠀⢿                                   ⠟⢦⡀                ⠀");
    	System.out.println("⠀⠀⡏⠀⠈⠛⠋⠉⢀⣴⣿⣟⢿⡏⠀⠀⢀⡴⠋⠀⣧⠀⠀ ⢀⣀⣠⣤⣤⠤⠴⠒⠚⠛⠉⠉⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀                           ⣯⡰⣗⣴⣾⣿⢡⢹⣿⣎⢷⣽⣿⣿⣿⣿⣿⣿⣿⣿⣿⡁⢸⣛⡟⠀⣾                                    ⢷⡄⠈⡓⠢⢄⡀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀   ⠀⣀⣠⠤⠂⢹               ⠀⠀");
    	System.out.println("⠀⠀⣧⢀⣴⣶⣶⡄⢾⣿⣿⡿⣸⠃⠀⢠⠞⠁⠀⠀⠈⠉⠉⠉⠁⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀                            ⣿⣿⣿⣿⣿⣿⡏⢸⣿⣿⣎⠿⣿⣿⣿⣿⣿⣿⣿⡿⢹⣿⠀⠉⠀⣴⣿                                     ⠈⡷⡄⠈⠲⢤⣈⠻⠉⠛⠉⠉⠁⠒⠖⠉⠉⠉⠒⠶⢦⣤⠴⠒⢉⣡⠴⠀⢀⠏               ⠀");
    	System.out.println("⠀⠀⢿⣿⣿⣿⣿⣿⠘⢿⣭⡵⠋⠀⣰⠋⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀                            ⠸⣿⣿⣿⣿⣿⡟⣿⣿⣿⣿⣿⡌⣿⣿⣿⣿⣿⡟⢠⣿⣿⠀⠀⠀⠉⢸                                      ⢸⡿⡂⠀⠀⠉⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⣀⣠⣴⡞⠉⠀⢀⣠⡞⠀               ");
    	System.out.println("⠀⠀⠈⠳⣬⣿⣭⠯⠖⠚⠁⠀⢀⡞⠁⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀                              ⠹⣿⣿⣿⣿⣏⠌⠋⣩⡶⣒⣵⣿⣿⣿⣿⣿⣷⣿⣿⣿⠀⠀⠀⠀⢸⠀                                      ⢙⣿⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠉⠀⠀⢠⡼⡟              ⠀");
    	System.out.println("⠀⠀⠀⠀⢠⠇⠀⠀⠀⠀⠀⠀⣿⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀                              ⠀⠀⠈⠙⢛⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⠟⣻⣿⣿⣿⣿⡟⡄⢀⠀⠀⠈⠀                                     ⠀⡼⠋⠀⣤⣀⠀⠀⠀⠀⠀⠈⠐⣂⣄⠀⠀⠀⠀⠀⠀⠀⢀⠀⣰⡟⠁⠀               ⠀");
    	System.out.println("⠀⠀⠀⣰⠏⠀⣀⠀⠀⠀⠀⠀⢸⡄⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀                                  ⠐⢝⢿⣿⡛⢯⡶⢶⣒⣛⣧⣾⢿⣿⣿⣿⡿⢡⣿⠈⢧⡀                                      ⢠⡇⠀⠀⠘⠛⠃⠀⠀⠀⠀⠾⣿⠿⠟⠉⠀⠀⠀⠀⠀⠀⠀⠀⢻⠀               ⠀");
    	System.out.println("⠀⠀⡼⢃⡴⠚⡿⠀⠀⠀⣤⠀⠈⣷⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀                                   ⠀⠈⡐⣶⣾⣿⣿⣿⠿⣻⣻⣿⣿⣿⡿⢡⣿⣿⡇⠆⢧⠀                                      ⢸⡇⢺⡀⠀⢠⡒⠠⣄⡀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠠⡀⠀⠀⠸⡇              ⠀⠀");
    	System.out.println("⢀⣾⠗⠋⠀⢠⡏⠀⠀⣸⠋⢷⡀⢹⡆⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀                                     ⠀⢨⣭⣭⣥⣶⣾⣿⣿⣿⣿⡟⣡⣿⣿⣿⣿⢰⢸⡖                                      ⢸⡇⣘⠑⡀⠀⠙⢏⣁⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠈⠂⠀⣔⣇⠀             ⠀⠀⠀");
    	System.out.println("⠋⠁⣄⠀⢠⡿⡇⠀⢰⡏⠀⠀⠻⣮⣧⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀                                   ⢀⢊⡾⡁⠻⣿⣿⣿⣿⣿⣿⣿⠏⣰⣿⣿⣿⣿⣿⣼⡟⣿                                     ⢸⡇⡁⠀⢳⣶⣾⣷⣦⣄⣀⡀⣀⣀⡀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢸⣿⠀             ⠀⠀");
    	System.out.println("⠀⠀⠙⠛⠋⠀⡇⢠⡟⠀⠀⠀⠀⠈⠛⠁⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀                                ⠀⡠⣠⢳⣧⡺⠁⡄⣝⡻⠿⠿⠿⢛⣡⣾⣿⣿⣿⣿⣿⣿⢻⣧⣿                                      ⠸⡇⠁⠀⠀⢏⠉⠀⠀⠙⠛⠛⠛⠉⠁⠀⠀⠀⠀⠀⠀⠀⠀⠀⢈⡏⠀             ⠀⠀");
    	System.out.println("⠀⠀⠀⠀⠀⠀⣧⡟⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀                                                                                             ⠯⣀⣈⣀⣈⣐⣲⣄⣄⣤⣴⣆⣀⣀⣀⣀⣀⣀⣀⣀⣀⣀⣈⣛⡧              ⠀⠀");
    	System.out.println("⠀⠀⠀⠀⠀⠀⡿⠁⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀                                                                                                                            ⠀⠀" + RESET);
    	System.exit(0);
    }
    public static void Spaces() {
        for (int i = 0; i < 40; i++) {
            System.out.println("\n");
        }
    }
}

