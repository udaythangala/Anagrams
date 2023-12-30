import java.util.*;
class Anagrams{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		String str1 = sc.next();
		String str2 = sc.next();
		sc.close();
		char[] arr1 = str1.toLowerCase().toCharArray();
		char[] arr2 = str2.toLowerCase().toCharArray();
		if(str1.length() == str2.length())
		{
			Arrays.sort(arr1);
			Arrays.sort(arr2);
			if(Arrays.equals(arr1, arr2))
			{
				System.out.println("Anagrams");
			}
			else{
				System.out.println("NOt Anagrams");
			}
		}
	}
}
