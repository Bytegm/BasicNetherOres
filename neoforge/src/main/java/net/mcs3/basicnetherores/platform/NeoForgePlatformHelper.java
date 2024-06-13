package net.mcs3.basicnetherores.platform;

import net.mcs3.basicnetherores.platform.services.IPlatformHelper;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.neoforged.fml.ModList;
import net.neoforged.fml.loading.FMLLoader;

public class NeoForgePlatformHelper implements IPlatformHelper {

    @Override
    public String getPlatformName() {

        return "NeoForge";
    }

    @Override
    public boolean isModLoaded(String modId) {

        return ModList.get().isLoaded(modId);
    }

    @Override
    public boolean isDevelopmentEnvironment() {

        return !FMLLoader.isProduction();
    }

    @Override
    public Item.Properties defaultItemBuilder() {
        return new Item.Properties();
    }

    @Override
    public CreativeModeTab.Builder creativeTab() {
        return CreativeModeTab.builder();
    }
}