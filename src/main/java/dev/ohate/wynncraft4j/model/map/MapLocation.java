package dev.ohate.wynncraft4j.model.map;

public class MapLocation {

    private String name;
    private String icon;
    private int x;
    private int y;
    private int z;

    /**
     * Gets the name of the location.
     *
     * @return the name of the location.
     */
    public String getName() {
        return this.name;
    }

    /**
     * Gets the icon representing the location.
     *
     * @return the icon representing the location.
     */
    public String getIcon() {
        return this.icon;
    }

    /**
     * Gets the x-coordinate of the location.
     *
     * @return the x-coordinate of the location.
     */
    public int getX() {
        return this.x;
    }

    /**
     * Gets the y-coordinate of the location.
     *
     * @return the y-coordinate of the location.
     */
    public int getY() {
        return this.y;
    }

    /**
     * Gets the z-coordinate of the location.
     *
     * @return the z-coordinate of the location.
     */
    public int getZ() {
        return this.z;
    }

    /**
     * Returns a string representation of the MapLocation.
     * The string includes the name, icon, and coordinates (x, y, z).
     *
     * @return a string representation of the MapLocation.
     */
    @Override
    public String toString() {
        return "MapLocation{" +
                "name='" + this.name + '\'' +
                ", icon='" + this.icon + '\'' +
                ", x=" + this.x +
                ", y=" + this.y +
                ", z=" + this.z +
                '}';
    }

}
