package armedmob.mods.mobdefenders;

import armedmob.mods.mobdefenders.tabs.MDTabBlocks;
import armedmob.mods.mobdefenders.tabs.MDTabFood;
import armedmob.mods.mobdefenders.tabs.MDTabItems;
import net.minecraft.creativetab.CreativeTabs;

/**
 * Created by Armed Mob on 2/5/2017.
 */
public class Refereneces {

    public static final String MODID = "md";
    public static final String VERSION = "0.0.8b";
    public static final String NAME = "Mob Defenders";

    public static final String CLIENT_PROXY = "armedmob.mods.mobdefenders.proxies.ClientProxy";
    public static final String SERVER_PROXY = "armedmob.mods.mobdefenders.proxies.CommonProxy";

    public static final MDTabItems MDItems = new MDTabItems(CreativeTabs.getNextID(), "MDItems");
    public static final MDTabBlocks MDBlocks = new MDTabBlocks(CreativeTabs.getNextID(), "MDBlocks");
    public static final MDTabFood MDFood = new MDTabFood(CreativeTabs.getNextID(), "MDFood");
}
