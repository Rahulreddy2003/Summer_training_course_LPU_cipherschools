import java.util.*;
public class CheckPalindrome{
static boolean checkPalindrome(String s)
{
s= s.toLowerCase();
int l = 0;
int r = s.length() -1;
while (l<r)
{
if(s.charAt(l) = s.charAt(r))
{
return false;
}
l++;
r--;
}
return true;
}
public static void main(String[] args)
{
String s= "MADAVI";
String s2= "CIPHER";
String s3 = "Madam";

System.out.println(checkPalindrome(s));
System.out.println(checkPalindrome(s2));
System.out.println(checkPalindrome(s3));

}
}

=====================
import java.util.*;
static boolean isAnagram(String s1, String s2)
{
if(s1.length() ! = s2.length()) return false;

s1 = s1.toLowerCase();
s2 = s2.toLowerCase();

int n= s1.length();

int freqArr1[] = new int[26];
int freqArr2[] = new int[26];

for(int i=0; i<n; i++)
{
int index1 = s1.charAt(i) - 'a';
freqArr1[index1]++;

int index2 = s2.charAt(i) - 'a';
freqArr1[index2]++;

for(int i =0; i<26; i++)
{
if(freqArr[i]!=freqArr2[i])
{
return false;
}

}
return true;
}

public static void main(String[] args)
{
System.out.println(isAnagram("CAT", "TAC"));
System.out.println(isAnagram("CAT", "TAG"));
System.out.println(isAnagram("CAT", "TACC"));

}
}
