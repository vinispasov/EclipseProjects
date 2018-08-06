package hashTable;
import java.util.HashSet;
public class JewelsAndStones {
	public static void main(String[] args) {
		System.out.println(numJewelsInStones("aA","aAAbbbb"));
	}
	public static int numJewelsInStones(String J, String S) {
		int counter=0;
        HashSet<Character>symbols=new HashSet<>();
        for (int i = 0; i < J.length(); i++) {
			symbols.add(J.charAt(i));
		}
        
        for (Character character : S.toCharArray()) {
			if(symbols.contains(character)) {
				++counter;
			}
		}
      return counter;
    }

}
