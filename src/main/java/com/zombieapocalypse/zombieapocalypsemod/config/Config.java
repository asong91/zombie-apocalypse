package com.zombieapocalypse.zombieapocalypsemod.config;

import com.electronwill.nightconfig.core.file.CommentedFileConfig;
import com.electronwill.nightconfig.core.io.WritingMode;
import com.zombieapocalypse.zombieapocalypsemod.ZombieApocalypseMod;
import net.minecraftforge.common.ForgeConfigSpec;
import net.minecraftforge.fml.common.Mod;

import java.io.File;

@Mod.EventBusSubscriber
public class Config {
    private static final ForgeConfigSpec.Builder SERVER_BUILDER = new ForgeConfigSpec.Builder();
    public static final ForgeConfigSpec SERVER;

    private static final ForgeConfigSpec.Builder CLIENT_BUILDER = new ForgeConfigSpec.Builder();
    public static final ForgeConfigSpec CLIENT;

    static {
        SERVER = SERVER_BUILDER.build();
        CLIENT = CLIENT_BUILDER.build();
    }

    public static void loadConfig(ForgeConfigSpec config, String path)
    {
        ZombieApocalypseMod.LOGGER.info("Loading config: " + path);
        final CommentedFileConfig file = CommentedFileConfig.builder(new File(path)).sync().autosave().writingMode(WritingMode.REPLACE).build();
        ZombieApocalypseMod.LOGGER.info("Built config: " + path);
        file.load();
        ZombieApocalypseMod.LOGGER.info("Loaded config: " + path);
        config.setConfig(file);
    }
}
