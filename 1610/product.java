import java.util.Scanner;
class Product {
	int productId;
	String productName;
	int quantity;
	double price;
	static String shopName="ABC General store";
	static int productcount=0;
	Product(int productId,String productName,int quantity, double price){
		this.productId=productId;
		this.productName=productName;
		this.quantity=quantity;
		this.price=price;
		productCount++;
	}
	void display() {
		System.out.println("Product ID:"+productId);
		System.out.println("Product Name:"+productName);
			System.out.println("Quantity:"+quantity);
			System.out.println("Price:"+price);
			Sytem.out.println();
	}
	static void
		displayShopDetails() {
			System.out.println("Shop Name:"+shopNmae);
			System.out.println("Total Products:"+productCount);
		}
}
public class ProductDemo {
	public static void
		main(String[] args) {
			Product p1=new
				Product(101,"pen",10,20.50);
			Product p2=new
				Product(102,"Notebook",5,50.00);
			product p3=new
				Product(103,"pencil",20,10.00);
			product p4=new
				Product(104,"Eraser",15,5.00);
			product p5=new
				Product(105,"Bag",3,500.00);
			p1.display();
			p2.display();
			p3.display();
			p4.display();
			p5.display();
			Product.displayShopDetails();
		}
}

