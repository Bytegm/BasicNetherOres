package com.cscot.basicnetherores.world;


import com.cscot.basicnetherores.world.gen.feature.ModOreFeatures;
import com.google.common.collect.Lists;
import net.minecraft.util.RegistryKey;
import net.minecraft.util.registry.WorldGenRegistries;
import net.minecraft.world.biome.Biome;
import net.minecraft.world.biome.BiomeGenerationSettings;
import net.minecraft.world.gen.GenerationStage;
import net.minecraft.world.gen.feature.ConfiguredFeature;
import net.minecraftforge.fml.common.ObfuscationReflectionHelper;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.function.Supplier;


public class OreGenerator
{
    public static void setupOreGenerator()
    {
        for (Map.Entry<RegistryKey<Biome>, Biome> biome : WorldGenRegistries.field_243657_i.getEntries()) {

            if (biome.getValue().getCategory().equals(Biome.Category.NETHER)){
                addNetherOres(biome.getValue(), GenerationStage.Decoration.UNDERGROUND_ORES, ModOreFeatures.ORE_EMERALD_NETHER);





                /*if (OreGenerationConfig.emeraldGeneration.get()) {
                    biome.addFeature(GenerationStage.Decoration.UNDERGROUND_ORES, Feature.ORE.withConfiguration(
                            new OreFeatureConfig(NETHERRACK, BlockOreList.netheremerald_ore.getDefaultState(), OreGenerationConfig.emeraldVeinSize.get())).withPlacement(Placement.COUNT_RANGE.configure(
                            new CountRangeConfig(OreGenerationConfig.emeraldPerChunk.get(), OreGenerationConfig.emeraldMinHeight.get(), 0, OreGenerationConfig.emeraldMaxHeight.get()))));
                }

                if (OreGenerationConfig.diamondGeneration.get()) {
                    biome.addFeature(GenerationStage.Decoration.UNDERGROUND_ORES, Feature.ORE.withConfiguration(
                            new OreFeatureConfig(NETHERRACK, BlockOreList.netherdiamond_ore.getDefaultState(), OreGenerationConfig.diamondVeinSize.get())).withPlacement(Placement.COUNT_RANGE.configure(
                            new CountRangeConfig(OreGenerationConfig.diamondPerChunk.get(), OreGenerationConfig.diamondMinHeight.get(), 0, OreGenerationConfig.diamondMaxHeight.get()))));
                }

                if (OreGenerationConfig.redstoneGeneration.get()) {
                    biome.addFeature(GenerationStage.Decoration.UNDERGROUND_ORES, Feature.ORE.withConfiguration(
                            new OreFeatureConfig(NETHERRACK, BlockOreList.netherredstone_ore.getDefaultState(), OreGenerationConfig.redstoneVeinSize.get())).withPlacement(Placement.COUNT_RANGE.configure(
                            new CountRangeConfig(OreGenerationConfig.redstonePerChunk.get(), OreGenerationConfig.redstoneMinHeight.get(), 0, OreGenerationConfig.redstoneMaxHeight.get()))));
                }

                if (OreGenerationConfig.lapisGeneration.get()) {
                    biome.addFeature(GenerationStage.Decoration.UNDERGROUND_ORES, Feature.ORE.withConfiguration(
                            new OreFeatureConfig(NETHERRACK, BlockOreList.netherlapis_ore.getDefaultState(), OreGenerationConfig.lapisVeinSize.get())).withPlacement(Placement.COUNT_RANGE.configure(
                            new CountRangeConfig(OreGenerationConfig.lapisPerChunk.get(), OreGenerationConfig.lapisMinHeight.get(), 0, OreGenerationConfig.lapisMaxHeight.get()))));
                }

                if (OreGenerationConfig.coalGeneration.get()) {
                    biome.addFeature(GenerationStage.Decoration.UNDERGROUND_ORES, Feature.ORE.withConfiguration(
                            new OreFeatureConfig(NETHERRACK, BlockOreList.nethercoal_ore.getDefaultState(), OreGenerationConfig.coalVeinSize.get())).withPlacement(Placement.COUNT_RANGE.configure(
                            new CountRangeConfig(OreGenerationConfig.coalPerChunk.get(), OreGenerationConfig.coalMinHeight.get(), 0, OreGenerationConfig.coalMaxHeight.get()))));
                }

                if (OreGenerationConfig.silverGeneration.get()) {
                    biome.addFeature(GenerationStage.Decoration.UNDERGROUND_ORES, Feature.ORE.withConfiguration(
                            new OreFeatureConfig(NETHERRACK, BlockOreList.nethersilver_ore.getDefaultState(), OreGenerationConfig.silverVeinSize.get())).withPlacement(Placement.COUNT_RANGE.configure(
                            new CountRangeConfig(OreGenerationConfig.silverPerChunk.get(), OreGenerationConfig.silverMinHeight.get(), 0, OreGenerationConfig.silverMaxHeight.get()))));
                }

                if (OreGenerationConfig.ironGeneration.get()) {
                    biome.addFeature(GenerationStage.Decoration.UNDERGROUND_ORES, Feature.ORE.withConfiguration(
                            new OreFeatureConfig(NETHERRACK, BlockOreList.netheriron_ore.getDefaultState(), OreGenerationConfig.ironVeinSize.get())).withPlacement(Placement.COUNT_RANGE.configure(
                            new CountRangeConfig(OreGenerationConfig.ironPerChunk.get(), OreGenerationConfig.ironMinHeight.get(), 0, OreGenerationConfig.ironMaxHeight.get()))));
                }

                if (OreGenerationConfig.leadGeneration.get()) {
                    biome.addFeature(GenerationStage.Decoration.UNDERGROUND_ORES, Feature.ORE.withConfiguration(
                            new OreFeatureConfig(NETHERRACK, BlockOreList.netherlead_ore.getDefaultState(), OreGenerationConfig.leadVeinSize.get())).withPlacement(Placement.COUNT_RANGE.configure(
                            new CountRangeConfig(OreGenerationConfig.leadPerChunk.get(), OreGenerationConfig.leadMinHeight.get(), 0, OreGenerationConfig.leadMaxHeight.get()))));
                }

                if (OreGenerationConfig.nickelGeneration.get()) {
                    biome.addFeature(GenerationStage.Decoration.UNDERGROUND_ORES, Feature.ORE.withConfiguration(
                            new OreFeatureConfig(NETHERRACK, BlockOreList.nethernickel_ore.getDefaultState(), OreGenerationConfig.nickelVeinSize.get())).withPlacement(Placement.COUNT_RANGE.configure(
                            new CountRangeConfig(OreGenerationConfig.nickelPerChunk.get(), OreGenerationConfig.nickelMinHeight.get(), 0, OreGenerationConfig.nickelMaxHeight.get()))));
                }

                if (OreGenerationConfig.copperGeneration.get()) {
                    biome.addFeature(GenerationStage.Decoration.UNDERGROUND_ORES, Feature.ORE.withConfiguration(
                            new OreFeatureConfig(NETHERRACK, BlockOreList.nethercopper_ore.getDefaultState(), OreGenerationConfig.copperVeinSize.get())).withPlacement(Placement.COUNT_RANGE.configure(
                            new CountRangeConfig(OreGenerationConfig.copperPerChunk.get(), OreGenerationConfig.copperMinHeight.get(), 0, OreGenerationConfig.copperMaxHeight.get()))));
                }

                if (OreGenerationConfig.aluminumGeneration.get()) {
                    biome.addFeature(GenerationStage.Decoration.UNDERGROUND_ORES, Feature.ORE.withConfiguration(
                            new OreFeatureConfig(NETHERRACK, BlockOreList.netheraluminum_ore.getDefaultState(), OreGenerationConfig.aluminumVeinSize.get())).withPlacement(Placement.COUNT_RANGE.configure(
                            new CountRangeConfig(OreGenerationConfig.aluminumPerChunk.get(), OreGenerationConfig.aluminumMinHeight.get(), 0, OreGenerationConfig.aluminumMaxHeight.get()))));
                }

                if (OreGenerationConfig.tinGeneration.get()) {
                    biome.addFeature(GenerationStage.Decoration.UNDERGROUND_ORES, Feature.ORE.withConfiguration(
                            new OreFeatureConfig(NETHERRACK, BlockOreList.nethertin_ore.getDefaultState(), OreGenerationConfig.tinVeinSize.get())).withPlacement(Placement.COUNT_RANGE.configure(
                            new CountRangeConfig(OreGenerationConfig.tinPerChunk.get(), OreGenerationConfig.tinMinHeight.get(), 0, OreGenerationConfig.tinMaxHeight.get()))));
                }

                if (OreGenerationConfig.osmiumGeneration.get()) {
                    biome.addFeature(GenerationStage.Decoration.UNDERGROUND_ORES, Feature.ORE.withConfiguration(
                            new OreFeatureConfig(NETHERRACK, BlockOreList.netherosmium_ore.getDefaultState(), OreGenerationConfig.osmiumVeinSize.get())).withPlacement(Placement.COUNT_RANGE.configure(
                            new CountRangeConfig(OreGenerationConfig.osmiumPerChunk.get(), OreGenerationConfig.osmiumMinHeight.get(), 0, OreGenerationConfig.osmiumMaxHeight.get()))));
                }

                if (OreGenerationConfig.uraniumGeneration.get()) {
                    biome.addFeature(GenerationStage.Decoration.UNDERGROUND_ORES, Feature.ORE.withConfiguration(
                            new OreFeatureConfig(NETHERRACK, BlockOreList.netheruranium_ore.getDefaultState(), OreGenerationConfig.uraniumVeinSize.get())).withPlacement(Placement.COUNT_RANGE.configure(
                            new CountRangeConfig(OreGenerationConfig.uraniumPerChunk.get(), OreGenerationConfig.uraniumMinHeight.get(), 0, OreGenerationConfig.uraniumMaxHeight.get()))));
                }*/
            }
        }
    }

    //Add Nether Ores Method adapted from DrunkBlood's Lucky Ore mod https://github.com/DrunkBlood/Lucky-Ore
    public static void addNetherOres(Biome biome, GenerationStage.Decoration decoration, ConfiguredFeature<?, ?> configuredFeature)
    {
        List<List<Supplier<ConfiguredFeature<?, ?>>>> biomeFeatures = new ArrayList<>(
                biome.func_242440_e().func_242498_c());
        while (biomeFeatures.size() <= decoration.ordinal()) {
            biomeFeatures.add(Lists.newArrayList());
        }
        List<Supplier<ConfiguredFeature<?, ?>>> features = new ArrayList<>(biomeFeatures.get(decoration.ordinal()));
        features.add(() -> configuredFeature);
        biomeFeatures.set(decoration.ordinal(), features);

        ObfuscationReflectionHelper.setPrivateValue(BiomeGenerationSettings.class, biome.func_242440_e(), biomeFeatures,
                "field_242484_f");
    }
}
