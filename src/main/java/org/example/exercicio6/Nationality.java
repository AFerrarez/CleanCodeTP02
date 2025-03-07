package org.example.exercicio6;

import java.awt.*;
import java.util.Arrays;
import java.util.List;

public enum Nationality {
    DUTCH(Arrays.asList(Color.RED, Color.WHITE, Color.BLUE)),
    GERMAN(Arrays.asList(Color.BLACK, Color.RED, Color.YELLOW)),
    BELGIAN(Arrays.asList(Color.BLACK, Color.YELLOW, Color.RED)),
    FRENCH(Arrays.asList(Color.BLUE, Color.WHITE, Color.RED)),
    ITALIAN(Arrays.asList(Color.GREEN, Color.WHITE, Color.RED)),
    UNCLASSIFIED(Arrays.asList(Color.GRAY));

    private final List<Color> flagColors;

    Nationality(List<Color> flagColors) {
        this.flagColors = flagColors;
    }

    public List<Color> getFlagColors() {
        return flagColors;
    }

    public static void main(String[] args) {
        List<Color> colorFrench = Nationality.FRENCH.getFlagColors();
        List<Color> colorDutch = Nationality.DUTCH.getFlagColors();
        System.out.println(colorFrench);
        System.out.println(colorDutch);
    }

}
