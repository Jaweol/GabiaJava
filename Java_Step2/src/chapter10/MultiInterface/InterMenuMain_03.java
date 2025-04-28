package chapter10.MultiInterface;

public class InterMenuMain_03 implements Inter_Menu3 {

	public static void main(String[] args) {

		InterMenuMain_03 im = new InterMenuMain_03();

		// 부모(Inter_Menu1)=자식(InterMenuMain_03)
		Inter_Menu1 im1 = im; // 업캐스팅
		Inter_Menu2 im2 = im; // 업캐스팅
		Inter_Menu3 im3 = im; // 업캐스팅
		System.out.println("----Inter_Menu1---");
		System.out.println(im1.jajang());
		System.out.println(im1.jjambong());
		im1.show();

		System.out.println("----Inter_Menu2---");
		System.out.println(im2.tangsuyuck());

		System.out.println("----Inter_Menu3---");
		System.out.println(im3.boggembab());

	}

	@Override
	public String jajang() {
		return "짬뽕";
	}

	@Override
	public String jjambong() {
		return "꿔바로우";
	}

	@Override
	public String tangsuyuck() {
		return "마라샹궈";
	}

	@Override
	public String boggembab() {
		return "곱창";
	}

}
