package string_Immutable;

public class test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str2 = "Goommd Life";
		String str1 =  str2 ;
		//char[] ch = str1.toCharArray();
		for (int i=0;i<str1.length();i++) {
		int	count=1;
					for(int j=i+1;j<str1.length();j++) {
						if(str1[i]==str1[j]) {
							count++;
							
						}	
			}
					
					if(count>1) {
						System.out.println("duplicate="+ch[i]);
					}
		}
		

	}

	}

}
