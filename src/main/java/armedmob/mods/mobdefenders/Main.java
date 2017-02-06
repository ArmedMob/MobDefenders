package armedmob.mods.mobdefenders;

import armedmob.mods.mobdefenders.blocks.MDBlocks;
import armedmob.mods.mobdefenders.generation.MDWorldGeneration;
import armedmob.mods.mobdefenders.items.MDItems;
import armedmob.mods.mobdefenders.proxies.CommonProxy;
import armedmob.mods.mobdefenders.recipies.MDIngameRecipes;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.registry.GameRegistry;

@Mod(modid = Refereneces.MODID, version = Refereneces.VERSION, name = Refereneces.NAME, useMetadata = true)
public class Main
{

    @Mod.Instance(Refereneces.MODID)
    public static Main instance;

    @SidedProxy(clientSide = Refereneces.CLIENT_PROXY, serverSide = Refereneces.SERVER_PROXY)
    public static CommonProxy proxy;

    @EventHandler
    public void preInit(FMLPreInitializationEvent preEvent)
    {

        MDBlocks.init();
        MDItems.init();
        GameRegistry.registerWorldGenerator(new MDWorldGeneration(), 3);
    }

    @EventHandler
    public void init(FMLInitializationEvent event)
    {

        MDIngameRecipes.init();
    }

    @EventHandler
    public void postInit(FMLPostInitializationEvent postEvent)
    {

    }
}
