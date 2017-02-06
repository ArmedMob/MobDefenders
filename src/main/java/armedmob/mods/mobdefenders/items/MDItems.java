package armedmob.mods.mobdefenders.items;

import armedmob.mods.mobdefenders.Refereneces;
import armedmob.mods.mobdefenders.items.food.MDFoodItem;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.util.FoodStats;
import net.minecraftforge.fml.common.registry.GameRegistry;

/**
 * Created by Armed Mob on 2/5/2017.
 */
public class MDItems {

    //Ingots
    public static MDItemBase ingotAluminum;
    public static MDItemBase ingotBrass;
    public static MDItemBase ingotCopper;
    public static MDItemBase ingotLead;
    public static MDItemBase ingotTin;

    //Nuggets
    public static MDItemBase nuggetAluminum;
    public static MDItemBase nuggetBrass;
    public static MDItemBase nuggetCopper;
    public static MDItemBase nuggetLead;
    public static MDItemBase nuggetTin;

    //Seeds
    public static MDCornSeed seedCorn;

    //Foods
    public static MDFoodItem corn;

    //Gears
    public static MDItemBase gearAluminum;
    public static MDItemBase gearCopper;
    public static MDItemBase gearTin;

    public static void init() {

        //Ingots
        ingotAluminum = register(new ItemOre("ingotAluminum", "ingotAluminum"));
        ingotBrass = register(new ItemOre("ingotBrass", "ingotBrass"));
        ingotCopper = register(new ItemOre("ingotCopper", "ingotCopper"));
        ingotLead = register(new ItemOre("ingotLead", "ingotLead"));
        ingotTin = register(new ItemOre("ingotTin", "ingotTin"));

        //Nuggets
        nuggetAluminum = register(new ItemOre("nuggetAluminum", "nuggetAluminum"));
        nuggetBrass = register(new ItemOre("nuggetBrass", "nuggetBrass"));
        nuggetCopper = register(new ItemOre("nuggetCopper", "nuggetCopper"));
        nuggetLead = register(new ItemOre("nuggetLead", "nuggetLead"));
        nuggetTin = register(new ItemOre("nuggetTin", "nuggetTin"));

        //Seeds
        seedCorn = register(new MDCornSeed());

        //Food
        corn = register(new MDFoodItem("corn", "cropCorn",3, 0.6f, false));

        //Gears
        gearAluminum = register(new ItemOre("gearAluminum", "gearAluminum"));
        gearCopper = register(new ItemOre("gearCopper", "gearCopper"));
        gearTin = register(new ItemOre("gearTin", "gearTin"));
    }

    private static <T extends Item> T register(T item) {

        GameRegistry.register(item);

        if (item instanceof ItemModelProvider) {

            ((ItemModelProvider)item).registerItemModel(item);
        }

        if (item instanceof ItemOreDict) {

            ((ItemOreDict)item).initOreDict();
        }

        return item;
    }
}
