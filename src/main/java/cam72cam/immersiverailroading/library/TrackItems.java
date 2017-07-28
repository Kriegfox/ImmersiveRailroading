package cam72cam.immersiverailroading.library;

public enum TrackItems {
	STRAIGHT_SMALL,
	STRAIGHT_MEDIUM,
	STRAIGHT_LARGE,
	CROSSING,
	SLOPE_MEDIUM,
	SLOPE_LARGE,
	TURN_MEDIUM,
	TURN_LARGE,
	SWITCH_MEDIUM,
	SWITCH_LARGE,
	PARALEL_SWITCH_MEDIUM,
	TURN_MEDIUM_45,
	TURN_LARGE_45,
	SWITCH_MEDIUM_45,
	SWITCH_LARGE_45,
	;
	
	public int getMeta() {
		return this.ordinal();
	}
	
	public static TrackItems fromMeta(int meta) {
		return TrackItems.values()[meta];
	}

	public boolean isTurn() {
		return this == TURN_MEDIUM || this == TURN_LARGE;
	}
}