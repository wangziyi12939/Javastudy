package lesson11;

/**
 * 与 Circle 没有任何血缘关系：不继承 Shape，也不认识它。
 * 照样能进 Named[]，因为它签了同一份能力清单。
 */
public class Student implements Named {

    private String id;

    public Student(String id) {
        this.id = id;
    }

    public String name() {
        return "学生-" + id;
    }
}
