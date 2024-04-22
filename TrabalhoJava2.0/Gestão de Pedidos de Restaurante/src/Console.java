public class Console {

    public static int Lerint () {
        return Integer.parseInt(System.console().readLine());
    }

public static String lerString () {
    return System.console().readLine();
}

public static float lerFloat () {
    return Float.parseFloat(System.console().readLine());
    }
}
