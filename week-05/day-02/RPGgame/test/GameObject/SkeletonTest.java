package GameObject;

import org.junit.Test;

import static org.junit.Assert.*;

public class SkeletonTest {

  @Test
  public void createSkeleton() {
    Monster skeleton = new Skeleton();
    assertNotNull(skeleton);
  }
}