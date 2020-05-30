import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintStream;
import java.util.*;

public class VehicleInventory {

	public static void main(String[] args) {
				
		String userInput;
		
		String BRAND;
		String MODEL;
		String COLOR;
		int YEAR;
		int MILEAGE;
		
		Scanner scn = new Scanner(System.in);
		Scanner intScan = new Scanner(System.in);
  try {		
		System.out.println("Welcome to the Vehicle Inventory!\n");
		System.out.println("Would you like to add a new vehicle/update your existing vehicle data/delete your vehicle data?\n");
		System.out.println("(Type ADD, to add a new vehicle. Type UPDATE, to update your existing vehicle. Type DELETE, to delete your existing vehicle data.)\n");
		System.out.println("Type NO to exit.");
		
		userInput = scn.nextLine();
		
		if (userInput.toUpperCase().equals("ADD")) {
			
			
			System.out.println("Please enter the Brand of your vehicle: ");
			BRAND = scn.nextLine();

			System.out.println("Please enter the Model of your vehicle: ");
			MODEL = scn.nextLine();
			
			System.out.println("Please enter the Color of your vehicle: ");
			COLOR = scn.nextLine();
			
			System.out.println("Please enter the Year on which your vehicle was purchased: ");
			YEAR = intScan.nextInt();
			
			System.out.println("Please enter the Mileage of your vehicle: ");
			MILEAGE = intScan.nextInt();
			
			AddNewVehicle(BRAND, MODEL, COLOR, YEAR, MILEAGE);			
			
			System.out.println("Would like to see all the data stored in our database? (type YES for yes and NO for no.");
			userInput = scn.nextLine();
			
			if (userInput.toUpperCase().equals("YES")) {
				Automobile.VehicleInfo();
			}
			
			else if (userInput.toUpperCase().equals("NO")) {
				System.out.println("Okay, nothing will be shown.");
			}
			
			else {
				System.out.println("Please type either YES or NO. No numbers will be accepted!");
			}
		}
		
		else if (userInput.toUpperCase().equals("UPDATE")) {
			
			UpdateVehicle();			
			
		}
		
		else if (userInput.toUpperCase().equals("DELETE")) {
			
			RemoveVehicle();
			
		}
		
		else if (userInput.toUpperCase().equals("NO")) {
			System.out.println("Thank You and have a great day!");
		}
		
		else {
			System.out.println("Please  enter either ADD/UPDATE/DELETE/NO. Any other input will not be accepted!");
		}
		
  } catch (Exception e) {
	  System.out.println("Failure");
  }
	
	}
	
