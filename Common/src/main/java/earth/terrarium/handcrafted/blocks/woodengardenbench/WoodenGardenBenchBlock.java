package earth.terrarium.handcrafted.blocks.woodengardenbench;

import earth.terrarium.handcrafted.blocks.ExpandableCouchBlock;
import earth.terrarium.handcrafted.blocks.SimpleBlock;
import net.minecraft.core.BlockPos;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.phys.BlockHitResult;

public class WoodenGardenBenchBlock extends ExpandableCouchBlock {

    public WoodenGardenBenchBlock(Properties properties) {
        super(properties);
    }

    @Override
    public BlockEntity newBlockEntity(BlockPos pos, BlockState state) {
        return new WoodenGardenBenchBlockEntity(pos, state);
    }

    @Override
    public InteractionResult use(BlockState state, Level level, BlockPos pos, Player player, InteractionHand hand, BlockHitResult hit) {
        return SimpleBlock.cushionUse(level, pos, player);
    }
}