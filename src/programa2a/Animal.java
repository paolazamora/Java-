package programa2a;

public class Animal {
    public String color;
    public int patas;
    
    public Animal() {
    	this.color="cafe";
    	this.patas = 4;
    }
    public Animal (String color, int patas){
    	this.color =color;
    	this.patas =patas;
    }
    
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Animal a = new Animal();
		Animal b =new Animal("negro", 4);
		
		System.out.println( "Hola mundo..........");

	}

}
