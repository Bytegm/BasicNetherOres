package net.mcs3.basicnetherores.init;

import net.minecraft.core.registries.Registries;
import net.minecraft.data.worldgen.BootstrapContext;
import net.minecraft.resources.ResourceKey;
import net.minecraft.tags.BlockTags;
import net.minecraft.world.level.levelgen.feature.ConfiguredFeature;
import net.minecraft.world.level.levelgen.feature.Feature;
import net.minecraft.world.level.levelgen.feature.configurations.FeatureConfiguration;
import net.minecraft.world.level.levelgen.feature.configurations.OreConfiguration;
import net.minecraft.world.level.levelgen.structure.templatesystem.RuleTest;
import net.minecraft.world.level.levelgen.structure.templatesystem.TagMatchTest;

import static net.mcs3.basicnetherores.util.helper.ResourceLocationHelper.prefix;

public class BNOConfiguredFeatures {

    private static final RuleTest NETHER_ORE_REPLACEABLES = new TagMatchTest(BlockTags.BASE_STONE_NETHER);

    public static final ResourceKey<ConfiguredFeature<?, ?>> ORE_EMERALD_CONFIGURED_FEATURE = registerKey("ore_emerald_nether");
    public static final ResourceKey<ConfiguredFeature<?, ?>> ORE_DIAMOND_CONFIGURED_FEATURE = registerKey("ore_diamond_nether");
    public static final ResourceKey<ConfiguredFeature<?, ?>> ORE_REDSTONE_CONFIGURED_FEATURE = registerKey("ore_redstone_nether");
    public static final ResourceKey<ConfiguredFeature<?, ?>> ORE_LAPIS_CONFIGURED_FEATURE = registerKey("ore_lapis_nether");
    public static final ResourceKey<ConfiguredFeature<?, ?>> ORE_COAL_CONFIGURED_FEATURE = registerKey("ore_coal_nether");
    public static final ResourceKey<ConfiguredFeature<?, ?>> ORE_SILVER_CONFIGURED_FEATURE = registerKey("ore_silver_nether");
    public static final ResourceKey<ConfiguredFeature<?, ?>> ORE_IRON_CONFIGURED_FEATURE = registerKey("ore_iron_nether");
    public static final ResourceKey<ConfiguredFeature<?, ?>> ORE_LEAD_CONFIGURED_FEATURE = registerKey("ore_lead_nether");
    public static final ResourceKey<ConfiguredFeature<?, ?>> ORE_NICKEL_CONFIGURED_FEATURE = registerKey("ore_nickel_nether");
    public static final ResourceKey<ConfiguredFeature<?, ?>> ORE_COPPER_CONFIGURED_FEATURE = registerKey("ore_copper_nether");
    public static final ResourceKey<ConfiguredFeature<?, ?>> ORE_ALUMINUM_CONFIGURED_FEATURE = registerKey("ore_aluminum_nether");
    public static final ResourceKey<ConfiguredFeature<?, ?>> ORE_TIN_CONFIGURED_FEATURE = registerKey("ore_tin_nether");
    public static final ResourceKey<ConfiguredFeature<?, ?>> ORE_OSMIUM_CONFIGURED_FEATURE = registerKey("ore_osmium_nether");
    public static final ResourceKey<ConfiguredFeature<?, ?>> ORE_URANIUM_CONFIGURED_FEATURE = registerKey("ore_uranium_nether");
    public static final ResourceKey<ConfiguredFeature<?, ?>> ORE_ZINC_CONFIGURED_FEATURE = registerKey("ore_zinc_nether");

