
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package taskschd1145.thestrangeideaoftaskschd.init;

import taskschd1145.thestrangeideaoftaskschd.Tsiot1145Mod;

import net.neoforged.neoforge.registries.DeferredRegister;
import net.neoforged.neoforge.registries.DeferredHolder;

import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.network.chat.Component;
import net.minecraft.core.registries.Registries;

public class Tsiot1145ModTabs {
	public static final DeferredRegister<CreativeModeTab> REGISTRY = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, Tsiot1145Mod.MODID);
	public static final DeferredHolder<CreativeModeTab, CreativeModeTab> TSIOT = REGISTRY.register("tsiot",
			() -> CreativeModeTab.builder().title(Component.translatable("item_group.tsiot1145.tsiot")).icon(() -> new ItemStack(Tsiot1145ModItems.TASKSCHD_1145.get())).displayItems((parameters, tabData) -> {
				tabData.accept(Tsiot1145ModItems.MECHANICALBOW.get());
				tabData.accept(Tsiot1145ModItems.NYFIREWORK.get());
				tabData.accept(Tsiot1145ModItems.OLD_FLAMETHROWER.get());
				tabData.accept(Tsiot1145ModItems.FLAMETHROWER.get());
				tabData.accept(Tsiot1145ModItems.INTASTE.get());
				tabData.accept(Tsiot1145ModItems.TALISMANS.get());
			})

					.build());
}
