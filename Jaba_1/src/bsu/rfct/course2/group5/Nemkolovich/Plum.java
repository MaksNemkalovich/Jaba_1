package bsu.rfct.course2.group5.Nemkolovich;

public class Plum extends Food {
    
    private String color;
    public Plum(String color)
    { 
        super("Слива");
        this.color = color;
    }
   
    public void consume() 
    {
        System.out.println(this + " съедена");
    }
   
    public String getColor()
    {
        return color;
    }
   
    public void setColor(String color)
    {
        this.color = color;
    }
   
    public boolean equals(Object arg0) {
        if (!super.equals(arg0)) return false;
        if (!(arg0 instanceof Plum)) return false; 
        return color.equals(((Plum)arg0).color); 
    }
    
    public String toString() {
        return super.toString() + " Цвета '" + color.toUpperCase() + "'";
    }
}