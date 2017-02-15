package armedmob.mods.mobdefenders.blocks.tileentities;

import armedmob.mods.mobdefenders.blocks.MDOreBase;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;

import javax.annotation.Nullable;


/**
 * Created by Armed Mob on 2/15/2017.
 */
public abstract class BlockTileEntity<TE extends TileEntity> extends MDOreBase {

    public BlockTileEntity(Material material, String name, String oreName, float resistance, float hardness, String toolClass, int harvestLevel) {
        super(material, name, oreName, resistance, hardness, toolClass, harvestLevel);
    }

    public abstract Class<TE> getTileEntityClass();

    public TE getTileEntity(IBlockAccess world, BlockPos pos) {
        return (TE)world.getTileEntity(pos);
    }

    @Override
    public boolean hasTileEntity(IBlockState state) {
        return true;
    }

    @Nullable
    @Override
    public abstract TE createTileEntity(World world, IBlockState state);
}
