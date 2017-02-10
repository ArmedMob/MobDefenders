package armedmob.mods.mobdefenders;

import armedmob.mods.mobdefenders.proxies.CommonProxy;
import armedmob.mods.mobdefenders.utilities.References;
import armedmob.mods.mobdefenders.utilities.Utils;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

/**
 * Created by Armed Mob on 2/10/2017.
 */
@Mod(modid = References.MODID, name = References.NAME, version = References.VERSION, useMetadata = true)
public class Main {

    @Mod.Instance(References.MODID)
    public static Main instance;

    @SidedProxy(clientSide = References.CLIENT_PROXY, serverSide = References.SERVER_PROXY, modId = References.MODID)
    public static CommonProxy proxy;

    @EventHandler
    public void preInit(FMLPreInitializationEvent preEvent) {

        Utils.getLogger().info("Pre Initialization Event");

        proxy.registerRenders();
    }

    @EventHandler
    public void init(FMLInitializationEvent event) {

        Utils.getLogger().info("Initialization Event");
    }

    @EventHandler
    public void postInit(FMLPostInitializationEvent postEvent) {

        Utils.getLogger().info("Post Initialization Event");
    }
}
