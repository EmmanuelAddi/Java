// Encapsulation -> Binding data with methods
class Students{
    private int regno;
    private String name;

    //Getters and setters
    public void setRegNo(int r){
        this.regno = r;
        System.out.println("Value of Reg No Changed!");
    }
    public int getRegNo(){
        return regno;
    }
    public void setName(String name){
        this.name = name;
    }
    public String getName(){
        return name;
    }
}

public class Encapsulation {
    public static void main(String[] args) {
        Students s1 = new Students();
        s1.setRegNo(1028);
        s1.setName("Addi");

        System.out.println(s1.getRegNo());
        System.out.println(s1.getName());
    }
}
