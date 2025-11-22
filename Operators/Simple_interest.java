import java.util.*;
class Simple_interest{
public static void main(String args[]){
double principle, rate, time,si;
Scanner sc = new Scanner(System.in);
System.out.println("Enter principle: ");
principle= sc.nextInt();
System.out.println("Enter rate: ");
rate= sc.nextInt();
System.out.println("Enter time: ");
time= sc.nextInt();
si=(principle*rate*time)/100;
System.out.println("Simple Interest is: "+si);
}
}
