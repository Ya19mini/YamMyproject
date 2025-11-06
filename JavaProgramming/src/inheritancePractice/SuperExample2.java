package inheritancePractice;


	class Process{
		void eat() {
			System.out.println("eating...");
		}
 
	}

	class eat1 extends Process {
		void eat() {
			//System.out.println("eating.. Bread.");
		super.eat();  //invoking immediate parent
		}
	
	}
