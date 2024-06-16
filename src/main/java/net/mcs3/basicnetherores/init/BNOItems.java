package net.mcs3.basicnetherores.init;

import net.mcs3.basicnetherores.BasicNetherOres;
import net.minecraft.world.item.Item;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class BNOItems {

    // Create a Deferred Register to hold Items which will all be registered under the "examplemod" namespace
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, BasicNetherOres.MODID);

    public static final RegistryObject<Item> ALUMINUM_INGOT = register("aluminum_ingot");
    public static final RegistryObject<Item> LEAD_INGOT = register("lead_ingot");
    public static final RegistryObject<Item> NICKEL_INGOT = register("nickel_ingot");
    public static final RegistryObject<Item> SILVER_INGOT = register("silver_ingot");
    public static final RegistryObject<Item> TIN_INGOT = register("tin_ingot");
    public static final RegistryObject<Item> OSMIUM_INGOT = register("osmium_ingot");
    public static final RegistryObject<Item> URANIUM_INGOT = register("uranium_ingot");
    public static final RegistryObject<Item> ZINC_INGOT = register("zinc_ingot");

    public static final RegistryObject<Item> ALUMINUM_NUGGET = register("aluminum_nugget");
    public static final RegistryObject<Item> COPPER_NUGGET = register("copper_nugget");
    public static final RegistryObject<Item> LEAD_NUGGET = register("lead_nugget");
    public static final RegistryObject<Item> NICKEL_NUGGET = register("nickel_nugget");
    public static final RegistryObject<Item> SILVER_NUGGET = register("silver_nugget");
    public static final RegistryObject<Item> OSMIUM_NUGGET = register("osmium_nugget");
    public static final RegistryObject<Item> TIN_NUGGET = register("tin_nugget");
    public static final RegistryObject<Item> ZINC_NUGGET = register("zinc_nugget");

    public static final RegistryObject<Item> RAW_ALUMINUM = register("raw_aluminum");
    public static final RegistryObject<Item> RAW_LEAD = register("raw_lead");
    public static final RegistryObject<Item> RAW_NICKEL = register("raw_nickel");
    public static final RegistryObject<Item> RAW_SILVER = register("raw_silver");
    public static final RegistryObject<Item> RAW_TIN = register("raw_tin");
    public static final RegistryObject<Item> RAW_OSMIUM = register("raw_osmium");
    public static final RegistryObject<Item> RAW_URANIUM = register("raw_uranium");
    public static final RegistryObject<Item> RAW_ZINC = register("raw_zinc");

    private static RegistryObject<Item> register(String id) {
        return BNOItems.ITEMS.register(id, () -> new Item(defaultBuilder()));
    }

    public static Item.Properties defaultBuilder() {
        return new Item.Properties();
    }
}
