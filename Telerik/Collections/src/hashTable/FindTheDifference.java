package hashTable;
import java.util.Set;
import java.util.HashSet;
import java.util.Iterator;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
import java.util.List;
public class FindTheDifference {
	public static void main(String[] args) {
		String s="abcdeee";
		String t="abcdeeed";
	    System.out.println(findTheDifference(s,t));
    
	}

   public static char findTheDifference(String s, String t) {
    	
		Map<Character,Integer>mapS=new HashMap<>();
    	Map<Character,Integer>mapT=new HashMap<>();
    	char result=' ';
    	boolean isDone=false;
    	
    	for (Character character : s.toCharArray()) {
    		if (mapS.containsKey(character)) {
				mapS.put(character, mapS.get(character)+1);
				continue;
			}
			mapS.put(character, 1);
		}
    	
    	for (Character character : t.toCharArray()) {
    		if (mapT.containsKey(character)) {
				mapT.put(character, mapT.get(character)+1);
				continue;
			}
			mapT.put(character, 1);
		}
    	
    	Set<Character>setS=mapS.keySet();
    	Set<Character>setT=mapT.keySet();
    	for (Character character : setT) {
			if (!setS.contains(character)) {
				result=character;
				isDone=true;
				break;
			}
		}
    	
    	if (!isDone) {
			for (Character character : setT) {
				int symbolT=mapT.get(character);
				int symbolS=mapS.get(character);
				if (symbolT!=symbolS) {
					result=character;
					break;
				}
			}
		}
    	return result;
    	
   }
}
