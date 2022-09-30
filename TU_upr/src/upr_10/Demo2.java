package upr_10;

public class Demo2 {

	public static void main(String[] args) {
		Animal animal = new Animal();
		System.out.println(animal.speak());
		System.out.println(animal.move());
		
//		Snake snake = new Snake();
		Animal snake = new Animal(){
			@Override
			public String speak() {
				return "I am a snake. SSSSSSSSSSSSSSS.";
			}
			@Override
			public String move() {
				return "I am a snake. I can sneak in every hole.";
			}
		};

		System.out.println(snake.speak());
		System.out.println(snake.move());
	}

}
