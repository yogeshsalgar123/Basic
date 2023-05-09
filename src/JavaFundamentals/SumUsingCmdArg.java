
        //RunTime Exception  :  Index 0 out of bounds for length 0

package JavaFundamentals;

public class SumUsingCmdArg {

	public static void main(String[] args) {

		int num1,num2,sum;
		
		num1=Integer.parseInt(args[0]);
		num2=Integer.parseInt(args[1]);
		
		sum = num1+ num2;
		
		System.out.println(sum);
	}

}
