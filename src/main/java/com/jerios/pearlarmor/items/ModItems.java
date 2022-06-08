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

        public static final RegistryObject<Item> AMETHYST_SWORD = ITEMS.register("amethyst_sword",
                () -> new SwordItem(ModItemTier.AMETHYST, 2, 3f,
                        new Item.Properties()));

        public static final RegistryObject<Item> AMETHYST_PICKAXE = ITEMS.register("amethyst_pickaxe",
                () -> new PickaxeItem(ModItemTier.AMETHYST, 0, -1f,
                        new Item.Properties()));

        public static final RegistryObject<Item> AMETHYST_SHOVEL = ITEMS.register("amethyst_shovel",
                () -> new ShovelItem(ModItemTier.AMETHYST, 0, -1f,
                        new Item.Properties()));

        public static final RegistryObject<Item> AMETHYST_AXE = ITEMS.register("amethyst_axe",
                () -> new AxeItem(ModItemTier.AMETHYST, 4, -6f,
                        new Item.Properties()));

        public static final RegistryObject<Item> AMETHYST_HOE = ITEMS.register("amethyst_hoe",
                () -> new HoeItem(ModItemTier.AMETHYST, 0, 0f,
                        new Item.Properties()));



        public static final RegistryObject<Item> PEARLORB = ITEMS.register("pearlorb",
                () -> new Item(new Item.Properties()));

        public static void register(IEventBus eventBus) {
                ITEMS.register(eventBus);
        }


}
