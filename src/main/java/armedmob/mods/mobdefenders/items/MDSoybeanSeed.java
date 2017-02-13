package armedmob.mods.mobdefenders.items;

import armedmob.mods.mobdefenders.Main;
import armedmob.mods.mobdefenders.Refereneces;
import armedmob.mods.mobdefenders.blocks.MDBlocks;
import net.minecraft.init.Blocks;
import net.minecraft.item.Item;
import net.minecraft.item.ItemSeeds;

/**
 * Created by Armed Mob on 2/6/2017.
 */
public class MDSoybeanSeed extends ItemSeeds implements ItemModelProvider {

    public MDSoybeanSeed() {

        super(MDBlocks.cropSoybean, Blocks.FARMLAND);
        setUnlocalizedName("seedSoybean");
        setRegistryName("seedSoybean");
        setCreativeTab(Refereneces.MDFood);
    }

    @Override
    public void registerItemModel(Item item) {

        Main.proxy.registerItemRenderer(item, 0, "seedSoybean");
    }
}
