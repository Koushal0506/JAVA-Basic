import java.util.*;
class Prime_number{
public static void main(String args[]){
int number;
Scanner sc=new Scanner(System.in);
System.out.print("Enter number to check its prime number or not!! :");
number=sc.nextInt();
if(number%2==1 || number==2){
System.out.println("This number is prime number");
}
else
System.out.println("This number is not a prime number");
}
}