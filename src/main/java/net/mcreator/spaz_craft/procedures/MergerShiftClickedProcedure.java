package net.mcreator.spaz_craft.procedures;

import net.minecraftforge.items.ItemHandlerHelper;

import net.minecraft.world.World;
import net.minecraft.util.math.BlockPos;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.tileentity.LockableLootTileEntity;
import net.minecraft.item.Items;
import net.minecraft.item.ItemStack;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.entity.Entity;
import net.minecraft.block.Blocks;

import net.mcreator.spaz_craft.item.SteelIngotItem;
import net.mcreator.spaz_craft.item.SakDogItem;
import net.mcreator.spaz_craft.item.HotdogItem;
import net.mcreator.spaz_craft.item.CosmiteIngotItem;
import net.mcreator.spaz_craft.block.CosmiteBlockBlock;
import net.mcreator.spaz_craft.SpazCraftElements;

@SpazCraftElements.ModElement.Tag
public class MergerShiftClickedProcedure extends SpazCraftElements.ModElement {
	public MergerShiftClickedProcedure(SpazCraftElements instance) {
		super(instance, 18);
	}

	public static void executeProcedure(java.util.HashMap<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			System.err.println("Failed to load dependency entity for procedure MergerShiftClicked!");
			return;
		}
		if (dependencies.get("x") == null) {
			System.err.println("Failed to load dependency x for procedure MergerShiftClicked!");
			return;
		}
		if (dependencies.get("y") == null) {
			System.err.println("Failed to load dependency y for procedure MergerShiftClicked!");
			return;
		}
		if (dependencies.get("z") == null) {
			System.err.println("Failed to load dependency z for procedure MergerShiftClicked!");
			return;
		}
		if (dependencies.get("world") == null) {
			System.err.println("Failed to load dependency world for procedure MergerShiftClicked!");
			return;
		}
		Entity entity = (Entity) dependencies.get("entity");
		int x = (int) dependencies.get("x");
		int y = (int) dependencies.get("y");
		int z = (int) dependencies.get("z");
		World world = (World) dependencies.get("world");
		if ((((new ItemStack(HotdogItem.block, (int) (1)).getItem() == (new Object() {
			public ItemStack getItemStack(BlockPos pos, int sltid) {
				TileEntity inv = world.getTileEntity(pos);
				if (inv instanceof LockableLootTileEntity)
					return ((LockableLootTileEntity) inv).getStackInSlot(sltid);
				return ItemStack.EMPTY;
			}
		}.getItemStack(new BlockPos((int) x, (int) y, (int) z), (int) (0))).getItem())
				&& (new ItemStack(Items.WITHER_SKELETON_SKULL, (int) (1)).getItem() == (new Object() {
					public ItemStack getItemStack(BlockPos pos, int sltid) {
						TileEntity inv = world.getTileEntity(pos);
						if (inv instanceof LockableLootTileEntity)
							return ((LockableLootTileEntity) inv).getStackInSlot(sltid);
						return ItemStack.EMPTY;
					}
				}.getItemStack(new BlockPos((int) x, (int) y, (int) z), (int) (1))).getItem()))
				|| ((new ItemStack(HotdogItem.block, (int) (1)).getItem() == (new Object() {
					public ItemStack getItemStack(BlockPos pos, int sltid) {
						TileEntity inv = world.getTileEntity(pos);
						if (inv instanceof LockableLootTileEntity)
							return ((LockableLootTileEntity) inv).getStackInSlot(sltid);
						return ItemStack.EMPTY;
					}
				}.getItemStack(new BlockPos((int) x, (int) y, (int) z), (int) (1))).getItem())
						&& (new ItemStack(Items.WITHER_SKELETON_SKULL, (int) (1)).getItem() == (new Object() {
							public ItemStack getItemStack(BlockPos pos, int sltid) {
								TileEntity inv = world.getTileEntity(pos);
								if (inv instanceof LockableLootTileEntity)
									return ((LockableLootTileEntity) inv).getStackInSlot(sltid);
								return ItemStack.EMPTY;
							}
						}.getItemStack(new BlockPos((int) x, (int) y, (int) z), (int) (0))).getItem())))) {
			if (((new Object() {
				public int getAmount(BlockPos pos, int sltid) {
					TileEntity inv = world.getTileEntity(pos);
					if (inv instanceof LockableLootTileEntity) {
						ItemStack stack = ((LockableLootTileEntity) inv).getStackInSlot(sltid);
						if (stack != null)
							return stack.getCount();
					}
					return 0;
				}
			}.getAmount(new BlockPos((int) x, (int) y, (int) z), (int) (0))) < (new Object() {
				public int getAmount(BlockPos pos, int sltid) {
					TileEntity inv = world.getTileEntity(pos);
					if (inv instanceof LockableLootTileEntity) {
						ItemStack stack = ((LockableLootTileEntity) inv).getStackInSlot(sltid);
						if (stack != null)
							return stack.getCount();
					}
					return 0;
				}
			}.getAmount(new BlockPos((int) x, (int) y, (int) z), (int) (1))))) {
				if (entity instanceof PlayerEntity) {
					ItemStack _setstack = new ItemStack(SakDogItem.block, (int) (1));
					_setstack.setCount(((new Object() {
						public int getAmount(BlockPos pos, int sltid) {
							TileEntity inv = world.getTileEntity(pos);
							if (inv instanceof LockableLootTileEntity) {
								ItemStack stack = ((LockableLootTileEntity) inv).getStackInSlot(sltid);
								if (stack != null)
									return stack.getCount();
							}
							return 0;
						}
					}.getAmount(new BlockPos((int) x, (int) y, (int) z), (int) (0))) - 1));
					ItemHandlerHelper.giveItemToPlayer(((PlayerEntity) entity), _setstack);
				}
				{
					TileEntity inv = world.getTileEntity(new BlockPos((int) x, (int) y, (int) z));
					if (inv instanceof LockableLootTileEntity)
						((LockableLootTileEntity) inv).decrStackSize((int) (1), (int) (((new Object() {
							public int getAmount(BlockPos pos, int sltid) {
								TileEntity inv = world.getTileEntity(pos);
								if (inv instanceof LockableLootTileEntity) {
									ItemStack stack = ((LockableLootTileEntity) inv).getStackInSlot(sltid);
									if (stack != null)
										return stack.getCount();
								}
								return 0;
							}
						}.getAmount(new BlockPos((int) x, (int) y, (int) z), (int) (0))) - 1)));
				}
				{
					TileEntity inv = world.getTileEntity(new BlockPos((int) x, (int) y, (int) z));
					if (inv instanceof LockableLootTileEntity)
						((LockableLootTileEntity) inv).decrStackSize((int) (0), (int) (((new Object() {
							public int getAmount(BlockPos pos, int sltid) {
								TileEntity inv = world.getTileEntity(pos);
								if (inv instanceof LockableLootTileEntity) {
									ItemStack stack = ((LockableLootTileEntity) inv).getStackInSlot(sltid);
									if (stack != null)
										return stack.getCount();
								}
								return 0;
							}
						}.getAmount(new BlockPos((int) x, (int) y, (int) z), (int) (0))) - 1)));
				}
			} else {
				if (entity instanceof PlayerEntity) {
					ItemStack _setstack = new ItemStack(SakDogItem.block, (int) (1));
					_setstack.setCount(((new Object() {
						public int getAmount(BlockPos pos, int sltid) {
							TileEntity inv = world.getTileEntity(pos);
							if (inv instanceof LockableLootTileEntity) {
								ItemStack stack = ((LockableLootTileEntity) inv).getStackInSlot(sltid);
								if (stack != null)
									return stack.getCount();
							}
							return 0;
						}
					}.getAmount(new BlockPos((int) x, (int) y, (int) z), (int) (1))) - 1));
					ItemHandlerHelper.giveItemToPlayer(((PlayerEntity) entity), _setstack);
				}
				{
					TileEntity inv = world.getTileEntity(new BlockPos((int) x, (int) y, (int) z));
					if (inv instanceof LockableLootTileEntity)
						((LockableLootTileEntity) inv).decrStackSize((int) (0), (int) (((new Object() {
							public int getAmount(BlockPos pos, int sltid) {
								TileEntity inv = world.getTileEntity(pos);
								if (inv instanceof LockableLootTileEntity) {
									ItemStack stack = ((LockableLootTileEntity) inv).getStackInSlot(sltid);
									if (stack != null)
										return stack.getCount();
								}
								return 0;
							}
						}.getAmount(new BlockPos((int) x, (int) y, (int) z), (int) (1))) - 1)));
				}
				{
					TileEntity inv = world.getTileEntity(new BlockPos((int) x, (int) y, (int) z));
					if (inv instanceof LockableLootTileEntity)
						((LockableLootTileEntity) inv).decrStackSize((int) (1), (int) (((new Object() {
							public int getAmount(BlockPos pos, int sltid) {
								TileEntity inv = world.getTileEntity(pos);
								if (inv instanceof LockableLootTileEntity) {
									ItemStack stack = ((LockableLootTileEntity) inv).getStackInSlot(sltid);
									if (stack != null)
										return stack.getCount();
								}
								return 0;
							}
						}.getAmount(new BlockPos((int) x, (int) y, (int) z), (int) (1))) - 1)));
				}
			}
		} else {
			if ((((new ItemStack(Items.IRON_INGOT, (int) (1)).getItem() == (new Object() {
				public ItemStack getItemStack(BlockPos pos, int sltid) {
					TileEntity inv = world.getTileEntity(pos);
					if (inv instanceof LockableLootTileEntity)
						return ((LockableLootTileEntity) inv).getStackInSlot(sltid);
					return ItemStack.EMPTY;
				}
			}.getItemStack(new BlockPos((int) x, (int) y, (int) z), (int) (0))).getItem())
					&& (new ItemStack(Blocks.COAL_BLOCK, (int) (1)).getItem() == (new Object() {
						public ItemStack getItemStack(BlockPos pos, int sltid) {
							TileEntity inv = world.getTileEntity(pos);
							if (inv instanceof LockableLootTileEntity)
								return ((LockableLootTileEntity) inv).getStackInSlot(sltid);
							return ItemStack.EMPTY;
						}
					}.getItemStack(new BlockPos((int) x, (int) y, (int) z), (int) (1))).getItem()))
					|| ((new ItemStack(Items.IRON_INGOT, (int) (1)).getItem() == (new Object() {
						public ItemStack getItemStack(BlockPos pos, int sltid) {
							TileEntity inv = world.getTileEntity(pos);
							if (inv instanceof LockableLootTileEntity)
								return ((LockableLootTileEntity) inv).getStackInSlot(sltid);
							return ItemStack.EMPTY;
						}
					}.getItemStack(new BlockPos((int) x, (int) y, (int) z), (int) (1))).getItem())
							&& (new ItemStack(Blocks.COAL_BLOCK, (int) (1)).getItem() == (new Object() {
								public ItemStack getItemStack(BlockPos pos, int sltid) {
									TileEntity inv = world.getTileEntity(pos);
									if (inv instanceof LockableLootTileEntity)
										return ((LockableLootTileEntity) inv).getStackInSlot(sltid);
									return ItemStack.EMPTY;
								}
							}.getItemStack(new BlockPos((int) x, (int) y, (int) z), (int) (0))).getItem())))) {
				if (((new Object() {
					public int getAmount(BlockPos pos, int sltid) {
						TileEntity inv = world.getTileEntity(pos);
						if (inv instanceof LockableLootTileEntity) {
							ItemStack stack = ((LockableLootTileEntity) inv).getStackInSlot(sltid);
							if (stack != null)
								return stack.getCount();
						}
						return 0;
					}
				}.getAmount(new BlockPos((int) x, (int) y, (int) z), (int) (0))) < (new Object() {
					public int getAmount(BlockPos pos, int sltid) {
						TileEntity inv = world.getTileEntity(pos);
						if (inv instanceof LockableLootTileEntity) {
							ItemStack stack = ((LockableLootTileEntity) inv).getStackInSlot(sltid);
							if (stack != null)
								return stack.getCount();
						}
						return 0;
					}
				}.getAmount(new BlockPos((int) x, (int) y, (int) z), (int) (1))))) {
					if (entity instanceof PlayerEntity) {
						ItemStack _setstack = new ItemStack(SteelIngotItem.block, (int) (1));
						_setstack.setCount(((new Object() {
							public int getAmount(BlockPos pos, int sltid) {
								TileEntity inv = world.getTileEntity(pos);
								if (inv instanceof LockableLootTileEntity) {
									ItemStack stack = ((LockableLootTileEntity) inv).getStackInSlot(sltid);
									if (stack != null)
										return stack.getCount();
								}
								return 0;
							}
						}.getAmount(new BlockPos((int) x, (int) y, (int) z), (int) (0))) - 1));
						ItemHandlerHelper.giveItemToPlayer(((PlayerEntity) entity), _setstack);
					}
					{
						TileEntity inv = world.getTileEntity(new BlockPos((int) x, (int) y, (int) z));
						if (inv instanceof LockableLootTileEntity)
							((LockableLootTileEntity) inv).decrStackSize((int) (1), (int) (((new Object() {
								public int getAmount(BlockPos pos, int sltid) {
									TileEntity inv = world.getTileEntity(pos);
									if (inv instanceof LockableLootTileEntity) {
										ItemStack stack = ((LockableLootTileEntity) inv).getStackInSlot(sltid);
										if (stack != null)
											return stack.getCount();
									}
									return 0;
								}
							}.getAmount(new BlockPos((int) x, (int) y, (int) z), (int) (0))) - 1)));
					}
					{
						TileEntity inv = world.getTileEntity(new BlockPos((int) x, (int) y, (int) z));
						if (inv instanceof LockableLootTileEntity)
							((LockableLootTileEntity) inv).decrStackSize((int) (0), (int) (((new Object() {
								public int getAmount(BlockPos pos, int sltid) {
									TileEntity inv = world.getTileEntity(pos);
									if (inv instanceof LockableLootTileEntity) {
										ItemStack stack = ((LockableLootTileEntity) inv).getStackInSlot(sltid);
										if (stack != null)
											return stack.getCount();
									}
									return 0;
								}
							}.getAmount(new BlockPos((int) x, (int) y, (int) z), (int) (0))) - 1)));
					}
				} else {
					if (entity instanceof PlayerEntity) {
						ItemStack _setstack = new ItemStack(SteelIngotItem.block, (int) (1));
						_setstack.setCount(((new Object() {
							public int getAmount(BlockPos pos, int sltid) {
								TileEntity inv = world.getTileEntity(pos);
								if (inv instanceof LockableLootTileEntity) {
									ItemStack stack = ((LockableLootTileEntity) inv).getStackInSlot(sltid);
									if (stack != null)
										return stack.getCount();
								}
								return 0;
							}
						}.getAmount(new BlockPos((int) x, (int) y, (int) z), (int) (1))) - 1));
						ItemHandlerHelper.giveItemToPlayer(((PlayerEntity) entity), _setstack);
					}
					{
						TileEntity inv = world.getTileEntity(new BlockPos((int) x, (int) y, (int) z));
						if (inv instanceof LockableLootTileEntity)
							((LockableLootTileEntity) inv).decrStackSize((int) (0), (int) (((new Object() {
								public int getAmount(BlockPos pos, int sltid) {
									TileEntity inv = world.getTileEntity(pos);
									if (inv instanceof LockableLootTileEntity) {
										ItemStack stack = ((LockableLootTileEntity) inv).getStackInSlot(sltid);
										if (stack != null)
											return stack.getCount();
									}
									return 0;
								}
							}.getAmount(new BlockPos((int) x, (int) y, (int) z), (int) (1))) - 1)));
					}
					{
						TileEntity inv = world.getTileEntity(new BlockPos((int) x, (int) y, (int) z));
						if (inv instanceof LockableLootTileEntity)
							((LockableLootTileEntity) inv).decrStackSize((int) (1), (int) (((new Object() {
								public int getAmount(BlockPos pos, int sltid) {
									TileEntity inv = world.getTileEntity(pos);
									if (inv instanceof LockableLootTileEntity) {
										ItemStack stack = ((LockableLootTileEntity) inv).getStackInSlot(sltid);
										if (stack != null)
											return stack.getCount();
									}
									return 0;
								}
							}.getAmount(new BlockPos((int) x, (int) y, (int) z), (int) (1))) - 1)));
					}
				}
			} else {
				if ((((new ItemStack(Blocks.IRON_BLOCK, (int) (1)).getItem() == (new Object() {
					public ItemStack getItemStack(BlockPos pos, int sltid) {
						TileEntity inv = world.getTileEntity(pos);
						if (inv instanceof LockableLootTileEntity)
							return ((LockableLootTileEntity) inv).getStackInSlot(sltid);
						return ItemStack.EMPTY;
					}
				}.getItemStack(new BlockPos((int) x, (int) y, (int) z), (int) (0))).getItem())
						&& (new ItemStack(Items.DIAMOND, (int) (1)).getItem() == (new Object() {
							public ItemStack getItemStack(BlockPos pos, int sltid) {
								TileEntity inv = world.getTileEntity(pos);
								if (inv instanceof LockableLootTileEntity)
									return ((LockableLootTileEntity) inv).getStackInSlot(sltid);
								return ItemStack.EMPTY;
							}
						}.getItemStack(new BlockPos((int) x, (int) y, (int) z), (int) (1))).getItem()))
						|| ((new ItemStack(Blocks.IRON_BLOCK, (int) (1)).getItem() == (new Object() {
							public ItemStack getItemStack(BlockPos pos, int sltid) {
								TileEntity inv = world.getTileEntity(pos);
								if (inv instanceof LockableLootTileEntity)
									return ((LockableLootTileEntity) inv).getStackInSlot(sltid);
								return ItemStack.EMPTY;
							}
						}.getItemStack(new BlockPos((int) x, (int) y, (int) z), (int) (1))).getItem())
								&& (new ItemStack(Items.DIAMOND, (int) (1)).getItem() == (new Object() {
									public ItemStack getItemStack(BlockPos pos, int sltid) {
										TileEntity inv = world.getTileEntity(pos);
										if (inv instanceof LockableLootTileEntity)
											return ((LockableLootTileEntity) inv).getStackInSlot(sltid);
										return ItemStack.EMPTY;
									}
								}.getItemStack(new BlockPos((int) x, (int) y, (int) z), (int) (0))).getItem())))) {
					if (((new Object() {
						public int getAmount(BlockPos pos, int sltid) {
							TileEntity inv = world.getTileEntity(pos);
							if (inv instanceof LockableLootTileEntity) {
								ItemStack stack = ((LockableLootTileEntity) inv).getStackInSlot(sltid);
								if (stack != null)
									return stack.getCount();
							}
							return 0;
						}
					}.getAmount(new BlockPos((int) x, (int) y, (int) z), (int) (0))) < (new Object() {
						public int getAmount(BlockPos pos, int sltid) {
							TileEntity inv = world.getTileEntity(pos);
							if (inv instanceof LockableLootTileEntity) {
								ItemStack stack = ((LockableLootTileEntity) inv).getStackInSlot(sltid);
								if (stack != null)
									return stack.getCount();
							}
							return 0;
						}
					}.getAmount(new BlockPos((int) x, (int) y, (int) z), (int) (1))))) {
						if (entity instanceof PlayerEntity) {
							ItemStack _setstack = new ItemStack(CosmiteIngotItem.block, (int) (1));
							_setstack.setCount(((new Object() {
								public int getAmount(BlockPos pos, int sltid) {
									TileEntity inv = world.getTileEntity(pos);
									if (inv instanceof LockableLootTileEntity) {
										ItemStack stack = ((LockableLootTileEntity) inv).getStackInSlot(sltid);
										if (stack != null)
											return stack.getCount();
									}
									return 0;
								}
							}.getAmount(new BlockPos((int) x, (int) y, (int) z), (int) (0))) - 1));
							ItemHandlerHelper.giveItemToPlayer(((PlayerEntity) entity), _setstack);
						}
						{
							TileEntity inv = world.getTileEntity(new BlockPos((int) x, (int) y, (int) z));
							if (inv instanceof LockableLootTileEntity)
								((LockableLootTileEntity) inv).decrStackSize((int) (1), (int) (((new Object() {
									public int getAmount(BlockPos pos, int sltid) {
										TileEntity inv = world.getTileEntity(pos);
										if (inv instanceof LockableLootTileEntity) {
											ItemStack stack = ((LockableLootTileEntity) inv).getStackInSlot(sltid);
											if (stack != null)
												return stack.getCount();
										}
										return 0;
									}
								}.getAmount(new BlockPos((int) x, (int) y, (int) z), (int) (0))) - 1)));
						}
						{
							TileEntity inv = world.getTileEntity(new BlockPos((int) x, (int) y, (int) z));
							if (inv instanceof LockableLootTileEntity)
								((LockableLootTileEntity) inv).decrStackSize((int) (0), (int) (((new Object() {
									public int getAmount(BlockPos pos, int sltid) {
										TileEntity inv = world.getTileEntity(pos);
										if (inv instanceof LockableLootTileEntity) {
											ItemStack stack = ((LockableLootTileEntity) inv).getStackInSlot(sltid);
											if (stack != null)
												return stack.getCount();
										}
										return 0;
									}
								}.getAmount(new BlockPos((int) x, (int) y, (int) z), (int) (0))) - 1)));
						}
					} else {
						if (entity instanceof PlayerEntity) {
							ItemStack _setstack = new ItemStack(CosmiteIngotItem.block, (int) (1));
							_setstack.setCount(((new Object() {
								public int getAmount(BlockPos pos, int sltid) {
									TileEntity inv = world.getTileEntity(pos);
									if (inv instanceof LockableLootTileEntity) {
										ItemStack stack = ((LockableLootTileEntity) inv).getStackInSlot(sltid);
										if (stack != null)
											return stack.getCount();
									}
									return 0;
								}
							}.getAmount(new BlockPos((int) x, (int) y, (int) z), (int) (1))) - 1));
							ItemHandlerHelper.giveItemToPlayer(((PlayerEntity) entity), _setstack);
						}
						{
							TileEntity inv = world.getTileEntity(new BlockPos((int) x, (int) y, (int) z));
							if (inv instanceof LockableLootTileEntity)
								((LockableLootTileEntity) inv).decrStackSize((int) (0), (int) (((new Object() {
									public int getAmount(BlockPos pos, int sltid) {
										TileEntity inv = world.getTileEntity(pos);
										if (inv instanceof LockableLootTileEntity) {
											ItemStack stack = ((LockableLootTileEntity) inv).getStackInSlot(sltid);
											if (stack != null)
												return stack.getCount();
										}
										return 0;
									}
								}.getAmount(new BlockPos((int) x, (int) y, (int) z), (int) (1))) - 1)));
						}
						{
							TileEntity inv = world.getTileEntity(new BlockPos((int) x, (int) y, (int) z));
							if (inv instanceof LockableLootTileEntity)
								((LockableLootTileEntity) inv).decrStackSize((int) (1), (int) (((new Object() {
									public int getAmount(BlockPos pos, int sltid) {
										TileEntity inv = world.getTileEntity(pos);
										if (inv instanceof LockableLootTileEntity) {
											ItemStack stack = ((LockableLootTileEntity) inv).getStackInSlot(sltid);
											if (stack != null)
												return stack.getCount();
										}
										return 0;
									}
								}.getAmount(new BlockPos((int) x, (int) y, (int) z), (int) (1))) - 1)));
						}
					}
				} else {
					if ((((new ItemStack(Blocks.IRON_BLOCK, (int) (1)).getItem() == (new Object() {
						public ItemStack getItemStack(BlockPos pos, int sltid) {
							TileEntity inv = world.getTileEntity(pos);
							if (inv instanceof LockableLootTileEntity)
								return ((LockableLootTileEntity) inv).getStackInSlot(sltid);
							return ItemStack.EMPTY;
						}
					}.getItemStack(new BlockPos((int) x, (int) y, (int) z), (int) (0))).getItem())
							&& (new ItemStack(Blocks.DIAMOND_BLOCK, (int) (1)).getItem() == (new Object() {
								public ItemStack getItemStack(BlockPos pos, int sltid) {
									TileEntity inv = world.getTileEntity(pos);
									if (inv instanceof LockableLootTileEntity)
										return ((LockableLootTileEntity) inv).getStackInSlot(sltid);
									return ItemStack.EMPTY;
								}
							}.getItemStack(new BlockPos((int) x, (int) y, (int) z), (int) (1))).getItem()))
							|| ((new ItemStack(Blocks.IRON_BLOCK, (int) (1)).getItem() == (new Object() {
								public ItemStack getItemStack(BlockPos pos, int sltid) {
									TileEntity inv = world.getTileEntity(pos);
									if (inv instanceof LockableLootTileEntity)
										return ((LockableLootTileEntity) inv).getStackInSlot(sltid);
									return ItemStack.EMPTY;
								}
							}.getItemStack(new BlockPos((int) x, (int) y, (int) z), (int) (1))).getItem())
									&& (new ItemStack(Blocks.DIAMOND_BLOCK, (int) (1)).getItem() == (new Object() {
										public ItemStack getItemStack(BlockPos pos, int sltid) {
											TileEntity inv = world.getTileEntity(pos);
											if (inv instanceof LockableLootTileEntity)
												return ((LockableLootTileEntity) inv).getStackInSlot(sltid);
											return ItemStack.EMPTY;
										}
									}.getItemStack(new BlockPos((int) x, (int) y, (int) z), (int) (0))).getItem())))) {
						if (((new Object() {
							public int getAmount(BlockPos pos, int sltid) {
								TileEntity inv = world.getTileEntity(pos);
								if (inv instanceof LockableLootTileEntity) {
									ItemStack stack = ((LockableLootTileEntity) inv).getStackInSlot(sltid);
									if (stack != null)
										return stack.getCount();
								}
								return 0;
							}
						}.getAmount(new BlockPos((int) x, (int) y, (int) z), (int) (0))) < (new Object() {
							public int getAmount(BlockPos pos, int sltid) {
								TileEntity inv = world.getTileEntity(pos);
								if (inv instanceof LockableLootTileEntity) {
									ItemStack stack = ((LockableLootTileEntity) inv).getStackInSlot(sltid);
									if (stack != null)
										return stack.getCount();
								}
								return 0;
							}
						}.getAmount(new BlockPos((int) x, (int) y, (int) z), (int) (1))))) {
							if (entity instanceof PlayerEntity) {
								ItemStack _setstack = new ItemStack(CosmiteBlockBlock.block, (int) (1));
								_setstack.setCount(((new Object() {
									public int getAmount(BlockPos pos, int sltid) {
										TileEntity inv = world.getTileEntity(pos);
										if (inv instanceof LockableLootTileEntity) {
											ItemStack stack = ((LockableLootTileEntity) inv).getStackInSlot(sltid);
											if (stack != null)
												return stack.getCount();
										}
										return 0;
									}
								}.getAmount(new BlockPos((int) x, (int) y, (int) z), (int) (0))) - 1));
								ItemHandlerHelper.giveItemToPlayer(((PlayerEntity) entity), _setstack);
							}
							{
								TileEntity inv = world.getTileEntity(new BlockPos((int) x, (int) y, (int) z));
								if (inv instanceof LockableLootTileEntity)
									((LockableLootTileEntity) inv).decrStackSize((int) (1), (int) (((new Object() {
										public int getAmount(BlockPos pos, int sltid) {
											TileEntity inv = world.getTileEntity(pos);
											if (inv instanceof LockableLootTileEntity) {
												ItemStack stack = ((LockableLootTileEntity) inv).getStackInSlot(sltid);
												if (stack != null)
													return stack.getCount();
											}
											return 0;
										}
									}.getAmount(new BlockPos((int) x, (int) y, (int) z), (int) (0))) - 1)));
							}
							{
								TileEntity inv = world.getTileEntity(new BlockPos((int) x, (int) y, (int) z));
								if (inv instanceof LockableLootTileEntity)
									((LockableLootTileEntity) inv).decrStackSize((int) (0), (int) (((new Object() {
										public int getAmount(BlockPos pos, int sltid) {
											TileEntity inv = world.getTileEntity(pos);
											if (inv instanceof LockableLootTileEntity) {
												ItemStack stack = ((LockableLootTileEntity) inv).getStackInSlot(sltid);
												if (stack != null)
													return stack.getCount();
											}
											return 0;
										}
									}.getAmount(new BlockPos((int) x, (int) y, (int) z), (int) (0))) - 1)));
							}
						} else {
							if (entity instanceof PlayerEntity) {
								ItemStack _setstack = new ItemStack(CosmiteBlockBlock.block, (int) (1));
								_setstack.setCount(((new Object() {
									public int getAmount(BlockPos pos, int sltid) {
										TileEntity inv = world.getTileEntity(pos);
										if (inv instanceof LockableLootTileEntity) {
											ItemStack stack = ((LockableLootTileEntity) inv).getStackInSlot(sltid);
											if (stack != null)
												return stack.getCount();
										}
										return 0;
									}
								}.getAmount(new BlockPos((int) x, (int) y, (int) z), (int) (1))) - 1));
								ItemHandlerHelper.giveItemToPlayer(((PlayerEntity) entity), _setstack);
							}
							{
								TileEntity inv = world.getTileEntity(new BlockPos((int) x, (int) y, (int) z));
								if (inv instanceof LockableLootTileEntity)
									((LockableLootTileEntity) inv).decrStackSize((int) (0), (int) (((new Object() {
										public int getAmount(BlockPos pos, int sltid) {
											TileEntity inv = world.getTileEntity(pos);
											if (inv instanceof LockableLootTileEntity) {
												ItemStack stack = ((LockableLootTileEntity) inv).getStackInSlot(sltid);
												if (stack != null)
													return stack.getCount();
											}
											return 0;
										}
									}.getAmount(new BlockPos((int) x, (int) y, (int) z), (int) (1))) - 1)));
							}
							{
								TileEntity inv = world.getTileEntity(new BlockPos((int) x, (int) y, (int) z));
								if (inv instanceof LockableLootTileEntity)
									((LockableLootTileEntity) inv).decrStackSize((int) (1), (int) (((new Object() {
										public int getAmount(BlockPos pos, int sltid) {
											TileEntity inv = world.getTileEntity(pos);
											if (inv instanceof LockableLootTileEntity) {
												ItemStack stack = ((LockableLootTileEntity) inv).getStackInSlot(sltid);
												if (stack != null)
													return stack.getCount();
											}
											return 0;
										}
									}.getAmount(new BlockPos((int) x, (int) y, (int) z), (int) (1))) - 1)));
							}
						}
					} else {
						{
							TileEntity inv = world.getTileEntity(new BlockPos((int) x, (int) y, (int) z));
							if (inv instanceof LockableLootTileEntity)
								((LockableLootTileEntity) inv).removeStackFromSlot((int) (2));
						}
					}
				}
			}
		}
	}
}
