package setherith.game.level.tiles;

import setherith.game.gfx.Screen;
import setherith.game.level.Level;

public class BaseTile extends Tile {

    protected int tileId;
    protected int tileColour;
    
    public BaseTile(int id, int x, int y, int tileColour) {
        super(id, false, false);
        this.tileId = x + y;
        this.tileColour = tileColour;
    }

    public void render(Screen screen, Level level, int x, int y) {
        screen.render(x, y, tileId, tileColour, 0x00, 1);
    }
    
}
