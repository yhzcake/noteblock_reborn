package asia.yhzcake.block;

import net.minecraft.block.BlockState;
import net.minecraft.block.NoteBlock;
import net.minecraft.entity.Entity;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import org.jetbrains.annotations.Nullable;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class NoteblockP extends NoteBlock implements NoteblockPl {
    public NoteblockP(Settings settings) {
        super(settings);
    }

    public static final Logger LOGGER = LoggerFactory.getLogger("noteblock-reborn");
    @Override
    public void playNote(@Nullable Entity entity, BlockState state, World world, BlockPos pos){
        if (state.get(INSTRUMENT).isNotBaseBlock() || world.getBlockState(pos.up()).isAir()) {
            if (!world.isClient()) {
//                world.playSound(entity,pos, );
                LOGGER.info("应该是音符盒播放声音");
            }
        }
    }
}
