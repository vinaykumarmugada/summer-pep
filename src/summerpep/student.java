package summerpep;
import java.util.*;

public class student extends Person{
	int roll;
	int marks[] = new int[5];
	int sum=0;
	public int  calculateAverage()
	{
		for(int i=0;i<marks.length;i++)
		{
			
			sum += marks[i];
		}
		int average  = sum / marks.length;
		return average;
	}
	Scanner sc  = new Scanner(System.in);
	for(int i=0;i<marks.length;i++);
	{
		marks[i] = sc.nextInt();
	}
	

}
