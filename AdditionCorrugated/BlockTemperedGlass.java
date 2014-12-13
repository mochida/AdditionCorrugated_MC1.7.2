package AdditionCorrugated;

import java.util.Random;

import net.minecraft.block.Block;
import net.minecraft.block.BlockGlass;
import net.minecraft.block.material.Material;

public class BlockTemperedGlass extends BlockGlass
{
	public BlockTemperedGlass()
	{
		super(Material.glass, false);
		setBlockName("TemperedGlass");
		setHardness(5.0F);
		setResistance(100.0F);
		setStepSound(Block.soundTypeGlass);
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
	
	public String getBlockTextureName()
	{
		return "additioncorrugated:block_temperedglass";
	}
}