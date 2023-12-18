package bsu.rfct.course2.group5.Nemkolovich;

public class Tea extends Food {
    
    private String color;
    public Tea(String color)
    { 
        super("Чай");
        this.color = color;
    }
   
    public void consume() 
    {
        System.out.println(this + " выпит");
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
        if (!(arg0 instanceof Tea)) return false; 
        return color.equals(((Tea)arg0).color); 
    }
    
    public String toString() {
        return super.toString() + " Цвета '" + color.toUpperCase() + "'";
    }
}

