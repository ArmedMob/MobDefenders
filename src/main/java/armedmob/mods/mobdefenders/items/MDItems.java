package armedmob.mods.mobdefenders.items;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraftforge.fml.common.registry.GameRegistry;

/**
 * Created by Armed Mob on 2/5/2017.
 */
public class MDItems {

    public static MDItemBase ingotAluminum;
    public static MDItemBase ingotCopper;
    public static MDItemBase ingotTin;
    public static MDItemBase nuggetAluminum;
    public static MDItemBase nuggetCopper;
    public static MDItemBase nuggetTin;

    public static void init() {

        ingotAluminum = register(new MDItemBase("ingotAluminum").setCreativeTab(CreativeTabs.MATERIALS));
        ingotCopper = register(new MDItemBase("ingotCopper").setCreativeTab(CreativeTabs.MATERIALS));
        ingotTin = register(new MDItemBase("ingotTin").setCreativeTab(CreativeTabs.MATERIALS));
        nuggetAluminum = register(new MDItemBase("nuggetAluminum").setCreativeTab(CreativeTabs.MATERIALS));
        nuggetCopper = register(new MDItemBase("nuggetCopper").setCreativeTab(CreativeTabs.MATERIALS));
        nuggetTin = register(new MDItemBase("nuggetTin").setCreativeTab(CreativeTabs.MATERIALS));
    }

    private static <T extends Item> T register(T item) {

        GameRegistry.register(item);

        if (item instanceof MDItemBase) {

            ((MDItemBase)item).registerItemModel();
        }

        return item;
    }
}
