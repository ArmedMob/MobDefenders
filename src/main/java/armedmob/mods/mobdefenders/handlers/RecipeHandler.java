package armedmob.mods.mobdefenders.handlers;

import armedmob.mods.mobdefenders.init.MDBlocks;
import armedmob.mods.mobdefenders.init.MDItems;
import armedmob.mods.mobdefenders.utilities.Utils;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.registry.GameRegistry;

/**
 * Created by Armed Mob on 2/10/2017.
 */
public class RecipeHandler {

    public static void registerCraftingRecipes() {



        Utils.getLogger().info("Registered MD Crafting Recipes!");
    }

    public static void registerSmeltingRecipes() {

        GameRegistry.addSmelting(MDBlocks.aluminum_ore, new ItemStack(MDItems.aluminumIngot), 0.0333f);

        Utils.getLogger().info("Registered MD Smelting Recipes!");
    }
}