	public static String RemoveVehicle () {
	
		
		String myRemoveInput;
		int myRemoveIntInput = 0;
		PrintStream RemoveVehicle = null;
		
    	Scanner scn = new Scanner(System.in);
    	Scanner intScan = new Scanner(System.in);
		
		System.out.println("Please type 'brand' to delete the brand of your vehicle, 'model' to delete the Model of your vehicle, 'color' to delete the Color of your vehicle, 'year' to delete the Year your vehicle was bought, 'mileage' to delete the Mileage of your vehicle.");
    	System.out.println("If you want to delete all the data of your vehicle then type 'all'.");
		myRemoveInput = scn.nextLine();
		
		// If Brand needs to be deleted.			
	try {	
				if (myRemoveInput.toLowerCase().equals("brand")) {
					
					System.out.println("Please enter the Brand of the vehicle which needs to be deleted.");
					myRemoveInput = scn.nextLine();
					
					if (Automobile.autoMake.contains(myRemoveInput)) {
						
						Automobile.autoMake.remove(myRemoveInput);
						
						RemoveVehicle = System.out.printf("The Brand %s has been deleted.",myRemoveInput);
						
					}
					
					else {
						System.out.println("The Brand of the vehicle you entered doesn't exist.");
					}
					
				}
				
		// If Model needs to be deleted.			
					
			   else if (myRemoveInput.toLowerCase().equals("model")) {
					
					System.out.println("Please enter the Model of the vehicle which needs to be deleted.");
					myRemoveInput = scn.nextLine();
					
					if (Automobile.autoModel.contains(myRemoveInput)) {
						
						Automobile.autoModel.remove(myRemoveInput);
						
						RemoveVehicle = System.out.printf("The vehicle Model %s has been deleted.",myRemoveInput);
						
					}
					
					else {
						System.out.println("The Model of the vehicle you entered doesn't exist.");
					}
					
				}
				
		// If Color needs to be deleted.			
				
		       else if (myRemoveInput.toLowerCase().equals("color")) {
					
					System.out.println("Please enter the Color of the vehicle which needs to be deleted.");
					myRemoveInput = scn.nextLine();
					
					if (Automobile.autoColor.contains(myRemoveInput)) {
						
						Automobile.autoColor.remove(myRemoveInput);
					
						RemoveVehicle = System.out.printf("The vehicle Color %s has been deleted.",myRemoveInput);
					}
					
					else {
						System.out.println("The Color of the vehicle you entered doesn't exist.");
					}
					
				}
				
		// If Year needs to be deleted.					
				
			   else if (myRemoveInput.toLowerCase().equals("year")) {
					
					System.out.println("Please enter the Year of the vehicle which needs to be updated. Meaning, you will have to enter the Brand which you have previously stated.");
					myRemoveIntInput = intScan.nextInt();
					
					if (Automobile.autoYear.contains(myRemoveIntInput)) {
						
						Automobile.autoYear.remove(myRemoveIntInput);
						
						RemoveVehicle = System.out.printf("The vehicle Year %d has been deleted.",myRemoveIntInput);
						
					}
					
					else {
						System.out.println("The Year of the vehicle you entered doesn't exist.");
					}
					
				} 
				
		// If Mileage needs to be deleted.		
				
			  else if (myRemoveInput.toLowerCase().equals("mileage")) {
					
					System.out.println("Please enter the Mileage of the vehicle which needs to be updated. Meaning, you will have to enter the Brand which you have previously stated.");
					myRemoveIntInput = intScan.nextInt();
					
					if (Automobile.autoMileage.contains(myRemoveIntInput)) {
						
						Automobile.autoMileage.remove(myRemoveIntInput);
						
						RemoveVehicle = System.out.printf("The vehicle Mileage %d has been deleted.",myRemoveIntInput);
						
					}
					
					else {
						System.out.println("The Mileage of the vehicle you entered doesn't exist.");
					}
					
				}	
				
		// If ALL the data needs to be updated.			
				
			   else if (myRemoveInput.toLowerCase().equals("all")) {
					
					System.out.println("Please enter the Brand of the vehicle which needs to be updated. Meaning, you will have to enter the Brand which you have previously stated.");
					myRemoveInput = scn.nextLine();
		// BRAND
					if (Automobile.autoMake.contains(myRemoveInput)) {
						
						Automobile.autoMake.remove(myRemoveInput);
						
						RemoveVehicle = System.out.printf("The vehicle Brand %s has been deleted.",myRemoveInput);
						
					}
					
					else {
						
						System.out.println("The Brand of the vehicle you entered doesn't exist.");
					}
					
		// MODEL			
					System.out.println("Please enter the Model of the vehicle which needs to be updated. Meaning, you will have to enter the Brand which you have previously stated.");
					myRemoveInput = scn.nextLine();
					
					if (Automobile.autoModel.contains(myRemoveInput)) {
						
						Automobile.autoModel.remove(myRemoveInput);
						
						RemoveVehicle = System.out.printf("The vehicle Model %s has been deleted.",myRemoveInput);
					}
					
					else {
						System.out.println("The Model of the vehicle you entered doesn't exist.");
					}
					
		// COLOR		
					System.out.println("Please enter the Color of the vehicle which needs to be updated. Meaning, you will have to enter the Brand which you have previously stated.");
					myRemoveInput = scn.nextLine();
					
					if (Automobile.autoColor.contains(myRemoveInput)) {
						
						Automobile.autoColor.remove(myRemoveInput);
						
						RemoveVehicle = System.out.printf("The vehicle Color %s has been deleted.",myRemoveInput);
					
					}
					
					else {
						System.out.println("The Color of the vehicle you entered doesn't exist.");
					}
					
		// YEAR
					System.out.println("Please enter the Year of the vehicle which needs to be updated. Meaning, you will have to enter the Brand which you have previously stated.");
					myRemoveIntInput = intScan.nextInt();
					
					if (Automobile.autoYear.contains(myRemoveIntInput)) {
						
						Automobile.autoYear.remove(myRemoveIntInput);
						
						RemoveVehicle = System.out.printf("The vehicle Year %d has been deleted.",myRemoveIntInput);
						
					}
					
					else {
						System.out.println("The Year of the vehicle you entered doesn't exist.");
					}
					
		// MILEAGE
					System.out.println("Please enter the Mileage of the vehicle which needs to be updated. Meaning, you will have to enter the Brand which you have previously stated.");
					myRemoveIntInput = intScan.nextInt();
					
					if (Automobile.autoMileage.contains(myRemoveIntInput)) {
						
						Automobile.autoMileage.remove(myRemoveIntInput);
						
						RemoveVehicle = System.out.printf("The vehicle Mileage %d has been deleted.",myRemoveIntInput);
						
					}
					
					else {
						System.out.println("The Mileage of the vehicle you entered doesn't exist.");
					}
				}
		    	
				else {
					System.out.println("Kindly type in as you were asked to. No, numbers are accepted.");
				}
		
	} catch (Exception e) {
		
		return "failure";
	}
		
		return RemoveVehicle.toString();
	}
	
