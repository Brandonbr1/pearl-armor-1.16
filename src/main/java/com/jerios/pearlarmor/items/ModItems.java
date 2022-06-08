package com.jerios.pearlarmor.items;


import com.jerios.pearlarmor.PearlArmor;
import net.minecraft.item.*;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;


public class ModItems {


        public static final DeferredRegister<Item> ITEMS =
                DeferredRegister.create(ForgeRegistries.ITEMS, PearlArmor.MOD_ID);

        public static final RegistryObject<Item> PEARL_SWORD = ITEMS.register("pearl_sword",
                () -> new SwordItem(ModItemTier.PEARLORB, 2, 3f,
                        new Item.Properties()));

        public static final RegistryObject<Item> PEARL_PICKAXE = ITEMS.register("pearl_pickaxe",
                () -> new PickaxeItem(ModItemTier.PEARLORB, 0, -2f,
                        new Item.Properties()));

        public static final RegistryObject<Item> PEARL_SHOVEL = ITEMS.register("pearl_shovel",
                () -> new ShovelItem(ModItemTier.PEARLORB, 0, -2f,
                        new Item.Properties()));

        public static final RegistryObject<Item> PEARL_AXE = ITEMS.register("pearl_axe",
                () -> new AxeItem(ModItemTier.PEARLORB, 4, -6f,
                        new Item.Properties()));

        public static final RegistryObject<Item> PEARL_HOE = ITEMS.register("pearl_hoe",
                () -> new HoeItem(ModItemTier.PEARLORB, 0, 0f,
                        new Item.Properties()));



        public static final RegistryObject<Item> PEARLORB = ITEMS.register("pearlorb",
                () -> new Item(new Item.Properties()));

        public static void register(IEventBus eventBus) {
                ITEMS.register(eventBus);
        }


}
