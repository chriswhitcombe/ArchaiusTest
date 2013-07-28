package test;

import com.netflix.config.DynamicBooleanProperty;
import com.netflix.config.DynamicPropertyFactory;
import com.netflix.config.DynamicStringProperty;

public class Main {

    public static void main(String[] args){

        //Check my custom property
        DynamicStringProperty greeting =
                DynamicPropertyFactory.getInstance().getStringProperty("word", "default");
        System.out.println("greeting is " + greeting.get());

        //Check that JMX is on
        DynamicBooleanProperty on =
                DynamicPropertyFactory.getInstance().getBooleanProperty("archaius.dynamicPropertyFactory.registerConfigWithJMX", false);
        System.out.println("enabled " + on.get());


        /*
         * Sleep for a while so I can boot jConsole
         */
        try{
            Thread.sleep(100000);
        }catch(InterruptedException ex){
            ex.printStackTrace();
        }
    }
}
