
package net.mcreator.spaz_craft.item;

import net.minecraftforge.registries.ObjectHolder;

import net.minecraft.item.UseAction;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.Item;
import net.minecraft.item.Food;

import net.mcreator.spaz_craft.SpazCraftElements;

@SpazCraftElements.ModElement.Tag
public class HotdogItem extends SpazCraftElements.ModElement {
	@ObjectHolder("spaz_craft:hotdog")
	public static final Item block = null;
	public HotdogItem(SpazCraftElements instance) {
		super(instance, 2);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new FoodItemCustom());
	}
	public static class FoodItemCustom extends Item {
		public FoodItemCustom() {
			super(new Item.Properties().group(ItemGroup.FOOD).maxStackSize(64).food((new Food.Builder()).hunger(21).saturation(12f).meat().build()));
			setRegistryName("hotdog");
		}

		@Override
		public int getUseDuration(ItemStack stack) {
			return 64;
		}

		@Override
		public UseAction getUseAction(ItemStack par1ItemStack) {
			return UseAction.EAT;
		}
	}
}
