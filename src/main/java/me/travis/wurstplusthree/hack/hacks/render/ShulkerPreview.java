package me.travis.wurstplusthree.hack.hacks.render;

import me.travis.wurstplusthree.hack.Hack;

@Hack.Registration(name = "ShulkerPreview", description = "lets u see shulker contents", category = Hack.Category.RENDER, isListening = false, color = 0xEBD655)
public class ShulkerPreview extends Hack {

    public static ShulkerPreview INSTACE;

    public ShulkerPreview() {
        INSTACE = this;
    }

}
