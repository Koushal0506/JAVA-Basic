import java .util.*;
class Leap_year{
public static void main(String args[]){
int leap , birth_year , current_year;
Scanner sc= new Scanner(System.in);
System.out.print("Enter your Birth year:");
birth_year = sc.nextInt();
System.out.print("Enter your Current year:");
current_year = sc.nextInt();
for(leap = birth_year; leap <= current_year ; leap++){
if((leap%4==0 && leap%100!=0) || (leap%400==0)){
System.out.println("leap year:"+leap);
}
}
}
}
