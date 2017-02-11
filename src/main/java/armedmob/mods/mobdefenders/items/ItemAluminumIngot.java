package armedmob.mods.mobdefenders.items;

import armedmob.mods.mobdefenders.utilities.References;
import net.minecraft.item.Item;
import net.minecraft.util.ResourceLocation;

/**
 * Created by Armed Mob on 2/10/2017.
 */
public class ItemAluminumIngot extends Item {

    public ItemAluminumIngot(String unlocalizedName, String registryName) {

        setUnlocalizedName(unlocalizedName);
        this.setRegistryName(new ResourceLocation(References.MODID, registryName));
    }
}
