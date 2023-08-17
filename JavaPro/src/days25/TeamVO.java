package days25;

import days24.MemberVO;

//~VO ==value object == 값 읽기 쓰기 객체
//DTO DAO VO
public class TeamVO {
	private String name; // 팀명
	private int totalNumber; // 팀 총인원수
	private String leaderName ; // 팀장명
	public TeamVO() {
		super();
	}
	public TeamVO(String name, int totalNumber, String leaderName) {
		super();
		this.name = name;
		this.totalNumber = totalNumber;
		this.leaderName = leaderName;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getTotalNumber() {
		return totalNumber;
	}
	public void setTotalNumber(int totalNumber) {
		this.totalNumber = totalNumber;
	}
	public String getLeaderName() {
		return leaderName;
	}
	public void setLeaderName(String leaderName) {
		this.leaderName = leaderName;
	}
	@Override
	public String toString() {
		return String.format("[%s(%d명) %s]\n", this.name, this.totalNumber, this.leaderName);
	}
	@Override
	public int hashCode() {
		return this.name.hashCode();
	}
	@Override
	public boolean equals(Object obj) {
		TeamVO vo =(TeamVO) obj;
		return this.name.equals(vo.name);
	}
	
	
	
}
