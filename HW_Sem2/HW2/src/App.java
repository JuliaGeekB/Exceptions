import java.util.Scanner;

import Exceptions.*;

public class App {
    
    public static void invalidNumber(int number){
            if (number<0){
                throw new InvalidNumberException("Некорректное число");
            }
        }


    public static void divisionByZero(int number){
            if (number==0){
                throw new DivisionByZeroException("Деление на 0 недопустимо");
            }
        }
    
     
    
    public static void main(String[] args)  {
        //Task1.
           
        try(Scanner sc=new Scanner(System.in)){
            int number=Integer.parseInt(sc.nextLine());
            try{
                invalidNumber(number);
                System.out.println("Число корректно");
            }catch(InvalidNumberException e){
            System.out.println("Ошибка: "+e.getMessage());
        }
        }
        
        //Task2.
        try(Scanner sc=new Scanner(System.in)){
            int number1=Integer.parseInt(sc.nextLine());
            int number2=Integer.parseInt(sc.nextLine());
            try{
                divisionByZero (number2);
                System.out.println(number1/number2);
            }catch(DivisionByZeroException e){
            System.out.println("Ошибка: "+e.getMessage());
            }
        }
    }
}
