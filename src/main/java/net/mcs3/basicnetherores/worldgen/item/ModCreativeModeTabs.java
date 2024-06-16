package net.mcs3.basicnetherores.worldgen.item;

import net.mcs3.basicnetherores.BasicNetherOres;
import net.mcs3.basicnetherores.init.BNOBlocks;
import net.mcs3.basicnetherores.init.BNOItems;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;


@SuppressWarnings("unused")
public class ModCreativeModeTabs {

    public static final DeferredRegister<CreativeModeTab> BNO_CREATIVE_MODE_TABS = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, BasicNetherOres.MODID);

    public static final RegistryObject<CreativeModeTab> BNO_TAB = BNO_CREATIVE_MODE_TABS.register("basicnetherores", () -> CreativeModeTab.builder()
            .icon(() -> new ItemStack(BNOBlocks.NETHER_EMERALD_ORE.get().asItem()))
            .title(Component.translatable("itemGroup.bno.basicnetherores"))
            .displayItems((params, output) -> {
                output.accept(BNOBlocks.NETHER_EMERALD_ORE.get().asItem());
                output.accept(BNOBlocks.NETHER_DIAMOND_ORE.get().asItem());
                output.accept(BNOBlocks.NETHER_REDSTONE_ORE.get().asItem());
                output.accept(BNOBlocks.NETHER_LAPIS_ORE.get().asItem());
                output.accept(BNOBlocks.NETHER_COAL_ORE.get().asItem());
                output.accept(BNOBlocks.NETHER_SILVER_ORE.get().asItem());
                output.accept(BNOBlocks.NETHER_IRON_ORE.get().asItem());
                output.accept(BNOBlocks.NETHER_LEAD_ORE.get().asItem());
                output.accept(BNOBlocks.NETHER_NICKEL_ORE.get().asItem());
                output.accept(BNOBlocks.NETHER_COPPER_ORE.get().asItem());
                output.accept(BNOBlocks.NETHER_ALUMINUM_ORE.get().asItem());
                output.accept(BNOBlocks.NETHER_TIN_ORE.get().asItem());
                output.accept(BNOBlocks.NETHER_OSMIUM_ORE.get().asItem());
                output.accept(BNOBlocks.NETHER_URANIUM_ORE.get().asItem());
                output.accept(BNOBlocks.NETHER_ZINC_ORE.get().asItem());

                output.accept(BNOBlocks.ALUMINUM_BLOCK.get().asItem());
                output.accept(BNOBlocks.LEAD_BLOCK.get().asItem());
                output.accept(BNOBlocks.NICKEL_BLOCK.get().asItem());
                output.accept(BNOBlocks.SILVER_BLOCK.get().asItem());
                output.accept(BNOBlocks.TIN_BLOCK.get().asItem());
                output.accept(BNOBlocks.OSMIUM_BLOCK.get().asItem());
                output.accept(BNOBlocks.URANIUM_BLOCK.get().asItem());
                output.accept(BNOBlocks.ZINC_BLOCK.get().asItem());

                output.accept(BNOItems.ALUMINUM_INGOT.get());
                output.accept(BNOItems.LEAD_INGOT.get());
                output.accept(BNOItems.NICKEL_INGOT.get());
                output.accept(BNOItems.SILVER_INGOT.get());
                output.accept(BNOItems.TIN_INGOT.get());
                output.accept(BNOItems.OSMIUM_INGOT.get());
                output.accept(BNOItems.URANIUM_INGOT.get());
                output.accept(BNOItems.ZINC_INGOT.get());

                output.accept(BNOItems.ALUMINUM_NUGGET.get());
                output.accept(BNOItems.COPPER_NUGGET.get());
                output.accept(BNOItems.LEAD_NUGGET.get());
                output.accept(BNOItems.NICKEL_NUGGET.get());
                output.accept(BNOItems.SILVER_NUGGET.get());
                output.accept(BNOItems.OSMIUM_NUGGET.get());
                output.accept(BNOItems.TIN_NUGGET.get());
                output.accept(BNOItems.ZINC_NUGGET.get());

                output.accept(BNOBlocks.RAW_ALUMINUM_BLOCK.get().asItem());
                output.accept(BNOBlocks.RAW_LEAD_BLOCK.get().asItem());
                output.accept(BNOBlocks.RAW_NICKEL_BLOCK.get().asItem());
                output.accept(BNOBlocks.RAW_SILVER_BLOCK.get().asItem());
                output.accept(BNOBlocks.RAW_TIN_BLOCK.get().asItem());
                output.accept(BNOBlocks.RAW_OSMIUM_BLOCK.get().asItem());
                output.accept(BNOBlocks.RAW_URANIUM_BLOCK.get().asItem());
                output.accept(BNOBlocks.RAW_ZINC_BLOCK.get().asItem());

                output.accept(BNOItems.RAW_ALUMINUM.get());
                output.accept(BNOItems.RAW_LEAD.get());
                output.accept(BNOItems.RAW_NICKEL.get());
                output.accept(BNOItems.RAW_SILVER.get());
                output.accept(BNOItems.RAW_TIN.get());
                output.accept(BNOItems.RAW_OSMIUM.get());
                output.accept(BNOItems.RAW_URANIUM.get());
                output.accept(BNOItems.RAW_ZINC.get());
            })
            .build());
}
