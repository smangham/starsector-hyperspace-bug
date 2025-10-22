package toaster;

import com.fs.starfarer.api.BaseModPlugin;
import com.fs.starfarer.api.Global;
import com.fs.starfarer.api.impl.campaign.terrain.HyperspaceTerrainPlugin;
import com.fs.starfarer.api.util.Misc;

/**
 * Plugin for the bugged thing
 */
public class HyperspaceBugModPlugin extends BaseModPlugin {
    public static void setUp() {
        HyperspaceTerrainPlugin hyper = Misc.getHyperspaceTerrainPlugin();
        Global.getLogger(HyperspaceBugModPlugin.class).info(
                "setUp: HyperspaceTerrainPlugin class is "+hyper.getClass().getName()
        );
        if (hyper instanceof BuggedHyperspaceTerrainPlugin hyperlib_subclass) {
            Global.getLogger(HyperspaceBugModPlugin.class).info("setUp: Plugin loaded");
        }
    }

    @Override
    public void onApplicationLoad() throws Exception {
        super.onApplicationLoad();
        Global.getLogger(HyperspaceBugModPlugin.class).info("onApplicationLoad: Loaded.");
    }

    @Override
    public void onNewGameAfterEconomyLoad() {
        Global.getLogger(HyperspaceBugModPlugin.class).info("OnNewGameAfterEconomyLoad");
        super.onNewGameAfterEconomyLoad();
        setUp();
    }

    @Override
    public void onGameLoad(boolean newGame) {
        Global.getLogger(HyperspaceBugModPlugin.class).info("OnGameLoad");
        super.onNewGame();
        setUp();
    }
}
