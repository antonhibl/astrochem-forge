package com.kuzhcola.astrochem;

import net.minecraft.world.item.Item;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, AstroChem.MODID);

    // Petroleum
    public static final RegistryObject<Item> PETROLEUM = ITEMS.register("petroleum",
            () -> new Item(new Item.Properties().tab(AstroChem.ASTROCHEM_TAB)));

    // Benzene
    public static final RegistryObject<Item> BENZENE = ITEMS.register("benzene",
            () -> new Item(new Item.Properties().tab(AstroChem.ASTROCHEM_TAB)));

    // Methanol
    public static final RegistryObject<Item> METHANOL = ITEMS.register("methanol",
            () -> new Item(new Item.Properties().tab(AstroChem.ASTROCHEM_TAB)));

    // Nitro-Methane
    public static final RegistryObject<Item> NITRO_METHANE = ITEMS.register("nitro_methane",
            () -> new Item(new Item.Properties().tab(AstroChem.ASTROCHEM_TAB)));

    // Cryo-Fluid Phial
    public static final RegistryObject<Item> CRYO_FLUID_PHIAL = ITEMS.register("cryo_fluid_phial",
            () -> new Item(new Item.Properties().tab(AstroChem.ASTROCHEM_TAB)));

    // Cryo-Nitrogen
    public static final RegistryObject<Item> CRYOGENIC_NITROGEN = ITEMS.register("cryogenic_nitrogen",
            () -> new Item(new Item.Properties().tab(AstroChem.ASTROCHEM_TAB)));

    // Cryo-Oxygen
    public static final RegistryObject<Item> CRYOGENIC_OXYGEN = ITEMS.register("cryogenic_oxygen",
            () -> new Item(new Item.Properties().tab(AstroChem.ASTROCHEM_TAB)));

    // Desh
    public static final RegistryObject<Item> DESH_DUST = ITEMS.register("desh_dust",
            () -> new Item(new Item.Properties().tab(AstroChem.ASTROCHEM_TAB)));

    // Ostrum
    public static final RegistryObject<Item> OSTRUM_DUST = ITEMS.register("ostrum_dust",
            () -> new Item(new Item.Properties().tab(AstroChem.ASTROCHEM_TAB)));

    // Calorite
    public static final RegistryObject<Item> CALORITE_DUST = ITEMS.register("calorite_dust",
            () -> new Item(new Item.Properties().tab(AstroChem.ASTROCHEM_TAB)));
}
