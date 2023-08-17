package days25;


import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Set;
import java.util.Map.Entry;

import days24.MemberVO;

public class Ex01 {
	public static void main(String[] args) {
		String fileName = ".\\src\\days19\\1. Java 팀 구성.txt";
		String line = null;
		String teamName = null;//key
		MemberVO memberVO = null;
		
		TeamVO teamVO = null;
		int totalNumber = 0;
		String teamLeaderName = null;
		
		ArrayList<MemberVO> teamList = null;
		HashMap<TeamVO, ArrayList<MemberVO>> teamMap = new LinkedHashMap<>();

		try (FileReader fr= new FileReader(fileName);
				BufferedReader br = new BufferedReader(fr)) {
			while ( (line = br.readLine())!= null && !line.equals("")) {

				teamName = line;// key
				line = br.readLine();
				String [] tNames = line.split("\\s*,\\s*");
				teamList = new ArrayList<MemberVO>();
				totalNumber =0;
				for (String tName: tNames) {

					if (tName.contains("(팀장)")) {
						teamLeaderName = tName = tName.replace("(팀장)","");
						memberVO = new MemberVO(tName,"팀장");
					}else {
						memberVO = new MemberVO(tName,"팀원");
					}
					totalNumber = totalNumber+1;
					teamList.add(memberVO);
				}
				
				teamVO = new TeamVO(teamName,totalNumber , teamLeaderName);
				teamMap.put(teamVO, teamList);
			} //while
			// 만약 key가  중복이 된다면 x 팀명이 같으면 key가 중복이 된다고 처리애햐 한다.
			teamVO = new TeamVO("1조", 1, "홍길동");
			if (!teamMap.containsKey(teamVO)) {
				teamList = null;
				teamMap.put(teamVO, teamList);
			} else {
				System.out.println(">>>>1조는 키");
			}
			
			displTeamMember(teamMap);
		} catch (Exception e) {
			e.printStackTrace();
			}

	}

	public static void displTeamMember(HashMap<TeamVO, ArrayList<MemberVO>> teamMap) {
		Set<Entry<TeamVO, ArrayList<MemberVO>>> eSet = teamMap.entrySet();
		Iterator<Entry<TeamVO, ArrayList<MemberVO>>> it = eSet.iterator();
		TeamVO teamVO = null;
		while (it.hasNext()) {
			Entry<TeamVO,ArrayList<MemberVO>> entry =it.next();
			teamVO = entry.getKey(); // 팀명
			
			ArrayList<MemberVO> teamList =  entry.getValue();
			System.out.printf("%s", teamVO);
			try {
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
			catch (NullPointerException e) {
				System.out.println(" *============*");
				System.out.println(" =*==========*=");
				System.out.println(" ==*========*==");
				System.out.println(" ===*======*===");
				System.out.println("   ________________ ");
				System.out.println("  |팀원이 존재하지 않습니다|");
				System.out.println("   ----------------------- ");
				System.out.println(" ===*======*===");
				System.out.println(" ==*========*==");
				System.out.println(" =*==========*=");
				System.out.println(" *============*");
			}catch (Exception e) {
				e.printStackTrace();
				}
			
		}
	} 
}