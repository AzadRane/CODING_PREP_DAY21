import java.io.*;

abstract class Staff 
{
    String name,address;

    abstract void accept()throws Exception;

    abstract void display();

}


class FullTimeStaff extends Staff
{
    String dept;
    double sal;

    public void accept()throws Exception 
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Enter the name of staff :");
        name=br.readLine();

        System.out.println("Enter the address");
        address=br.readLine();

        System.out.println("Enther the department ");
        dept=br.readLine();
    }
}




public class StaffDemo
{
    public static void main()
    {

    }
}