import java.util.*;
import java.util.Scanner;
class student
{
    public static void main(String[] args)
    {
        int rollno;
        String name;
        double marks;
        Scanner sc=new Scanner(System.in);
        rollno=sc.nextInt();
        name=sc.next();
        marks=sc.nextDouble();
        System.out.println("Roll number:"+rollno);
        System.out.println("Name:"+name);
        System.out.println("Marks:"+marks);
    }
}