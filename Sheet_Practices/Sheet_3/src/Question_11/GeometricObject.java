package Question_11;

import java.util.Date;

class GeometricObject
{
    private String color;
    private boolean filled;
    private Date dateCreated;

    public GeometricObject() {}
    public GeometricObject(String color, boolean filled)
    {
        this.color = color;
        this.filled = filled;
    }

    public String getColor() { return color; }
    public void setColor(String color) { this.color = color; }
    public boolean isFilled() { return filled; }
    public void setFilled(boolean filled) { this.filled = filled; }
    public Date getDateCreated() { return dateCreated; }

    public String toString() { return super.toString(); }
}
