package chapter1;

public class Section2_6 {
	
	class Foo<T extends Number> {}
	class Bar<T, X extends T> {}

	public static void main(String[] args) {//境界付きパラメータ
		// TODO 自動生成されたメソッド・スタブ
		Foo<Integer> foo = new Foo<>();
		Bar<Number, Double> bar = new Bar<>();
	}
}
