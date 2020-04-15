package net.mcreator.spaz_craft.procedures;

import net.minecraft.entity.Entity;

import net.mcreator.spaz_craft.SpazCraftElements;

@SpazCraftElements.ModElement.Tag
public class SakDogFoodEatenProcedure extends SpazCraftElements.ModElement {
	public SakDogFoodEatenProcedure(SpazCraftElements instance) {
		super(instance, 6);
	}

	public static void executeProcedure(java.util.HashMap<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			System.err.println("Failed to load dependency entity for procedure SakDogFoodEaten!");
			return;
		}
		Entity entity = (Entity) dependencies.get("entity");
		if (!entity.world.isRemote && entity.world.getServer() != null) {
			entity.world.getServer().getCommandManager().handleCommand(entity.getCommandSource().withFeedbackDisabled().withPermissionLevel(4),
					"kill @s");
		}
	}
}
