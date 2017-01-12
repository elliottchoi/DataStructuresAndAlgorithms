//For the sake of this example, I have not moved day or enumtest into their own file
//If you want the code to compile you shoudl designate their own file 
public class enumExample {

	    public static void main(String[] args) {
	    	//Create a EnumTest Object that looks at Keyword Monday in the enum Day Class
	        EnumTest firstDay = new EnumTest(Day.MONDAY);
	        firstDay.tellItLikeItIs();
	        EnumTest thirdDay = new EnumTest(Day.WEDNESDAY);
	        thirdDay.tellItLikeItIs();
	        EnumTest fifthDay = new EnumTest(Day.FRIDAY);
	        fifthDay.tellItLikeItIs();
	        EnumTest sixthDay = new EnumTest(Day.SATURDAY);
	        sixthDay.tellItLikeItIs();
	        EnumTest seventhDay = new EnumTest(Day.SUNDAY);
	        seventhDay.tellItLikeItIs();
	    }

	}

//Serves as "keyword"
public enum Day {
    SUNDAY, MONDAY, TUESDAY, WEDNESDAY,
    THURSDAY, FRIDAY, SATURDAY 
}

public class EnumTest {
    Day day;
    
    public EnumTest(Day day) {
        this.day = day;
    }
    
    public void tellItLikeItIs() {
        switch (day) {
            case MONDAY:
                System.out.println("Mondays are bad.");
                break;
                    
            case FRIDAY:
                System.out.println("Fridays are better.");
                break;
                         
            case SATURDAY: case SUNDAY:
                System.out.println("Weekends are best.");
                break;
                        
            default:
                System.out.println("Midweek days are so-so.");
                break;
        }
    }
 
}
