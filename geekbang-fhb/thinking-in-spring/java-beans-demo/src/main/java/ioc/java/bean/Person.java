package ioc.java.bean;

import lombok.ToString;

/**
 * Setter / Getter
 * Writable / Readable
 * @author benfeihu
 */
@ToString
public class Person {

    private String name;  // property

    private Integer age;

    public String getName() {
        return name;
    }

//    public void setName(String name) {
//        this.name = name;
//    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }
}
