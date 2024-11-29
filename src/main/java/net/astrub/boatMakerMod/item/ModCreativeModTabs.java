package net.astrub.boatMakerMod.item;

import net.astrub.boatMakerMod.BoatMakerMod;
import net.astrub.boatMakerMod.block.ModBlocks;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;

public class ModCreativeModTabs {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, BoatMakerMod.MOD_ID);


    public static final RegistryObject<CreativeModeTab> BOAT_MAKER = CREATIVE_MODE_TABS.register("boat_maker",
            ()-> CreativeModeTab.builder().icon(()-> new ItemStack(ModItems.Ansko.get()))
                    .title(Component.translatable("creativetab.boat_maker"))
                    .displayItems((itemDisplayParameters, output) -> {
                        output.accept(ModItems.Ansko.get());
                        output.accept(ModItems.Sapphire.get());
                        output.accept(ModItems.Raw_Sapphire.get());
                        output.accept(ModBlocks.ANSKO_BLOCK.get());
                        output.accept(ModBlocks.SAPPHIRE_BLOCK.get());
                        output.accept(ModBlocks.RAW_SAPPHIRE_BLOCK.get());

                        output.accept(ModBlocks.SAPPHIRE_ORE.get());
                        output.accept(ModBlocks.DEEPSLATE_SAPPHIRE_ORE.get());
                        output.accept(ModBlocks.NETHER_SAPPHIRE_ORE.get());
                        output.accept(ModBlocks.END_STONE_SAPPHIRE_ORE.get());
                    })
                    .build());

    public static void register(IEventBus eventBus){
        CREATIVE_MODE_TABS.register(eventBus);
    }
}
