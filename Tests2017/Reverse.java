package Tests2017;

import java.util.Stack;

public class Reverse {
public static void reverse (Stack t ) {
	Stack a = new Stack () ;
	for (int i = 0; i < t.size(); i++) {
        a.push(t.pop());
	}
}
public static void main(String[] args) {
	Stack t = new Stack ();
	t.add(1);
	t.add(2);
	t.add(3);
	reverse(t);
	//System.out.println(reverse(t));
}
}
