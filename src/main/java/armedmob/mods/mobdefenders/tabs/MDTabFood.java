package armedmob.mods.mobdefenders.tabs;

import armedmob.mods.mobdefenders.items.MDItems;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

/**
 * Created by Armed Mob on 2/6/2017.
 */
public class MDTabFood extends CreativeTabs {

    public MDTabFood(int index, String label) {

        super(index, label);
    }

    @Override
    public Item getTabIconItem() {

        return MDItems.corn;
    }
}
