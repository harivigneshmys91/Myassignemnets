package week1.day1;

public class Mobile {
	
	
	String mobileBrandName = "IPHONE";
	char mobileLogo = 'l';
	short noOfMobilePiece = 1;
	int modelNumber = 8765;
	long mobileImeiNumber = 12345;
	float mobilePrice=44.3f;
	boolean isDamaged=false;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
				Mobile mob=new Mobile();
				System.out.println(mob.mobileBrandName);
				System.out.println(mob.mobileLogo);
				System.out.println(mob.noOfMobilePiece);
				System.out.println(mob.modelNumber);
				System.out.println(mob.mobileImeiNumber);
				System.out.println(mob.mobilePrice);
				System.out.println(mob.isDamaged);
	}

}
