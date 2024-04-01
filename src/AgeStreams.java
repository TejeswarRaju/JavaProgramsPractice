import java.util.HashMap;

public class AgeStreams {
	public static void main(String[] args) {
		HashMap<String, Integer> map = new HashMap<>();
		map.put("teja", 16);
		map.put("rathod", 18);
		map.put("kumble", 19);
		map.put("john", 20);

		// Using entrySet() to get a stream of entries (key-value pairs)
		map.entrySet().stream()
				.filter(entry -> entry.getValue() >= 18)
				.forEach(System.out::println);
	}
}
