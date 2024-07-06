package asia.yhzcake.block;

import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;


public class NoteBlockBase implements ModInitializer {
    public static final NoteblockP NOTEBLOCK_HIGHER = new NoteblockP(FabricBlockSettings.create().strength(4.0f));


    @Override
    public void onInitialize(){
        Registry.register(Registries.BLOCK, new Identifier("noteblock_reborn","noteblock_higher"), NOTEBLOCK_HIGHER);
        Registry.register(Registries.ITEM, new Identifier("noteblock_reborn","noteblock_higher"), new BlockItem(NOTEBLOCK_HIGHER, new Item.Settings()));
    }
}
