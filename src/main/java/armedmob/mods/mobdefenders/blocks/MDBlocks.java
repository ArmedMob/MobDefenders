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

    //Nether Ores
    public static MDOreBase oreNetherAluminum;
    public static MDOreBase oreNetherBrass;
    public static MDOreBase oreNetherCoal;
    public static MDOreBase oreNetherCopper;
    public static MDOreBase oreNetherDiamond;
    public static MDOreBase oreNetherEmerald;
    public static MDOreBase oreNetherGold;
    public static MDOreBase oreNetherIron;
    public static MDOreBase oreNetherLapis;
    public static MDOreBase oreNetherLead;
    public static MDOreBase oreNetherRedstone;
    public static MDOreBase oreNetherTin;

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
        oreAluminum = register(new MDOreBase(Material.ROCK, "oreAluminum", "oreAluminum",  5.0f, 3.0f, "pickaxe", 1));
        oreBrass = register(new MDOreBase(Material.ROCK, "oreBrass", "oreBrass", 5.0f, 3.0f, "pickaxe", 1));
        oreCopper = register(new MDOreBase(Material.ROCK, "oreCopper", "oreCopper", 5.0f, 3.0f, "pickaxe", 1));
        oreLead = register(new MDOreBase(Material.ROCK, "oreLead", "oreLead", 5.0f, 3.0f, "pickaxe", 1));
        oreTin = register(new MDOreBase(Material.ROCK, "oreTin", "oreTin", 5.0f, 3.0f, "pickaxe", 1));

        //Nether Ores
        oreNetherAluminum = register(new MDOreBase(Material.ROCK, "oreNetherAluminum", "oreNetherAluminum", 5.0f, 3.0f, "pickaxe", 1));
        oreNetherBrass = register(new MDOreBase(Material.ROCK, "oreNetherBrass", "oreNetherBrass", 5.0f, 3.0f, "pickaxe", 1));
        oreNetherCoal = register(new MDOreBase(Material.ROCK, "oreNetherCoal", "oreNetherCoal", 5.0f, 3.0f, "pickaxe", 0));
        oreNetherCopper = register(new MDOreBase(Material.ROCK, "oreNetherCopper", "oreNetherCopper", 5.0f, 3.0f, "pickaxe", 1));
        oreNetherDiamond = register(new MDOreBase(Material.ROCK, "oreNetherDiamond", "oreNetherDiamond", 5.0f, 3.0f, "pickaxe", 2));
        oreNetherEmerald = register(new MDOreBase(Material.ROCK, "oreNetherEmerald", "oreNetherEmerald", 5.0f, 3.0f, "pickaxe", 2));
        oreNetherGold = register(new MDOreBase(Material.ROCK, "oreNetherGold", "oreNetherGold", 5.0f, 3.0f, "pickaxe", 2));
        oreNetherIron = register(new MDOreBase(Material.ROCK, "oreNetherIron", "oreNetherIron", 5.0f, 3.0f, "pickaxe", 1));
        oreNetherLapis = register(new MDOreBase(Material.ROCK, "oreNetherLapis", "oreNetherLapis", 5.0f, 3.0f, "pickaxe", 1));
        oreNetherLead = register(new MDOreBase(Material.ROCK, "oreNetherLead", "oreNetherLead", 5.0f, 3.0f, "pickaxe", 1));
        oreNetherRedstone = register(new MDOreBase(Material.ROCK, "oreNetherRedstone", "oreNetherRedstone", 5.0f, 3.0f, "pickaxe", 2));
        oreNetherTin = register(new MDOreBase(Material.ROCK, "oreNetherTin", "oreNetherTin", 5.0f, 3.0f, "pickaxe", 1));

        //Blocks
        blockAluminum = register(new MDOreBase(Material.IRON, "blockAluminum", "blockAluminum", 10.0f, 5.0f, "pickaxe", 1));
        blockBrass = register(new MDOreBase(Material.IRON, "blockBrass", "blockBrass", 10.0f, 5.0f, "pickaxe", 1));
        blockCopper = register(new MDOreBase(Material.IRON, "blockCopper", "blockCopper", 10.0f, 5.0f, "pickaxe", 1));
        blockLead = register(new MDOreBase(Material.IRON, "blockLead", "blockLead", 10.0f, 5.0f, "pickaxe", 1));
        blockTin = register(new MDOreBase(Material.IRON, "blockTin", "blockTin", 10.0f, 5.0f, "pickaxe", 1));

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
