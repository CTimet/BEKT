package io.github.ctimet.bedrocktechnology.core.items;

import io.github.thebusybiscuit.slimefun4.api.items.SlimefunItemStack;
import org.bukkit.Material;
import org.jetbrains.annotations.Contract;
import org.jetbrains.annotations.NotNull;

public class BItemStacks {
    public static final SlimefunItemStack BEKT_SUPERFIX_REG = new SlimefunItemStack(
            "BEKT_SUPERFIX_REG",
            Material.STICK,
            "&a超级修复-注册",
            "",
            "&7注册你的机器",
            "&7当你的机器被卡掉时",
            "&7可以通过 &b超级修复-修复&7 来修复你的机器"
    );
    public static final SlimefunItemStack BEKT_SUPERFIX_FIX = new SlimefunItemStack(
            "BEKT_SUPERFIX_FIX",
            Material.STICK,
            "&a超级修复-修复",
            "",
            "&7修复你的机器",
            "&7当你的机器被卡成原版方块时",
            "&7你可以用此物品右键机器来修复你的机器",
            "&7前提是你的机器必须已经经过 &b超级修复-注册 &7注册",
            "&7未被注册的机器将&4修复失败！"
    );
    public static final SlimefunItemStack BEKT_OIL_MAKE = new SlimefunItemStack(
            "BEKT_OIL_MAKE",
            Material.ENCHANTING_TABLE,
            "&4原油生成机",
            "",
            "&7不受当前区块影响，全自动生成原油"
    );
    public static final SlimefunItemStack BEKT_LITHOGRAPHY_MACHINE = new SlimefunItemStack(
            "BEKT_LITHOGRAPHY_MACHINE",
            Material.DRIED_KELP_BLOCK,
            "&4光刻机",
            "",
            "&4制造芯片的机器"
    );
    public static final SlimefunItemStack BEKT_CPU_PAPER = new SlimefunItemStack(
            "BEKT_CPU_PAPER",
            Material.PAPER,
            "&aCPU电路图图纸",
            "",
            "&7绘制了CPU电路图的图纸"
    );
    public static final SlimefunItemStack BEKT_GPU_PAPER = new SlimefunItemStack(
            "BEKT_GPU_PAPER",
            Material.PAPER,
            "&aGPU电路图图纸",
            "",
            "&7绘制了GPU电路图的图纸"
    );
    public static final SlimefunItemStack BEKT_CPU = new SlimefunItemStack(
            "BEKT_CPU",
            Material.NETHER_STAR,
            "&6CPU",
            "",
            "&7一个高精尖设备，用来处理数据"
    );
    public static final SlimefunItemStack BEKT_GPU = new SlimefunItemStack(
            "BEKT_GPU",
            Material.NETHER_STAR,
            "&6GPU",
            "",
            "&7一个高精尖设备，用来绘制图像"
    );
    public static final SlimefunItemStack BEKT_CLOUD_TABLE = new SlimefunItemStack(
            "BEKT_CLOUD_TABLE",
            Material.SEA_LANTERN,
            "&bCloud云组装台",
            "",
            "构建，组装您的CLOUD云中转站"
    );
    public static final SlimefunItemStack BEKT_RECIPES_SHOW = new SlimefunItemStack(
            "BEKT_RECIPES_LOOK",
            Material.CRYING_OBSIDIAN,
            "&d物品配方查看器",
            "",
            "&7一个小小的指南书无法展示如此强大的配方"
    );

    public static final SlimefunItemStack BEKT_CLOUD = new SlimefunItemStack(
            "BEKT_CLOUD_V1",
            Material.BEACON,
            "&aCloud云",
            "Cloud云，你的信息中专站",
            ""
    );
    /**
     * 机器的速度，eff内一定要带上x，比如1x，代表1倍
     * @param eff 速度，单位x
     * @return 速度
     */
    @Contract(pure = true)
    @NotNull
    public static String getEff(String eff){
        return "&7⇨ &e⚡ &7速度: &b" + eff;
    }

    /**
     * 机器的耗电量，当一个机器需要持续耗电时，请用这个方法添加lore
     * @param j 电量，单位J/S，输入的字符串中不需要带单位，只需要输入数字即可
     * @return 电量
     */
    @NotNull
    public static String getPow(String j){
        return "&7⇨ &e⚡ &7" + j + "J/s";
    }

    /**
     * 机器的耗电量，当一个机器只在用的时候才耗电时，使用这个方法添加lore
     * @param j 电量，单位J/S,输入的字符串不需要带单位
     * @return 电量
     */
    @NotNull
    public static String getUse(String j){
        return "&7⇨ &e⚡ &7" + j + "J每次使用";
    }
}
