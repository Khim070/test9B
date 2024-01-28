public class Main {
    public static void main(String[] args) {
        Student s = new Student("Vakhim","RUPP",2);
        try{
            s.addCourse("Java",90);
            s.addCourse("Network",92);
            s.addCourse("Statistics Analysis",95);
        }catch(ArrayIndexOutOfBoundsException e){
            System.out.println(e.getMessage());
        }
        System.out.println("==========================");
        s.showGrade();
    }
}