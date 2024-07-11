package asia.yhzcake.noteblock_reborn;

import net.minecraft.registry.entry.RegistryEntry;
import net.minecraft.sound.SoundEvent;
import net.minecraft.sound.SoundEvents;
import net.minecraft.util.StringIdentifiable;

public enum MMInstrument implements StringIdentifiable {
    HARP("harp", SoundReg.BLOCK_NOTE_BLOCK_HARP_MM, MMInstrument.Type.BASE_BLOCK),
    BASEDRUM("basedrum", SoundReg.BLOCK_NOTE_BLOCK_BASEDRUM_MM, MMInstrument.Type.BASE_BLOCK),
    SNARE("snare", SoundReg.BLOCK_NOTE_BLOCK_SNARE_MM, MMInstrument.Type.BASE_BLOCK),
    HAT("hat", SoundReg.BLOCK_NOTE_BLOCK_HAT_MM, MMInstrument.Type.BASE_BLOCK),
    BASS("bass", SoundReg.BLOCK_NOTE_BLOCK_BASS_MM, MMInstrument.Type.BASE_BLOCK),
    FLUTE("flute", SoundReg.BLOCK_NOTE_BLOCK_FLUTE_MM, MMInstrument.Type.BASE_BLOCK),
    BELL("bell", SoundReg.BLOCK_NOTE_BLOCK_BELL_MM, MMInstrument.Type.BASE_BLOCK),
    GUITAR("guitar", SoundReg.BLOCK_NOTE_BLOCK_GUITAR_MM, MMInstrument.Type.BASE_BLOCK),
    CHIME("chime", SoundReg.BLOCK_NOTE_BLOCK_CHIME_MM, MMInstrument.Type.BASE_BLOCK),
    XYLOPHONE("xylophone", SoundReg.BLOCK_NOTE_BLOCK_XYLOPHONE_MM, MMInstrument.Type.BASE_BLOCK),
    IRON_XYLOPHONE("iron_xylophone", SoundReg.BLOCK_NOTE_BLOCK_IRON_XYLOPHONE_MM, MMInstrument.Type.BASE_BLOCK),
    COW_BELL("cow_bell", SoundReg.BLOCK_NOTE_BLOCK_COW_BELL_MM, MMInstrument.Type.BASE_BLOCK),
    DIDGERIDOO("didgeridoo", SoundReg.BLOCK_NOTE_BLOCK_DIDGERIDOO_MM, MMInstrument.Type.BASE_BLOCK),
    BIT("bit", SoundReg.BLOCK_NOTE_BLOCK_BIT_MM, MMInstrument.Type.BASE_BLOCK),
    BANJO("banjo", SoundReg.BLOCK_NOTE_BLOCK_BANJO_MM, MMInstrument.Type.BASE_BLOCK),
    PLING("pling", SoundReg.BLOCK_NOTE_BLOCK_PLING_MM, MMInstrument.Type.BASE_BLOCK),
    ZOMBIE("zombie", SoundEvents.BLOCK_NOTE_BLOCK_IMITATE_ZOMBIE, MMInstrument.Type.MOB_HEAD),
    SKELETON("skeleton", SoundEvents.BLOCK_NOTE_BLOCK_IMITATE_SKELETON, MMInstrument.Type.MOB_HEAD),
    CREEPER("creeper", SoundEvents.BLOCK_NOTE_BLOCK_IMITATE_CREEPER, MMInstrument.Type.MOB_HEAD),
    DRAGON("dragon", SoundEvents.BLOCK_NOTE_BLOCK_IMITATE_ENDER_DRAGON, MMInstrument.Type.MOB_HEAD),
    WITHER_SKELETON("wither_skeleton", SoundEvents.BLOCK_NOTE_BLOCK_IMITATE_WITHER_SKELETON, MMInstrument.Type.MOB_HEAD),
    PIGLIN("piglin", SoundEvents.BLOCK_NOTE_BLOCK_IMITATE_PIGLIN, MMInstrument.Type.MOB_HEAD),
    CUSTOM_HEAD("custom_head", SoundEvents.UI_BUTTON_CLICK, MMInstrument.Type.CUSTOM);

    private final String name;
    private final RegistryEntry<SoundEvent> sound;
    private final MMInstrument.Type type;

    private MMInstrument(String name, RegistryEntry sound, MMInstrument.Type type) {
        this.name = name;
        this.sound = sound;
        this.type = type;
    }

    public String asString() {
        return this.name;
    }

    public static MMInstrument fromName(String name) {
        for (MMInstrument instrument : MMInstrument.values()) {
            if (instrument.name.equals(name)) {
                return instrument;
            }
        }
        throw new IllegalArgumentException("No enum constant with name " + name);
    }

    public RegistryEntry<SoundEvent> getSound() {
        return this.sound;
    }

    public boolean shouldSpawnNoteParticles() {
        return this.type == MMInstrument.Type.BASE_BLOCK;
    }

    public boolean hasCustomSound() {
        return this.type == MMInstrument.Type.CUSTOM;
    }

    public boolean isNotBaseBlock() {
        return this.type != MMInstrument.Type.BASE_BLOCK;
    }


    static enum Type {
        BASE_BLOCK,
        MOB_HEAD,
        CUSTOM;

        private Type() {
        }
    }
}
