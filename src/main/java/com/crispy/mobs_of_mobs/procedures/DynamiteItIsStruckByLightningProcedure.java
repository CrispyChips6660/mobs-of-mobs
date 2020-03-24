package com.crispy.mobs_of_mobs.procedures;

import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.Entity;

import com.crispy.mobs_of_mobs.MobsofMobsElements;

@MobsofMobsElements.ModElement.Tag
public class DynamiteItIsStruckByLightningProcedure extends MobsofMobsElements.ModElement {
	public DynamiteItIsStruckByLightningProcedure(MobsofMobsElements instance) {
		super(instance, 31);
	}

	public static void executeProcedure(java.util.HashMap<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			System.err.println("Failed to load dependency entity for procedure DynamiteItIsStruckByLightning!");
			return;
		}
		Entity entity = (Entity) dependencies.get("entity");
		if (entity instanceof LivingEntity)
			((LivingEntity) entity).setHealth((float) 0);
	}
}
