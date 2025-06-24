import java.util.Scanner;

public class calculator {
    static double addition(double a,double b){
        return a+b;
    }
    static double subtraction(double a, double b){
        return a*b;
    }
    static double multiplication(double a, double b){
        return a*b;
    }
    static double division(double a, double b){
        return a/b;
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int choice;
        do { 
            System.out.println("Calculator");            
            System.out.println("1.Additiomn");            
            System.out.println("2.Subtraction");            
            System.out.println("3.multiplication");            
            System.out.println("4.division");            
            System.out.println("5.exit");  
            choice=sc.nextInt();  
            if(choice==1 || choice==2 || choice==3 || choice==4){
                System.out.print("Enter the number: ");
                double a=sc.nextDouble();
                System.out.print("Enter the number: ");
                double b=sc.nextDouble();
                if(choice==1){
                    System.out.println("Result: " + addition(a, b));
                }
                else if(choice==2){
                    System.out.println("Result: " + subtraction(a, b));
                }
                else if(choice==3){
                    System.out.println("Result: " + multiplication(a, b));
                }
                else if(choice==4){
                    System.out.println("Result: " + division(a, b));
                }

            }
            else if(choice==5){
                System.out.println("Exiting... Thank you!");
            }
            else{
                System.out.println("Invalid choice. Please try again.");
            }

        } while (choice!=5);
        
    }
    
}
