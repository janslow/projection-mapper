package com.jayanslow.projection.scene;

import javax.vecmath.Vector3f;

public interface RealObject {

	/**
	 * Unique ID of object
	 * 
	 * @return Object ID
	 */
	public int getId();

	/**
	 * Gets the position of the object (relative to the parent)
	 * 
	 * @return Position vector (in mm)
	 */
	public Vector3f getPosition();

	/**
	 * Gets the type of the object
	 * 
	 * @return Object Type
	 */
	public RealObjectType getType();
}
