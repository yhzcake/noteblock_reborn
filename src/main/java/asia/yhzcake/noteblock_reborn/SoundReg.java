package asia.yhzcake.noteblock_reborn;

import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.registry.entry.RegistryEntry;
import net.minecraft.sound.SoundEvent;
import net.minecraft.util.Identifier;


public class SoundReg {
    public static final RegistryEntry.Reference<SoundEvent> BLOCK_NOTE_BLOCK_BASEDRUM_PP = registerReference("block.note_block.basedrum_1");
    public static final RegistryEntry.Reference<SoundEvent> BLOCK_NOTE_BLOCK_BASS_PP = registerReference("block.note_block.bass_1");
    public static final RegistryEntry.Reference<SoundEvent> BLOCK_NOTE_BLOCK_BELL_PP = registerReference("block.note_block.bell_1");
    public static final RegistryEntry.Reference<SoundEvent> BLOCK_NOTE_BLOCK_CHIME_PP = registerReference("block.note_block.chime_1");
    public static final RegistryEntry.Reference<SoundEvent> BLOCK_NOTE_BLOCK_FLUTE_PP = registerReference("block.note_block.flute_1");
    public static final RegistryEntry.Reference<SoundEvent> BLOCK_NOTE_BLOCK_GUITAR_PP = registerReference("block.note_block.guitar_1");
    public static final RegistryEntry.Reference<SoundEvent> BLOCK_NOTE_BLOCK_HARP_PP = registerReference("block.note_block.harp_1");
    public static final RegistryEntry.Reference<SoundEvent> BLOCK_NOTE_BLOCK_HAT_PP = registerReference("block.note_block.hat_1");
    public static final RegistryEntry.Reference<SoundEvent> BLOCK_NOTE_BLOCK_PLING_PP = registerReference("block.note_block.pling_1");
    public static final RegistryEntry.Reference<SoundEvent> BLOCK_NOTE_BLOCK_SNARE_PP = registerReference("block.note_block.snare_1");
    public static final RegistryEntry.Reference<SoundEvent> BLOCK_NOTE_BLOCK_XYLOPHONE_PP = registerReference("block.note_block.xylophone_1");
    public static final RegistryEntry.Reference<SoundEvent> BLOCK_NOTE_BLOCK_IRON_XYLOPHONE_PP = registerReference("block.note_block.iron_xylophone_1");
    public static final RegistryEntry.Reference<SoundEvent> BLOCK_NOTE_BLOCK_COW_BELL_PP = registerReference("block.note_block.cow_bell_1");
    public static final RegistryEntry.Reference<SoundEvent> BLOCK_NOTE_BLOCK_DIDGERIDOO_PP = registerReference("block.note_block.didgeridoo_1");
    public static final RegistryEntry.Reference<SoundEvent> BLOCK_NOTE_BLOCK_BIT_PP = registerReference("block.note_block.bit_1");
    public static final RegistryEntry.Reference<SoundEvent> BLOCK_NOTE_BLOCK_BANJO_PP = registerReference("block.note_block.banjo_1");

    public static final RegistryEntry.Reference<SoundEvent> BLOCK_NOTE_BLOCK_BASEDRUM_MM = registerReference("block.note_block.basedrum_-1");
    public static final RegistryEntry.Reference<SoundEvent> BLOCK_NOTE_BLOCK_BASS_MM = registerReference("block.note_block.bass_-1");
    public static final RegistryEntry.Reference<SoundEvent> BLOCK_NOTE_BLOCK_BELL_MM = registerReference("block.note_block.bell_-1");
    public static final RegistryEntry.Reference<SoundEvent> BLOCK_NOTE_BLOCK_CHIME_MM = registerReference("block.note_block.chime_-1");
    public static final RegistryEntry.Reference<SoundEvent> BLOCK_NOTE_BLOCK_FLUTE_MM = registerReference("block.note_block.flute_-1");
    public static final RegistryEntry.Reference<SoundEvent> BLOCK_NOTE_BLOCK_GUITAR_MM = registerReference("block.note_block.guitar_-1");
    public static final RegistryEntry.Reference<SoundEvent> BLOCK_NOTE_BLOCK_HARP_MM = registerReference("block.note_block.harp_-1");
    public static final RegistryEntry.Reference<SoundEvent> BLOCK_NOTE_BLOCK_HAT_MM = registerReference("block.note_block.hat_-1");
    public static final RegistryEntry.Reference<SoundEvent> BLOCK_NOTE_BLOCK_PLING_MM = registerReference("block.note_block.pling_-1");
    public static final RegistryEntry.Reference<SoundEvent> BLOCK_NOTE_BLOCK_SNARE_MM = registerReference("block.note_block.snare_-1");
    public static final RegistryEntry.Reference<SoundEvent> BLOCK_NOTE_BLOCK_XYLOPHONE_MM = registerReference("block.note_block.xylophone_-1");
    public static final RegistryEntry.Reference<SoundEvent> BLOCK_NOTE_BLOCK_IRON_XYLOPHONE_MM = registerReference("block.note_block.iron_xylophone_-1");
    public static final RegistryEntry.Reference<SoundEvent> BLOCK_NOTE_BLOCK_COW_BELL_MM = registerReference("block.note_block.cow_bell_-1");
    public static final RegistryEntry.Reference<SoundEvent> BLOCK_NOTE_BLOCK_DIDGERIDOO_MM = registerReference("block.note_block.didgeridoo_-1");
    public static final RegistryEntry.Reference<SoundEvent> BLOCK_NOTE_BLOCK_BIT_MM = registerReference("block.note_block.bit_-1");
    public static final RegistryEntry.Reference<SoundEvent> BLOCK_NOTE_BLOCK_BANJO_MM = registerReference("block.note_block.banjo_-1");

    private static RegistryEntry.Reference<SoundEvent> registerReference(String id) {
        return registerReference(new Identifier(id));
    }
    private static RegistryEntry.Reference<SoundEvent> registerReference(Identifier id) {
        return registerReference(id, id);
    }
    private static RegistryEntry.Reference<SoundEvent> registerReference(Identifier id, Identifier soundId) {
        return Registry.registerReference(Registries.SOUND_EVENT, id, SoundEvent.of(soundId));
    }
    public static void registerReferences() {

    }
}
