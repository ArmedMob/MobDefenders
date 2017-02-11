package armedmob.mods.mobdefenders.items;

import armedmob.mods.mobdefenders.Main;
import armedmob.mods.mobdefenders.Refereneces;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

/**
 * Created by Armed Mob on 2/5/2017.
 */
public class MDItemBase extends Item implements ItemModelProvider {

    protected String name;

    public MDItemBase(String name) {

        this.name = name;
        setUnlocalizedName(name);
        setRegistryName(name);
        setCreativeTab(Refereneces.MDItems);
    }

    @Override
    public void registerItemModel(Item item) {

        Main.proxy.registerItemRenderer(item, 0, name);
    }

    @Override
    public MDItemBase setCreativeTab(CreativeTabs tab) {

        super.setCreativeTab(tab);
        return this;
    }
}
