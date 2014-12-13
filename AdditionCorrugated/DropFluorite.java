package AdditionCorrugated;

import net.minecraft.entity.monster.EntityZombie;
import net.minecraftforge.event.entity.living.LivingDeathEvent;

public class DropFluorite
{
	public void onLivingDeathEvent(LivingDeathEvent event) {
		if(event.entityLiving.worldObj.isRemote) {
			return;
		}
		if(event.entityLiving instanceof EntityZombie) {
			if(event.entityLiving.worldObj.rand.nextInt(10) == 0) {
				event.entityLiving.dropItem(AdditionCorrugatedCore.Fluorite, 1);
			}
		}
	}

}
