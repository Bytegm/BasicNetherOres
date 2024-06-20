package net.mcs3.basicnetherores.client.renderer;

import net.mcs3.basicnetherores.init.BNOBlocks;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.world.level.block.Block;

import java.util.function.BiConsumer;

public class BlockRenderLayers {

    public static void registerRenderLayers(BiConsumer<Block, RenderType> consumer) {

        consumer.accept(BNOBlocks.NETHER_EMERALD_ORE, RenderType.cutout());
        consumer.accept(BNOBlocks.NETHER_DIAMOND_ORE, RenderType.cutout());
        consumer.accept(BNOBlocks.NETHER_REDSTONE_ORE, RenderType.cutout());
        consumer.accept(BNOBlocks.NETHER_LAPIS_ORE, RenderType.cutout());
        consumer.accept(BNOBlocks.NETHER_COAL_ORE, RenderType.cutout());
        consumer.accept(BNOBlocks.NETHER_SILVER_ORE, RenderType.cutout());
        consumer.accept(BNOBlocks.NETHER_IRON_ORE, RenderType.cutout());
        consumer.accept(BNOBlocks.NETHER_LEAD_ORE, RenderType.cutout());
        consumer.accept(BNOBlocks.NETHER_NICKEL_ORE, RenderType.cutout());
        consumer.accept(BNOBlocks.NETHER_COPPER_ORE, RenderType.cutout());
        consumer.accept(BNOBlocks.NETHER_ALUMINUM_ORE, RenderType.cutout());
        consumer.accept(BNOBlocks.NETHER_TIN_ORE, RenderType.cutout());
        consumer.accept(BNOBlocks.NETHER_OSMIUM_ORE, RenderType.cutout());
        consumer.accept(BNOBlocks.NETHER_URANIUM_ORE, RenderType.cutout());
        consumer.accept(BNOBlocks.NETHER_ZINC_ORE, RenderType.cutout());

        consumer.accept(BNOBlocks.BASALT_EMERALD_ORE, RenderType.cutout());
        consumer.accept(BNOBlocks.BASALT_DIAMOND_ORE, RenderType.cutout());
        consumer.accept(BNOBlocks.BASALT_REDSTONE_ORE, RenderType.cutout());
        consumer.accept(BNOBlocks.BASALT_LAPIS_ORE, RenderType.cutout());
        consumer.accept(BNOBlocks.BASALT_COAL_ORE, RenderType.cutout());
        consumer.accept(BNOBlocks.BASALT_SILVER_ORE, RenderType.cutout());
        consumer.accept(BNOBlocks.BASALT_IRON_ORE, RenderType.cutout());
        consumer.accept(BNOBlocks.BASALT_LEAD_ORE, RenderType.cutout());
        consumer.accept(BNOBlocks.BASALT_NICKEL_ORE, RenderType.cutout());
        consumer.accept(BNOBlocks.BASALT_COPPER_ORE, RenderType.cutout());
        consumer.accept(BNOBlocks.BASALT_ALUMINUM_ORE, RenderType.cutout());
        consumer.accept(BNOBlocks.BASALT_TIN_ORE, RenderType.cutout());
        consumer.accept(BNOBlocks.BASALT_OSMIUM_ORE, RenderType.cutout());
        consumer.accept(BNOBlocks.BASALT_URANIUM_ORE, RenderType.cutout());
        consumer.accept(BNOBlocks.BASALT_ZINC_ORE, RenderType.cutout());

        consumer.accept(BNOBlocks.SOUL_EMERALD_ORE, RenderType.cutout());
        consumer.accept(BNOBlocks.SOUL_DIAMOND_ORE, RenderType.cutout());
        consumer.accept(BNOBlocks.SOUL_REDSTONE_ORE, RenderType.cutout());
        consumer.accept(BNOBlocks.SOUL_LAPIS_ORE, RenderType.cutout());
        consumer.accept(BNOBlocks.SOUL_COAL_ORE, RenderType.cutout());
        consumer.accept(BNOBlocks.SOUL_SILVER_ORE, RenderType.cutout());
        consumer.accept(BNOBlocks.SOUL_IRON_ORE, RenderType.cutout());
        consumer.accept(BNOBlocks.SOUL_LEAD_ORE, RenderType.cutout());
        consumer.accept(BNOBlocks.SOUL_NICKEL_ORE, RenderType.cutout());
        consumer.accept(BNOBlocks.SOUL_COPPER_ORE, RenderType.cutout());
        consumer.accept(BNOBlocks.SOUL_ALUMINUM_ORE, RenderType.cutout());
        consumer.accept(BNOBlocks.SOUL_TIN_ORE, RenderType.cutout());
        consumer.accept(BNOBlocks.SOUL_OSMIUM_ORE, RenderType.cutout());
        consumer.accept(BNOBlocks.SOUL_URANIUM_ORE, RenderType.cutout());
        consumer.accept(BNOBlocks.SOUL_ZINC_ORE, RenderType.cutout());
    }

    private BlockRenderLayers() {}
}
