package string_Immutable;

public class duplicate_strings {

	public static void main(String[] args) {
		String str1 = "Goommd Lifeeee";
		char[] ch = str1.toCharArray();
		for (int i=0;i<ch.length;i++) {
		int	count=1;
					for(int j=i+1;j<ch.length;j++) {
						if(ch[i]==ch[j]) {
							count++;
							ch[j]='0';
						}	    
					}
					if(count>1) {
						System.out.println("duplicate="+ch[i]);
		} 			
		}
	}
	}  
				
		
		

	


