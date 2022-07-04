package Q4;

public class ArmstrongNumber {
	public static boolean checkArmstrong (int num)
	{
		int number, temp, total =0;
		number = num;
		while (number !=0)
		{
			temp =number % 10;
			total =total+ temp*temp*temp;
			number /= 10;
		}
		if(total == num)
			return true;
		else
			return false;
		
	}

}
