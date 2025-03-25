package net.hatsontv.enchantedfish.enchantment;

import net.minecraft.core.BlockPos;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.world.entity.*;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.enchantment.Enchantment;
import net.minecraft.world.item.enchantment.EnchantmentCategory;

public class FishSpawningEnchantment extends Enchantment {
    public FishSpawningEnchantment(Rarity pRarity, EnchantmentCategory pCategory, EquipmentSlot... pApplicableSlots) {
        super(pRarity, pCategory, pApplicableSlots);
    }

    @Override
    public void doPostAttack(LivingEntity pAttacker, Entity pTarget, int pLevel) {
        if(!pAttacker.level().isClientSide()) {
            ServerLevel world = ((ServerLevel) pAttacker.level());
            BlockPos position = pTarget.blockPosition();

            if(pLevel == 1) {
                EntityType.COD.spawn(world, position,
                        MobSpawnType.TRIGGERED);
            }

            if(pLevel == 2) {
                EntityType.COD.spawn(world, position,
                        MobSpawnType.TRIGGERED);
                EntityType.COD.spawn(world, position,
                        MobSpawnType.TRIGGERED);
            }

            if(pLevel == 3) {
                EntityType.COD.spawn(world, position,
                        MobSpawnType.TRIGGERED);
                EntityType.COD.spawn(world, position,
                        MobSpawnType.TRIGGERED);
                EntityType.COD.spawn(world, position,
                        MobSpawnType.TRIGGERED);
            }
        }
    }

    @Override
    public int getMaxLevel() {
        return 3;
    }
}
