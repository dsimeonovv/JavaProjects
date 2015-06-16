package santase;

public class Cat {

	public String name;
	public String color;
	
	public String getName(){
		return this.name;
	}
	
	public void setName(String name){
		this.name = name;
	}
	
	public String getColor(){
		return this.color;
	}
	
	public void setColor(String color){
		this.color = color;
	}
	
	public Cat(){
		this.name = "Unnamed";
		this.color = "gray";
	}
	
	public void sayMiau(){
		System.out.printf("Cat %s say: Miaaaauuu!", name);
	}

}
