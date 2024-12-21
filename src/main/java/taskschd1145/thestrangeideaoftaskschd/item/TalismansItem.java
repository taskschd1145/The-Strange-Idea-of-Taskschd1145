
package taskschd1145.thestrangeideaoftaskschd.item;

import taskschd1145.thestrangeideaoftaskschd.procedures.Talismans_mainProcedure;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.world.entity.LivingEntity;

public class TalismansItem extends Item {
	public TalismansItem() {
		super(new Item.Properties().durability(100).fireResistant().rarity(Rarity.COMMON));
	}

	@Override
	public boolean hurtEnemy(ItemStack itemstack, LivingEntity entity, LivingEntity sourceentity) {
		boolean retval = super.hurtEnemy(itemstack, entity, sourceentity);
		Talismans_mainProcedure.execute(entity);
		return retval;
	}
}
