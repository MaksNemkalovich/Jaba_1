package bsu.rfct.course2.group5.Nemkolovich;

public class Main {
    
    public static void main(String[] args) throws Exception {

        Food[] breakfast = new Food[20];
        for(int itemIndex=0; itemIndex <args.length; itemIndex++) {
            String[] parts = args[itemIndex].split("/");
            if (parts[0].equals("Cheese")) {
                breakfast[itemIndex] = new Cheese();
            } else if (parts[0].equals("Apple")) {
                breakfast[itemIndex] = new Apple(parts[1]);

            } else if (parts[0].equals("Tea")){
                breakfast[itemIndex] = new Tea(parts[1]);
                
            } else if (parts[0].equals("Plum")) {
            	breakfast[itemIndex] = new Plum(parts[1]);
            }
        }
        for (Food item: breakfast) {
            if (item==null) break;
            item.consume();
        }
        System.out.println("Всего хорошего!");
    }
}

