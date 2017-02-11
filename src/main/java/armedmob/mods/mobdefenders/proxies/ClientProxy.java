package armedmob.mods.mobdefenders.proxies;

import armedmob.mods.mobdefenders.Refereneces;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraftforge.client.model.ModelLoader;

/**
 * Created by Armed Mob on 2/5/2017.
 */
public class ClientProxy extends CommonProxy {

    @Override
    public void registerItemRenderer(Item item, int meta, String id) {
        ModelLoader.setCustomModelResourceLocation(item, meta, new ModelResourceLocation(Refereneces.MODID + ":" + id, "inventory"));
    }
}
