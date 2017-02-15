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
    public static MDItemBase ingotNickel;
    public static MDItemBase ingotSilver;
    public static MDItemBase ingotTin;

    //Nuggets
    public static MDItemBase nuggetAluminum;
    public static MDItemBase nuggetBrass;
    public static MDItemBase nuggetCopper;
    public static MDItemBase nuggetLead;
    public static MDItemBase nuggetNickel;
    public static MDItemBase nuggetSilver;
    public static MDItemBase nuggetTin;

    //Seeds
    public static MDCornSeed seedCorn;
    public static MDSoybeanSeed seedSoybean;

    //Foods
    public static MDFoodItem corn;
    public static MDFoodItem soybean;

    //Gears
    public static MDItemBase gearAluminum;
    public static MDItemBase gearBrass;
    public static MDItemBase gearCopper;
    public static MDItemBase gearLead;
    public static MDItemBase gearNickel;
    public static MDItemBase gearSilver;
    public static MDItemBase gearTin;

    public static void init() {

        //Ingots
        ingotAluminum = register(new ItemOre("ingotAluminum", "ingotAluminum"));
        ingotBrass = register(new ItemOre("ingotBrass", "ingotBrass"));
        ingotCopper = register(new ItemOre("ingotCopper", "ingotCopper"));
        ingotLead = register(new ItemOre("ingotLead", "ingotLead"));
        ingotNickel = register(new ItemOre("ingotNickel", "ingotNickel"));
        ingotSilver = register(new ItemOre("ingotSilver", "ingotSilver"));
        ingotTin = register(new ItemOre("ingotTin", "ingotTin"));

        //Nuggets
        nuggetAluminum = register(new ItemOre("nuggetAluminum", "nuggetAluminum"));
        nuggetBrass = register(new ItemOre("nuggetBrass", "nuggetBrass"));
        nuggetCopper = register(new ItemOre("nuggetCopper", "nuggetCopper"));
        nuggetLead = register(new ItemOre("nuggetLead", "nuggetLead"));
        nuggetNickel = register(new ItemOre("nuggetNickel", "nuggetNickel"));
        nuggetSilver = register(new ItemOre("nuggetSilver", "nuggetSilver"));
        nuggetTin = register(new ItemOre("nuggetTin", "nuggetTin"));

        //Seeds
        seedCorn = register(new MDCornSeed());
        seedSoybean = register(new MDSoybeanSeed());

        //Food
        corn = register(new MDFoodItem("corn", "cropCorn",3, 0.6f, false));
        soybean = register(new MDFoodItem("soybean", "cropSoybean",3, 0.6f, false));

        //Gears
        gearAluminum = register(new ItemOre("gearAluminum", "gearAluminum"));
        gearBrass = register(new ItemOre("gearBrass", "gearBrass"));
        gearCopper = register(new ItemOre("gearCopper", "gearCopper"));
        gearLead = register(new ItemOre("gearLead", "gearLead"));
        gearNickel = register(new ItemOre("gearNickel", "gearNickel"));
        gearSilver = register(new ItemOre("gearSilver", "gearSilver"));
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
