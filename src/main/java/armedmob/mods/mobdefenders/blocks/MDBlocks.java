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
    //public static MDOreBase oreBrass;
    public static MDOreBase oreCopper;
    public static MDOreBase oreTin;

    //Blocks
    public static MDBlockBase blockAluminum;
    //public static MDBlockBase blockBrass;
    public static MDBlockBase blockCopper;
    public static MDBlockBase blockTin;

    //Crops
    public static CornCropBlock cropCorn;

    public static void init() {

        //Ores
        oreAluminum = register(new MDOreBase(Material.ROCK, "oreAluminum", "oreAluminum",  4f, 6f, "pickaxe", 2));
        //oreBrass = register(new MDOreBase(Material.ROCK, "oreBrass", "oreBrass, 4f, 6f, "pickaxe", 2));
        oreCopper = register(new MDOreBase(Material.ROCK, "oreCopper", "oreCopper", 4f, 6f, "pickaxe", 2));
        oreTin = register(new MDOreBase(Material.ROCK, "oreTin", "oreCopper", 4f, 6f, "pickaxe", 2));

        //Blocks
        blockAluminum = register(new MDBlockBase(Material.IRON, "blockAluminum", 4f, 6f, "pickaxe", 2));
        //blockBrass = register(new MDBlockBase(Material.IRON, "blockBrass", 4f, 6f, "pickaxe", 2));
        blockCopper = register(new MDBlockBase(Material.IRON, "blockCopper", 4f, 6f, "pickaxe", 2));
        blockTin = register(new MDBlockBase(Material.IRON, "blockTin", 4f, 6f, "pickaxe", 2));

        //Crops
        cropCorn = register(new CornCropBlock(), null);
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
