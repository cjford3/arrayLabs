
public class twoDimensional {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		int[][] firstArray = { {8,9,10,11}, {12,13,14,15}};
		int[][] secondArray = { {3,31,32,33}, {43}, {4,5,6}};

		char[] vowels = {'a','e','i', 'o', 'u'};
		for (char v: vowels)
		{
			System.out.printf("%c", v);
		}
		
		for (int [] row: secondArray) 
		{
			for (int i : row)
			{
				System.out.printf("%d\t", i);
			}
		}

	}

}

