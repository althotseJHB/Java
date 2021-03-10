public class Clock {//1.  Declare a class called Clock which is saved in a file called Clock.java
    int hours;  //2. Declare a property called hours of type int.
    int minutes;

    String getTime() { //3. Declare a method called getTime which tales no parameters and returns a string.
        return hours + ":" + minutes;
    }

    void setTime(int currentHours, int currentMinutes) //4. The method setTime takes two parameters and returns void(i.e. nothing)
    {
        hours = currentHours; //5. This statement assigns the value of currentHours passed in as a parameter to the property hours.
        minutes = currentMinutes;
    }
}