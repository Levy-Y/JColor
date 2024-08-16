package org.jcolor;

public class CString {
    // Reset
    private static final String RESET = "\033[0m";  // Text Reset

    // Regular Colors
    private static final String BLACK = "\033[0;30m";   // BLACK
    private static final String RED = "\033[0;31m";     // RED
    private static final String GREEN = "\033[0;32m";   // GREEN
    private static final String YELLOW = "\033[0;33m";  // YELLOW
    private static final String BLUE = "\033[0;34m";    // BLUE
    private static final String PURPLE = "\033[0;35m";  // PURPLE
    private static final String CYAN = "\033[0;36m";    // CYAN
    private static final String WHITE = "\033[0;37m";   // WHITE

    // Bold
    private static final String BLACK_BOLD = "\033[1;30m";  // BLACK
    private static final String RED_BOLD = "\033[1;31m";    // RED
    private static final String GREEN_BOLD = "\033[1;32m";  // GREEN
    private static final String YELLOW_BOLD = "\033[1;33m"; // YELLOW
    private static final String BLUE_BOLD = "\033[1;34m";   // BLUE
    private static final String PURPLE_BOLD = "\033[1;35m"; // PURPLE
    private static final String CYAN_BOLD = "\033[1;36m";   // CYAN
    private static final String WHITE_BOLD = "\033[1;37m";  // WHITE

    // Underline
    private static final String BLACK_UNDERLINED = "\033[4;30m";  // BLACK
    private static final String RED_UNDERLINED = "\033[4;31m";    // RED
    private static final String GREEN_UNDERLINED = "\033[4;32m";  // GREEN
    private static final String YELLOW_UNDERLINED = "\033[4;33m"; // YELLOW
    private static final String BLUE_UNDERLINED = "\033[4;34m";   // BLUE
    private static final String PURPLE_UNDERLINED = "\033[4;35m"; // PURPLE
    private static final String CYAN_UNDERLINED = "\033[4;36m";   // CYAN
    private static final String WHITE_UNDERLINED = "\033[4;37m";  // WHITE

    // Background
    private static final String BLACK_BACKGROUND = "\033[40m";  // BLACK
    private static final String RED_BACKGROUND = "\033[41m";    // RED
    private static final String GREEN_BACKGROUND = "\033[42m";  // GREEN
    private static final String YELLOW_BACKGROUND = "\033[43m"; // YELLOW
    private static final String BLUE_BACKGROUND = "\033[44m";   // BLUE
    private static final String PURPLE_BACKGROUND = "\033[45m"; // PURPLE
    private static final String CYAN_BACKGROUND = "\033[46m";   // CYAN
    private static final String WHITE_BACKGROUND = "\033[47m";  // WHITE

    // High Intensity
    private static final String BLACK_BRIGHT = "\033[0;90m";  // BLACK
    private static final String RED_BRIGHT = "\033[0;91m";    // RED
    private static final String GREEN_BRIGHT = "\033[0;92m";  // GREEN
    private static final String YELLOW_BRIGHT = "\033[0;93m"; // YELLOW
    private static final String BLUE_BRIGHT = "\033[0;94m";   // BLUE
    private static final String PURPLE_BRIGHT = "\033[0;95m"; // PURPLE
    private static final String CYAN_BRIGHT = "\033[0;96m";   // CYAN
    private static final String WHITE_BRIGHT = "\033[0;97m";  // WHITE

    // Bold High Intensity
    private static final String BLACK_BOLD_BRIGHT = "\033[1;90m"; // BLACK
    private static final String RED_BOLD_BRIGHT = "\033[1;91m";   // RED
    private static final String GREEN_BOLD_BRIGHT = "\033[1;92m"; // GREEN
    private static final String YELLOW_BOLD_BRIGHT = "\033[1;93m";// YELLOW
    private static final String BLUE_BOLD_BRIGHT = "\033[1;94m";  // BLUE
    private static final String PURPLE_BOLD_BRIGHT = "\033[1;95m";// PURPLE
    private static final String CYAN_BOLD_BRIGHT = "\033[1;96m";  // CYAN
    private static final String WHITE_BOLD_BRIGHT = "\033[1;97m"; // WHITE

    // High Intensity backgrounds
    private static final String BLACK_BACKGROUND_BRIGHT = "\033[0;100m";// BLACK
    private static final String RED_BACKGROUND_BRIGHT = "\033[0;101m";// RED
    private static final String GREEN_BACKGROUND_BRIGHT = "\033[0;102m";// GREEN
    private static final String YELLOW_BACKGROUND_BRIGHT = "\033[0;103m";// YELLOW
    private static final String BLUE_BACKGROUND_BRIGHT = "\033[0;104m";// BLUE
    private static final String PURPLE_BACKGROUND_BRIGHT = "\033[0;105m"; // PURPLE
    private static final String CYAN_BACKGROUND_BRIGHT = "\033[0;106m";  // CYAN
    private static final String WHITE_BACKGROUND_BRIGHT = "\033[0;107m";   // WHITE

