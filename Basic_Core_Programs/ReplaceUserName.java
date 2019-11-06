package basic_Core_Programs;
import java.util.Scanner;

public class ReplaceUserName {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str1,str2,str3,str4;

		str1="Hello Username, How are you?";
		System.out.println(str1);

		str2="Username";

		System.out.println("Enter the Name to replace Username.");
		str3=sc.nextLine();

		str4=str1.replace(str2, str3);
		System.out.println("New Template:-"+str4);
	}
}
