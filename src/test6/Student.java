package test6;

import java.io.Serializable;
import java.util.Objects;

/**
 * 一个类实现了Serializable接口
 * 说明该类的对象支持序列化操作
 *
 * 一个完整的实体类通常包含
 * 构造方法（有参|无参）
 * 属性
 * 属性的封装方法
 * hashcode和equals
 * 实现Serializable接口
 */
public class Student implements Serializable {
    //序列化的版本号
    private static final long serialVersionUID = 4866152260907552349L;
    private String stuNo;
    private String stuName;
    private int age;
    private char sex;

    public String getStuNo() {
        return stuNo;
    }

    public void setStuNo(String stuNo) {
        this.stuNo = stuNo;
    }

    public String getStuName() {
        return stuName;
    }

    public void setStuName(String stuName) {
        this.stuName = stuName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public char getSex() {
        return sex;
    }

    public void setSex(char sex) {
        this.sex = sex;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return Objects.equals(stuNo, student.stuNo);
    }

    @Override
    public int hashCode() {
        return Objects.hash(stuNo);
    }

    public Student() {
    }

    public Student(String stuNo, String stuName, int age, char sex) {
        this.stuNo = stuNo;
        this.stuName = stuName;
        this.age = age;
        this.sex = sex;
    }

    @Override
    public String toString() {
        return "Student{" +
                "stuNo='" + stuNo + '\'' +
                ", stuName='" + stuName + '\'' +
                ", age=" + age +
                ", sex=" + sex +
                '}';
    }
}
