package armedmob.mods.mobdefenders.utilities;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/**
 * Created by Armed Mob on 2/10/2017.
 */
public class Utils {

    private static Logger logger;

    public static Logger getLogger() {
        if(logger == null) {
            logger = LogManager.getFormatterLogger(References.MODID);
        }

        return logger;
    }
}
