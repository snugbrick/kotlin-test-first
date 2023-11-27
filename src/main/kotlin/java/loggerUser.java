package java;

import java.util.logging.Logger;

/**
 * @author MiracleUR -> github.com/snugbrick
 * @version 1.0.0 2023.11.26 14:21
 */
public class loggerUser {
    
    public static void three(){
        int a=10;
        int b=20;
    }
    public static void useLog(String massage){
        Logger.getAnonymousLogger().info(massage);
    }
}
