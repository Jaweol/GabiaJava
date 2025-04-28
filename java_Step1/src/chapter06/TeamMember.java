package chapter06;

public class TeamMember {


	public String TeamName; //팀
	public String meName;//팀장 
	public String mPhone;//팀장 전화번호 
	public String sName;
	public String name;
	public String gender;
	
	//기본 생성자
	public TeamMember() {
		
	}
	
	//Overload
	public TeamMember(String name, String gender) {
		this.name=name;
		this.gender=gender;
		
	}
	
	//get //setter
	
	
	
	public String getTeamName() {
		return TeamName;
	}
	public void setTeamName(String teamName) {
		TeamName = teamName;
	}
	public String getMeName() {
		return meName;
	}
	public void setMeName(String meName) {
		this.meName = meName;
	}
	public String getmPhone() {
		return mPhone;
	}
	public void setmPhone(String mPhone) {
		this.mPhone = mPhone;
	}
	public String getsName() {
		return sName;
	}
	public void setsName(String sName) {
		this.sName = sName;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
		
	
	

		
		
	

}
