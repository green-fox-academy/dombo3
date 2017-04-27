import static org.junit.Assert.*;

import joptsimple.OptionParser;
import joptsimple.OptionSet;
import org.junit.Test;

public class ShortOptionsTest {
  @Test
  public void supportsShortOptions() {
    OptionParser parser = new OptionParser( "larc" );

    OptionSet options = parser.parse( "-l", "-a", "-r", "c" );

    assertTrue( options.has( "l" ) );
    assertTrue( options.has( "a" ) );
    assertTrue( options.has( "r" ) );
    assertFalse( options.has( "c" ) );
  }
}