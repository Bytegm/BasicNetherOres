package net.mcs3.basicnetherores.data.model;

import net.mcs3.basicnetherores.Constants;
import net.mcs3.basicnetherores.init.BNOBlocks;
import net.mcs3.basicnetherores.init.BNOItems;
import net.minecraft.data.PackOutput;
import net.minecraft.world.level.block.Block;
import net.neoforged.neoforge.client.model.generators.ItemModelProvider;
import net.neoforged.neoforge.common.data.ExistingFileHelper;

import static net.mcs3.basicnetherores.util.helper.ResourceLocationHelper.prefix;

public class NeoItemModelGenerator extends ItemModelProvider {

    public NeoItemModelGenerator(PackOutput output, ExistingFileHelper existingFileHelper) {
        super(output, Constants.MOD_ID, existingFileHelper);
    }

    @Override
    protected void registerModels() {

        existingParentBlockItem(BNOBlocks.NETHER_EMERALD_ORE, "nether_emerald_ore");
        existingParentBlockItem(BNOBlocks.NETHER_DIAMOND_ORE, "nether_diamond_ore");
        existingParentBlockItem(BNOBlocks.NETHER_REDSTONE_ORE, "nether_redstone_ore");
        existingParentBlockItem(BNOBlocks.NETHER_LAPIS_ORE, "nether_lapis_ore");
        existingParentBlockItem(BNOBlocks.NETHER_COAL_ORE, "nether_coal_ore");
        existingParentBlockItem(BNOBlocks.NETHER_SILVER_ORE, "nether_silver_ore");
        existingParentBlockItem(BNOBlocks.NETHER_IRON_ORE, "nether_iron_ore");
        existingParentBlockItem(BNOBlocks.NETHER_LEAD_ORE, "nether_lead_ore");
        existingParentBlockItem(BNOBlocks.NETHER_NICKEL_ORE, "nether_nickel_ore");
        existingParentBlockItem(BNOBlocks.NETHER_COPPER_ORE, "nether_copper_ore");
        existingParentBlockItem(BNOBlocks.NETHER_ALUMINUM_ORE, "nether_aluminum_ore");
        existingParentBlockItem(BNOBlocks.NETHER_TIN_ORE, "nether_tin_ore");
        existingParentBlockItem(BNOBlocks.NETHER_OSMIUM_ORE, "nether_osmium_ore");
        existingParentBlockItem(BNOBlocks.NETHER_URANIUM_ORE, "nether_uranium_ore");
        existingParentBlockItem(BNOBlocks.NETHER_ZINC_ORE, "nether_zinc_ore");

        existingParentBlockItem(BNOBlocks.ALUMINUM_BLOCK, "aluminum_block");
        existingParentBlockItem(BNOBlocks.LEAD_BLOCK, "lead_block");
        existingParentBlockItem(BNOBlocks.NICKEL_BLOCK, "nickel_block");
        existingParentBlockItem(BNOBlocks.SILVER_BLOCK, "silver_block");
        existingParentBlockItem(BNOBlocks.TIN_BLOCK, "tin_block");
        existingParentBlockItem(BNOBlocks.OSMIUM_BLOCK, "osmium_block");
        existingParentBlockItem(BNOBlocks.URANIUM_BLOCK, "uranium_block");
        existingParentBlockItem(BNOBlocks.ZINC_BLOCK, "zinc_block");

        existingParentBlockItem(BNOBlocks.RAW_ALUMINUM_BLOCK, "raw_aluminum_block");
        existingParentBlockItem(BNOBlocks.RAW_LEAD_BLOCK, "raw_lead_block");
        existingParentBlockItem(BNOBlocks.RAW_NICKEL_BLOCK, "raw_nickel_block");
        existingParentBlockItem(BNOBlocks.RAW_SILVER_BLOCK, "raw_silver_block");
        existingParentBlockItem(BNOBlocks.RAW_TIN_BLOCK, "raw_tin_block");
        existingParentBlockItem(BNOBlocks.RAW_OSMIUM_BLOCK, "raw_osmium_block");
        existingParentBlockItem(BNOBlocks.RAW_URANIUM_BLOCK, "raw_uranium_block");
        existingParentBlockItem(BNOBlocks.RAW_ZINC_BLOCK, "raw_zinc_block");

        basicItem(BNOItems.ALUMINUM_INGOT);
        basicItem(BNOItems.LEAD_INGOT);
        basicItem(BNOItems.NICKEL_INGOT);
        basicItem(BNOItems.SILVER_INGOT);
        basicItem(BNOItems.TIN_INGOT);
        basicItem(BNOItems.OSMIUM_INGOT);
        basicItem(BNOItems.URANIUM_INGOT);
        basicItem(BNOItems.ZINC_INGOT);

        basicItem(BNOItems.ALUMINUM_NUGGET);
        basicItem(BNOItems.COPPER_NUGGET);
        basicItem(BNOItems.LEAD_NUGGET);
        basicItem(BNOItems.NICKEL_NUGGET);
        basicItem(BNOItems.SILVER_NUGGET);
        basicItem(BNOItems.TIN_NUGGET);
        basicItem(BNOItems.OSMIUM_NUGGET);
        basicItem(BNOItems.ZINC_NUGGET);

        basicItem(BNOItems.RAW_ALUMINUM);
        basicItem(BNOItems.RAW_LEAD);
        basicItem(BNOItems.RAW_NICKEL);
        basicItem(BNOItems.RAW_SILVER);
        basicItem(BNOItems.RAW_TIN);
        basicItem(BNOItems.RAW_OSMIUM);
        basicItem(BNOItems.RAW_URANIUM);
        basicItem(BNOItems.RAW_ZINC);
    }

    public void existingParentBlockItem(Block block, String blockTexture) {
        withExistingParent("item/" + blockTexture, prefix("block/" + blockTexture));
    }
}