    public static void bootstrap(BootstrapContext<ConfiguredFeature<?, ?>> context) {

        register(context, ORE_EMERALD_CONFIGURED_FEATURE, Feature.ORE, new OreConfiguration(NETHER_ORE_REPLACEABLES, BNOBlocks.NETHER_EMERALD_ORE.get().defaultBlockState(), 4));
        register(context, ORE_DIAMOND_CONFIGURED_FEATURE, Feature.ORE, new OreConfiguration(NETHER_ORE_REPLACEABLES, BNOBlocks.NETHER_DIAMOND_ORE.get().defaultBlockState(), 8));
        register(context, ORE_REDSTONE_CONFIGURED_FEATURE, Feature.ORE, new OreConfiguration(NETHER_ORE_REPLACEABLES, BNOBlocks.NETHER_REDSTONE_ORE.get().defaultBlockState(), 8));
        register(context, ORE_LAPIS_CONFIGURED_FEATURE, Feature.ORE, new OreConfiguration(NETHER_ORE_REPLACEABLES, BNOBlocks.NETHER_LAPIS_ORE.get().defaultBlockState(), 7));
        register(context, ORE_COAL_CONFIGURED_FEATURE, Feature.ORE, new OreConfiguration(NETHER_ORE_REPLACEABLES, BNOBlocks.NETHER_COAL_ORE.get().defaultBlockState(), 17));
        register(context, ORE_SILVER_CONFIGURED_FEATURE, Feature.ORE, new OreConfiguration(NETHER_ORE_REPLACEABLES, BNOBlocks.NETHER_SILVER_ORE.get().defaultBlockState(), 9));
        register(context, ORE_IRON_CONFIGURED_FEATURE, Feature.ORE, new OreConfiguration(NETHER_ORE_REPLACEABLES, BNOBlocks.NETHER_IRON_ORE.get().defaultBlockState(), 8));
        register(context, ORE_LEAD_CONFIGURED_FEATURE, Feature.ORE, new OreConfiguration(NETHER_ORE_REPLACEABLES, BNOBlocks.NETHER_LEAD_ORE.get().defaultBlockState(), 8));
        register(context, ORE_NICKEL_CONFIGURED_FEATURE, Feature.ORE, new OreConfiguration(NETHER_ORE_REPLACEABLES, BNOBlocks.NETHER_NICKEL_ORE.get().defaultBlockState(), 4));
        register(context, ORE_COPPER_CONFIGURED_FEATURE, Feature.ORE, new OreConfiguration(NETHER_ORE_REPLACEABLES, BNOBlocks.NETHER_COPPER_ORE.get().defaultBlockState(), 8));
        register(context, ORE_ALUMINUM_CONFIGURED_FEATURE, Feature.ORE, new OreConfiguration(NETHER_ORE_REPLACEABLES, BNOBlocks.NETHER_ALUMINUM_ORE.get().defaultBlockState(), 8));
        register(context, ORE_TIN_CONFIGURED_FEATURE, Feature.ORE, new OreConfiguration(NETHER_ORE_REPLACEABLES, BNOBlocks.NETHER_TIN_ORE.get().defaultBlockState(), 8));
        register(context, ORE_OSMIUM_CONFIGURED_FEATURE, Feature.ORE, new OreConfiguration(NETHER_ORE_REPLACEABLES, BNOBlocks.NETHER_OSMIUM_ORE.get().defaultBlockState(), 8));
        register(context, ORE_URANIUM_CONFIGURED_FEATURE, Feature.ORE, new OreConfiguration(NETHER_ORE_REPLACEABLES, BNOBlocks.NETHER_URANIUM_ORE.get().defaultBlockState(), 4));
        register(context, ORE_ZINC_CONFIGURED_FEATURE, Feature.ORE, new OreConfiguration(NETHER_ORE_REPLACEABLES, BNOBlocks.NETHER_ZINC_ORE.get().defaultBlockState(), 12));
    }

    public static ResourceKey<ConfiguredFeature<?, ?>> registerKey(String name) {
        return ResourceKey.create(Registries.CONFIGURED_FEATURE, prefix(name));
    }

    private static <FC extends FeatureConfiguration, F extends Feature<FC>>
    void register(BootstrapContext<ConfiguredFeature<?, ?>> context, ResourceKey<ConfiguredFeature<?, ?>> key, F feature, FC configuration) {
        context.register(key, new ConfiguredFeature<>(feature, configuration));
    }
}
