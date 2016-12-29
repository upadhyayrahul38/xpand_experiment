package datamodel.generator.util;

import data.Entity;

public class EntityHelper {
	public static String className(Entity e) {
		return e.getName() + "Implementation";

	}

	public static String classFileName(Entity e) {
		return className(e) + ".java";
	}
}
