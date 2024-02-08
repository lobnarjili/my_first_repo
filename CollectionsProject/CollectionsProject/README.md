## Getting Started

Welcome to the VS Code Java world. Here is a guideline to help you get started to write Java code in Visual Studio Code.

## Folder Structure

The workspace contains two folders by default, where:

- `src`: the folder to maintain sources
- `lib`: the folder to maintain dependencies

Meanwhile, the compiled output files will be generated in the `bin` folder by default.

> If you want to customize the folder structure, open `.vscode/settings.json` and update the related settings there.

## Dependency Management

The `JAVA PROJECTS` view allows you to manage your dependencies. More details can be found [here](https://github.com/microsoft/vscode-java-dependency#manage-dependencies).

/*
 * courseMap.computeIfAbsent(course, k -> new ArrayList<>()).add(student);
 * 
 * // Question 10
 * System.out.println("Courses and Students:");
 * for (Map.Entry<String, List<Student>> entry : courseMap.entrySet()) {
 * System.out.println("Course: " + entry.getKey() + ", Students: " +
 * entry.getValue());
 * }
 * 
 * // Question 11
 * List<String> jStudents = studentMap.values().stream().filter(student ->
 * student.getNom().startsWith("J"))
 * .map(Student::getNom).collect(Collectors.toList());
 * 
 * System.out.println("Students whose names start with 'J': " + jStudents);
 * }
 * }
 */