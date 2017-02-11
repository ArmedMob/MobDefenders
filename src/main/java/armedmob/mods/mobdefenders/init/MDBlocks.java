package armedmob.mods.mobdefenders.init;

import armedmob.mods.mobdefenders.blocks.BlockAluminumOre;
import armedmob.mods.mobdefenders.utilities.References;
import armedmob.mods.mobdefenders.utilities.Utils;
import net.minecraft.block.Block;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.fml.common.registry.GameRegistry;

/**
 * Created by Armed Mob on 2/10/2017.
 */
public class MDBlocks {

    public static Block aluminum_ore;

    public static void init() {

        aluminum_ore = new BlockAluminumOre("aluminum_ore", "aluminum_ore");

    }

    public static void register() {

        registerBlock(aluminum_ore);
    }

    public static void registerRenders() {

        registerRender(aluminum_ore);
    }

    public static void registerBlock(Block block) {

        GameRegistry.register(block);
        GameRegistry.register(new ItemBlock(block).setRegistryName(block.getRegistryName()));
        Utils.getLogger().info("Registered Block" + block.getUnlocalizedName().substring(5));
    }

    public static void registerRender(Block block) {

       ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(block), 0, new ModelResourceLocation(new ResourceLocation(References.MODID, block.getUnlocalizedName().substring(5)), "inventory"));
       Utils.getLogger().info("Registered render for " + block.getUnlocalizedName().substring(5));
    }
}
