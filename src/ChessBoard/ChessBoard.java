package ChessBoard;

import de.ur.mi.oop.app.GraphicsApp;
import de.ur.mi.oop.launcher.GraphicsAppLauncher;

public class ChessBoard extends GraphicsApp {

    private static final int CHESS_FIELDS = 8;
    private static final int FIELD_SIZE = 100;
    private static final int CANVAS_SIZE = FIELD_SIZE * CHESS_FIELDS;

    public static void main(String[] args) {
        GraphicsAppLauncher.launch();
    }

    @Override
    public void initialize() {
        setCanvasSize(CANVAS_SIZE, CANVAS_SIZE);
    }

    @Override
    public void draw() {

    }
}
