package chapter06;

public class TeamGroup {


	private TeamMember[] member=new TeamMember[6];
	
	public void init() {
		
		member[0]=new TeamMember("김청우", "여학생");
		member[1]=new TeamMember("김자월","여학생");
		member[2]=new TeamMember("김민석","남학생");
		member[3]=new TeamMember("김태완", "남학생");
		member[4]=new TeamMember("이연승", "남학생");
		member[5]=new TeamMember("지건우", "남학생");
		
	}
	public void Disp() {
		
		for(int i=0; i<member.length;i++) {
			System.out.println("성명:"+(member[i].getName()));
			System.out.println("성별:"+(member[i].getName()));
		}
		
	}
	
	

		

	}


