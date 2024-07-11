package asia.yhzcake.noteblock_reborn;

import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.MapColor;
import net.minecraft.block.enums.Instrument;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.item.Items;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.Identifier;


public class NoteBlockBase implements ModInitializer {
    public static final NoteblockP NOTEBLOCK_HIGHER = new NoteblockP(FabricBlockSettings.create().mapColor(MapColor.OAK_TAN).instrument(Instrument.BASS).sounds(BlockSoundGroup.WOOD).strength(0.8F).burnable());
    public static final NoteblockM NOTEBLOCK_LOWER = new NoteblockM(FabricBlockSettings.create().mapColor(MapColor.OAK_TAN).instrument(Instrument.BASS).sounds(BlockSoundGroup.WOOD).strength(0.8F).burnable());

    @Override
    public void onInitialize(){
        Registry.register(Registries.BLOCK, new Identifier("noteblock_reborn","noteblock_higher"), NOTEBLOCK_HIGHER);
        Registry.register(Registries.ITEM, new Identifier("noteblock_reborn","noteblock_higher"), new BlockItem(NOTEBLOCK_HIGHER, new Item.Settings()));
    }
}
