package asia.yhzcake.block;

import net.minecraft.block.BlockState;
import net.minecraft.entity.Entity;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import org.jetbrains.annotations.Nullable;

public interface NoteblockPl {
    void playNote(@Nullable Entity entity, BlockState state, World world, BlockPos pos);
}
