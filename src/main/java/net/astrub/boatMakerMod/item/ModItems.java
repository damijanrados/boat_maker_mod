package net.astrub.boatMakerMod.item;

import net.astrub.boatMakerMod.BoatMakerMod;
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
    public static final RegistryObject<Item> Raw_Sapphire = ITEMS.register("raw_sapphire",
            () -> new Item(new Item.Properties()));

    public static void register (IEventBus eventBus){
        ITEMS.register(eventBus);
    }
}