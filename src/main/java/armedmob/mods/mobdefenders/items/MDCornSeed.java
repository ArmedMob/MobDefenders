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
public class MDCornSeed extends ItemSeeds implements ItemModelProvider {

    public MDCornSeed() {

        super(MDBlocks.cropCorn, Blocks.FARMLAND);
        setUnlocalizedName("seedCorn");
        setRegistryName("seedCorn");
        setCreativeTab(Refereneces.MDFood);
    }

    @Override
    public void registerItemModel(Item item) {

        Main.proxy.registerItemRenderer(item, 0, "seedCorn");
    }
}
