package days23;

import java.io.FileReader;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Ex07 {
	public static void main(String[] args) {
		//days20.Ex01.java. 파일 읽어서
		//hashmap에 저장 - key +value
		//							'a' 10
		
		String fileName =".\\src\\days20\\Ex08.java";
		int code = -1;
		char one;
		HashMap<Character, Integer> hmap = new HashMap<Character, Integer>();
		
		try(FileReader fr = new FileReader(fileName)) {
			
			while ( (code = fr.read()) != -1) {
				one = (char) code;
				// 읽어온 문자key가 hmap에 존재한다면 value 값을 1증가 시키고 존재하지 않으면 새로 앤트리 추가
				/*
				if (hmap.containsKey(one)) {
					int value = hmap.get(one);
					hmap.put(one, value+1);
				}else {
//					hmap.put(one, 1);
					
				} //if else
				*/
				hmap.put(one, hmap.getOrDefault(one, 0) +1);
			} // while
			Set<Entry<Character, Integer>> skv =  hmap.entrySet();
			Iterator<Entry<Character, Integer>>it= skv.iterator();
			while (it.hasNext()) {
				Map.Entry<Character, Integer> entry = it.next();
				char key =  entry.getKey();
				int value=  entry.getValue();
				if( 'A' <= Character.toUpperCase(key) && Character.toUpperCase(key)<='Z' ) {
				System.out.printf("'%c' (%d) : %s \n",key, value,"#".repeat(value));
				} else {
					continue;
				}
			} // while
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	} //main
} 
