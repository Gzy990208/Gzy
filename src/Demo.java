import java.util.Scanner;


public class Demo {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int i=0,j=7,n;
		System.out.print("�����룺");
		n= in.nextInt();
		
		while(i<n){
			if(j%7==0){
				System.out.println("��"+(i+1)+"�Σ�"+j);
				i++;
			}else if(j%10==7){
				System.out.println("��"+(i+1)+"�Σ�"+j);
				i++;
			}
			j++;
		}
	}
	
}
