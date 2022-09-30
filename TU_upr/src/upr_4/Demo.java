package upr_4;


public class Demo {

	public static void main(String[] args) {
//		Animal animal = new Animal();
//		animal.setKind("mamal");
//		System.out.println("This animal is "+animal.getKind());
		
		Animal cat1 = new Cat();
		Animal dog1 = new Dog();
//		Tiger t = new Animal();
		
//		if(cat instanceof Cat) {
//			Cat newCat = (Cat)cat;
//			newCat.setNails("sharp nails");
//		}

		Animal[] animals = {cat1,dog1};
		for(Animal animal:animals) {
			System.out.println("Animal said: "+animal.speak1());
		}
		
//		System.out.println("Cat said: "+cat.speak());
//		System.out.println("Dog said: "+dog.speak());
//		System.out.println("Tiger said: "+tiger.speak());
		
		
		//interfaces:

			//Speakable speaker = new Speakable();
			
			Cat cat = new Cat();
			Dog dog = new Dog();
			
			System.out.println("Cat "+cat.walk());
			System.out.println("Dog "+dog.walk());

			System.out.println("Cat said: "+cat.speak());
			System.out.println("Dog said: "+dog.speak());
			
			cat.defaultMethod();
			dog.defaultMethod();
			Speakable.staticMethod();
//			cat.privateDefaultMethod();
//			Speakable.privateStaticMethod();
			
			Speakable[] speakers = {cat,dog};
			for(Speakable speaker:speakers) {
				System.out.println("Speaker said: "+speaker.speak());
			}
			
		}
	}

