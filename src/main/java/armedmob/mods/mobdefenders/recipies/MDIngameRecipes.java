package armedmob.mods.mobdefenders.recipies;

import armedmob.mods.mobdefenders.blocks.MDBlocks;
import armedmob.mods.mobdefenders.items.MDItems;
import net.minecraft.init.Blocks;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.crafting.IRecipe;
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
        GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(MDItems.nuggetBrass, 9), MDItems.ingotBrass));
        GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(MDItems.ingotBrass, 9), MDBlocks.blockBrass));
        GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(MDItems.nuggetCopper, 9), MDItems.ingotCopper));
        GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(MDItems.ingotCopper, 9), MDBlocks.blockCopper));
        GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(MDItems.nuggetLead, 9), MDItems.ingotLead));
        GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(MDItems.ingotLead, 9), MDBlocks.blockLead));
        GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(MDItems.nuggetTin, 9), MDItems.ingotTin));
        GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(MDItems.ingotTin, 9), MDBlocks.blockTin));     

        //Shaped
        GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(MDItems.ingotAluminum), "NNN", "NNN", "NNN", 'N', MDItems.nuggetAluminum));
        GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(MDItems.ingotBrass), "NNN", "NNN", "NNN", 'N', MDItems.nuggetBrass));
        GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(MDItems.ingotCopper), "NNN", "NNN", "NNN", 'N', MDItems.nuggetCopper));
        GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(MDItems.ingotLead), "NNN", "NNN", "NNN", 'N', MDItems.nuggetLead));
        GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(MDItems.ingotTin), "NNN", "NNN", "NNN", 'N', MDItems.nuggetTin));
        GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(Item.getItemFromBlock(MDBlocks.blockAluminum)), "III", "III", "III", 'I', MDItems.ingotAluminum));
        GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(Item.getItemFromBlock(MDBlocks.blockBrass)), "III", "III", "III", 'I', MDItems.ingotBrass));
        GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(Item.getItemFromBlock(MDBlocks.blockCopper)), "III", "III", "III", 'I', MDItems.ingotCopper));
        GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(Item.getItemFromBlock(MDBlocks.blockLead)), "III", "III", "III", 'I', MDItems.ingotLead));
        GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(Item.getItemFromBlock(MDBlocks.blockTin)), "III", "III", "III", 'I', MDItems.ingotTin));

        //Smelting
        GameRegistry.addSmelting(new ItemStack(Item.getItemFromBlock(MDBlocks.oreAluminum)), new ItemStack(MDItems.ingotAluminum), 0.0075f);
        GameRegistry.addSmelting(new ItemStack(Item.getItemFromBlock(MDBlocks.oreBrass)), new ItemStack(MDItems.ingotBrass), 0.0075f);
        GameRegistry.addSmelting(new ItemStack(Item.getItemFromBlock(MDBlocks.oreCopper)), new ItemStack(MDItems.ingotCopper), 0.0075f);
        GameRegistry.addSmelting(new ItemStack(Item.getItemFromBlock(MDBlocks.oreLead)), new ItemStack(MDItems.ingotLead), 0.0075f);
        GameRegistry.addSmelting(new ItemStack(Item.getItemFromBlock(MDBlocks.oreTin)), new ItemStack(MDItems.ingotTin), 0.0075f);

        GameRegistry.addSmelting(new ItemStack(Item.getItemFromBlock(MDBlocks.oreNetherAluminum)), new ItemStack(Item.getItemFromBlock(MDBlocks.oreAluminum), 2), 0.075f);
        GameRegistry.addSmelting(new ItemStack(Item.getItemFromBlock(MDBlocks.oreNetherBrass)), new ItemStack(Item.getItemFromBlock(MDBlocks.oreBrass), 2), 0.075f);
        GameRegistry.addSmelting(new ItemStack(Item.getItemFromBlock(MDBlocks.oreNetherCoal)), new ItemStack(Item.getItemFromBlock(Blocks.COAL_ORE), 2), 0.075f);
        GameRegistry.addSmelting(new ItemStack(Item.getItemFromBlock(MDBlocks.oreNetherCopper)), new ItemStack(Item.getItemFromBlock(MDBlocks.oreCopper), 2), 0.075f);
        GameRegistry.addSmelting(new ItemStack(Item.getItemFromBlock(MDBlocks.oreNetherDiamond)), new ItemStack(Item.getItemFromBlock(Blocks.DIAMOND_ORE), 2), 0.075f);
        GameRegistry.addSmelting(new ItemStack(Item.getItemFromBlock(MDBlocks.oreNetherEmerald)), new ItemStack(Item.getItemFromBlock(Blocks.EMERALD_ORE), 2), 0.075f);
        GameRegistry.addSmelting(new ItemStack(Item.getItemFromBlock(MDBlocks.oreNetherGold)), new ItemStack(Item.getItemFromBlock(Blocks.GOLD_ORE), 2), 0.075f);
        GameRegistry.addSmelting(new ItemStack(Item.getItemFromBlock(MDBlocks.oreNetherIron)), new ItemStack(Item.getItemFromBlock(Blocks.IRON_ORE), 2), 0.075f);
        GameRegistry.addSmelting(new ItemStack(Item.getItemFromBlock(MDBlocks.oreNetherLapis)), new ItemStack(Item.getItemFromBlock(Blocks.LAPIS_ORE), 2), 0.075f);
        GameRegistry.addSmelting(new ItemStack(Item.getItemFromBlock(MDBlocks.oreNetherLead)), new ItemStack(Item.getItemFromBlock(MDBlocks.oreLead), 2), 0.075f);
        GameRegistry.addSmelting(new ItemStack(Item.getItemFromBlock(MDBlocks.oreNetherRedstone)), new ItemStack(Item.getItemFromBlock(Blocks.REDSTONE_ORE), 2), 0.075f);
        GameRegistry.addSmelting(new ItemStack(Item.getItemFromBlock(MDBlocks.oreNetherTin)), new ItemStack(Item.getItemFromBlock(MDBlocks.oreTin), 2), 0.075f);
    }
}
