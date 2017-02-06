package armedmob.mods.mobdefenders.blocks;

import armedmob.mods.mobdefenders.Main;
import armedmob.mods.mobdefenders.Refereneces;
import armedmob.mods.mobdefenders.items.ItemModelProvider;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraftforge.oredict.OreDictionary;

/**
 * Created by Armed Mob on 2/6/2017.
 */
public class MDBlockBase extends Block implements ItemModelProvider {

    protected String name;

    public MDBlockBase(Material material, String name, float resistance, float hardness, String toolClass, int harvestLevel) {

        super(material);

        this.name = name;

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
    public MDBlockBase setCreativeTab(CreativeTabs tab) {

        super.setCreativeTab(tab);
        return this;
    }
}
