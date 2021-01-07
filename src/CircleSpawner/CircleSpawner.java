package CircleSpawner;

import de.ur.mi.oop.app.GraphicsApp;
import de.ur.mi.oop.events.MousePressedEvent;
import de.ur.mi.oop.launcher.GraphicsAppLauncher;

public class CircleSpawner extends GraphicsApp {

    private static final int CANVAS_SIZE = 800;
    private static final int MAX_RADIUS = 50;

    public static void main(String[] args) {
        GraphicsAppLauncher.launch();
    }


    @Override
    public void initialize() {
        setCanvasSize(CANVAS_SIZE, CANVAS_SIZE);
    }

    @Override
    public void onMousePressed(MousePressedEvent event) {
        handleClick(event.getXPos(), event.getYPos());
    }

    private void handleClick(float xPos, float yPos) {

    }

    @Override
    public void draw() {

    }
}
