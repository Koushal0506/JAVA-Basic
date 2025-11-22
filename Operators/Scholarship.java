import java.util.*;
class Scholarship{
public static void main(String args[]){
int clas, age;
double percentage;
char gender;
Scanner sc= new Scanner(System.in);
System.out.print("Enter your class: ");
clas = sc.nextInt();
System.out.print("Enter your age: ");
age = sc.nextInt();
System.out.print("Enter your percentage: ");
percentage = sc.nextDouble();
System.out.print("Enter your gender: ");
gender = sc.next().charAt(0);
if(clas==12){
if(age>=17){
if(percentage>=90){
if(gender=='F' || gender=='f'){
System.out.println("you are eligible for scholarship");
}
else{
System.out.println("Your Gender is not eligible for scholarship...");
}
}
else{
System.out.println("Your Percentage is not eligible for scholarship...");
}
}
else{
System.out.println("Your age is not eligible for scholarship...");
}
}
else{
System.out.println("Your class is not eligible for scholarship ...");
}
}
}



