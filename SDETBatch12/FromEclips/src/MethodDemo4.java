
public class MethodDemo4 {

	double discount(boolean isSaleOn, double price, double discount) {
		if(isSaleOn) {
			return (price -  price * discount);
		} else {
			return price;
		}
	}
	
	public static void main(String[] args) {
		MethodDemo4 obj = new MethodDemo4();
		System.out.println(obj.discount(false, 100, .15));
		System.out.println(obj.discount(true, 100, .15));
		
	}
}
