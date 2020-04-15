package net.mcreator.spaz_craft.procedures;

import net.minecraft.world.World;
import net.minecraft.util.math.BlockPos;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.tileentity.LockableLootTileEntity;

import net.mcreator.spaz_craft.SpazCraftElements;

@SpazCraftElements.ModElement.Tag
public class MergerTakenFromProcedure extends SpazCraftElements.ModElement {
	public MergerTakenFromProcedure(SpazCraftElements instance) {
		super(instance, 5);
	}

	public static void executeProcedure(java.util.HashMap<String, Object> dependencies) {
		if (dependencies.get("x") == null) {
			System.err.println("Failed to load dependency x for procedure MergerTakenFrom!");
			return;
		}
		if (dependencies.get("y") == null) {
			System.err.println("Failed to load dependency y for procedure MergerTakenFrom!");
			return;
		}
		if (dependencies.get("z") == null) {
			System.err.println("Failed to load dependency z for procedure MergerTakenFrom!");
			return;
		}
		if (dependencies.get("world") == null) {
			System.err.println("Failed to load dependency world for procedure MergerTakenFrom!");
			return;
		}
		int x = (int) dependencies.get("x");
		int y = (int) dependencies.get("y");
		int z = (int) dependencies.get("z");
		World world = (World) dependencies.get("world");
		{
			TileEntity inv = world.getTileEntity(new BlockPos((int) x, (int) y, (int) z));
			if (inv instanceof LockableLootTileEntity)
				((LockableLootTileEntity) inv).decrStackSize((int) (0), (int) (1));
		}
		{
			TileEntity inv = world.getTileEntity(new BlockPos((int) x, (int) y, (int) z));
			if (inv instanceof LockableLootTileEntity)
				((LockableLootTileEntity) inv).decrStackSize((int) (1), (int) (1));
		}
	}
}
