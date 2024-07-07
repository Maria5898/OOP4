package view;

public class Teacher implements Comparable<Teacher> {
    private String name;
    private int id;

    public Teacher(String name, int id) {
        this.name = name;
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }

    @Override
    public int compareTo(Teacher other) {
        // Сравниваем учителей по имени (можно изменить на сравнение по id или другим параметрам)
        return this.name.compareTo(other.name);
    }

    @Override
    public String toString() {
        // Возвращаем строковое представление объекта
        return "Teacher{name='" + name + "', id=" + id + "}";
    }
}
