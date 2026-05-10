package chapter1;

import java.util.ArrayList;
import java.util.List;

public class Section2_5 {//ジェネリックメソッド
	
	<T> List<T> foo() {
		return new ArrayList<T>();
	}
	
	static <E> void bar(List<E> list) {
		for(E e : list) {
			System.out.println(e);
		}
	}

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		
		Section2_5 obj = new Section2_5();
		List<Integer> list1 = obj.foo();
		List<Integer> list2 = obj.<Integer>foo();
		
		list1.add(10);
		list2.add(20);
		
		Section2_5.bar(list1);
		Section2_5.<Integer>bar(list2);
	}
}




