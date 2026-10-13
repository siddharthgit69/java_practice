class test{
    int age;
    String name;
    String school;

    void display(){
        System.out.println("Age: "+age);
        System.out.println("Name: "+name);
        System.out.println("School: "+school);
    }
    public static void main(String args[]){
        test s1 = new test();
        s1.age = 19;
        s1.name = "JAVA";
        s1.school = "JDK";
        s1.display();
    }
}