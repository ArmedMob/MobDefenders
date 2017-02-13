package armedmob.mods.mobdefenders.blocks;

import armedmob.mods.mobdefenders.items.ItemModelProvider;
import armedmob.mods.mobdefenders.items.ItemOre;
import armedmob.mods.mobdefenders.items.ItemOreDict;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemBlock;
import net.minecraftforge.fml.common.registry.GameRegistry;

/**
 * Created by Armed Mob on 2/6/2017.
 */
public class MDBlocks {

    //Ores
    public static MDOreBase oreAluminum;
    public static MDOreBase oreBrass;
    public static MDOreBase oreCopper;
    public static MDOreBase oreLead;
    public static MDOreBase oreTin;

    //Blocks
    public static MDOreBase blockAluminum;
    public static MDOreBase blockBrass;
    public static MDOreBase blockCopper;
    public static MDOreBase blockLead;
    public static MDOreBase blockTin;

    //Crops
    public static CornCropBlock cropCorn;
    public static SoybeanCropBlock cropSoybean;

    public static void init() {

        //Ores
        oreAluminum = register(new MDOreBase(Material.ROCK, "oreAluminum", "oreAluminum",  4f, 6f, "pickaxe", 2));
        oreBrass = register(new MDOreBase(Material.ROCK, "oreBrass", "oreBrass", 3f, 5f, "pickaxe", 2));
        oreCopper = register(new MDOreBase(Material.ROCK, "oreCopper", "oreCopper", 4f, 6f, "pickaxe", 2));
        oreLead = register(new MDOreBase(Material.ROCK, "oreLead", "oreLead", 3f, 5f, "pickaxe", 2));
        oreTin = register(new MDOreBase(Material.ROCK, "oreTin", "oreTin", 4f, 6f, "pickaxe", 2));

        //Blocks
        blockAluminum = register(new MDOreBase(Material.IRON, "blockAluminum", "blockAluminum", 4f, 6f, "pickaxe", 2));
        blockBrass = register(new MDOreBase(Material.IRON, "blockBrass", "blockBrass", 3f, 5f, "pickaxe", 2));
        blockCopper = register(new MDOreBase(Material.IRON, "blockCopper", "blockCopper", 4f, 6f, "pickaxe", 2));
        blockLead = register(new MDOreBase(Material.IRON, "blockLead", "blockLead", 3f, 5f, "pickaxe", 2));
        blockTin = register(new MDOreBase(Material.IRON, "blockTin", "blockTin", 4f, 6f, "pickaxe", 2));

        //Crops
        cropCorn = register(new CornCropBlock(), null);
        cropSoybean = register(new SoybeanCropBlock(), null);
    }

    private static <T extends Block> T register(T block, ItemBlock itemBlock) {

            GameRegistry.register(block);
            if (itemBlock != null) {
                GameRegistry.register(itemBlock);

                if (block instanceof ItemModelProvider) {

                    ((ItemModelProvider) block).registerItemModel(itemBlock);
                }

                if (block instanceof ItemOreDict) {

                    ((ItemOreDict)block).initOreDict();
                }

                if (itemBlock instanceof ItemOreDict) {

                    ((ItemOreDict)itemBlock).initOreDict();
                }
            }

        return block;
    }

    private static <T extends Block> T register(T block) {

        ItemBlock itemBlock = new ItemBlock(block);
        itemBlock.setRegistryName(block.getRegistryName());
        return register(block, itemBlock);
    }
}
