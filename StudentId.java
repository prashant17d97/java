import java.util.Scanner;
public class StudentId
{
    public static void main(String []arg)
    {
        String name, bloodGroup, group;                 //variable declaration
        int age;

        Scanner scan=new Scanner(System.in);            //object created of scanner class

        System.out.println("Enter name:");
        name=scan.nextLine();                           //taken name

        System.out.println("Enter Blood Group:");
        bloodGroup=scan.nextLine();                     //taken blood group

        System.out.println("Enter age:");
        age=scan.nextInt();                             //taken age

        if(age>=20)                                     //condition 1
        {
            group="RED";
        }
        else if(age>=15 &&age<=20)                      //condition 2
        {
            group="BLUE";
        }
        else
        {
            group="YELLOW";
        }
        //Displayed the card.
        System.out.println("----------------------------------");
        System.out.println("Name: "+name);
        System.out.println("Age: "+age);
        System.out.println("Blood Group: "+bloodGroup);
        System.out.println("----------------------------------");
        System.out.println("Your group is "+group);
        System.out.println("----------------------------------");
    }
}// end of program.
