package com.jerios.pearlarmor.items;

import net.minecraft.inventory.EquipmentSlotType;
import net.minecraft.item.IArmorMaterial;
import net.minecraft.item.Items;
import net.minecraft.item.crafting.Ingredient;
import net.minecraft.util.LazyValue;
import net.minecraft.util.SoundEvent;
import com.jerios.pearlarmor.PearlArmor;
import net.minecraft.util.SoundEvents;
import java.util.function.Supplier;
import net.minecraft.inventory.EquipmentSlotType;
import net.minecraft.item.crafting.Ingredient;
import net.minecraft.util.LazyValue;
import net.minecraft.util.SoundEvent;
import net.minecraft.util.SoundEvents;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;

public enum ModMaterialArmor implements IArmorMaterial {


    PEARLMATERIAL("pearl", 7, new int[] {3, 6, 8,3}, 12, SoundEvents.ARMOR_EQUIP_DIAMOND, 3.0f, 0.0f, (null)  );




    private static final int[] MAX_DAMAGE_ARRAY = new int[]{13, 15, 16, 11};

    private final String name;
    private final int durabilityMultiplier;
    private final int[] slotProtections;
    private final int enchantmentValue;
    private final SoundEvent sound;
    private final float toughness;
    private final float knockbackResistance;
    private final LazyValue<Ingredient> repairIngredient;

    ModMaterialArmor(String name, int durabilityMultiplier, int[] slotProtections, int enchantmentValue, SoundEvent sound, float toughness, float knockbackResistance, LazyValue<Ingredient> repairIngredient) {
        this.name = name; //yes
        this.durabilityMultiplier = durabilityMultiplier; // yes
        this.slotProtections = slotProtections;
        this.enchantmentValue = enchantmentValue; // yes
        this.sound = sound; //yes
        this.toughness = toughness; //yes
        this.knockbackResistance = knockbackResistance; //yes
        this.repairIngredient = repairIngredient;
    }


    @Override
    public int getDurabilityForSlot(EquipmentSlotType p_200896_1_) {
        return MAX_DAMAGE_ARRAY[p_200896_1_.getIndex()] * this.durabilityMultiplier;
    }

    @Override
    public int getDefenseForSlot(EquipmentSlotType p_200902_1_) {
        return this.slotProtections[p_200902_1_.getIndex()];
    }

    @Override
    public int getEnchantmentValue() {
        return this.enchantmentValue;
    }

    @Override
    public SoundEvent getEquipSound() {
        return this.sound;
    }

    @Override
    public Ingredient getRepairIngredient() {
        return this.repairIngredient.get();
    }

    @Override
    @OnlyIn(Dist.CLIENT)
    public String getName() {
        return this.name;
    }

    @Override
    public float getToughness() {
        return this.toughness;
    }

    @Override
    public float getKnockbackResistance() {
        return this.knockbackResistance;
    }

}
