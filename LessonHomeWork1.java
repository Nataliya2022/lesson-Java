class LessonHomeWork1 {
	 
	public static void main(String[] args) {
		printThreeWords();
		checkSumSign();
		printColor();
		compareNumbers();
	}

    static void printThreeWords(){
        System.out.println("Orange");
		System.out.println("Banana");
		System.out.println("Apple");
    }

    static void checkSumSign() {
		int a = 15;
		int b = 1;
		if (a+b >= 0) {
		    System.out.println ("positive");
     	} else {		
		    System.out.println ("negative");
		}
    }
	
	static void printColor() {
		int value = 101;
		if (value <= 0) {
		    System.out.println ("Red");
		} else if (value <= 100) {
			System.out.println ("Yellow");
		} else {
			System.out.println ("Green");
		}
	}
	
	static void compareNumbers() {
		int a = 10;
		int b = 10;
		System.out.println (a >= b? "a >= b" : "a <= b");
	}
	}