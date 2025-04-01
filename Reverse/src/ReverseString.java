
public class ReverseString {
	public static void main(String[] args) {
		String str ="Akash";
		char[] ch=str.toCharArray();
		String reverse ="";
		for(int i=ch.length-1;i>=0;i--)
		{   
			
			  reverse=reverse+ch[i];  
			System.out.println("Original String >>"+str);
			System.out.println("Reverse String>>"+reverse);
			System.out.println("master");
		}
		
	}

}
