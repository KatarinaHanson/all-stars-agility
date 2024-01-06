/* Authors: Katarina Hanson, Matthew Boyea
 * Creation Date: 2024/01/03
 * Last Edit Date: 2024/01/03
 * Editors: ---
 * Description: Entity represents an object at a position in the game world with collision.
 */
import org.dyn4j.dynamics.*;

public class Entity {
    public Body body;
    Entity() {
        body = new Body();
        Main.physics.world.addBody(body);
    }
}