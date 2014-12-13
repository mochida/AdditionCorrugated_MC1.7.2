package AdditionCorrugated;

import net.minecraft.entity.monster.EntityCreeper;
import net.minecraftforge.event.entity.living.LivingDeathEvent;

public class DropPolishngPowder
{
	public void onLivingDeathEvent(LivingDeathEvent event) {
		if(event.entityLiving.worldObj.isRemote) {
			return;
		}
		if(event.entityLiving instanceof EntityCreeper) {
			if(event.entityLiving.worldObj.rand.nextInt(10) == 0) {
				event.entityLiving.dropItem(AdditionCorrugatedCore.PolishngPowder, 1);
			}
		}
	}

}