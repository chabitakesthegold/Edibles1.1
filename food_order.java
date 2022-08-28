import java.util.Scanner;

public class food_order {
    int ugaliBeef= 120;
    int mcheleBeef= 120;
    int chapoBeans= 70;
    int fries= 100;
    int ugaliFish= 150;
    int ugaliKuku= 200;
    int mcheleKuku= 200;
    int choice;
    int quantity;
    static int total;
    String extraOrder;
    String location;
Scanner Sc= new Scanner(System.in);

public void display(){
    System.out.println("-------------------Welcome To Edibles---------------------------");
    System.out.println("-------Order your lunch conviniently from anywhere in TUK-------");
    System.out.println("--------Here's our Menu---------");
    System.out.println("-----------------------------------------------------------------");
    System.out.println(" What do you feel like ordering today??");
    System.out.println("                     Student pricing      Staff Pricing");
    System.out.println("          1.Ugali Beef     120/=                   170/=");
    System.out.println("          2.Mchele Beef    120/=                   170/=");
    System.out.println("          3.Chapo Beans     70/=                   120/=");
    System.out.println("          4.Fries          100/=                   150/=");
    System.out.println("          5.Ugali Fish     150/=                   200/=");
    System.out.println("          6.Ugali Kuku     200/=                   250/=");
    System.out.println("          7.Mchele Kuku     200/=                  250/=");
    System.out.println("          8.Exit                ");
    System.out.println("-----------------------------------------------------------------");
    System.out.println(" What do you feel like ordering today??");


}


public void generateBill(){
    System.out.println();
    System.out.println("---------Where would you like it delivered?:---------------");
    location = Sc.next();
    System.out.println("-----------------Your total bill is:" + total + " ----------------" );
    System.out.println("---------Your lunch will arrive at " + location + " in 8 mins---------------");
    System.out.println("---------Thanks for choosing us. Enjoy your meal---------------");
}


public void order() {
   
        while(true){
 
            System.out.println(" Enter your option");
            choice = Sc.nextInt();
            switch(choice) 
            {
                case 1://ugaliBeef
                System.out.println(" You have selected Ugali Beef");
                System.out.println();
                System.out.println(" Enter your desired quantity");
                quantity=Sc.nextInt();
                total = total + quantity*ugaliBeef;

                    break;

                case 2://mcheleBeef
                System.out.println(" You have selected Mchele Beef");
                System.out.println();
                System.out.println(" Enter your desired quantity");
                quantity=Sc.nextInt();
                total = total + quantity*mcheleBeef;

                    break;

                case 3://chapoBeans
                System.out.println(" You have selected Chapo Beans");
                System.out.println();
                System.out.println(" Enter your desired quantity");
                quantity=Sc.nextInt();
                total = total + quantity*chapoBeans;
                
                    break;

                case 4://fries
                System.out.println(" You have selected Fries");
                System.out.println();
                System.out.println(" Enter your desired quantity");
                quantity=Sc.nextInt();
                total = total + quantity*fries;
                
                    break;

                case 5://ugaliFish
                System.out.println(" You have selected Ugali Fish");
                System.out.println();
                System.out.println(" Enter your desired quantity");
                quantity=Sc.nextInt();
                total = total + quantity*ugaliFish;
                    
                    break;

                case 6://ugaliKuku
                System.out.println(" You have selected Ugali Kuku");
                System.out.println();
                System.out.println(" Enter your desired quantity");
                quantity=Sc.nextInt();
                total = total + quantity*ugaliKuku;
                        
                    break;
                    
                case 7://mcheleKuku
                System.out.println(" You have selected Mchele Kuku");
                System.out.println();
                System.out.println(" Enter your desired quantity");
                quantity=Sc.nextInt();
                total = total + quantity*mcheleKuku;
                        
                    break;

                case 8://exit
                System.exit(1);
                break;



                default:
                    break;
            }

            System.out.println(" Enter your desired quantity");
            System.out.print(" Do you wish to make another order?(Y/N):");
            extraOrder=Sc.next();
            if(extraOrder.equalsIgnoreCase("Y"))
            {order();}
            else if(extraOrder.equalsIgnoreCase("N"))
            {generateBill();
            System.exit(1);}
            else{System.out.println("Invalid choice in your selection!");}
            
            
        }


    }

}
