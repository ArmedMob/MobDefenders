package armedmob.mods.mobdefenders.init;

import armedmob.mods.mobdefenders.items.ItemAluminumIngot;
import armedmob.mods.mobdefenders.utilities.References;
import armedmob.mods.mobdefenders.utilities.Utils;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.fml.common.registry.GameRegistry;

/**
 * Created by Armed Mob on 2/10/2017.
 */
public class MDItems {

    public static Item aluminumIngot;

    public static void init() {

        aluminumIngot = new ItemAluminumIngot("aluminum_ingot", "aluminum_ingot");
    }

    public static void register() {

        registerItem(aluminumIngot);
    }

    public static void registerRenders() {

        registerRender(aluminumIngot);
    }

    public static void registerItem(Item item) {

        GameRegistry.register(item);
        Utils.getLogger().info("Registered Item " + item.getUnlocalizedName().substring(5));
    }

    public static void registerRender(Item item) {

        ModelLoader.setCustomModelResourceLocation(item, 0, new ModelResourceLocation(new ResourceLocation(References.MODID, item.getUnlocalizedName().substring(5)), "inventory"));
        Utils.getLogger().info("Register render for " + item.getUnlocalizedName().substring(5));
    }
}
