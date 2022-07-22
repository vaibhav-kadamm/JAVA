public class constructor{
    int id;
    String name;

    constructor(int i,String n){
        id=i;
        name=n;
    }
    void display(){
        System.out.println(id+""+name);
    }
    public static void main(String[] args) {
        constructor s1=new constructor(111," Vaibhav " );

        s1.display();
    }
}