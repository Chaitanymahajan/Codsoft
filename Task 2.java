import java.util.*;

class Student
{
    String name;
    String Add;
    Long mob;
    Scanner sc = new Scanner(System.in);
    int sub[]= new int[5];
        int Tot=0;
        float Percent=0;
        int i,Id;
        String Result;
    public void Getdetails()
    {
        System.out.println("Enter the Students Details: ");
        System.out.println("Enter Student Name: ");
        name= sc.next();
        System.out.println("Enter Student Address: ");
        Add= sc.next();
        System.out.println("Enter Student Mobile No.:");
        mob= sc.nextLong();
        System.out.println("Enter Student Id: ");
        Id=sc.nextInt();
        System.out.println("Enter the Marks Obtained in English: ");
        sub[0]=sc.nextInt();
        System.out.println("Enter the Marks Obtained in Maths: ");
        sub[1]=sc.nextInt();
        System.out.println("Enter the Marks Obtained in Marathi: ");
        sub[2]=sc.nextInt();
        System.out.println("Enter the Marks Obtained in Hindi: ");
        sub[3]=sc.nextInt();
        System.out.println("Enter the Marks Obtained in Science: ");
        sub[4]=sc.nextInt(); 
        for(i=0;i<=4;i++)
        {
            Tot= Tot + sub[i];
        }
        Percent = Tot/5;
        if(Percent>=35.00)
        {
            if(Percent>=35.00 && Percent<50.00)
            {
                Result= "C";
            }
            else if(Percent>=50.00 && Percent<60.00)
            {
                Result= "B";
            }
            else if(Percent>=60.00 && Percent<70.00)
            {
                Result= "B+";
            }
            else if(Percent>=70.00 && Percent<90.00)
            {
                Result= "A";
            }
            else if(Percent>=90.00 && Percent<=100.00)
            {
                Result= "A+";
            }
        }
        if(Percent<35)
            {
                Result="FAIL";
            }
    }
    public void Showdetails()
    {
        System.out.println("Here is the Details and Result of the Student: ");
        System.out.println("Name: "+name);
        System.out.println("Address: "+Add);
        System.out.println("Mob: "+mob);
        System.out.println("Student Id: "+Id);
        System.out.println("Total Marks Obtained: "+Tot);
        System.out.println("Percentage: "+Percent);
        System.out.println("Result: "+Result);
    }
    public static void main(String a[])
    {
        Student S1=new Student();
        S1.Getdetails();
        S1.Showdetails();

    }
}