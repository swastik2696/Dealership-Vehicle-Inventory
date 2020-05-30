import java.util.ArrayList;

public class Automobile {

	private String make;
	private String model;
	private String color;
	private int year;
	private int mileage;
	
	static ArrayList<String> autoMake = new ArrayList<String>();
	static ArrayList<String> autoModel = new ArrayList<String>();
	static ArrayList<String> autoColor = new ArrayList<String>();
	static ArrayList<Integer> autoYear = new ArrayList<Integer>();
	static ArrayList<Integer> autoMileage = new ArrayList<Integer>();
	
	Automobile (String make, String model, String color, int year, int mileage) {
		
		this.make = make;
	    this.model = model;
	    this.color = color;
	    this.year = year;
	    this.mileage = mileage;
	    
	    autoMake.add(make);
	    autoModel.add(model);
	    autoColor.add(color);
	    autoYear.add(year);
	    autoMileage.add(mileage);
	 
	}
	
	public static void VehicleInfo() {
		
		int i =0;
try {	
		System.out.println("The Brand consists of: \n");
		for (i=0; i<autoMake.size(); i++) {
			System.out.println(autoMake.get(i));
		}
		
		System.out.println("The Model consists of: \n");
		for (i=0; i<autoModel.size(); i++) {
			System.out.println(autoModel.get(i));
		}
		
		System.out.println("The Color consists of: \n");
		for (i=0; i<autoColor.size(); i++) {
			System.out.println(autoColor.get(i));
		}
		
		System.out.println("The Year consists of: \n");
		for (i=0; i<autoYear.size(); i++) {
			System.out.println(autoColor.get(i));
		}
		
		System.out.println("The Mileage consists of: \n");
		for (i=0; i<autoMileage.size(); i++) {
			System.out.println(autoColor.get(i));
		}
} catch (Exception e) {
  System.out.println("failure");
}
	}
	
}

