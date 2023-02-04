package Module7.encapsulation2;

public class DemoPiza {

	public static void main(String[] args) {


		Pizza p1 = new Pizza("small",3);
		
		System.out.println(p1);
		
		System.out.println(p1.getToppings());
		System.out.println(p1.getSize());
		System.out.println("=============================================");
		p1.setToppings(4);
		System.out.println(p1);
		

	}

}
