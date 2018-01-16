package coffee.dripcoffee;

import coffee.Pump;
import dagger.Module;
import dagger.Provides;

@Module
public class PumpModule {

  @Provides
  public static Pump providePump(Thermosiphon pump) {
    return pump;
  }
}
