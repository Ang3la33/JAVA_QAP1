// QAP 1 - Problem # 3
// Author: Angela Flynn-Smith

public class Time {
    
    // Attribute(s)
    private int hour;
    private int minute;
    private int second;

    // Constructor
    public Time(int hour, int minute, int second) {
        this.hour = hour;
        this.minute = minute;
        this.second = second;
    }

    // Method(s)
    public int getHour() {
        return this.hour;
    }

    public int getMinute() {
        return this.minute;
    }

    public int getSecond() {
        return this.second;
    }

    public void setHour(int hour) {
        this.hour = hour;
    }

    public void setMinute(int minute) {
        this.minute = minute;
    }

    public void setSecond(int second) {
        this.second = second;
    }

    public void setTime(int hour, int minute, int second) {
        this.hour = hour;
        this.minute = minute;
        this.second = second;
    }

    public String toString() {
        // Formats time (hh:mm:ss) with leading zero
        return String.format("%02d:%02d:%02d", hour, minute, second);
    }

    public Time nextSecond() {
        // Method to advance time by 1 second

        // Increment second by 1
        this.second++;

        // Handle rollover for seconds, minutes, & hours
        if (this.second == 60) {
            this.second = 0;
            this.minute++;
            if (this.minute == 60) {
                this.minute = 0;
                this.hour++;
                if (this.hour == 24) {
                    this.hour = 0;
                }
            }
        }

        //Return the current instance
        return this;
    }

    public Time previousSecond() {
        // Method to decrement time by 1 second

        // Decrement second by 1
        this.second--;

        // Handle rollunder for seconds, minutes & hours
        if (this.second < 0) {
            this.second = 59;
            this.minute--;
            if (this.minute < 0) {
                this.minute = 59;
                this.hour--;
                if (this.hour < 0) {
                    this.hour = 23;
                }
            }
        }

        // Return the current instance
        return this;
    }

}
