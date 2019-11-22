
import java.util.Arrays;
public class Application {
	 public static void main(String[] args) {
	       Appliance appliances[] = new Appliance[40];

	appliances[0] = new TV("Samsung 32", "Flat Screen", true, 440, "Black", "Japan", 90);
	appliances[1] = new TV("Samsung 43", "Flat Screen", true, 440, "Black", "Japan", 500);
	appliances[2] = new TV("Samsung 50", "Flat Screen", true, 440, "Black", "Japan", 560);
	appliances[3] = new TV("Samsung 55", "Flat Screen", true, 440, "Black", "Japan", 584);
	appliances[4] = new TV("Samsung 60", "Flat Screen", true, 440, "Black", "Japan", 600);
	appliances[5] = new TV("Samsung 14", "Flat Screen", true, 440, "Black", "Japan", 35);
	appliances[6] = new TV("Samsung 15", "Flat Screen", true, 440, "Black", "Japan",45);	
	appliances[7] = new TV("Samsung 25", "Flat Screen", true, 440, "Black", "Japan", 50);
	appliances[8] = new TV("Samsung 65", "Flat Screen", true, 440, "Black", "Japan", 650);
	appliances[9] = new TV("Samsung 70", "Flat Screen", true, 440, "Black", "Japan", 700);
	appliances[10] = new TV("Samsung 75", "Flat Screen", true, 440, "Black", "Japan", 750);
	appliances[11] = new TV("Samsung 80", "Flat Screen", true, 440, "Black", "Japan", 800);
	appliances[12] = new TV("Samsung 85", "Flat Screen", true, 440, "Black", "Japan", 900);
	appliances[13] = new TV("Samsung 90", "Flat Screen", true, 440, "Black", "Japan", 1500);


	appliances[26] = new Telephone("iPhone 4 ", false, true, 440, "Black", "USA", 500);
	appliances[14] = new Telephone("iPhone 5", false, true, 440, "Black", "USA", 100);
	appliances[15] = new Telephone("iPhone 6", false, true, 440, "Black", "USA", 200);
	appliances[16] = new Telephone("iPhone 6Plus", false, true, 440, "Black", "USA", 350);
	appliances[17] = new Telephone("iPhone 5S", false, true, 440, "Black", "Korea",250);
	appliances[18] = new Telephone("iPhone 6SPlus", false, true, 440, "Black", "Korea", 350);
	appliances[19] = new Telephone("iPhone 7", false, true, 440, "Black", "USA",400);
	appliances[20] = new Telephone("iPhone 7Plus", false, true, 440, "Black", "USA", 450);
	appliances[21] = new Telephone("iPhone 8", false, true, 440, "Black", "USA", 500);	
	appliances[22] = new Telephone("iPhone 8Plus", false, true, 440, "Black", "USA", 550);
	appliances[23] = new Telephone("iPhone 10", false, true, 440, "Black", "USA", 600);
	appliances[24] = new Telephone("iPhone XR", false, true, 440, "Black", "USA", 650);
	appliances[25] = new Telephone("iPhone 10XMax", false, true, 440, "Black", "USA", 1200);


	appliances[30] = new Toaster("Kitchen Aid1", "2 Slice", true, 440, "Silver", "USA", 150);
	appliances[32] = new Toaster("Kitchen Aid2", "2 Slice", true, 440, "Silver", "USA", 150);
	appliances[33] = new Toaster("Kitchen Aid3", "2 Slice", true, 440, "Silver", "USA", 150);
	appliances[34] = new Toaster("Kitchen Aid4", "2 Slice", true, 440, "Silver", "USA", 150);
	appliances[35] = new Toaster("Kitchen Aid5", "2 Slice", true, 440, "Silver", "USA", 150);
	appliances[36] = new Toaster("Kitchen Aid6", "4 Slice", true, 440, "Stainless Steel", "USA", 399);
	appliances[37] = new Toaster("Kitchen Aid7", "4 Slice", true, 440, "Stainless Steel", "USA", 399);
	appliances[38] = new Toaster("Kitchen Aid8", "4 Slice", true, 440, "Stainless Steel", "USA", 399);
	appliances[39] = new Toaster("Kitchen Aid9", "4 Slice", true, 440, "Stainless Steel", "USA", 399);
	appliances[40] = new Toaster("Kitchen Aid10", "4 Slice", true, 440, "Stainless Steel", "USA", 399);


	       Arrays.sort(appliances);
	       for(Appliance app:appliances) {
	           System.out.println(app);
	       }
}

}
