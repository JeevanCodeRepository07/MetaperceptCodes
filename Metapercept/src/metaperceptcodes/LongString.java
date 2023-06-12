package metaperceptcodes;

public class LongString {
	
	public static void main(String[] args) {
		String s="dummy text of the printing and typesetting industry";
		String w[]=s.split(" ");
		int len =0;
		 for(int i=0;i<w.length;i++) {
			 if(len<w[i].length()) {
				 
				 len=w[i].length();
				 
			 
		 }
	}
		 for(int i=1;i<w.length;i++) {
			 if(len==w[i].length()) {
				 System.out.println(w[i]);
				 
			 }
			 
		 }
	}
	}
	



