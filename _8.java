import java.util.Scanner;
public class _8 {
	static int isleft(String[] left, String[] right)
	{
	    int f = 0;
	    for (int i = 0; i < left.length; i++) {
	        for (int j = 0; j < right.length; j++)
	        {
	            if (left[i].charAt(0) == right[j].charAt(0)) {
	                System.out.println("Grammar is left recursive");
	                f = 1;
	            }
	        }
	    }
	    return f;
	}

	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	    System.out.println("Enter no of product");
	    int n = sc.nextInt();
	    String[] left = new String[n];
	    String[] right = new String[n];
	    for (int i = 0; i < n; i++) {
	        System.out.println("Enter left product");
	        left[i] = sc.next();
	        System.out.println("Enter right product");
	        right[i] = sc.next();
	    }

	    System.out.println("The productions are");
	    for (int i = 0; i < n; i++) {
	        System.out.println(left[i] + "->" + right[i]);
	    }
	    int flag = 0;
	    flag = isleft(left, right);
	    if (flag == 1) {
	        System.out.println("Removing left recursion");
	    } else {
	        System.out.println("No left recursion");
	    }
	}
	  }
