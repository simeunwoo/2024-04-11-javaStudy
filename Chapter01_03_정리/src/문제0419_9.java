
public class 문제0419_9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sum=0;
		for(int a=0;a<=12;a++)
		{
			
			if(a%2==0 || a%3==0 || a%6==0)
			sum+=a;

		}
		System.out.println(sum);
	}

}
