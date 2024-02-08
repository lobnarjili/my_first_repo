import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collectors;
//import java.util.*;
import java.util.stream.Stream;

public class App {
    public static void main(String[] args) throws Exception {
        // CREERR Un nouveau HashMap ,
        /*
         * 3- Créez une Map appelée studentMap qui fait correspondre l'identifiant de
         * chaque étudiant
         * à son objet Student :
         * - Vous pouvez utiliser la classe HashMap pour créer la map.
         * - Cette map vous permettra de rechercher rapidement un objet Student en
         * fonction de son identifiant.
         */
        Map<Integer, Student> studentMap = new HashMap<>();
        /*
         * 4- Ajoutez quelques objets Student à la Map :
         * - Créez au moins 3 objets Student et ajoutez-les à la Map en utilisant leur
         * identifiant
         * comme clé.
         * - Pour chaque objet Student, ajoutez quelques cours à leur liste de cours.
         */

        Student student1 = new Student("Jason", 2001);
        student1.addCourse("Math");
        student1.addCourse("Science");
        student1.addCourse("History");

        studentMap.put(student1.getID(), student1);

        Student student2 = new Student("Ava", 2002);
        student2.addCourse("English");
        student2.addCourse("Science");
        student2.addCourse("Art");

        studentMap.put(student2.getID(), student2);

        Student student3 = new Student("Mike", 2003);
        student3.addCourse("Math");
        student3.addCourse("History");
        student3.addCourse("Geography");

        studentMap.put(student3.getID(), student3);

        // for (studentMap.entry<String, Integer> entry : studentMap.entrySet()) {
        System.out.println("step5: Print student information");
        /*
         * 5- Parcourez la Map à l'aide d'une boucle for et affichez le nom,
         * l'identifiant et les cours de
         * chaque étudiant.
         */
        for (Student student : studentMap.values()) {

            System.out.println(
                    "Name: " + student.getNom() + " ID: " + student.getID() + " Courses: " + student.getCourses());

        }
        /*
         * 6- Créez une liste de tous les cours suivis par les étudiants :
         * - Créez une nouvelle ArrayList appelée allCourses.
         * - Parcourez la Map et ajoutez tous les cours de chaque objet Student à la
         * liste
         * allCourses.
         */

        ArrayList<String> allCourse = new ArrayList<>();
        // CREERR Un nouveau HashMap ,
        // Map<Integer, courMap> courMap = new HashMap<>();
        for (Student student : studentMap.values()) {
            allCourse.addAll(student.getCourses());

            // System.out.println(student.courses);

        }
        /*
         * 7- Supprimez les cours en double de la liste en utilisant un Set :
         * - Créez un nouveau HashSet appelée uniqueCourses et transmettez la liste
         * allCourses au constructeur.
         * - Cela supprimera les cours en double de la liste.
         */

        Set<String> uniqueCourses = new HashSet<>(allCourse);
        /*
         * 8- Parcourez les cours uniques à l'aide d'une boucle for et affichez chaque
         * cours :
         * - Utilisez une boucle for pour parcourir l'ensemble uniqueCourses et afficher
         * chaque
         * cours
         */
        System.out.println("");
        System.out.println("step8: Print unique courses");

        System.out.print("Unique Courses: ");
        for (String course : uniqueCourses) {
            System.out.print(course + " ");
        }
        System.out.println(" ");
        /*
         * 9- Créez une Map qui fait correspondre chaque cours à une liste d'étudiants
         * qui suivent ce cours:
         * - Créez une nouvelle HashMap appelée courseMap.
         * - Parcourez la Map des objets Student et pour chaque Student, parcourez leur
         * liste
         * de cours. Pour chaque cours, vérifiez si courseMap contient déjà une liste
         * d'étudiants pour ce cours.
         * 
         * Si ce n'est pas le cas, créez une nouvelle ArrayList et ajoutez-la à
         * courseMap avec le cours comme clé. Ensuite, ajoutez l'objet Student actuel à
         * la liste
         * d'étudiants pour ce cours.
         */

        Map<String, List<Student>> courseMap = new HashMap<>();
        for (Student student : studentMap.values()) {
            for (String course : student.getCourses()) {
                courseMap.computeIfAbsent(course, k -> new ArrayList<>()).add(student);

            }

        }
        /*
         * 10- Parcourez la Map à l'aide d'une boucle for et affichez le cours et la
         * liste d'étudiants qui suivent
         * ce cours.
         * 
         */
        System.out.println("");
        System.out.println("Step 10: Print sudents by course Students by Course: ");
        for (Map.Entry<String, List<Student>> entry : courseMap.entrySet()) {
            String cour = entry.getKey();
            List<Student> value = entry.getValue();

            System.out.print(cour + " : [ ");

            for (Student objet : value) {

                System.out.print(objet.getNom());
                System.out.print(" ,");

            }
            System.out.println(" ]");

            // System.out.println(cour + " : " + entry.getValue());

        }

        /*
         * 11- Utilisez les streams pour créer une liste d'étudiants dont le nom
         * commence par la lettre "J"
         * et affichez leurs noms.
         */
        System.out.println("");
        System.out.println("Step 11 : Print students whose name with // the letter J ");
        List<String> jStudents = studentMap.values().stream().filter(student -> student.getNom().startsWith("J"))
                .map(Student::getNom).collect(Collectors.toList());

        System.out.println("Students with J Names: ");
        System.out.println(jStudents);
    }

}
