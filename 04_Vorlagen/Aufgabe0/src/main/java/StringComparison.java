public class StringComparison {
	public static void main(String[] args) {
		String oo = "OO";
		String prog = "Prog";
		String ooProg = "OOProg";

		System.out.println(oo == oo); 						// true due to String pooling making this the same Object
		System.out.println(oo == "OO"); 					// true due to String pooling as == compares references to the same Object in heap
		System.out.println(oo == new String(oo)); 			// false as explicitly new object is created so reference is different
		System.out.println(oo == new String("OO"));	// false as explicitly new object is created
		System.out.println(oo + prog == ooProg); 			// false not the same object
		System.out.println(oo + prog == oo + prog);			// false as both + operations create a new object each
		System.out.println(ooProg == "OO" + "Prog");		// true string concatenation applies as var is compared to a constant

		System.out.println("---");

		System.out.println(oo.equals("OO")); 						// true as the content of var oo is compared to the literal OO
		System.out.println(oo.equals(new String("OO"))); 	// true as two different objects with same content are compared for content
		System.out.println((oo + prog).equals(ooProg)); 			// true as the concatenated variable is equals in content to ooProg
		System.out.println((oo + prog).equals(oo + prog)); 			// true
		System.out.println(ooProg.equals("OO" + "Prog")); 			// true
	}
}
