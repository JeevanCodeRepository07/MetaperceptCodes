package metaperceptcodes;

public class ValidString {
	public static void main(String[] args) {
		
		ValidString v=new ValidString();
		String email="test01*gmail.com";
		v.cheakmail(email);
	}
		public void cheakmail(String email) {
	
		
		
		String s="@gmail.com";
		String ee=email.substring(email.length()-10);
		
		
		if(ee.equals(s)) {
			System.out.println("Sting is valid ");
			
		}
		else {
			System.out.println("String not valid");
		}
	}

}
