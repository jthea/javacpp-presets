// Targeted by JavaCPP version 1.5-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.javacpp.opencv_tracking;

import org.bytedeco.javacpp.annotation.Index;
import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import org.bytedeco.javacpp.opencv_core.*;
import static org.bytedeco.javacpp.opencv_core.opencv_core.*;
import org.bytedeco.javacpp.opencv_imgproc.*;
import static org.bytedeco.javacpp.opencv_imgproc.opencv_imgproc.*;
import org.bytedeco.javacpp.opencv_plot.*;
import static org.bytedeco.javacpp.opencv_plot.opencv_plot.*;
import org.bytedeco.javacpp.opencv_imgcodecs.*;
import static org.bytedeco.javacpp.opencv_imgcodecs.opencv_imgcodecs.*;
import org.bytedeco.javacpp.opencv_videoio.*;
import static org.bytedeco.javacpp.opencv_videoio.opencv_videoio.*;
import org.bytedeco.javacpp.opencv_highgui.*;
import static org.bytedeco.javacpp.opencv_highgui.opencv_highgui.*;
import org.bytedeco.javacpp.opencv_flann.*;
import static org.bytedeco.javacpp.opencv_flann.opencv_flann.*;
import org.bytedeco.javacpp.opencv_features2d.*;
import static org.bytedeco.javacpp.opencv_features2d.opencv_features2d.*;
import org.bytedeco.javacpp.opencv_calib3d.*;
import static org.bytedeco.javacpp.opencv_calib3d.opencv_calib3d.*;
import org.bytedeco.javacpp.opencv_video.*;
import static org.bytedeco.javacpp.opencv_video.opencv_video.*;
import org.bytedeco.javacpp.opencv_dnn.*;
import static org.bytedeco.javacpp.opencv_dnn.opencv_dnn.*;

import static org.bytedeco.javacpp.opencv_tracking.opencv_tracking.*;


/************************************ TrackerSampler Base Classes ************************************/

/** \brief Abstract base class for TrackerSamplerAlgorithm that represents the algorithm for the specific
sampler.
 */
@Namespace("cv") @Properties(inherit = org.bytedeco.javacpp.opencv_tracking.opencv_tracking_presets.class)
public class TrackerSamplerAlgorithm extends Pointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public TrackerSamplerAlgorithm(Pointer p) { super(p); }

  /**
   * \brief Destructor
   */

  /** \brief Create TrackerSamplerAlgorithm by tracker sampler type.
    @param trackerSamplerType The trackerSamplerType name
    <p>
    The modes available now:
    <p>
    -   "CSC" -- Current State Center
    -   "CS" -- Current State
     */
  public static native @Ptr @ByVal TrackerSamplerAlgorithm create( @Str BytePointer trackerSamplerType );
  public static native @Ptr @ByVal TrackerSamplerAlgorithm create( @Str String trackerSamplerType );

  /** \brief Computes the regions starting from a position in an image.
    <p>
    Return true if samples are computed, false otherwise
    <p>
    @param image The current frame
    @param boundingBox The bounding box from which regions can be calculated
    <p>
    @param sample The computed samples \cite AAM Fig. 1 variable Sk
     */
  public native @Cast("bool") boolean sampling( @Const @ByRef Mat image, @ByVal Rect boundingBox, @ByRef MatVector sample );

  /** \brief Get the name of the specific TrackerSamplerAlgorithm
    */
  public native @Str BytePointer getClassName();
}