    public static String AddNewVehicle (String autoMake, String autoModel, String autoColor, int autoYear, int autoMileage ) {
			    	
    	Scanner scan = new Scanner(System.in);
    	String myInput;
    	final String FILENAME = "C:\\Temp\\Autos.txt";
    	
    	try {
    	Automobile vehicle = new Automobile(autoMake, autoModel, autoColor, autoYear, autoMileage);
    	PrintStream AddNewVehicle = System.out.printf("Your car %s of %s has been added to the inventory. \n",autoModel, autoMake);
    	
    	System.out.println("Would you like to print the file? (Please type 'Y' for Yes or 'N' for No).");
    	myInput = scan.nextLine();
   	
    	if (myInput.toUpperCase().equals("Y")) {   	
    		
    	BufferedWriter bw = null;
        FileWriter fw = null;
    	
        try {
        	
			fw = new FileWriter(FILENAME);
			bw = new BufferedWriter(fw);
			bw.write("Your Car Brand is :\r\n");
			bw.write(autoMake + "\r\n");
			bw.write("Your Car Model is :\r\n");
			bw.write(autoModel + "\r\n");
			bw.write("Your Car Color is :\r\n");
			bw.write(autoColor + "\r\n");
			bw.write("Your Car Year is :\r\n");
			bw.write(autoYear + "\r\n" );
			bw.write("Your Car Mileage is :\r\n");
			bw.write(autoMileage + "\r\n" );
			System.out.println("Your data is printed.");
			bw.close();
			
		} catch (IOException e) {
			e.printStackTrace();
		}
    	}
    	
    	else if (myInput.toUpperCase().equals("N")){
    		System.out.println("Your data will not be printed.");
    	}
    	
    	else {
    		System.out.println("Please type either 'Y' for Yes or 'N' for No. No numbers or words are accepted!");
    	}
		
    	return AddNewVehicle.toString();
    	
    	
    	} catch (Exception e) {
    		return "Failure";
    	}
    
	}
	
