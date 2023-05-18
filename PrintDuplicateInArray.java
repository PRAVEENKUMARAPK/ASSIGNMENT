package week4;

public class PrintDuplicateInArray {
	public static void main (String[] args) {
		int[] arr= {10,30,50,70,90,40,};
		int len=arr.length;
		System.out.println(len);
		System.out.println();
		
		for (int i=0; i < arr.length; i++) {
			for (int j = i+1; j < arr.length; j++ ) {
				if(arr[i]==arr[j]) {
					System.out.println(arr[i]);
					
				}
			}
		}
		
	}

}
