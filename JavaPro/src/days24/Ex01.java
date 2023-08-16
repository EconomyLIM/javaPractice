package days24;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Ex01 {
	public static void main(String[] args) {
		String fileName = ".\\src\\days19\\1. Java 팀 구성.txt";
		String line = null;
		String teamName = null;//key
		MemberVO memberVO = null;
		ArrayList<MemberVO> teamList = null;
		HashMap<String, ArrayList<MemberVO>> teamMap = new LinkedHashMap<>();

		// FileReader , BufferedReader =보조스트림
		try (FileReader fr= new FileReader(fileName);
				BufferedReader br = new BufferedReader(fr)) {
			while ( (line = br.readLine())!= null && !line.equals("")) {

				//				if (line.equals("")) {
				//					break;
				//				}

				teamName = line;// key
				line = br.readLine();
				String [] tNames = line.split("\\s*,\\s*");
				teamList = new ArrayList<MemberVO>();
				for (String tName: tNames) {

					if (tName.contains("(팀장)")) {
						tName = tName.replace("(팀장)","");
						memberVO = new MemberVO(tName,"팀장");
					}else {
						memberVO = new MemberVO(tName,"팀원");
					}
					teamList.add(memberVO);
				}

				teamMap.put(teamName, teamList);
			} //while
			displTeamMember(teamMap);
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	private static void displTeamMember(HashMap<String, ArrayList<MemberVO>> teamMap) {
		Set<Entry<String, ArrayList<MemberVO>>> eSet = teamMap.entrySet();
		Iterator<Entry<String, ArrayList<MemberVO>>> it = eSet.iterator();
		while (it.hasNext()) {
			Entry<String,ArrayList<MemberVO>> entry =it.next();
			String teamName = entry.getKey(); // 팀명
			ArrayList<MemberVO> teamList =  entry.getValue();
			MemberVO teamLeaderVO = teamList.get(0);
			String teamLeader = teamLeaderVO.getName();
			System.out.printf("[%s](%d명) : %s\n", teamName, teamList.size(), teamLeader);
			Iterator<MemberVO> it2 = teamList.iterator();
			int seq = 1;
			if (it2.hasNext()) {
				it2.next();
			}
			while (it2.hasNext()) {
				MemberVO memberVO = it2.next();
				System.out.printf("  [%d] %s\n", seq++, memberVO.getName());
			}
		}
	} 
}
