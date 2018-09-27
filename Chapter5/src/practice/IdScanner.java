package practice;

import java.util.Scanner;

public class IdScanner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int idNumber;
		
		Scanner input = new Scanner (System.in);
		
		System.out.print("Scan the bar code to find an person >>");
        idNumber = input.nextInt();
        
        switch(idNumber) 
        {
        case 146891:
        	result = "De'Antwan Hanes";
        	break;
        case 316338:
        	result = "Logan DeWilfond";
        	break;
        case 155706:
        	result = "Joseph Chalupa";
        	break;
        case 274891:
        	result = "Jason Wells";
        	break;
        case 137112:
        	result = "Adam Burton";
        	break;
        case 137160:
        	result = "Zach Canada";
        	break;
        case 153184:
        	result = "Jayden Graap";
        	break;
        case 159343:
        	result = "Giovanni Jacobsen";
        	break;
        case 129001	
        	
        }
	}

}
