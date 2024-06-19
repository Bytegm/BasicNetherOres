package net.mcs3.basicnetherores;

import net.mcs3.basicnetherores.config.NeoBasicNetherOresConfig;
import net.mcs3.basicnetherores.init.BNOBlocks;
import net.mcs3.basicnetherores.init.BNOItems;
import net.mcs3.basicnetherores.worldgen.item.ModCreativeModeTabs;
import net.minecraft.core.Registry;
import net.minecraft.core.registries.Registries;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.level.levelgen.placement.PlacedFeature;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.fml.common.Mod;
import net.neoforged.fml.javafmlmod.FMLJavaModLoadingContext;
import net.neoforged.neoforge.registries.DeferredRegister;
import net.neoforged.neoforge.registries.RegisterEvent;

import java.util.function.BiConsumer;
import java.util.function.Consumer;
import java.util.function.Supplier;


@Mod(Constants.MOD_ID)
public class NeoBasicNetherOres {

    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, Constants.MOD_ID);
    public static final DeferredRegister<PlacedFeature> PLACED_FEATURES = DeferredRegister.create(Registries.PLACED_FEATURE, Constants.MOD_ID);


    public static final Supplier<CreativeModeTab> BNO_TAB = CREATIVE_MODE_TABS.register("bno_tab", () -> ModCreativeModeTabs.BNO_TAB);

    public NeoBasicNetherOres(IEventBus bus) {

        registryInit();
        CREATIVE_MODE_TABS.register(bus);

        NeoBasicNetherOresConfig.setup();
    }

    private void registryInit() {
        bind(Registries.BLOCK, BNOBlocks::registerBlocks);
        bind(Registries.ITEM, BNOBlocks::registerItemBlocks);
        bind(Registries.ITEM, BNOItems::registerItems);
    }

    private static <T> void bind(ResourceKey<Registry<T>> registry, Consumer<BiConsumer<T, ResourceLocation>> source) {
        FMLJavaModLoadingContext.get().getModEventBus().addListener((RegisterEvent event) -> {
            if (registry.equals(event.getRegistryKey())) {
                source.accept((t, rl) -> event.register(registry, rl, () -> t));
            }
        });
    }
}
