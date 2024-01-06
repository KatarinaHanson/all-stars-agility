/* Authors: Katarina Hanson, Matthew Boyea
 * Creation Date: 2024/01/03
 * Last Edit Date: 2024/01/04
 * Editors: ---
 * Description: Physics manages the dyn4j collision & physics.
 */
import org.dyn4j.world.*;

public class Physics {
    public World world;
    public Physics(int w, int h) {
        world = new World(w, h);
    }
}