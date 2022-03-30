import java.util.Scanner;
public class SumOfNaturalNos {
	public static void main(String[] args) {
		Scanner get=new Scanner(System.in);
		System.out.println("Enter the Natural Number:");
		int n,sum =0;
		n=get.nextInt();
		for(int i=1;i<=n;i++) {
			sum=sum+2*i;
		}
			System.out.println(sum);
		}
	}


