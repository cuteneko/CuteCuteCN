package org.cneko.strange.events;

import net.fabricmc.fabric.api.entity.event.v1.ServerLivingEntityEvents;
import net.minecraft.core.registries.Registries;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.tags.TagKey;
import net.minecraft.world.damagesource.DamageSource;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.entity.LivingEntity;
import org.cneko.strange.items.armors.SteelPlate;

public class EntityDamageEvent {
    public static void init() {
        ServerLivingEntityEvents.ALLOW_DAMAGE.register((entity, source, amount) -> {
                onEntityDamage(entity, source, amount);
            return true;
        });
    }

    private static void onEntityDamage(LivingEntity entity, DamageSource source, float amount) {
        // 判断实体是否穿了钢板
        if (entity.getItemBySlot(EquipmentSlot.CHEST).is(TagKey.create(Registries.ITEM, new ResourceLocation("c",SteelPlate.ID)))) {
            // 发送铁砧音效
            entity.playSound(SoundEvents.ANVIL_FALL, 1.0F, 1.0F);
        }
    }
}
