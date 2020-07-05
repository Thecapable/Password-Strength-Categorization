

import java.util.Scanner;

public class testMethods {
	static int validateStrength(String str) {
		int count=0,out=0;
		boolean f1=false,f2=false,f3=true,f4=true,f5=true,f6=true,f7=false,f8=false;
		
		if(str.length()<8)
			f1=true;
		if(str.length()>16)
			f2=true;

		for(int i=0;i<str.length();i++) {
			if(Character.isUpperCase(str.charAt(i)) && f3) {
			
				f3=false;
			}
			if(Character.isLowerCase(str.charAt(i)) && f4) {
				
				f4=false;
			}
			if(Character.isDigit(str.charAt(i))) {
				
				f5=false;
			}
			if (str.substring(i, i+1).matches("[^A-Za-z0-9 ]")) {
			
				f6=false;
				}
		}
		
		 for(int i=0;i<str.length()-2;i++) {
				if((Character.isUpperCase(str.charAt(i)) && Character.isUpperCase(str.charAt(i+1)) && Character.isUpperCase(str.charAt(i+2)) | (Character.isLowerCase(str.charAt(i)) && Character.isLowerCase(str.charAt(i+1)) & Character.isLowerCase(str.charAt(i+2))))) {
					f7=true;
					break;
				}
			}
		 
		
		 for(int i=0;i<str.length()-1;i++) {
				if((Character.isDigit(str.charAt(i)) & Character.isDigit(str.charAt(i+1)))){
					if((Character.getNumericValue(str.charAt(i+1))==(Character.getNumericValue(str.charAt(i))+1))) {
						f8=true;
					}
				}
		 	}
		 boolean array[]= {f1,f2,f3,f4,f5,f6,f7,f8};
		 
		 for(int i=0;i<array.length;i++) {
			 if(array[i]==false) {
				 count++;
			
			 }
		 }
		
		if(count<2)
			out=0;
		else if((count>=2) && (count<5))
			out=1;
		else if((count>=5) && (count<8))
			out=2;
		else
			out=3;
		
		return out;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		String password=sc.nextLine();
		System.out.println(validateStrength(password));
		sc.close();
	}

}

