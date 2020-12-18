
public class test {

	public static void main(String[] args) {
	
		Swap<Integer> s = new Swap(100, 200);
		System.out.println(s.toString());
		s.setFirst(1);
		System.out.println("Set first element 1");
		System.out.println(s.toString());
		System.out.println("Swap the elements");
		s.swap();
		System.out.println(s.toString());
		System.out.println();
		Swap<Character> s1 = new Swap('a', 'b');
		System.out.println(s1.toString());
		System.out.println("Swap the elements");
		s1.swap();
		System.out.println(s1.toString());
		System.out.println();
		Swap<String> s2 = new Swap("Gogo", "Dari");
		System.out.println(s2.toString());
		System.out.println("Swap the elements");
		s2.swap();
		System.out.println(s2.toString());
	}

}
