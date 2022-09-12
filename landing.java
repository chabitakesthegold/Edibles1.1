import java.util.Scanner;

public class landing {
    
 public void log_in(){
    System.out.println(" Powered by ==District==");
    System.out.print(" which view do you wish to see?(Student/Staff):");

    Scanner Sc= new Scanner(System.in);
    
    String extraOrder=Sc.next();
    if(extraOrder.equalsIgnoreCase("Student"))
    {        student_pricing StudentOrder1= new student_pricing();
        StudentOrder1.display();
        StudentOrder1.order();}
    else if(extraOrder.equalsIgnoreCase("Staff"))
    {       staff_pricing StaffOrder2= new staff_pricing();
            StaffOrder2.display();
            StaffOrder2.staff_order();
    }
    else{System.out.println("Invalid choice in your selection!");}





 }   
}
