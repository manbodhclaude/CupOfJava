
public class Main {

	public static void main(String[] args) {
		
		Student a = new Student();
		
		a.setStudentName("Billy Joker");
		a.setStudentId(52647);
		a.setCollegeName("University of Expensive Learning");
		a.setAddress("5555 Sycamore st. Pennsylvania, PA");

		System.out.println(a.getAddress());
		System.out.println(a.getCollegeName());
		System.out.println(a.getStudentId());
		System.out.println(a.getStudentName());

		
	}

}
