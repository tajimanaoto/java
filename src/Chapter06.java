
public class Chapter06 {
	public static void main(String[] arg) {
		int val = 2 + 5;
		System.out.println(val);
		
		val++;
		System.out.println(val);
		
		val *= 5;
		System.out.println(val);
		
		boolean bool = (val == 50);
		System.out.println(bool);
		
		bool = (50 > val) && (val % 10 == 0 );
		System.out.println(bool);
	}

}
