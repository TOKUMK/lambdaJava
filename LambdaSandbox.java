
public class LambdaSandbox {

	public static void main(String[] args){

		StringLengthLambda myLamda = (String s) -> s.length();

		System.out.println(myLambda.getLength("Hello Lambda"));

	
	}

	interface StringLengthLambda{
		int getLength(String s)
	}

}
