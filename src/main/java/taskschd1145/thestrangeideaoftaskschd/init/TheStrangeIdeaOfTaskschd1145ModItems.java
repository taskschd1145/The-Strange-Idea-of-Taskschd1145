
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package taskschd1145.thestrangeideaoftaskschd.init;

import taskschd1145.thestrangeideaoftaskschd.item.Taskschd1145Item;
import taskschd1145.thestrangeideaoftaskschd.item.MechanicalbowItem;
import taskschd1145.thestrangeideaoftaskschd.TheStrangeIdeaOfTaskschd1145Mod;

import net.neoforged.neoforge.registries.DeferredRegister;
import net.neoforged.neoforge.registries.DeferredItem;

import net.minecraft.world.item.Item;

public class TheStrangeIdeaOfTaskschd1145ModItems {
	public static final DeferredRegister.Items REGISTRY = DeferredRegister.createItems(TheStrangeIdeaOfTaskschd1145Mod.MODID);
	public static final DeferredItem<Item> TASKSCHD_1145 = REGISTRY.register("taskschd_1145", Taskschd1145Item::new);
	public static final DeferredItem<Item> MECHANICALBOW = REGISTRY.register("mechanicalbow", MechanicalbowItem::new);
	// Start of user code block custom items
	// End of user code block custom items
}