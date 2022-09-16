package sub04;


class Apple{
	
	private String country;
	private int price;
	
	public Apple(String country, int price) {
		this.country = country;
		this.price = price;
	}
	
	public void show() {
		System.out.println("원산지 : "+country);
		System.out.println("가격 : "+price);
	}
}

class Banana{
	
	private String country;
	private int price;
	
	public Banana(String country, int price) {
		this.country = country;
		this.price = price;
	}
	
	public void show() {
		System.out.println("원산지 : "+country);
		System.out.println("가격 : "+price);
	}
}

class Grape extends Object{
	private String country;
	private int price;
	
	public Grape(String country, int price) {
		this.country = country;
		this.price = price;
	}
	
	public void show() {
		System.out.println("원산지 : "+country);
		System.out.println("가격 : "+price);
	}
}

public class Test06 {
	public static void main(String[] args) {
		
		Test06 test = new Test06();
		
		Apple apple 	= new Apple("한국", 3000);
		Banana banana 	= new Banana("필리핀", 2000);
		Grape grape 	= new Grape("미국", 3000);
		
		
		
		public void showInfo(???? fruit){
			if(fruit ??? Apple) {
				Apple apple = ????? fruit;
				apple.show();
				
			}else if(fruit ??? Banana) {
				Banana banana = ???? fruit;
				banana.show();
				
			}else if(fruit ??? Grape) {
				Grape grape = ??? fruit;
				grape.show();
			}
		}
	}

}
