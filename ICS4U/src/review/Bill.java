package review;

import java.text.DecimalFormat;

public class Bill {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		
		double HST = 59.95 * 0.13;
        double total = HST + 59.95;
        double recieved = 80.00;
        double change = recieved - total;
        
        DecimalFormat number = new DecimalFormat("####.00");
        
        
        
        System.out.println("BILL");
        System.out.println();
        System.out.println("SKIRT----$59.95");
        System.out.println("HST------$" + number.format(HST));
        System.out.println();
        System.out.println("TOTAL----$" + number.format(total));
        
        System.out.println("RECIEVED-$" + number.format(recieved));
        System.out.println();
        System.out.println("CHANGE---$" + number.format(change));
		

	}

}
