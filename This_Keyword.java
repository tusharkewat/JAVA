// class Student{
//     
//     void data(){
//         System.out.println(this);
//     }
// }


// public class This_Keyword {
//     public static void main(String[] args) {
//         Student obj = new Student();
//         obj.data();
//         System.out.println(obj);
//     }
// }

class Student{
    int age;
    Student(int age){
        this.age = age ;
    }
    void print(){
        System.out.println(age);
    }
}

public class This_Keyword{
    public static void main(String[] args) {
        Student obj = new Student(19);
        obj.print();
    }
}
