package week1.day1;

public class Variables {
	String mobmodel = "one plus";
	int mobweight = 30;
	boolean isFullCharge = true;
	double mobileCost = 70900.012;

	public static void main(String[] args) {
	Variables mobInfo = new Variables();
	System.out.println(mobInfo.mobileCost);
	System.out.println(mobInfo.isFullCharge);
	System.out.println(mobInfo.mobmodel);
	System.out.println(mobInfo.mobweight);

	}

}
