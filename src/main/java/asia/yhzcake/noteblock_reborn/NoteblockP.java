package asia.yhzcake.noteblock_reborn;

import net.minecraft.block.AbstractBlock;
import net.minecraft.block.BlockState;
import net.minecraft.block.entity.SkullBlockEntity;
import net.minecraft.block.enums.Instrument;
import net.minecraft.particle.ParticleTypes;
import net.minecraft.registry.entry.RegistryEntry;
import net.minecraft.sound.SoundCategory;
import net.minecraft.sound.SoundEvent;
import net.minecraft.util.Identifier;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraft.block.NoteBlock;
import org.jetbrains.annotations.Nullable;

public class NoteblockP extends NoteBlock {
    public NoteblockP(AbstractBlock.Settings settings) {
        super(settings);
    }

    @Override
    public boolean onSyncedBlockEvent(BlockState state, World world, BlockPos pos, int type, int data) {
        Instrument instrument = state.get(INSTRUMENT);
        float f;
        if (instrument.shouldSpawnNoteParticles()) {
            int i = state.get(NOTE);
            f = getNotePitch(i);
            world.addParticle(ParticleTypes.NOTE, (double)pos.getX() + 0.5, (double)pos.getY() + 1.2, (double)pos.getZ() + 0.5, (double)i / 24.0, 0.0, 0.0);
        } else {
            f = 1.0F;
        }

        RegistryEntry<SoundEvent> registryEntry;
        if (instrument.hasCustomSound()) {
            Identifier identifier = this.getCustomSoundOver(world, pos);
            if (identifier == null) {
                return false;
            }

            registryEntry = RegistryEntry.of(SoundEvent.of(identifier));
        } else {
                registryEntry = PPInstrument.fromName(instrument.asString()).getSound();
        }

        world.playSound(null, (double)pos.getX() + 0.5, (double)pos.getY() + 0.5, (double)pos.getZ() + 0.5, registryEntry, SoundCategory.RECORDS, 3.0F, f, world.random.nextLong());
        return true;
    }
    @Nullable
    private Identifier getCustomSoundOver(World world, BlockPos pos) {
        return world.getBlockEntity(pos.up()) instanceof SkullBlockEntity skullBlockEntity ? skullBlockEntity.getNoteBlockSound() : null;
    }
}