    public static String UpdateVehicle() {
		
    	
    	String myUpdateInput;
    	int myUpdateIntInput = 0;
    	PrintStream UpdateVehicle = null;
    	
    	Scanner scn = new Scanner(System.in);
		Scanner intScan = new Scanner(System.in);
  try {  	
    	System.out.println("Please type 'brand' to update the Brand of your vehicle, 'model' to update Model of your vehicle, 'color' to update Color of your vehicle, 'year' to update the Year your vehicle was bought, 'mileage' to update the Mileage of your vehicle.");
    	System.out.println("If you want to update all the of your vehicle data then type 'all'.");
		myUpdateInput = scn.nextLine();
		
// If Brand needs to be updated.			
		
		if (myUpdateInput.toLowerCase().equals("brand")) {
			
			System.out.println("Please enter the Brand of the vehicle which needs to be updated. Meaning, you will have to enter the Brand which you have previously stated.");
			myUpdateInput = scn.nextLine();
			
			if (Automobile.autoMake.contains(myUpdateInput)) {
				
				Automobile.autoMake.remove(myUpdateInput);
				
				System.out.println("Please enter the new Brand of the vehicle :");
				myUpdateInput = scn.nextLine();
				
				Automobile.autoMake.add(myUpdateInput);
				
				UpdateVehicle = System.out.printf("The vehicle Brand %s has been updated.",myUpdateInput);
					
			}
			else {
				System.out.println("The Brand of the vehicle you entered doesn't exist.");
			}
			
		}
		
// If Model needs to be updated.			
			
     else if (myUpdateInput.toLowerCase().equals("model")) {
			
			System.out.println("Please enter the Model of the vehicle which needs to be updated. Meaning, you will have to enter the Brand which you have previously stated.");
			myUpdateInput = scn.nextLine();
			
			if (Automobile.autoModel.contains(myUpdateInput)) {
				
				Automobile.autoModel.remove(myUpdateInput);
				
				System.out.println("Please enter the new Model of the vehicle :");
				myUpdateInput = scn.nextLine();
				
				Automobile.autoModel.add(myUpdateInput);
				
				UpdateVehicle = System.out.printf("The vehicle Model %s has been updated.",myUpdateInput);
				
			}
			
			else {
				System.out.println("The Model of the vehicle you entered doesn't exist.");
			}
			
		}
		
// If Color needs to be updated.			
		
     else if (myUpdateInput.toLowerCase().equals("color")) {
			
			System.out.println("Please enter the Color of the vehicle which needs to be updated. Meaning, you will have to enter the Brand which you have previously stated.");
			myUpdateInput = scn.nextLine();
			
			if (Automobile.autoColor.contains(myUpdateInput)) {
				
				Automobile.autoColor.remove(myUpdateInput);
				
				System.out.println("Please enter the new Color of the vehicle :");
				myUpdateInput = scn.nextLine();
				
				Automobile.autoColor.add(myUpdateInput);				
				
				UpdateVehicle = System.out.printf("The vehicle Color %s has been updated.",myUpdateInput);
			}
			
			else {
				System.out.println("The Color of the vehicle you entered doesn't exist.");
			}
			
		}
		
// If Year needs to be updated.					
		
     else if (myUpdateInput.toLowerCase().equals("year")) {
			
			System.out.println("Please enter the Year of the vehicle which needs to be updated. Meaning, you will have to enter the Brand which you have previously stated.");
			myUpdateIntInput = intScan.nextInt();
			
			if (Automobile.autoYear.contains(myUpdateIntInput)) {
				
				Automobile.autoYear.remove(myUpdateIntInput);
				
				System.out.println("Please enter the new Year of the vehicle :");
				myUpdateIntInput = intScan.nextInt();
				
				Automobile.autoYear.add(myUpdateIntInput);
				
				UpdateVehicle = System.out.printf("The vehicle Year %d has been updated.",myUpdateIntInput);
			}
			
			else {
				System.out.println("The Year of the vehicle you entered doesn't exist.");
			}
			
		} 
		
// If Mileage needs to be updated.		
		
     else if (myUpdateInput.toLowerCase().equals("mileage")) {
			
			System.out.println("Please enter the Mileage of the vehicle which needs to be updated. Meaning, you will have to enter the Brand which you have previously stated.");
			myUpdateIntInput = intScan.nextInt();
			
			if (Automobile.autoMileage.contains(myUpdateIntInput)) {
				
				Automobile.autoMileage.remove(myUpdateIntInput);
				
				System.out.println("Please enter the new Mileage of the vehicle :");
				myUpdateIntInput = intScan.nextInt();
				
				Automobile.autoMileage.add(myUpdateIntInput);
				
				UpdateVehicle = System.out.printf("The vehicle Mileage %d has been updated.",myUpdateIntInput);
				
			}
			
			else {
				System.out.println("The Mileage of the vehicle you entered doesn't exist.");
			}
			
		}	
		
// If ALL the data needs to be updated.			
		
     else if (myUpdateInput.toLowerCase().equals("all")) {
			
			System.out.println("Please enter the Brand of the vehicle which needs to be updated. Meaning, you will have to enter the Brand which you have previously stated.");
			myUpdateInput = scn.nextLine();
// BRAND
			if (Automobile.autoMake.contains(myUpdateInput)) {
				
				Automobile.autoMake.remove(myUpdateInput);
				
				System.out.println("Please enter the new Brand of the vehicle :");
				myUpdateInput = scn.nextLine();
				
				Automobile.autoMake.add(myUpdateInput);
				
				UpdateVehicle = System.out.printf("The vehicle Brand %s has been updated.",myUpdateInput);
			}
			
			else {
				
				System.out.println("The Brand of the vehicle you entered doesn't exist.");
			}
			
// MODEL			
			System.out.println("Please enter the Model of the vehicle which needs to be updated. Meaning, you will have to enter the Brand which you have previously stated.");
			myUpdateInput = scn.nextLine();
			
			if (Automobile.autoModel.contains(myUpdateInput)) {
				
				Automobile.autoModel.remove(myUpdateInput);
				
				System.out.println("Please enter the new Model of the vehicle :");
				myUpdateInput = scn.nextLine();
				
				Automobile.autoModel.add(myUpdateInput);
				
				UpdateVehicle = System.out.printf("The vehicle Model %s has been updated.",myUpdateInput);
				
			}
			
			else {
				System.out.println("The Model of the vehicle you entered doesn't exist.");
				
			}
			
// COLOR		
			System.out.println("Please enter the Color of the vehicle which needs to be updated. Meaning, you will have to enter the Brand which you have previously stated.");
			myUpdateInput = scn.nextLine();
			
			if (Automobile.autoColor.contains(myUpdateInput)) {
				
				Automobile.autoColor.remove(myUpdateInput);
				
				System.out.println("Please enter the new Color of the vehicle :");
				myUpdateInput = scn.nextLine();
				
				Automobile.autoColor.add(myUpdateInput);				
				
			}
			
			else {
				System.out.println("The Color of the vehicle you entered doesn't exist.");
			}
			
// YEAR
			System.out.println("Please enter the Year of the vehicle which needs to be updated. Meaning, you will have to enter the Brand which you have previously stated.");
			myUpdateIntInput = intScan.nextInt();
			
			if (Automobile.autoYear.contains(myUpdateIntInput)) {
				
				Automobile.autoYear.remove(myUpdateIntInput);
				
				System.out.println("Please enter the new Year of the vehicle :");
				myUpdateIntInput = intScan.nextInt();
				
				Automobile.autoYear.add(myUpdateIntInput);
				
				UpdateVehicle = System.out.printf("The vehicle Year %d has been updated.",myUpdateIntInput);
			}
			
			else {
				System.out.println("The Year of the vehicle you entered doesn't exist.");
			}
			
// MILEAGE
			System.out.println("Please enter the Mileage of the vehicle which needs to be updated. Meaning, you will have to enter the Brand which you have previously stated.");
			myUpdateIntInput = intScan.nextInt();
			
			if (Automobile.autoMileage.contains(myUpdateIntInput)) {
				
				Automobile.autoMileage.remove(myUpdateIntInput);
				
				System.out.println("Please enter the new Mileage of the vehicle :");
				myUpdateIntInput = intScan.nextInt();
				
				Automobile.autoMileage.add(myUpdateIntInput);
				
				UpdateVehicle = System.out.printf("The vehicle Mileage %d has been updated.",myUpdateIntInput);
			}
			
			else {
				System.out.println("The Mileage of the vehicle you entered doesn't exist.");
			}
		}
    	
		else {
			System.out.println("Kindly type in as you were asked to. No, numbers are accepted.");
		}
		
  } catch (Exception e) {
  	return "Failure";
  }
		
		return UpdateVehicle.toString();
    
       }
		
    }

 

