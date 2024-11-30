package net.astrub.boatMakerMod.item;

import net.astrub.boatMakerMod.BoatMakerMod;
import net.astrub.boatMakerMod.item.costum.FuelItem;
import net.astrub.boatMakerMod.item.costum.MetalDetectorItem;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, BoatMakerMod.MOD_ID);

    public static final RegistryObject<Item> Ansko = ITEMS.register("ansko",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> Sapphire = ITEMS.register("sapphire",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> Raw_Sapphire = ITEMS.register("raw_sapphire",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> METAL_DETECTOR = ITEMS.register("metal_detector",
            () -> new MetalDetectorItem(new Item.Properties().durability(100)));

    public static final RegistryObject<Item> STRAWBERRY = ITEMS.register("strawberry",
            () -> new Item(new Item.Properties().food(ModFoods.STRAWBERRY)));
    public static final RegistryObject<Item> MIA_COKOLADA = ITEMS.register("mia_cokolada",
            () -> new Item(new Item.Properties().food(ModFoods.MIA_COKOLADA)));

    public static final RegistryObject<Item> PINE_CONE = ITEMS.register("pine_cone",
            () -> new FuelItem(new Item.Properties(), 400));

    public static void register (IEventBus eventBus){
        ITEMS.register(eventBus);
    }
}
