package sub07;


class Artists
{
	public String name;
	public String country;
	public int birth;
	
	public Artists(String name, String country, int birth) {
		this.name = name;
		this.country = country;
		this.birth = birth;
	}
	
	

	public String show() {
		return String.format("%s, %s, %d", name, country, birth);
	}
}

public class Test02 {
	public static void main(String[] args) {
		
		Artists[] famousArts = {
				
				// 객체 생성
				
		};
		
		for(Artists art : famousArts) {
			System.out.println(art.show());
		}
		
	
	}

}
