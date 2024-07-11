package asia.yhzcake.noteblock_reborn;

import net.minecraft.registry.entry.RegistryEntry;
import net.minecraft.sound.SoundEvent;
import net.minecraft.sound.SoundEvents;
import net.minecraft.util.StringIdentifiable;

public enum PPInstrument implements StringIdentifiable {
    HARP("harp", SoundReg.BLOCK_NOTE_BLOCK_HARP_PP, PPInstrument.Type.BASE_BLOCK),
    BASEDRUM("basedrum", SoundReg.BLOCK_NOTE_BLOCK_BASEDRUM_PP, PPInstrument.Type.BASE_BLOCK),
    SNARE("snare", SoundReg.BLOCK_NOTE_BLOCK_SNARE_PP, PPInstrument.Type.BASE_BLOCK),
    HAT("hat", SoundReg.BLOCK_NOTE_BLOCK_HAT_PP, PPInstrument.Type.BASE_BLOCK),
    BASS("bass", SoundReg.BLOCK_NOTE_BLOCK_BASS_PP, PPInstrument.Type.BASE_BLOCK),
    FLUTE("flute", SoundReg.BLOCK_NOTE_BLOCK_FLUTE_PP, PPInstrument.Type.BASE_BLOCK),
    BELL("bell", SoundReg.BLOCK_NOTE_BLOCK_BELL_PP, PPInstrument.Type.BASE_BLOCK),
    GUITAR("guitar", SoundReg.BLOCK_NOTE_BLOCK_GUITAR_PP, PPInstrument.Type.BASE_BLOCK),
    CHIME("chime", SoundReg.BLOCK_NOTE_BLOCK_CHIME_PP, PPInstrument.Type.BASE_BLOCK),
    XYLOPHONE("xylophone", SoundReg.BLOCK_NOTE_BLOCK_XYLOPHONE_PP, PPInstrument.Type.BASE_BLOCK),
    IRON_XYLOPHONE("iron_xylophone", SoundReg.BLOCK_NOTE_BLOCK_IRON_XYLOPHONE_PP, PPInstrument.Type.BASE_BLOCK),
    COW_BELL("cow_bell", SoundReg.BLOCK_NOTE_BLOCK_COW_BELL_PP, PPInstrument.Type.BASE_BLOCK),
    DIDGERIDOO("didgeridoo", SoundReg.BLOCK_NOTE_BLOCK_DIDGERIDOO_PP, PPInstrument.Type.BASE_BLOCK),
    BIT("bit", SoundReg.BLOCK_NOTE_BLOCK_BIT_PP, PPInstrument.Type.BASE_BLOCK),
    BANJO("banjo", SoundReg.BLOCK_NOTE_BLOCK_BANJO_PP, PPInstrument.Type.BASE_BLOCK),
    PLING("pling", SoundReg.BLOCK_NOTE_BLOCK_PLING_PP, PPInstrument.Type.BASE_BLOCK),
    ZOMBIE("zombie", SoundEvents.BLOCK_NOTE_BLOCK_IMITATE_ZOMBIE, PPInstrument.Type.MOB_HEAD),
    SKELETON("skeleton", SoundEvents.BLOCK_NOTE_BLOCK_IMITATE_SKELETON, PPInstrument.Type.MOB_HEAD),
    CREEPER("creeper", SoundEvents.BLOCK_NOTE_BLOCK_IMITATE_CREEPER, PPInstrument.Type.MOB_HEAD),
    DRAGON("dragon", SoundEvents.BLOCK_NOTE_BLOCK_IMITATE_ENDER_DRAGON, PPInstrument.Type.MOB_HEAD),
    WITHER_SKELETON("wither_skeleton", SoundEvents.BLOCK_NOTE_BLOCK_IMITATE_WITHER_SKELETON, PPInstrument.Type.MOB_HEAD),
    PIGLIN("piglin", SoundEvents.BLOCK_NOTE_BLOCK_IMITATE_PIGLIN, PPInstrument.Type.MOB_HEAD),
    CUSTOM_HEAD("custom_head", SoundEvents.UI_BUTTON_CLICK, PPInstrument.Type.CUSTOM);

    private final String name;
    private final RegistryEntry<SoundEvent> sound;
    private final PPInstrument.Type type;

    private PPInstrument(String name, RegistryEntry sound, PPInstrument.Type type) {
        this.name = name;
        this.sound = sound;
        this.type = type;
    }

    public String asString() {
        return this.name;
    }

    public static PPInstrument fromName(String name) {
        for (PPInstrument instrument : PPInstrument.values()) {
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
        return this.type == PPInstrument.Type.BASE_BLOCK;
    }

    public boolean hasCustomSound() {
        return this.type == PPInstrument.Type.CUSTOM;
    }

    public boolean isNotBaseBlock() {
        return this.type != PPInstrument.Type.BASE_BLOCK;
    }


    static enum Type {
        BASE_BLOCK,
        MOB_HEAD,
        CUSTOM;

        private Type() {
        }
    }
}
