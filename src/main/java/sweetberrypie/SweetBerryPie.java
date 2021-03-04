package sweetberrypie;

import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.DistExecutor;
import net.minecraftforge.fml.common.Mod;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import javax.annotation.Nonnull;

@Mod("sweetberrypie")
public class SweetBerryPie {
    public static final String MOD_ID = "sweetberrypie";
    public static final Logger LOGGER = LogManager.getLogger();

    public SweetBerryPie() {
        DistExecutor.safeRunForDist(() -> SideProxy.Client::new, () -> SideProxy.Server::new);
    }

    @Nonnull
    public static ResourceLocation getId(String path) {
        return new ResourceLocation(MOD_ID, path);
    }

}