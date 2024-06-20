package net.mcs3.basicnetherores.util.helper;

import net.mcs3.basicnetherores.Constants;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.Item;

public class ResourceLocationHelper {
    public static ResourceLocation prefix(String path) {
        return ResourceLocation.fromNamespaceAndPath(Constants.MOD_ID, path);
    }

    public static String itemName(Item item) {
        return BuiltInRegistries.ITEM.getKey(item).getPath();
    }
}
