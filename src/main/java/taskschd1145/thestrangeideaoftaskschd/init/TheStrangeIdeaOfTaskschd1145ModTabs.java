
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package taskschd1145.thestrangeideaoftaskschd.init;

import taskschd1145.thestrangeideaoftaskschd.TheStrangeIdeaOfTaskschd1145Mod;

import net.neoforged.neoforge.registries.DeferredRegister;
import net.neoforged.neoforge.registries.DeferredHolder;

import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.network.chat.Component;
import net.minecraft.core.registries.Registries;

public class TheStrangeIdeaOfTaskschd1145ModTabs {
	public static final DeferredRegister<CreativeModeTab> REGISTRY = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, TheStrangeIdeaOfTaskschd1145Mod.MODID);
	public static final DeferredHolder<CreativeModeTab, CreativeModeTab> TSIOT = REGISTRY.register("tsiot",
			() -> CreativeModeTab.builder().title(Component.translatable("item_group.the_strange_idea_of_taskschd1145.tsiot")).icon(() -> new ItemStack(TheStrangeIdeaOfTaskschd1145ModItems.TASKSCHD_1145.get())).displayItems((parameters, tabData) -> {
				tabData.accept(TheStrangeIdeaOfTaskschd1145ModItems.MECHANICALBOW.get());
				tabData.accept(TheStrangeIdeaOfTaskschd1145ModItems.NYFIREWORK.get());
				tabData.accept(TheStrangeIdeaOfTaskschd1145ModItems.OLD_FLAMETHROWER.get());
				tabData.accept(TheStrangeIdeaOfTaskschd1145ModItems.FLAMETHROWER.get());
				tabData.accept(TheStrangeIdeaOfTaskschd1145ModItems.INTASTE.get());
				tabData.accept(TheStrangeIdeaOfTaskschd1145ModItems.TALISMANS.get());
			})

					.build());
}
