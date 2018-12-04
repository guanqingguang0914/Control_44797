/**
 * The ROI (region of interest) for the vehicle. This can be
 * be used by the vehicle for camera/vehicle attitude alignment (see
 * MAV_CMD_NAV_ROI).
 */
package com.MAVLink.enums;

public class MAV_ROI {
    public static final int MAV_ROI_NONE = 0; /* No region of interest. | */
    public static final int MAV_ROI_WPNEXT = 1; /* Point toward next MISSION. | */
    public static final int MAV_ROI_WPINDEX = 2; /* Point toward given MISSION. | */
    public static final int MAV_ROI_LOCATION = 3; /* Point toward fixed location. | */
    public static final int MAV_ROI_TARGET = 4; /* Point toward of given id. | */
    public static final int MAV_ROI_ENUM_END = 5; /*  | */

}
            