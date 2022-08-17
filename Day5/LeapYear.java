public class LeapYear{

	public static void main(String[] args){

		int year = 2021;

		if(year%10==0 && year%400 == 0 || year%100 !=0 && year%4==0){
			
					System.out.println(year +" This is the Leap Year");
				
				}else {
					System.out.println(year +" This is the not Leap Year");
					
				}

	}



}