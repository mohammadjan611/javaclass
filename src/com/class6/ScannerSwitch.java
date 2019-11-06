package com.class6;

import java.util.Scanner;

public class ScannerSwitch {

	public static void main(String[] args) {
		
		/* ask user where they are from based on the country we will specify favorite food 

		 */
		String country, foodName;
		Scanner scan;
		
		scan=new Scanner(System.in);
		System.out.println("Please enter your country");
		country = scan.nextLine();
		
		switch (country) {
		case "Afghanistan":
		foodName = "kebab";
	     break;
	      case "Ethiopia":
	       foodName = "Tibs";
	      break;
	      case "Morocco":
	foodName = "Tajin";
		break;
		case "Kazakhstan":
	foodName = "Kumis";
		break;
		case "Pakistan":
	foodName = "Beryani";
	 break;
	case "Russia":
		foodName = "Caviar";
	break;
   case "Cuba":
	 foodName = "Sofrito";
	break;
	default:
	foodName = "Unknown";
	
		}
		
     System.out.println("You are from "+country+" and your favorite food is "+foodName);
     
     
     
     
     {
    	 
     }
	}
				
			
				
				
		}
		
	
