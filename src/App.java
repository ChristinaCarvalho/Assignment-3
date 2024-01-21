import java.util.Scanner;

public class App {    
    public static void main(String[] args) throws Exception {
        int run = 1;
        do{
            double num1 = 0;
            String unit1 = "", unit2 = "";
            Scanner input = new Scanner(System.in);
            System.out.println("Welcome to Metric Converter! Enter -1 to exit.");
            System.out.println("Supported conversions: cm, m, in, ft.");
            System.out.println("Enter value: ");
            num1 = input.nextDouble();
            if(num1 == -1){
                System.exit(0);
            }

            System.out.println("Enter abreviated units of value: ");
            input.nextLine();
            unit1 = input.nextLine();

            System.out.println("Enter abreviated units of value to convert to: ");
            unit2 = input.nextLine();

            double num2 = 0;
            switch(unit1){
                case "cm":
                    switch(unit2){
                        case "m": 
                            num2 = num1/100;  
                            break;
                        case "in": 
                            num2 = num1/2.54;
                            break;
                        case "ft": 
                            num2 = num1/30.48;
                            break;
                        default:
                            System.out.println("Cannot convert to "+unit2+". Try with a different unit.");
                            break;
                    }
                    break;

                case "m":
                    switch(unit2){
                        case "cm": 
                            num2 = num1*100;
                            break;
                        case "in": 
                            num2 = num1*39.37;
                            break;
                        case "ft": 
                            num2 = num1*3.2808399;
                            break;
                        default:
                            System.out.println("Cannot convert to "+unit2+". Try with a different unit.");
                            break;
                    }
                    break;

                case "in":
                    switch(unit2){
                        case "m": 
                            num2 = num1/39.37;
                            break;
                        case "cm": 
                            num2 = num1*2.54;
                            break;
                        case "ft": 
                            num2 = num1/12;
                            break;
                        default:
                            System.out.println("Cannot convert to "+unit2+". Try with a different unit.");
                            break;
                    }
                    break;

                case "ft":
                    switch(unit2){
                        case "m": 
                            num2 = num1/3.2808399;
                            break;
                        case "in": 
                            num2 = num1*12;
                            break;
                        case "cm": 
                            num2 = num1*30.48;
                            break;
                        default:
                            System.out.println("Cannot convert to "+unit2+". Try with a different unit.");
                            break;
                    }
                    break;

                default:
                    System.out.println(unit1+" is not a vaild conversion. Try with a different unit.");
                    break;
            }
            System.out.println("Conversion from "+num1+" "+unit1+" to "+unit2+" is "+num2+" "+unit2);
            System.out.println("**************************");

        } while (run ==1);
    }
}
