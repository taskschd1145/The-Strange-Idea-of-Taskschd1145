
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package taskschd1145.thestrangeideaoftaskschd.init;

import taskschd1145.thestrangeideaoftaskschd.entity.SpitfireGunbulletEntity;
import taskschd1145.thestrangeideaoftaskschd.Tsiot1145Mod;

import net.neoforged.neoforge.registries.DeferredRegister;
import net.neoforged.neoforge.registries.DeferredHolder;

import net.minecraft.world.entity.MobCategory;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.Entity;
import net.minecraft.core.registries.Registries;

public class Tsiot1145ModEntities {
	public static final DeferredRegister<EntityType<?>> REGISTRY = DeferredRegister.create(Registries.ENTITY_TYPE, Tsiot1145Mod.MODID);
	public static final DeferredHolder<EntityType<?>, EntityType<SpitfireGunbulletEntity>> SPITFIRE_GUNBULLET = register("spitfire_gunbullet",
			EntityType.Builder.<SpitfireGunbulletEntity>of(SpitfireGunbulletEntity::new, MobCategory.MISC).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(1).sized(0.5f, 0.5f));

	// Start of user code block custom entities
	// End of user code block custom entities
	private static <T extends Entity> DeferredHolder<EntityType<?>, EntityType<T>> register(String registryname, EntityType.Builder<T> entityTypeBuilder) {
		return REGISTRY.register(registryname, () -> (EntityType<T>) entityTypeBuilder.build(registryname));
	}
}
