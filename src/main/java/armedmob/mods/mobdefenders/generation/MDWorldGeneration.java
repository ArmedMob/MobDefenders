package armedmob.mods.mobdefenders.generation;

import armedmob.mods.mobdefenders.blocks.MDBlocks;
import net.minecraft.block.state.IBlockState;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraft.world.chunk.IChunkGenerator;
import net.minecraft.world.chunk.IChunkProvider;
import net.minecraft.world.gen.feature.WorldGenMinable;
import net.minecraftforge.fml.common.IWorldGenerator;

import java.util.Random;

/**
 * Created by Armed Mob on 2/6/2017.
 */
public class MDWorldGeneration implements IWorldGenerator {

    @Override
    public void generate(Random random, int chunkX, int chunkZ, World world, IChunkGenerator chunkGenerator, IChunkProvider chunkProvider) {

        if (world.provider.getDimension() == 0) {
            generateOverworld(random, chunkX, chunkZ, world, chunkGenerator, chunkProvider);
        }

        if (world.provider.getDimension() == -1) {
            generateNether(random, chunkX, chunkZ, world, chunkGenerator, chunkProvider);
        }
    }

    private void generateOverworld(Random random, int chunkX, int chunkZ, World world, IChunkGenerator chunkGenerator, IChunkProvider chunkProvider) {

        generateOre(MDBlocks.oreAluminum.getDefaultState(), world, random, chunkX * 16, chunkZ * 16, 0, 64, 4 + random.nextInt(4), 6);
        generateOre(MDBlocks.oreBrass.getDefaultState(), world, random, chunkX * 16, chunkZ * 16, 0, 64, 4 + random.nextInt(4), 6);
        generateOre(MDBlocks.oreCopper.getDefaultState(), world, random, chunkX * 16, chunkZ * 16, 0, 64, 4 + random.nextInt(4), 6);
        generateOre(MDBlocks.oreLead.getDefaultState(), world, random, chunkX * 16, chunkZ * 16, 0, 64, 4 + random.nextInt(4), 6);
        generateOre(MDBlocks.oreTin.getDefaultState(), world, random, chunkX * 16, chunkZ * 16, 0, 64, 4 + random.nextInt(4), 6);
    }

    private void generateNether(Random random, int chunkX, int chunkZ, World world, IChunkGenerator chunkGenerator, IChunkProvider chunkProvider) {

        generateOre(MDBlocks.oreNetherAluminum.getDefaultState(), world, random, chunkX * 16, chunkZ * 16, 0, 64, 4 + random.nextInt(4), 6);
        generateOre(MDBlocks.oreNetherBrass.getDefaultState(), world, random, chunkX * 16, chunkZ * 16, 0, 64, 4 + random.nextInt(4), 6);
        generateOre(MDBlocks.oreNetherCoal.getDefaultState(), world, random, chunkX * 16, chunkZ * 16, 0, 128, 4 + random.nextInt(4), 6);
        generateOre(MDBlocks.oreNetherCopper.getDefaultState(), world, random, chunkX * 16, chunkZ * 16, 0, 64, 4 + random.nextInt(4), 6);
        generateOre(MDBlocks.oreNetherDiamond.getDefaultState(), world, random, chunkX * 16, chunkZ * 16, 0, 16, 4 + random.nextInt(4), 6);
        generateOre(MDBlocks.oreNetherEmerald.getDefaultState(), world, random, chunkX * 16, chunkZ * 16, 0, 4, 4 + random.nextInt(4), 6);
        generateOre(MDBlocks.oreNetherGold.getDefaultState(), world, random, chunkX * 16, chunkZ * 16, 0, 32, 4 + random.nextInt(4), 6);
        generateOre(MDBlocks.oreNetherIron.getDefaultState(), world, random, chunkX * 16, chunkZ * 16, 0, 64, 4 + random.nextInt(4), 6);
        generateOre(MDBlocks.oreNetherLapis.getDefaultState(), world, random, chunkX * 16, chunkZ * 16, 0, 32, 4 + random.nextInt(4), 6);
        generateOre(MDBlocks.oreNetherLead.getDefaultState(), world, random, chunkX * 16, chunkZ * 16, 0, 64, 4 + random.nextInt(4), 6);
        generateOre(MDBlocks.oreNetherRedstone.getDefaultState(), world, random, chunkX * 16, chunkZ * 0, 0, 16, 4 + random.nextInt(4), 6);
        generateOre(MDBlocks.oreNetherTin.getDefaultState(), world, random, chunkX * 16, chunkZ * 16, 0, 64, 4 + random.nextInt(4), 6);
    }

    private void generateOre(IBlockState ore, World world, Random random, int x, int z, int minY, int maxY, int size, int chances) {

        int deltaY = maxY - minY;

        for (int i = 0; i < chances; i++) {

            BlockPos pos = new BlockPos(x + random.nextInt(16), minY + random.nextInt(deltaY), z + random.nextInt(16));

            WorldGenMinable generator = new WorldGenMinable(ore, size);
            generator.generate(world, random, pos);
        }
    }
}
