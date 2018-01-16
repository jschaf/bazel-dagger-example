package coffee.dripcoffee;

import coffee.Heater;
import dagger.Module;
import dagger.Provides;
import javax.inject.Singleton;

@Module(includes = PumpModule.class)
public class DripCoffeeModule {
  @Provides @Singleton
  public static Heater provideHeater() {
    return new ElectricHeater();
  }
}
