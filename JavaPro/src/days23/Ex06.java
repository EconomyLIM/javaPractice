package days23;

import java.util.Collection;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Ex06 {
	public static void main(String[] args) {
		/* Map 인터페이스를 구현한 컬렉션 클래스
		 *  1. key + value 한 쌍 관리
		 *  2. Entry = key+value
		 *  3. key 중복허용x
		 *  	value 중복허용 o
		 *  4. Hashmap (신)
		 *  	 Hashtable (구)
		 *  5. Hashmap을 사용하도록 권장.
		 *  6. 해싱(Hashing)? 
		 *  	- 해시 함수(hash function)을 이용해서 데이터를 해시테이블(hash table)에 저장하고 검색하는 기법 
		 *  	- 해시함수 ? 데이터가 저장되어 있는 곳을 알려주는 함수 
		 *  				  데이터를 빠르게 찾을 수 있다.
		 *  	- 데이터를 저장(key + value) 키를 해시 함수에 넣으면 배열의 한 요소를 얻어오고  다시 그 배열에 연결된 LinkedList에 데이터를 저장하는 방식
		 */
		//	id		name
		HashMap<String, String> hm = new HashMap<String, String>();
//		Hashtable<String, String> hm2 = new Hashtable<String, String>(); //HashMap, Hashtable 똑같음 but Hashmap 권장
		 /*
		  * 해시테이블 
		  */
		
		hm.put("admin", "관리자");
		hm.put("hong", "홍길동");

		System.out.println(hm);

		hm.put("hong", "홍중복"); // 키가 중복될때 에러발생x 새로운 value 저장
		System.out.println(hm);

		hm.put("root", "관리자");
		System.out.println(hm);

		System.out.println("-".repeat(46));

		// 모든 key 조회
		Set<String> ks =  hm.keySet();
		Iterator<String> it = ks.iterator();
		while (it.hasNext()) {
			String key = (String) it.next();
			System.out.println(key);
		} //while

		// 모든 value 값 조회
		Collection<String> vSet = hm.values();
		Iterator<String>it2= vSet.iterator();
		while (it2.hasNext()) {
			String value = it2.next();
			System.out.println(value);
		}
		
		hm.containsKey("hong"); //true/false
		hm.containsValue("홍중복"); //true/false
		String value2 =  hm.get("root");
		value2 =  hm.getOrDefault("kim", "익명");
		hm.replace("root", "관리자", "루트루트");
		
		
		System.out.println("-".repeat(46));
		// root 키를 알때 value 값이 뭔지 알고 싶다
		String value =  hm.get("root");
		System.out.println(value);
		System.out.println("-".repeat(46));
		displHm(hm);
	}
	/*[1] 이거 시험임
	 * // key : value
		// key : value
		// key : value
	private static void displHm(HashMap<String, String> hm) {
		Set<String> ks =  hm.keySet();
		Iterator<String> it = ks.iterator();
		while (it.hasNext()) {
			String key = (String) it.next();
			System.out.println(key+": " + hm.get(key));
		} //while
	} // displHm
	 */

	//[2]
	private static void displHm(HashMap<String, String> hm) {
		Set<Entry<String, String>> kvSet =  hm.entrySet();
		Iterator<Entry<String, String>> it = kvSet.iterator();
		while (it.hasNext()) {
			Map.Entry<String, String> entry = it.next();
			String key =  entry.getKey();
			String value=  entry.getValue();
			System.out.printf("e_%s : e_%s \n", key,value);
		}
	}  // displHm

}
