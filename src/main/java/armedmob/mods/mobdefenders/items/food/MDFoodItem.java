package armedmob.mods.mobdefenders.items.food;

import armedmob.mods.mobdefenders.Main;
import armedmob.mods.mobdefenders.Refereneces;
import armedmob.mods.mobdefenders.items.ItemModelProvider;
import armedmob.mods.mobdefenders.items.ItemOre;
import armedmob.mods.mobdefenders.items.ItemOreDict;
import net.minecraft.item.Item;
import net.minecraft.item.ItemFood;
import net.minecraftforge.oredict.OreDictionary;

/**
 * Created by Armed Mob on 2/6/2017.
 */
public class MDFoodItem extends ItemFood implements ItemModelProvider, ItemOreDict {

    protected String name;
    protected String oreName;

    public MDFoodItem(String name, String oreNameint, int amount, float saturation, boolean wolfFood) {

        super(amount, saturation, wolfFood);

        this.name = name;
        this.oreName = oreName;

        setUnlocalizedName(name);
        setRegistryName(name);
        setCreativeTab(Refereneces.MDFood);
    }

    @Override
    public void registerItemModel(Item item) {

        Main.proxy.registerItemRenderer(this, 0, name);
    }

    @Override
    public void initOreDict() {

        OreDictionary.registerOre(oreName, this);
    }
}
