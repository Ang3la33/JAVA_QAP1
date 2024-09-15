// QAP 1 - Problem # 3 Demo
// Author: Angela Flynn-Smith

public class TestTime {
    
    public static void main(String[] args) {

        // Create two time objects (t1 and t2)
        Time t1 = new Time(0,0,0);
        Time t2 = new Time(0,0,0);

        // Set their time to 21:10:15 and 10:20:25 using set methods
        t1.setTime(21, 10, 15);
        t2.setTime(10, 20, 25);

        // Call nextSecond() method for t1
        t1.nextSecond();

        // Call previousSecond() method for t2
        t2.previousSecond();

        // Display the final times for t1 and t2 using "toString()" method
        System.out.println("t1 = " + t1.toString());
        System.out.println("t2 = " + t2.toString());

    }
}
