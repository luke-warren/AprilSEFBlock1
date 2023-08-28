package org.alarmclock;

public class Application {

    public static void main(String[] args){
       //Pseudocode
       //Alarm goes off
       //Check awake status-- if not awake alarm goes off again
        try {
            boolean isAwake = false;
            String power = "ON";
            System.out.println("Morning time: Its 6am!");

            try {
                isAwake = soundAlarm(power);
            }
            catch(PowerIsOffException e){
                System.out.println(e.getMessage());
            }
            catch(Exception e){
                System.out.println("Unexpected exception " + e.getMessage());
            }

            if(!isAwake){
                throw new InterruptedException("Not awake!");
            }
            else{
                System.out.println("The tank is clean!");
            }
        }
        catch(InterruptedException e){
            String message = e.getMessage();
            // Text mom to come wake me up.

        }
        finally {
            System.out.println("Reminder: set your alarm for tomorrow");
        }

    }

    public static boolean soundAlarm (String power){
        if(power.equals("ON")){
            return true;
        }
        else{
            throw new PowerIsOffException("You forgot to plug in your alarm clock!!");
        }
    }

}












