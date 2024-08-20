package InterviewPrep;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.ListIterator;

public class ReverseString {

	public static void main(String[] args) {

		
		
		
		
	}

	public void usingOwnLogic() {
		String givenWord = "Pradheep";
		char[] charArray = givenWord.toCharArray();
		String reversed = "";
		for (int i = charArray.length - 1; i >= 0; i--) {
			reversed = reversed + charArray[i];
		}

		System.out.println(reversed);

	}

	public void usingstringBuffer() {
		String givenWord = "Pradheep";

		StringBuffer buffer = new StringBuffer();
		buffer.append(givenWord);
		System.out.println(buffer.reverse());
	}
	
	public void usingCollection() {
		String given = "Pradeep";
		char[] charArray = given.toCharArray();
		List<Character> l=new ArrayList<Character>();
		for(Character  c :charArray) {
			l.add(c);
		}
		Collections.reverse(l);
		ListIterator itr = l.listIterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
	}

}
