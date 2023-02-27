package Milestone3;
import java.util.*;
public class StoreFront3 extends Product3{
	public static int purchaseSwords = 0;
	public static int purchaseShurikans = 0;
	public static int purchaseHelmets = 0;
	public static int purchaseBoots = 0;
	public static int purchaseHealthPotions = 0;

		static void options(){
			Scanner input = new Scanner(System.in);
			System.out.print("what would you like to do?: "+"\n\t1. View Products"+"\n\t2. Check out"+"\n\t3. View Cart"+"\n\t4. Cancel"+"\n:");
			int choice = input.nextInt();
			
			if (choice == 1)
				products();
			else if (choice == 2)
				checkOut();
			else if (choice == 3)
				viewCart();
			else if (choice == 4)
				Cancel();
				else {
					options();
					
				}
					
		}
		static void products() {
			Scanner input = new Scanner(System.in);
			System.out.print("select an item to view: "+"\n1. Sword"+"\n2. Shurikan"+"\n3. Helmet"+"\n4. Boots"+"\n5. Health Potion"+"\n6. Cancel"+"\n:");
			int choice2 = input.nextInt();
			
			if (choice2 == 1) {
				Sword();
			Scanner SWPurchase = new Scanner(System.in);
			System.out.print("Would you like to add this item to your cart? (y/n): ");
			String SWPurchase1 = SWPurchase.nextLine();
			char SWPurchase2 = SWPurchase1.charAt(0);
			if (SWPurchase2 == 'y') {
			Scanner SWQuantity = new Scanner(System.in);
			System.out.print("How many Swords do you want?: ");

			purchaseSwords = (purchaseSwords+SWQuantity.nextInt());
			System.out.print("Item(s) added to cart!\n\n");
			options();
			



			}
			}
			if (choice2 == 2) {
				Shurikan();
			Scanner SHPurchase = new Scanner(System.in);
			System.out.print("Would you like to add this item to your cart? (y/n): ");
			String SHPurchase1 = SHPurchase.nextLine();
			char SHPurchase2 = SHPurchase1.charAt(0);
			if (SHPurchase2 == 'y') {
			Scanner SHQuantity = new Scanner(System.in);
			System.out.print("How many Shurikans do you want?: ");

			purchaseShurikans = (purchaseShurikans+SHQuantity.nextInt());
			System.out.print("Item(s) added to cart!\n\n");
			options();
			}
				
			}
			if (choice2 == 3) {
				Helmet();
			Scanner HPurchase = new Scanner(System.in);
			System.out.print("Would you like to add this item to your cart? (y/n): ");
			String HPurchase1 = HPurchase.nextLine();
			char HPurchase2 = HPurchase1.charAt(0);
			if (HPurchase2 == 'y') {
			Scanner HQuantity = new Scanner(System.in);
			System.out.print("How many Helmets do you want?: ");

			purchaseHelmets = (purchaseHelmets+HQuantity.nextInt());
			System.out.print("Item(s) added to cart!\n\n");
			options();
			}
				
			}
			
			
			if (choice2 == 4) {
				Boots();
			Scanner BPurchase = new Scanner(System.in);
			System.out.print("Would you like to add this item to your cart? (y/n): ");
			String BPurchase1 = BPurchase.nextLine();
			char BPurchase2 = BPurchase1.charAt(0);
			if (BPurchase2 == 'y') {
			Scanner BQuantity = new Scanner(System.in);
			System.out.print("How many pairs of Boots do you want?: ");

			purchaseBoots = (purchaseBoots+BQuantity.nextInt());
			System.out.print("Item(s) added to cart!\n\n");
			options();
			}
				
			}
			
			
			
			if (choice2 == 5) {
				Health();
			Scanner HPPurchase = new Scanner(System.in);
			System.out.print("Would you like to add this item to your cart? (y/n): ");
			String HPPurchase1 = HPPurchase.nextLine();
			char HPPurchase2 = HPPurchase1.charAt(0);
			if (HPPurchase2 == 'y') {
			Scanner HPQuantity = new Scanner(System.in);
			System.out.print("How many Health potions do you want?: ");

			purchaseHealthPotions = (purchaseHealthPotions+HPQuantity.nextInt());
			System.out.print("Item(s) added to cart!\n\n");
			options();
			}
				
			}
			else {
				options();
			}
			
			
			
			
		}
		static void viewCart() {
			System.out.print("your cart contains: "+"\nSwords: "+purchaseSwords+"\nShurikans: "+purchaseShurikans+"\nHelmets: "+purchaseHelmets+"\nBoots: "+purchaseBoots+"\nHealth Potions: "+purchaseHealthPotions+"\n");
			options();
		}
		
		static void checkOut() {
			System.out.print("your cart contains: "+"\nSwords: "+purchaseSwords+"\nShurikans: "+purchaseShurikans+"\nHelmets: "+purchaseHelmets+"\nBoots: "+purchaseBoots+"\nHealth Potions: "+purchaseHealthPotions+"\n");
			if (purchaseSwords > 15) {
				System.out.print("your cart contains more Swords than we have in our inventory. your cart has been cleared of Swords\n");
				purchaseSwords = 0;
				options();
			}
			
			
			if (purchaseShurikans > 750) {
				System.out.print("your cart contains more Shurikans than we have in our inventory. your cart has been cleared of Shurikans\n1");
				purchaseShurikans = 0;
				options();
			}
			if (purchaseHelmets > 200) {
				System.out.print("your cart contains more Helmets than we have in our inventory. your cart has been cleared of helmets\n1");
				purchaseHelmets = 0;
				options();
			}
			if (purchaseBoots > 175) {
				System.out.print("your cart contains more Boots than we have in our inventory. your cart has been cleared of Boots\n1");
				purchaseBoots = 0;
				options();
			}
			if (purchaseHelmets > 500) {
				System.out.print("your cart contains more Potions than we have in our inventory. your cart has been cleared of Potions\n1");
				purchaseHealthPotions = 0;
				options();
			}
			Scanner checkOut = new Scanner(System.in);
			System.out.print("would you like to check out? (y/n): ");
			String checkOut1 = checkOut.nextLine();
			char checkOut2 = checkOut1.charAt(0);
			if (checkOut2 == 'y') {
			System.out.print("your total is: "+((250*purchaseSwords)+(25*purchaseShurikans)+(150*purchaseHelmets)+(125*purchaseBoots)+(50*purchaseHealthPotions))+" Coins");
			System.out.print("\nThank you for shopping with us at belethors Do come back! \n");
			
			
			}
			else {
				options();
				
			}
		}
		
		static void Cancel() {
			purchaseSwords = (0);
			purchaseShurikans = (0);
			purchaseHelmets = (0);
			purchaseBoots = (0);
			purchaseHealthPotions = (0);
			System.out.print("cart cleared \n");
			System.out.print("Welcome to Belethors General goods!\n");
			options();
			
		}
		public static void main(String[] args) {
			System.out.print("Welcome to Belethors General goods!\n");
			options();
			
		}

}
