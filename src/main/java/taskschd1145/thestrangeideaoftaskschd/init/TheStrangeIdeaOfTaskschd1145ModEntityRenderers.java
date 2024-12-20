
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package taskschd1145.thestrangeideaoftaskschd.init;

import net.neoforged.neoforge.client.event.EntityRenderersEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.api.distmarker.Dist;

import net.minecraft.client.renderer.entity.ThrownItemRenderer;

@EventBusSubscriber(bus = EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class TheStrangeIdeaOfTaskschd1145ModEntityRenderers {
	@SubscribeEvent
	public static void registerEntityRenderers(EntityRenderersEvent.RegisterRenderers event) {
		event.registerEntityRenderer(TheStrangeIdeaOfTaskschd1145ModEntities.SPITFIRE_GUNBULLET.get(), ThrownItemRenderer::new);
	}
}
