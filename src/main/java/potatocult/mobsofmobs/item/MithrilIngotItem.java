
package potatocult.mobsofmobs.item;

import potatocult.mobsofmobs.itemgroup.MobsOfMobsStuffItemGroup;
import potatocult.mobsofmobs.MobsofMobsElements;

import org.omg.CORBA.ObjectHolder;

@MobsofMobsElements.ModElement.Tag
public class MithrilIngotItem extends MobsofMobsElements.ModElement {
	@ObjectHolder("mobs_of_mobs:mithrilingot")
	public static final Item block = null;
	public MithrilIngotItem(MobsofMobsElements instance) {
		super(instance, 10);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new ItemCustom());
	}
	public static class ItemCustom extends Item {
		public ItemCustom() {
			super(new Item.Properties().group(MobsOfMobsStuffItemGroup.tab).maxStackSize(64));
			setRegistryName("mithrilingot");
		}

		@Override
		public int getItemEnchantability() {
			return 0;
		}

		@Override
		public int getUseDuration(ItemStack itemstack) {
			return 0;
		}

		@Override
		public float getDestroySpeed(ItemStack par1ItemStack, BlockState par2Block) {
			return 1F;
		}
	}
}
