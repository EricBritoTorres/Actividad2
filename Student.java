public class Student {

    static String name = "Eric";
    static int[] scores = new int[]{75, 65, 78, 95, 85};
// primer metodo
    public double average() {
        double sum = 0;

        for (int i = 0; i < scores.length; i++) {
            sum += scores[i];
        }
        double avg = sum / scores.length;
        return avg;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }

    @Override
    protected void finalize() throws Throwable {
        super.finalize();
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    @Override
    public String toString() {
        return super.toString();
    }
// segundo metodo
    public char score(double average) {
        char grade = ' ';
        if (average >= 91 && average <= 100) grade = 'A';
        else if (average >= 81 && average <= 90) grade = 'B';
        else if (average >= 71 && average <= 80) grade = 'C';
        else if (average >= 61 && average <= 70) grade = 'D';
        else if (average >= 51 && average <= 60) grade = 'E';
        else grade = 'F';
        return grade;
    }
// tercer metodo
    public static void main(String[] args) {
        Student student = new Student();

        System.out.println("Nombre del estudiante: " + Student.name);
        for (int i = 0; i < scores.length; i++) {
            System.out.println("Calificacion " + (i + 1) + ": " + scores[i]);
        }

        double avg = student.average();
        char grade = student.score(avg);

        System.out.println("Promedio: " + avg);
        System.out.println("Calificacion: " + grade);
    }
}
