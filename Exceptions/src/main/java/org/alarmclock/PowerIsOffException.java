package org.alarmclock;

public class PowerIsOffException extends RuntimeException{
    public PowerIsOffException(){
        super();
    }

    public PowerIsOffException(String message){
        super(message);
    }

    public PowerIsOffException(String message, Throwable error){
        super("Error: power was off!" + message, error);
    }
}
