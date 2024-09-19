package homeworkAssignment;

public class HomeworkAssignment3 {
	public static void main(String[] args) {
		System.out.println(isAllUnique("stack"));
		System.out.println(isAllUnique("unique"));
}

public static boolean isAllUnique(String input)
{
	char[] inputArray = new char[input.length()];
	for (int i = 0; i < input.length(); i++)
	{
		inputArray[i] = input.charAt(i);
	}
	for (int i = 0; i < input.length()-1; i++)
	{
		char temp = inputArray[i];
		for (int j = i+1; j< input.length();j++)
		{
			if(temp == inputArray[j])
			{
				return true;
			}
		}
	}
	return false;
}
}
