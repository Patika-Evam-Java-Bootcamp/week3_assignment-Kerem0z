import java.util.*;

import static java.lang.System.out;

public class Services {


    List<Student> priorityList = new ArrayList<>();  //Öğrenci verilerini tutacağımız listemizi oluşturuyoruz.


    public Student addStudent() {                    //ogrenci ekleme methodu
        out.println("ENTER:");
        out.println("Type name");
        Scanner nameObj = new Scanner(System.in);
        String name = nameObj.nextLine();
        out.println("Type cgpa");
        Scanner cgpaObj = new Scanner(System.in);
        double cgpa = cgpaObj.nextDouble();
        out.println("Type id");

        Scanner idObj = new Scanner(System.in);
        int id = idObj.nextInt();
        Student student = new Student();       //aldığımız verileri oluşturduğumuz objenin içine atıyoruz.
        student.setCgpa(cgpa);
        student.setName(name);
        student.setId(id);
        priorityList.add(student);              //objemizi listemize ekliyoruz.
        for (Student Student : priorityList) {
            System.out.println(Student.getName());
        }
        return student;
    }

    public List<Student> served() {

        if (priorityList.isEmpty()) {
            out.println("EMPTY");
        } else {
            priorityList.sort(Comparator.comparing(Student::getCgpa).thenComparing(Student::getName)); //önce sıralama çalışıyor
            priorityList.remove(0); //listenin ilk ögesi siliniyor.
            for (Student Student : priorityList) {
                System.out.println(Student.getName());//liste döndürülüyor listedeki objelerin isimleri yazdırılıyor.
            }
        }
        return null;
    }
}







