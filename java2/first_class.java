import java.util.Scanner;

public class first_class
{
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String text = scanner.nextLine();
		char[] arr = text.toCharArray();
		int j = arr.length;
		char[] arr1 = new char[j];
		int k = arr.length -1;
				
		//your code goes here
		for (int i= 0; i<= arr.length-1; i++){
			   arr1[i] = arr[k-i];
			   //System.out.println(arr[k-i]);
        }
		String result1 = String.valueOf(arr1);
		System.out.println(result1);

	}
//return result1;
}