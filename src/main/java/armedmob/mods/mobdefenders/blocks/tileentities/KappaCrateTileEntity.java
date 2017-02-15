package armedmob.mods.mobdefenders.blocks.tileentities;

import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.tileentity.TileEntity;

/**
 * Created by Armed Mob on 2/15/2017.
 */
public class KappaCrateTileEntity extends TileEntity {

    private int kappaCount;

    @Override
    public NBTTagCompound writeToNBT(NBTTagCompound compound) {
        compound.setInteger("kappaCount", kappaCount);
        return super.writeToNBT(compound);
    }

    @Override
    public void readFromNBT(NBTTagCompound compound) {
        kappaCount = compound.getInteger("kappaCount");
        super.readFromNBT(compound);
    }

    public int getKappaCount() {
        return kappaCount;
    }

    public void incrementCount() {
        kappaCount++;
        markDirty();
    }

    public void decrementCount() {
        kappaCount--;
        markDirty();
    }
}
