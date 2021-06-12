import java.util.Scanner;
class Product
{
	int pcode, i, n,price;
    String pname;
   
	 public static void main(String args[]) {
		 
        Product p1 = new Product();
        Product p2 = new Product();
        Product p3 = new Product();

		System.out.println("ENTER THE PRODUCT DETAILS:\n");
		p1.get();
		System.out.println("ENTER THE PRODUCT DETAILS:\n");
		p2.get();
		System.out.println("ENTER THE PRODUCT DETAILS:\n");
		p3.get();
		
		if(p1.price<p2.price && p1.price<p3.price)
			{
				System.out.println("\n "+p1.price+" is smallest price");
				p1.put();
			}
		else if(p2.price<p3.price)
			{
				System.out.println("\n "+p2.price+" is smallest price");
				p2.put();
			}
		else 
			{
				System.out.println("\n "+p3.price+" is smallest price");
				p3.put();
			}
	
	 }
	
     void get() {
		Scanner sc = new Scanner(System.in);
        	
		    System.out.println("Enter product code: ");
			pcode = sc.nextInt();
			
			System.out.println("Enter product price: ");
			price = sc.nextInt();
			
			System.out.println("Enter product name: ");
			pname = sc.next();   
      
    }
	void put()
		{
			System.out.println("\n DETAILS OF SMALLEST PRODUCT \n");	
			System.out.println("product code : " + pcode);
			System.out.println("product name : " + pname);
			
		}

}



