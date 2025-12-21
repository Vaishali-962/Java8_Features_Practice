package day9_streamAPIs_summrizingDouble_match_find_limit_skip_methods.summerizingDouble.question1.notesQuestion;

public class Students {
    // fields
    private int studentId;
    private String name;
    private int maths;
    private int history;
    private int english;
    // parameterized constructor

    public Students(int studentId, String name, int maths, int history, int english) {
        this.studentId = studentId;
        this.name = name;
        this.maths = maths;
        this.history = history;
        this.english = english;
    }

    // getter and setter

    public int getStudentId() {
        return studentId;
    }

    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getMaths() {
        return maths;
    }

    public void setMaths(int maths) {
        this.maths = maths;
    }

    public int getHistory() {
        return history;
    }

    public void setHistory(int history) {
        this.history = history;
    }

    public int getEnglish() {
        return english;
    }

    public void setEnglish(int english) {
        this.english = english;
    }

    // overridden toString()

    @Override
    public String toString() {
        return "Students [" +
                "studentId=" + studentId +
                ", name='" + name + '\'' +
                ", maths=" + maths +
                ", history=" + history +
                ", english=" + english +
                ']';
    }
}
