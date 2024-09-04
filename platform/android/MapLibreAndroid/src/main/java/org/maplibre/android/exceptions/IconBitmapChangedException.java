package org.maplibre.android.exceptions;

import org.maplibre.android.annotations.Icon;
import org.maplibre.android.annotations.Marker;
import org.maplibre.android.maps.MapView;

/**
 * <p>
 * An IconBitmapChangedException is thrown by MapView when a Marker is added
 * that has an Icon with a Bitmap that has been modified since the creation of the Icon.
 * </p>
 * You cannot modify a {@code Icon} after it has been added to the map in a {@code Marker}
 *
 * @see MapView
 * @see Icon
 * @see Marker
 */
public class IconBitmapChangedException extends RuntimeException {

  public IconBitmapChangedException() {
    super("The added Marker has an Icon with a bitmap that has been modified. An Icon cannot be modified"
      + "after it has been added to the map in a Marker.");
  }

}
