package aarogyahospital;

/**
 * Hello world!
 *
 */
import java.util.*;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	Scanner sc=new Scanner(System.in);
    	try {
    	//DaoImpl dao=new DaoImpl();
    	App1 a1=new App1();
    	App2 a2=new App2();
        do {
        	System.out.println("----------Choices---------");
        	System.out.println("[1]. Medicine records");
            System.out.println("[2]. Patient Registration");
            System.out.println("[3]. Contact us");
            System.out.println("[0]. Exit");
        
        System.out.println("Enter your choice ");
        int n = sc.nextInt();
        switch (n) {
        case 1:
        	a1.medicineRecords();
        	break;
        case 2:
        	a2.patientRecords();
        	break;
        case 3:
        	System.out.println("Email:suhelshaik@gmail.com.com");
        	System.out.println("phn.no: 9845683256");
        	System.out.println("address H-no:2-06,Eraagadda,Hyderabd.");
        	break;
        case 0:
        	System.exit(0);
        	break;
        
        default:
        	System.out.println("invalid choice");
        }
        }while(true);
        
        
    	}
    	catch(Exception e) {
    		System.out.println(e);
    	}
    }
}