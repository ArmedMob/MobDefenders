package armedmob.mods.mobdefenders.items;

import net.minecraftforge.oredict.OreDictionary;

/**
 * Created by Armed Mob on 2/6/2017.
 */
public class ItemOre extends MDItemBase implements ItemOreDict {

    private String oreName;

    public ItemOre(String name, String oreName) {

        super(name);

        this.oreName = oreName;
    }

    @Override
    public void initOreDict() {

        OreDictionary.registerOre(oreName, this);
    }
}
