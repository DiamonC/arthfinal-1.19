package net.diamonc.arthfinal.item.custom;

import net.minecraft.entity.TntEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.network.packet.s2c.play.PlayerAbilitiesS2CPacket;
import net.minecraft.util.Hand;
import net.minecraft.util.TypedActionResult;
import net.minecraft.world.World;

import java.util.Random;

public class FinalItem extends Item {
    public FinalItem(Settings settings) {
        super(settings);
    }

    public void onCraft(ItemStack stack, World world, PlayerEntity player) {
        player.getAbilities().allowFlying = true;
    }
}
