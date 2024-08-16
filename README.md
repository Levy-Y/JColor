# JColor

### Method: 
```java
printc(Styles style, String string)
```
This method prints a formatted string to the console based on the specified style. The Styles enum defines various styles such as colors, boldness, underlining, background colors, and brightness.

Parameters:
- Styles style: The style to apply to the printed text.
- String string: The text to be printed.

Styles Options:
- BLACK, RED, GREEN, YELLOW, BLUE, PURPLE, CYAN, WHITE
- Bold versions of the above (BLACK_BOLD, etc.)
- Underlined versions of the above (BLACK_UNDERLINED, etc.)
- Background color versions of the above (BLACK_BACKGROUND, etc.)
- Bright versions of the above (BLACK_BRIGHT, etc.)
- Combined versions like bold and bright (BLACK_BOLD_BRIGHT, etc.)

Example Usage:
```java
import com.example.CString;

public class Main {
    public static void main(String[] args) {
        CString.printc(Styles.RED, "Hello, World!");
    }
}
```
In this example, the text "Hello, World!" will be printed in red.
