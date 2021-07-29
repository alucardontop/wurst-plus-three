package me.travis.wurstplusthree.hack.hacks.render;

import me.travis.wurstplusthree.hack.Hack;
import me.travis.wurstplusthree.setting.type.DoubleSetting;

@Hack.Registration(name = "CameraClip", description = "f5 mode", category = Hack.Category.RENDER, isListening = false, color = 0x5CCB9D)
public class CameraClip extends Hack {

    public static CameraClip INSTANCE;

    public CameraClip() {
        INSTANCE = this;
    }

    public DoubleSetting distance = new DoubleSetting("Distance", 10.0, -10.0, 50.0, this);

}
