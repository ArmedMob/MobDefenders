package armedmob.mods.mobdefenders.tabs;

import armedmob.mods.mobdefenders.blocks.MDBlocks;
import armedmob.mods.mobdefenders.items.MDItems;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

/**
 * Created by Armed Mob on 2/6/2017.
 */
public class MDTabBlocks extends CreativeTabs {

    public MDTabBlocks(int index, String label) {

        super(index, label);
    }

    @Override
    public Item getTabIconItem() {

        return Item.getItemFromBlock(MDBlocks.blockAluminum);
    }
}
