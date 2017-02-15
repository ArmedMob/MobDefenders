package armedmob.mods.mobdefenders.blocks.tileentities;

import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.EnumHand;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.text.TextComponentString;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;

import armedmob.mods.mobdefenders.blocks.tileentities.KappaCrateTileEntity;

import javax.annotation.Nullable;

/**
 * Created by Armed Mob on 2/15/2017.
 */
public class KappaCrate extends BlockTileEntity<KappaCrateTileEntity> {

    public KappaCrate() {
        super(Material.WOOD, "kappaCrate", "blockKappaCrate", 15.0f, 2.5f, "axe", 0);
    }

    @Override
    public boolean onBlockActivated(World world, BlockPos pos, IBlockState state, EntityPlayer player, EnumHand hand, @Nullable ItemStack heldItem, EnumFacing side, float hitX, float hitY, float hitZ) {

        if (!world.isRemote) {
            KappaCrateTileEntity kappa = getTileEntity(world, pos);
            if (side == EnumFacing.SOUTH) {
                kappa.decrementCount();
            } else if (side == EnumFacing.NORTH) {
                kappa.incrementCount();
            }
            player.addChatMessage(new TextComponentString("Kappa Count: " + kappa.getKappaCount()));
        }
        return true;
    }

    @Override
    public Class<KappaCrateTileEntity> getTileEntityClass() {
        return KappaCrateTileEntity.class;
    }

    @Nullable
    @Override
    public KappaCrateTileEntity createTileEntity(World world, IBlockState state) {
        return new KappaCrateTileEntity();
    }
}
