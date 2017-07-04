package corejava.usecase13;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

public class MapSorter {
	
	public static void main(String[] args) {
		Map<String, Integer> map = new HashMap<>();
		map.put("Five", 5);
		map.put("Two", 2);
		map.put("Ten", 10);
		map.put("Nine", 9);
		
		mapSortByValue(map);
		
	}
	
	public static void mapSortByValue(Map<String, Integer> map) {
		
		
		List<Entry<String, Integer>> entries = new ArrayList<>(map.entrySet());
		
		Collections.sort(entries, new Comparator<Entry<String, Integer>>() {

			@Override
			public int compare(Entry<String, Integer> entry1,
					Entry<String, Integer> entry2) {
				return entry1.getValue().compareTo(entry2.getValue());
			}
		});
		
		
		for(Entry<String, Integer> entry: entries) {
			System.out.println("key " + entry.getKey()+" Value "+entry.getValue());
		}
	}
	
	
}
