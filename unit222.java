//switch statement
public class Switch222 {
    public static void main(String[] args)
    {
        int day = 1;
        
        String dayString;
  
        // switch statement with int data type
        switch (day) {
        case 1:///////////////////////////day=1
            dayString = "Monday";/////     |
            break;//////////////stop///////v
        case 2:////////////////////////////|
            dayString = "Tuesday";/////////|
            break;//////////////stop///////|
        case 3:////////////////////////////v
            dayString = "Wednesday";///////|
            break;//////////////stop///////|
        case 4:////////////////////////////|
            dayString = "Thursday";////////v
            break;//////////////stop///////|
        case 5:////////////////////////////|
            dayString = "Friday";//////////v
            break;//////////////stop///////|
        case 6:////////////////////////////|
            dayString = "Saturday";////////v
            break;////////////stop/////////|
        case 7:////////////////////////////|
            dayString = "Sunday";//////////v
            break;//////////////stop///////|
        default:///////////////////////////|
            dayString = "Invalid day";/////v
        }//////////////////////////////////|
        System.out.println(dayString);
    }
}
