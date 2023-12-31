package bsu.rfct.course2.group5.Nemkolovich;

public class Apple extends Food {
   
    private String size;
    public Apple(String size) {
       
        super("Яблоко");
        
        this.size = size;
    }
  
    public void consume() {
        System.out.println(this + " съедено");
    }
  
    public String getSize() {
        return size;
    }
  
    public void setSize(String size) {
        this.size = size;
    }
   
    public boolean equals(Object arg0) {
        if (!super.equals(arg0)) return false; 
        if (!(arg0 instanceof Apple)) return false; 
        return size.equals(((Apple)arg0).size);
    };
        
   
    public String toString() {
        return super.toString() + " размера '" + size.toUpperCase() + "'";
    }
}