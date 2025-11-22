import java.util.*;
class Area_of_cube{
public static void main(String args[]){
double side, area;
Scanner sc = new Scanner(System.in);
System.out.println("Enter side of cube: ");
side= sc.nextInt();
area=6*side*side;
System.out.println("Area is: "+area);
}
}
