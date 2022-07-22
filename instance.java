
public class instance{
    String name;
    double salary;

    instance(String n){
      name=n;
    }
    void setSalary(double s){
        salary=s;
    }
    void printemp(){
        System.out.println("name:"+name);
        System.out.println("salary:"+salary);
    }
    public static void main(String[] args) {
        instance empone=new instance("vaibhav");
        empone.setSalary(1000000);
        empone.printemp();
        }
}