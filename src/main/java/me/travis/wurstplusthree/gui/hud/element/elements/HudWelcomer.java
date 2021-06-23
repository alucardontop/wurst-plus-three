package me.travis.wurstplusthree.gui.hud.element.elements;

import me.travis.wurstplusthree.WurstplusThree;
import me.travis.wurstplusthree.event.events.Render2DEvent;
import me.travis.wurstplusthree.gui.hud.element.HudElement;
import me.travis.wurstplusthree.hack.hacks.client.HudEditor;
import me.travis.wurstplusthree.util.HudUtil;

/**
 * @author Madmegsox1
 * @since 22/06/2021
 */

@HudElement.Element(name = "Welcomer", posX = 100, posY = 100)
public class HudWelcomer extends HudElement {

    String text = "";

    @Override
    public int getHeight() {
        return HudUtil.getHudStringHeight(text);
    }

    @Override
    public int getWidth(){
        return HudUtil.getHudStringWidth(text);
    }

    @Override
    public void onRender2D(Render2DEvent event){
        text = HudUtil.getWelcomerLine();
        HudUtil.drawHudString(text, getX(), getY(), HudEditor.INSTANCE.fontColor.getValue().hashCode());
    }

}
