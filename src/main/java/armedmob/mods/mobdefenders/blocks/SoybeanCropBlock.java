package armedmob.mods.mobdefenders.blocks;

import armedmob.mods.mobdefenders.items.MDItems;
import net.minecraft.block.BlockCrops;
import net.minecraft.item.Item;

/**
 * Created by Armed Mob on 2/6/2017.
 */
public class SoybeanCropBlock extends BlockCrops {

    public SoybeanCropBlock() {

        setUnlocalizedName("cropSoybean");
        setRegistryName("cropSoybean");
    }

    @Override
    protected Item getSeed() {

        return MDItems.seedSoybean;
    }

    @Override
    protected Item getCrop() {

        return MDItems.soybean;
    }
}
