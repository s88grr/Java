//all object inheret functions - tostring is one of them
class Frog {
    
    private int id;
    private String name;
    
    public Frog(int id, String name) {
        this.id = id;
        this.name = name;
    }
    // string tostring() basically is saying "type string calling method toString()
    public String toString() {
        //line below is the same as StringBuilder but even more efficient !! looks clean too.
        return String.format("%-4d: %s", id, name);
        
        /*
        StringBuilder sb = new StringBuilder();
        //below line creates one string and adds to it - more efficient !
        sb.append(id).append(": ").append(name);
        return sb.toString();
       */
    }
}

public class app {

    public static void main(String[] args) {
        Frog frog1 = new Frog(7, "Freddy");
        Frog frog2 = new Frog(5, "Roger");
        
        System.out.println(frog1);
        System.out.println(frog2);
        
        
        //further example
        Integer x = 9;
        //tostring below makes the x int a string !! coversion in the method 
        System.out.println(x.toString());  
        System.out.println(Integer.toString(12));
    }
}