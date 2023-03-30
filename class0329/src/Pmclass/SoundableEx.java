package Pmclass;

public class SoundableEx {
	
	private static void printSound(Soundable soundable) {
		System.out.println(soundable.sound());
	}
	private static void print(Soundable soundable) {
		System.out.println(soundable.num());
	}
	
	public static void main(String[] args) {

		printSound(new Cat());
		printSound(new Dog());
		
		print(new Cat());
		print(new Dog());
		
		
		
		
		
		
		
				
			}
	
	}

