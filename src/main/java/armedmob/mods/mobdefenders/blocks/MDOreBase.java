package armedmob.mods.mobdefenders.blocks;

import armedmob.mods.mobdefenders.Main;
import armedmob.mods.mobdefenders.Refereneces;
import armedmob.mods.mobdefenders.items.ItemModelProvider;
import armedmob.mods.mobdefenders.items.ItemOreDict;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraftforge.oredict.OreDictionary;

/**
 * Created by Armed Mob on 2/6/2017.
 */
public class MDOreBase extends Block implements ItemModelProvider, ItemOreDict {

    protected String oreName;
    protected String name;

    public MDOreBase(Material material, String name, String oreName, float resistance, float hardness, String toolClass, int harvestLevel) {

        super(material);

        this.name = name;
        this.oreName = oreName;

        setUnlocalizedName(name);
        setRegistryName(name);
        setResistance(resistance);
        setHardness(hardness);
        setHarvestLevel(toolClass, harvestLevel);
        setCreativeTab(Refereneces.MDBlocks);
    }

    @Override
    public void registerItemModel(Item item) {

        Main.proxy.registerItemRenderer(item, 0, name);
    }


    @Override
    public void initOreDict() {

        OreDictionary.registerOre(oreName, this);
    }

    @Override
    public MDOreBase setCreativeTab(CreativeTabs tab) {

        super.setCreativeTab(tab);
        return this;
    }
}
