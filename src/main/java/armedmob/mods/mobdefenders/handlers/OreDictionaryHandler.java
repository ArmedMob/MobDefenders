package armedmob.mods.mobdefenders.handlers;

import armedmob.mods.mobdefenders.init.MDBlocks;
import armedmob.mods.mobdefenders.init.MDItems;
import net.minecraft.item.ItemStack;
import net.minecraftforge.oredict.OreDictionary;

/**
 * Created by Armed Mob on 2/10/2017.
 */
public class OreDictionaryHandler {

    public static void registerOreDictionary() {

        //Ingots
        OreDictionary.registerOre("ingotAluminum", new ItemStack(MDItems.aluminumIngot));

        //Blocks
        OreDictionary.registerOre("oreAluminum", MDBlocks.aluminum_ore);
    }
}
