package scrap;


import java.util.HashSet;


public class Application_Scrap {

	public static void main(String[] args) {
		
  HashSet<Integer> hashBrowns = new HashSet<Integer>();
hashBrowns.add(13);
//hashBrowns.add(23);
//hashBrowns.add(72);

//System.out.println(hashBrowns);

Object [] a = hashBrowns.toArray();
//System.out.println(a[1]);
//System.out.println(a[0]);
System.out.println(a.hashCode());
}
	
	1/2  x 1/2 
	
}