    public static void printc(Styles style, String string) {
        String format = switch (style) {
            case BLACK -> BLACK;
            case RED -> RED;
            case GREEN -> GREEN;
            case YELLOW -> YELLOW;
            case BLUE -> BLUE;
            case PURPLE -> PURPLE;
            case CYAN -> CYAN;
            case WHITE -> WHITE;
            case BLACK_BOLD -> BLACK_BOLD;
            case RED_BOLD -> RED_BOLD;
            case GREEN_BOLD -> GREEN_BOLD;
            case YELLOW_BOLD -> YELLOW_BOLD;
            case BLUE_BOLD -> BLUE_BOLD;
            case PURPLE_BOLD -> PURPLE_BOLD;
            case CYAN_BOLD -> CYAN_BOLD;
            case WHITE_BOLD -> WHITE_BOLD;
            case BLACK_UNDERLINED -> BLACK_UNDERLINED;
            case RED_UNDERLINED -> RED_UNDERLINED;
            case GREEN_UNDERLINED -> GREEN_UNDERLINED;
            case YELLOW_UNDERLINED -> YELLOW_UNDERLINED;
            case BLUE_UNDERLINED -> BLUE_UNDERLINED;
            case PURPLE_UNDERLINED -> PURPLE_UNDERLINED;
            case CYAN_UNDERLINED -> CYAN_UNDERLINED;
            case WHITE_UNDERLINED -> WHITE_UNDERLINED;
            case BLACK_BACKGROUND -> BLACK_BACKGROUND;
            case RED_BACKGROUND -> RED_BACKGROUND;
            case GREEN_BACKGROUND -> GREEN_BACKGROUND;
            case YELLOW_BACKGROUND -> YELLOW_BACKGROUND;
            case BLUE_BACKGROUND -> BLUE_BACKGROUND;
            case PURPLE_BACKGROUND -> PURPLE_BACKGROUND;
            case CYAN_BACKGROUND -> CYAN_BACKGROUND;
            case WHITE_BACKGROUND -> WHITE_BACKGROUND;
            case BLACK_BRIGHT -> BLACK_BRIGHT;
            case RED_BRIGHT -> RED_BRIGHT;
            case GREEN_BRIGHT -> GREEN_BRIGHT;
            case YELLOW_BRIGHT -> YELLOW_BRIGHT;
            case BLUE_BRIGHT -> BLUE_BRIGHT;
            case PURPLE_BRIGHT -> PURPLE_BRIGHT;
            case CYAN_BRIGHT -> CYAN_BRIGHT;
            case WHITE_BRIGHT -> WHITE_BRIGHT;
            case BLACK_BOLD_BRIGHT -> BLACK_BOLD_BRIGHT;
            case RED_BOLD_BRIGHT -> RED_BOLD_BRIGHT;
            case GREEN_BOLD_BRIGHT -> GREEN_BOLD_BRIGHT;
            case YELLOW_BOLD_BRIGHT -> YELLOW_BOLD_BRIGHT;
            case BLUE_BOLD_BRIGHT -> BLUE_BOLD_BRIGHT;
            case PURPLE_BOLD_BRIGHT -> PURPLE_BOLD_BRIGHT;
            case CYAN_BOLD_BRIGHT -> CYAN_BOLD_BRIGHT;
            case WHITE_BOLD_BRIGHT -> WHITE_BOLD_BRIGHT;
            case BLACK_BACKGROUND_BRIGHT -> BLACK_BACKGROUND_BRIGHT;
            case RED_BACKGROUND_BRIGHT -> RED_BACKGROUND_BRIGHT;
            case GREEN_BACKGROUND_BRIGHT -> GREEN_BACKGROUND_BRIGHT;
            case YELLOW_BACKGROUND_BRIGHT -> YELLOW_BACKGROUND_BRIGHT;
            case BLUE_BACKGROUND_BRIGHT -> BLUE_BACKGROUND_BRIGHT;
            case PURPLE_BACKGROUND_BRIGHT -> PURPLE_BACKGROUND_BRIGHT;
            case CYAN_BACKGROUND_BRIGHT -> CYAN_BACKGROUND_BRIGHT;
            case WHITE_BACKGROUND_BRIGHT -> WHITE_BACKGROUND_BRIGHT;
            default -> "";
        };

        System.out.println(format + string + RESET);
    }

}
