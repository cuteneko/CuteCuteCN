package org.cneko.strange.items;

import net.minecraft.tags.TagKey;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.level.block.Block;
import org.jetbrains.annotations.NotNull;

public class TieredBase implements Tier {
    private int uses = 1;
    private float speed = 1;
    private float attackDamageBonus = 1f;
    private int enchantmentValue;
    private Ingredient repairIngredient = Ingredient.EMPTY;
    @Override
    public int getUses() {
        return uses;
    }
    public void setUses(int uses) {
        this.uses = uses;
    }

    @Override
    public float getSpeed() {
        return speed;
    }

    public void setSpeed(float speed) {
        this.speed = speed;
    }

    @Override
    public float getAttackDamageBonus() {
        return attackDamageBonus;
    }

    @Override
    public int getLevel() {
        return 1;
    }

    public void setAttackDamageBonus(float attackDamageBonus) {
        this.attackDamageBonus = attackDamageBonus;
    }


    @Override
    public int getEnchantmentValue() {
        return enchantmentValue;
    }

    public void setEnchantmentValue(int enchantmentValue) {
        this.enchantmentValue = enchantmentValue;
    }

    @Override
    public @NotNull Ingredient getRepairIngredient() {
        return repairIngredient;
    }

    public void setRepairIngredient(Ingredient repairIngredient) {
        this.repairIngredient = repairIngredient;
    }
}
