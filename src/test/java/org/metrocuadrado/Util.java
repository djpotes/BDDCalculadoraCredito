package org.metrocuadrado;

public class Util {
    public static void threadWait(long seconds){
        try {
            Thread.sleep(seconds);
        }catch (InterruptedException ex){
        }
    }
}