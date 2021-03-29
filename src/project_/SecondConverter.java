package project_;

public class SecondConverter {

	public static void main(String[] args) {
		int s, m, h, d;
		s = 100000;
		d = s / 43200;
		s = s % 43200;
		h = s / 3600;
		s = s % 3600;
		m = s / 60;
		s = s % 60;
		

		System.out.println( d +"일" + h+ "시간"+ m + "분" + s + "초");
		
		if(s>60*60*24*365) {
			System.out.println("more than 1 year");
		}
		else {
			System.out.println("less than 1 year");
		}
	
	}

}
