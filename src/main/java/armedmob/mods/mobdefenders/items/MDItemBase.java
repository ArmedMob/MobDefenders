package armedmob.mods.mobdefenders.items;

import armedmob.mods.mobdefenders.Main;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

/**
 * Created by Armed Mob on 2/5/2017.
 */
public class MDItemBase extends Item {

    protected String name;

    public MDItemBase(String name) {

        this.name = name;
        setUnlocalizedName(name);
        setRegistryName(name);
    }

    public void registerItemModel() {

        Main.proxy.registerItemRenderer(this, 0, name);
    }

    @Override
    public MDItemBase setCreativeTab(CreativeTabs tab) {

        super.setCreativeTab(tab);
        return this;
    }
}
