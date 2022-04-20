package net.thunderstrikers.oresmod.item;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import net.thunderstrikers.oresmod.OresMod;

public class ModItems {
    public static final Item THUNDERITE_INGOT = registerItem("thunderite_ingot,",
            new Item(new FabricItemSettings().group(ItemGroup.MISC)));

    public static final Item THUNDERITE_NUGGET = registerItem("thunderite_nugget,",
            new Item(new FabricItemSettings().group(ItemGroup.MISC)));

    public static final Item THUNDERITE_SCRAP = registerItem("thunderite_scrap,",
            new Item(new FabricItemSettings().group(ItemGroup.MISC)));




    private static Item registerItem(String name, Item item) {
        return Registry.register(Registry.ITEM, new Identifier(OresMod.MOD_ID, name), item);
    }

    public static void registerModItems(){
        OresMod.LOGGER.info("Registering Mod Items for " + OresMod.MOD_ID);
    }
}
