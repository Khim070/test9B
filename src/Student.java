public class Student extends Person{
    private int numCourse;
    private String[] course;
    private int[] grade;
    private int temp = 0;
    public Student(String name, String address, int numCourse){
        super(name, address);
        this.numCourse = numCourse;
        this.course = new String[this.numCourse];
        this.grade = new int[this.numCourse];
    }
    public void addCourse(String course, int grade)throws ArrayIndexOutOfBoundsException{
        if(this.course.length!=this.numCourse-1){
            this.course[temp]=course;
            this.grade[temp]=grade;
            temp++;
        }else{
            throw new ArrayIndexOutOfBoundsException("You can not add more course and grade as you had initialize");
        }
    }
    public void showGrade(){
        for(int i=0;i<this.course.length;i++){
            System.out.println("Course: "+course[i]+", "+"Grade: "+grade[i]);
        }
    }
}
