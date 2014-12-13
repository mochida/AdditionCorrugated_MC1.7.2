package AdditionCorrugated;

import java.util.Random;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.world.World;
import net.minecraftforge.common.EnumPlantType;

public class BlockTStone extends Block
{
	
	public BlockTStone()
	{
		super(Material.rock);
		setBlockName("TStone");
		setBlockTextureName("additioncorrugated:block_tstone");
		setStepSound(Block.soundTypeStone);
		setHardness(2.0F);
	}

	public int quantityDropped(int meta, int fortune, Random random)
	{
		return quantityDroppedWithBonus(fortune, random);
	}
	
	@Override
	public int quantityDropped(Random rand)
	{
		return 1;
	}

}