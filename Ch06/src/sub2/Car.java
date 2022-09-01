package sub2;

public interface Car {
	
	//인터페이스는 추상메서드 밖에 없어서 abstract 생략해도 됨
	public abstract void speedUp(int speed);
	public  void speedDown(int speed);
	public abstract void show();

}
