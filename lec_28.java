package Strings;

public class StringStudy1 {
	public static void main(String[] args) {
	    String text = "I'm pursuing my bachelor's in Lovely Professional University";

	    String[] result = text.split(" ");


	    System.out.print("result = ");
	    for (String str : result) {
	      System.out.print(str + ", ");
	    }
	      
	    //--------------------------------------  
	      String str1 = "Cipher";
	      String str2 = "Schools";
	      int result1;

	      result1 = str1.compareTo(str2);

	      System.out.println(result1+",     ");
	    //----------------------------------------  
	      String str3 = "Java Programming";
	      System.out.println(str3.charAt(2)+",     ");
	    //-----------------------------------------
	      String str4 = "CipherSchools";
	      int result2;
	      result2 = str4.indexOf('s');

	      System.out.println(result2+",       ");
	      //-------------------------------------------
	      String str5 = "Cipher";
	      String str6 = "Schools";
	      System.out.println(str5.concat(str6));
	      //------------------------------------------
	      
	    }

}
