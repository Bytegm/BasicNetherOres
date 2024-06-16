package net.mcs3.basicnetherores.data.models;

import net.mcs3.basicnetherores.BasicNetherOres;
import net.mcs3.basicnetherores.init.BNOBlocks;
import net.mcs3.basicnetherores.init.BNOItems;
import net.minecraft.data.PackOutput;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.client.model.generators.ItemModelProvider;
import net.minecraftforge.common.data.ExistingFileHelper;

import static net.mcs3.basicnetherores.util.helper.ResourceLocationHelper.prefix;

public class ItemModelGenerator extends ItemModelProvider {

    public ItemModelGenerator(PackOutput output, ExistingFileHelper existingFileHelper) {
        super(output, BasicNetherOres.MODID, existingFileHelper);
    }

    @Override
    protected void registerModels() {


        existingParentBlockItem(BNOBlocks.NETHER_EMERALD_ORE.get());
        existingParentBlockItem(BNOBlocks.NETHER_DIAMOND_ORE.get());
        existingParentBlockItem(BNOBlocks.NETHER_REDSTONE_ORE.get());
        existingParentBlockItem(BNOBlocks.NETHER_LAPIS_ORE.get());
        existingParentBlockItem(BNOBlocks.NETHER_COAL_ORE.get());
        existingParentBlockItem(BNOBlocks.NETHER_SILVER_ORE.get());
        existingParentBlockItem(BNOBlocks.NETHER_IRON_ORE.get());
        existingParentBlockItem(BNOBlocks.NETHER_LEAD_ORE.get());
        existingParentBlockItem(BNOBlocks.NETHER_NICKEL_ORE.get());
        existingParentBlockItem(BNOBlocks.NETHER_COPPER_ORE.get());
        existingParentBlockItem(BNOBlocks.NETHER_ALUMINUM_ORE.get());
        existingParentBlockItem(BNOBlocks.NETHER_TIN_ORE.get());
        existingParentBlockItem(BNOBlocks.NETHER_OSMIUM_ORE.get());
        existingParentBlockItem(BNOBlocks.NETHER_URANIUM_ORE.get());
        existingParentBlockItem(BNOBlocks.NETHER_ZINC_ORE.get());

        existingParentBlockItem(BNOBlocks.ALUMINUM_BLOCK.get());
        existingParentBlockItem(BNOBlocks.LEAD_BLOCK.get());
        existingParentBlockItem(BNOBlocks.NICKEL_BLOCK.get());
        existingParentBlockItem(BNOBlocks.SILVER_BLOCK.get());
        existingParentBlockItem(BNOBlocks.TIN_BLOCK.get());
        existingParentBlockItem(BNOBlocks.OSMIUM_BLOCK.get());
        existingParentBlockItem(BNOBlocks.URANIUM_BLOCK.get());
        existingParentBlockItem(BNOBlocks.ZINC_BLOCK.get());

        existingParentBlockItem(BNOBlocks.RAW_ALUMINUM_BLOCK.get());
        existingParentBlockItem(BNOBlocks.RAW_LEAD_BLOCK.get());
        existingParentBlockItem(BNOBlocks.RAW_NICKEL_BLOCK.get());
        existingParentBlockItem(BNOBlocks.RAW_SILVER_BLOCK.get());
        existingParentBlockItem(BNOBlocks.RAW_TIN_BLOCK.get());
        existingParentBlockItem(BNOBlocks.RAW_OSMIUM_BLOCK.get());
        existingParentBlockItem(BNOBlocks.RAW_URANIUM_BLOCK.get());
        existingParentBlockItem(BNOBlocks.RAW_ZINC_BLOCK.get());

        basicItem(BNOItems.ALUMINUM_INGOT.get());
        basicItem(BNOItems.LEAD_INGOT.get());
        basicItem(BNOItems.NICKEL_INGOT.get());
        basicItem(BNOItems.SILVER_INGOT.get());
        basicItem(BNOItems.TIN_INGOT.get());
        basicItem(BNOItems.OSMIUM_INGOT.get());
        basicItem(BNOItems.URANIUM_INGOT.get());
        basicItem(BNOItems.ZINC_INGOT.get());

        basicItem(BNOItems.ALUMINUM_NUGGET.get());
        basicItem(BNOItems.COPPER_NUGGET.get());
        basicItem(BNOItems.LEAD_NUGGET.get());
        basicItem(BNOItems.NICKEL_NUGGET.get());
        basicItem(BNOItems.SILVER_NUGGET.get());
        basicItem(BNOItems.TIN_NUGGET.get());
        basicItem(BNOItems.OSMIUM_NUGGET.get());
        basicItem(BNOItems.ZINC_NUGGET.get());

        basicItem(BNOItems.RAW_ALUMINUM.get());
        basicItem(BNOItems.RAW_LEAD.get());
        basicItem(BNOItems.RAW_NICKEL.get());
        basicItem(BNOItems.RAW_SILVER.get());
        basicItem(BNOItems.RAW_TIN.get());
        basicItem(BNOItems.RAW_OSMIUM.get());
        basicItem(BNOItems.RAW_URANIUM.get());
        basicItem(BNOItems.RAW_ZINC.get());
    }

    public void existingParentBlockItem(Block block) {
        withExistingParent(block.asItem().toString(), prefix("block/" + block.asItem()));
    }
}
