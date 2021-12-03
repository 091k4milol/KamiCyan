package org.O91k4mi.KamiCyan.modules.client;

import org.O91k4mi.KamiCyan.modules.module;
import java.util.ArrayList;

public class Hud {
    public boolean setted;
    public boolean toggled;
    public static Object watermarkPanel;
    public static Object arrayPanel;
    String niggahack = "nigga hack !";
    String KamiCyan = "Kami Cyan" + "!" + MOD_VERSION;
    String CZ_Meme = "Kunšty, Franklin a Rakys";
    String Minecraft;
    String getInstance;
    String mc = Minecraft.getInstance;
    int trans;
    int pan;
    int rainbow;
    int straight_allay;
    public Hud() {
    }
    public void watermarkPanel(Object watermarkPanel) {
        this.setparameters(10, 30);
        this.setOptions(watermark);
        this.getOption(setted);
    }
    public void arrayPanel(Object arrayPanel) {
        this.setparameters(10, 30);
        this.setOptions(modulelist);
    }
    public void setparameters(int height, int width) {}
    public ArrayList<String> watermark = new ArrayList<String>();
    watermark.add(niggahack);
    watermark.add(KamiCyan);
    watermark.add(CZ_Meme);
    public void setOptions(ArrayList<String> options) {}
    public void setWatermark(int option1, int option2, int option3) {}
    public void getInstance(String game) {}
    public void setTitle(String title) {} 
    public void getOption(boolean setted) {
        setted = !setted;
    }
    public void getToggledModules() {
        toggled = !toggled;
    }
    ArrayList<String> activemodules = new ArrayList<String>();
    activemodules.add(toggled);
    ArrayList<String> modulelist = new ArrayList<String>();
    modulelist.add(trans);
    modulelist.add(pan);
    modulelist.add(rainbow);
    modulelist.add(straight_allay);
    public void setColor(int color) {}
    void drawn() {
        switch (watermarkPanel.getOption(setted)) {
            //sets watermark to one of thos options
            case niggahack:
                this.mc.setTitle(niggahack);
                break;
            case KamiCyan:
                this.mc.setTitle(KamiCyan);
                break;
            case CZ_Meme:
                this.mc.setTitle(CZ_Meme);
                break;

        }
        switch (arrayPanel.getOption(setted)) {
            //sets active-module-list colors
            case trans:
                this.activemodules.setColor();
                break;
            case pan:
                this.activemodules.setColor();
                break;
        }
    }
}
