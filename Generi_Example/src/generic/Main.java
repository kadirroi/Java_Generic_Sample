package generic;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Generic<String> user=new Generic<String>();
		user.setFirst_name("Hazal");
		user.setLast_name("Kýlýç");
		
		System.out.println(user.getFirst_name());
		System.out.println(user.getLast_name());
		
		Generic<Integer> user2=new Generic<Integer>();
		user2.setFirst_name(5);
		user2.setLast_name(5);
		
		System.out.println(user2.getFirst_name());
		System.out.println(user2.getLast_name());
		
	}

}
