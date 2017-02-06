package armedmob.mods.mobdefenders.recipies;

import armedmob.mods.mobdefenders.blocks.MDBlocks;
import armedmob.mods.mobdefenders.items.MDItems;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.oredict.ShapedOreRecipe;
import net.minecraftforge.oredict.ShapelessOreRecipe;

/**
 * Created by Armed Mob on 2/6/2017.
 */
public class MDIngameRecipes {

    public static void init() {

        //Shapeless
        GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(MDItems.seedCorn), MDItems.corn));
        GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(MDItems.nuggetAluminum, 9), MDItems.ingotAluminum));
        GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(MDItems.ingotAluminum, 9), MDBlocks.blockAluminum));
        GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(MDItems.nuggetCopper, 9), MDItems.ingotCopper));
        GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(MDItems.ingotCopper, 9), MDBlocks.blockCopper));
        GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(MDItems.nuggetTin, 9), MDItems.ingotTin));
        GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(MDItems.ingotTin, 9), MDBlocks.blockTin));

        //Shaped
        GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(MDItems.ingotAluminum), "NNN", "NNN", "NNN", 'N', MDItems.nuggetAluminum));
        GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(MDItems.ingotCopper), "NNN", "NNN", "NNN", 'N', MDItems.nuggetCopper));
        GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(MDItems.ingotTin), "NNN", "NNN", "NNN", 'N', MDItems.nuggetTin));
        GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(Item.getItemFromBlock(MDBlocks.blockAluminum)), "III", "III", "III", 'I', MDItems.ingotAluminum));
        GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(Item.getItemFromBlock(MDBlocks.blockCopper)), "III", "III", "III", 'I', MDItems.ingotCopper));
        GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(Item.getItemFromBlock(MDBlocks.blockTin)), "III", "III", "III", 'I', MDItems.ingotTin));

        //Smelting
        GameRegistry.addSmelting(new ItemStack(Item.getItemFromBlock(MDBlocks.oreAluminum)), new ItemStack(MDItems.ingotAluminum), 0.0075f);
        GameRegistry.addSmelting(new ItemStack(Item.getItemFromBlock(MDBlocks.oreCopper)), new ItemStack(MDItems.ingotCopper), 0.0075f);
        GameRegistry.addSmelting(new ItemStack(Item.getItemFromBlock(MDBlocks.oreTin)), new ItemStack(MDItems.ingotTin), 0.0075f);
    }
}
