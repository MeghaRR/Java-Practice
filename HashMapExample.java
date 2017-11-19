
import java.io.File;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class HashMapExample {

	public static void countWords(String fileName, Map<String, Integer> directory) throws Exception {

		// Map <String,Integer> hm= new HashMap<String,Integer>();
		Scanner sc = new Scanner(new File(fileName));
		while (sc.hasNext()) {
			String text = sc.nextLine();
			System.out.println(text);
			String line[] = text.toLowerCase().trim().replaceAll("[^a-z]", " ").split(" ");  //removes punctuation/numbers and separates the words
			for (String word : line) {
				if (word == null || word.trim().equals("")) {  //removes extra spaces
					continue;
				}
				Integer count = directory.get(word);
				if (count != null) {
					count++;
				} else
					count = 1;
				directory.put(word, count);   //adds the word frequency to the hashmap
				
			}
		}
		sc.close();
	}

	public static void main(String[] args) throws Exception {

		Map<String, Integer> mapObj = new HashMap<String, Integer>();
		// HashMapExample m = new HashMapExample();
		countWords("C:\\Users\\Megha\\workspace\\Prac\\src\\abc.txt", mapObj);

		System.out.println(mapObj);
	}
}