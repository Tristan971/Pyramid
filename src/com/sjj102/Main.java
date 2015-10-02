package com.sjj102;

import java.awt.*;
import java.awt.event.KeyEvent;

import static java.lang.Thread.sleep;

public class Main {



    public static void main(String[] args) throws InterruptedException, AWTException {

        sleep(4000);

        //vertiRamid("Kappa", "krippW");
        type("finally a good pyramid PogChamp");
        enter();
        //endRamidWithSpecial("TriHard", "KappaPride", "sjjW");
        //type("Sup guys, sup jj! KappaPride");

        //windmill("sjjW", "NightBat");

        //frenchFlag();
        //windmill("ANELE", "NightBat");
        //enter();
        //type("NAZI MOD CHECKING IN DatSheffy sjjW");
        enter();
        //naziFlag();
        normalRamid("sjjW", "", 0);
        enter();
    }

    public static void type(String s) {
        Robot robot;
        char[] chars = s.toCharArray();

        try {
            robot = new Robot();

            for (char aChar : chars) {
                if (Character.isUpperCase(aChar)) {
                    robot.keyPress(KeyEvent.VK_SHIFT);
                }

                int keyCode = KeyEvent.getExtendedKeyCodeForChar(aChar);
                robot.keyPress(keyCode);
                robot.keyRelease(keyCode);

                if (Character.isUpperCase(aChar)) {
                    robot.keyRelease(KeyEvent.VK_SHIFT);
                }
            }

        } catch (AWTException e) {
            e.printStackTrace();
        }
    }

    public static void vertiRamid(String emote, String blank) {
        type(makeCustomString(2, 2, 1, blank, emote));
        enter();
        type(makeCustomString(1, 1, 3, blank, emote));
        enter();
        type(makeCustomString(0, 0, 5, blank, emote));
        enter();
    }

    public static void triColor(String color1, String color2, String color3, boolean leftToRight) {
        if(leftToRight) {
            type(color1+" "+color1+" "+color2+" "+color2+" "+color3+" "+color3);
            enter();
            type(color1+" "+color1+" "+color2+" "+color2+" "+color3+" "+color3);
            enter();
            type(color1+" "+color1+" "+color2+" "+color2+" "+color3+" "+color3);
            enter();
        } else {
            type(color1+" "+color1+" "+color1+" "+color1+" "+color1+" "+color1);
            enter();
            type(color2+" "+color2+" "+color2+" "+color2+" "+color2+" "+color2);
            enter();
            type(color3+" "+color3+" "+color3+" "+color3+" "+color3+" "+color3);
            enter();
        }
    }

    public static void frenchFlag() {
        triColor("Volcania", "deExcite", "krippGive", true);
    }

    public static void naziFlag() {
        triColor("forsenDDK", "deExcite", "krippGive", false);
    }

    public static void endRamid(String emote, String blank) {
        vertiRamid(emote, blank);
        type(makeCustomString(1, 1, 3, blank, emote));
        enter();
        type(makeCustomString(2, 2, 1, blank, emote));
        enter();
    }

    public static void
    endRamidWithSpecial(String emote, String blank, String special) {
        type(makeCustomString(2, 2, 1, blank, emote));
        enter();
        type(makeCustomString(1, 1, 3, blank, emote));
        enter();
        type(emote+" "+emote+" "+special+" "+emote+" "+emote);
        enter();
        type(makeCustomString(1, 1, 3, blank, emote));
        enter();
        type(makeCustomString(2, 2, 1, blank, emote));
        enter();
    }

    public static void normalRamid(String emote, String blank, long wait) throws InterruptedException {
        type(makeCustomString(0, 0, 1, blank, emote));
        enter();
        if (wait != 0) {
            Thread.sleep(wait);
        }
        type(makeCustomString(0, 0, 2, blank, emote));
        enter();
        if (wait != 0) {
            Thread.sleep(wait);
        }        type(makeCustomString(0, 0, 3, blank, emote));
        enter();
        if (wait != 0) {
            Thread.sleep(wait);
        }        type(makeCustomString(0, 0, 2, blank, emote));
        enter();
        if (wait != 0) {
            Thread.sleep(wait);
        }        type(makeCustomString(0, 0, 1, blank, emote));
        enter();
    }

    public static void windmill(String emote, String blank) {
        type(emote+" "+emote+" "+emote+" "+blank+" "+emote);
        enter();
        type(blank+" "+blank+" "+emote+" "+blank+" "+emote);
        enter();
        type(emote+" "+emote+" "+emote+" "+emote+" "+emote);
        enter();
        type(emote+" "+blank+" "+emote+" "+blank+" "+blank);
        enter();
        type(emote+" "+blank+" "+emote+" "+emote+" "+emote);
        enter();
    }

    public static void heart(String emote, String blank) {
        type(blank+" "+emote+" "+blank+" "+emote+" "+blank);
        enter();
        type(emote+" "+blank+" "+emote+" "+blank+" "+emote);
        enter();
        type(emote+" "+blank+" "+blank+" "+blank+" "+emote);
        enter();
        type(blank+" "+emote+" "+blank+" "+emote+" "+blank);
        enter();
        type(blank+" "+blank+" "+emote+" "+blank+" "+blank);
        enter();
    }

    public static void dickRamid(String emote) {
        type("Support gays, support JJ! <3");
        enter();
        type(makeCustomString(0, 0, 2, "", emote));
        enter();
        type(makeCustomString(0, 0, 2, "", emote));
        enter();
        type(makeCustomString(0, 0, 5, "", emote));
        enter();
        type(makeCustomString(0, 0, 5, "", emote));
        enter();
        type(makeCustomString(0, 0, 2, "", emote));
        enter();
        type(makeCustomString(0, 0, 2, "", emote));
        enter();
    }

    public static String makeCustomString(int bef, int aft, int emotes, String blank, String emote) {
        String temp = "";

        for (int i = 0; i < bef; i++) {
            temp+=blank+" ";
        }

        for (int i = 0; i < emotes; i++) {
            temp+=emote+" ";
        }

        for (int i = 0; i < aft; i++) {
            temp+=blank+" ";
        }
        return temp;
    }

    public static void sjjW() {
        type("sjjW");
        space();
    }

    public static void krippW() {
        type("krippW");
        space();
    }

    public static void SMOrc() {
        type("SMOrc");
        space();
    }

    public static void PJSalt() {
        type("PJSalt");
        space();
    }

    public static void illuminati() {
        type("deIlluminati");
        space();
    }

    public static void Kappa() {
        type("Kappa");
        space();
    }

    public static void PogChamp() {
        type("PogChamp");
        space();
    }

    public static void krippWall() {
        type("krippWall");
        space();
    }

    public static void enter() {
        Robot robot;
        try {
            robot = new Robot();
            robot.keyPress(KeyEvent.VK_ENTER);
            robot.keyRelease(KeyEvent.VK_ENTER);
        } catch (AWTException e) {
            e.printStackTrace();
        }
    }
    public static void space() {
        Robot robot;
        try {
            robot = new Robot();
            robot.keyPress(KeyEvent.VK_SPACE);
            robot.keyRelease(KeyEvent.VK_SPACE);
        } catch (AWTException e) {
            e.printStackTrace();
        }
    }
}
