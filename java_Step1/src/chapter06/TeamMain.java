package chapter06;

public class TeamMain {

	public static void main(String[] args) {

		TeamGroup team=new TeamGroup();
		
		team.init();
		team.Disp();
		
		
		TeamMember t=new TeamMember();
		
		t.setName("김청우");
		System.out.println("팀장이름: "+t.getName());
		
		t.setmPhone(t.getmPhone());
		
		t.setsName(t.getsName());
	}

}
