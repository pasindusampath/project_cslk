import java.util.*;  //Bubble Sort...............2025/04/23 (jp 27)

public class anja {
	
	public static void main (String[] args) {
		int [] ar = {10,15,35,90,4,7,36,80};
		System.out.println("BEfore Short :"+Arrays.toString(ar));
		
		for (int j = 0; j < ar.length; j++)
		{
			for (int i = 0; i < ar.length - 1; i++) {
			if (ar[i] < ar[i + 1]) { 
				int temp = ar[i + 1];
				ar[i + 1] = ar[i];
				ar[i] = temp;
			}
		}
	       System.out.print("After   Short "+j+":" + Arrays.toString(ar));
		}
		
		
	
	
	}
}
