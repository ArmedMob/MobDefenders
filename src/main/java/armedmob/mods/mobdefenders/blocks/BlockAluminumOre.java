package armedmob.mods.mobdefenders.blocks;

import armedmob.mods.mobdefenders.utilities.References;
import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.item.Item;
import net.minecraft.util.ResourceLocation;

import javax.annotation.Nullable;
import java.util.Random;

/**
 * Created by Armed Mob on 2/10/2017.
 */
public class BlockAluminumOre extends Block {

    public BlockAluminumOre(String unlocalizedName, String registryName) {

        super(Material.ROCK);

        setUnlocalizedName(unlocalizedName);
        setRegistryName(new ResourceLocation(References.MODID, registryName));

        setHardness(3.0f);
        setResistance(15.0f);
        setSoundType(SoundType.STONE);
        setHarvestLevel("pickaxe", 2);

    }

    @Nullable
    @Override
    public Item getItemDropped(IBlockState state, Random rand, int fortune) {

        return Item.getItemFromBlock(this);
    }
}
