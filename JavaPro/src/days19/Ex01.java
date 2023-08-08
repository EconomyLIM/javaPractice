package days19;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.Arrays;
import java.util.Collections;
import java.util.StringJoiner;

public class Ex01 {
	public static void main(String[] args) {


		String key = "user.dir";
		String userDir = System.getProperty(key);
		String fileName = "1. Java 팀 구성.txt";
		String path = String.format("%s\\src\\days19\\%s", userDir,fileName);

		String line = null;

		try (FileReader fr = new FileReader(path);
				BufferedReader br = new BufferedReader(fr)){
				
			while ( (line = br.readLine()) != null) {
				if(line.equals("2조")) {
					line = br.readLine();
					System.out.println(line);
					break;
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		String regex = "\\s*,\\s*";
		String [] teamMembers = line.split(regex);
		String [] teamMembers2 = new String[teamMembers.length-1];
		System.out.println(Arrays.toString(teamMembers));
		String teamLeader = null;
		for (int i = 0, index = 0; i < teamMembers.length; i++) {
			if (teamMembers[i].contains("(팀장)")) {
				teamLeader = teamMembers[i].replace("(팀장)","");
//				break;
				continue;
			}
			//팀원
			teamMembers2[index++] = teamMembers[i];
		} //for
		System.out.println(teamLeader);
		Arrays.sort(teamMembers2,Collections.reverseOrder());
//		Arrays.sort(teamMembers2,(n1,n2) -> n2.compareTo(n2));
		System.out.println(Arrays.toString(teamMembers2));
		
		String output = "<ul>";
		output += String.format(	"\r\n<li class=\"leader\">%s</li> \r\n", teamLeader);
		output += "\t<li>"+ String.join("</li>\r\n\t<li>", teamMembers2)+"</li>";
		System.out.println(output);
		StringBuilder sb = new StringBuilder();
		// sb.append ...
		/*
		StringJoiner sj = new StringJoiner("</li>\\r\\n\\t<li>","\\t<li>","</li>");
		sj.add(teamMembers2);
		*/
		
	} //main
}
