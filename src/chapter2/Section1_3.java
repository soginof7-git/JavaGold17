package chapter2;

public class Section1_3 {

	class Inner {
		void print() {System.out.println("Inner");}
	}
	
	static class Nested {
		static void print() {System.out.println("Nested");}
	}
	
	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		Section1_3 outer = new Section1_3();
		Inner inner1 = outer.new Inner();
		Inner inner2 = new Section1_3().new Inner();
		
		Nested nested1 = new Section1_3.Nested();
		Nested nested2 = new Nested();
	}

}

class Main {
	public static void main(String[] args) {
		Section1_3.Inner inner3 = new Section1_3().new Inner();
		Section1_3.Nested nested3 = new Section1_3.Nested();
		
	}
}