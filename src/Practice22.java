
public class Practice22 
{
	public static void main(String[] args) 
	{
		String s = "My name is xyz";
        String[] wordsArr = s.split(" "); // broke string into array delimited by " " whitespace
        StringBuilder sb = new StringBuilder();
        for(int i = 0 ; i< wordsArr.length; i++)
        { // loop over array length
            if(i%2 == 0) // if 1st word, 3rd word, 5th word..and so on words 
            {
            	sb.append(wordsArr[i]); // add  the word as it is
            }
            else sb.append(new StringBuilder(wordsArr[i]).reverse()); // else use StringBuilder revrese() to reverse it
            sb.append(" ");// add a whitespace in between words
        }
        System.out.println(sb.toString().trim()); 
	}
}
