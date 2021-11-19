
package de.lpd.largemod.java.item;

import net.minecraftforge.registries.ObjectHolder;

import net.minecraft.item.crafting.Ingredient;
import net.minecraft.item.SwordItem;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.Item;
import net.minecraft.item.IItemTier;

import de.lpd.largemod.java.LpdsLargeModModElements;

@LpdsLargeModModElements.ModElement.Tag
public class LPDSpearItem extends LpdsLargeModModElements.ModElement {
	@ObjectHolder("lpds_large_mod:lpd_spear")
	public static final Item block = null;
	public LPDSpearItem(LpdsLargeModModElements instance) {
		super(instance, 20);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new SwordItem(new IItemTier() {
			public int getMaxUses() {
				return 354;
			}

			public float getEfficiency() {
				return 4f;
			}

			public float getAttackDamage() {
				return 9f;
			}

			public int getHarvestLevel() {
				return 1;
			}

			public int getEnchantability() {
				return 15;
			}

			public Ingredient getRepairMaterial() {
				return Ingredient.EMPTY;
			}
		}, 3, -3f, new Item.Properties().group(ItemGroup.TOOLS)) {
		}.setRegistryName("lpd_spear"));
	}
}
