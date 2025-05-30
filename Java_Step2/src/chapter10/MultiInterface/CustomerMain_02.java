package chapter10.MultiInterface;

public class CustomerMain_02 {

	public static void main(String[] args) {

		Customer customer = new Customer();
		System.out.println("---Buy---");
		Buy buyer = customer;
		buyer.buy();
		buyer.order();

		System.out.println("---Sell---");
		Sell seller = customer;
		seller.sell();
		seller.Sellorder();
		seller.order();

		// seller 부모 | customer 자식
		if (seller instanceof Customer) { // **내 자식인지 또는 부모인지 물어보는 역할**
			System.out.println("---Down Casting---");
			Customer customer2 = (Customer) seller;
			customer2.buy();
			customer2.sell();
			customer2.Sellorder();

		}

	}

}
