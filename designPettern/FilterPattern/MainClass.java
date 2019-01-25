package FilterPattern;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by zhaoyimeng on 2016/12/22.
 * 过滤器模式（Filter Pattern）或标准模式（Criteria Pattern）是一种设计模式，
 * 这种模式允许开发人员使用不同的标准来过滤一组对象，通过逻辑运算以解耦的方式把它们连接起来。
 * 这种类型的设计模式属于结构型模式，它结合多个标准来获得单一标准。
 *
 * 参考：http://www.runoob.com/design-pattern/filter-pattern.html
 */
public class MainClass {
    public static void main(String[] args) {
        List<Person> persons = new ArrayList<Person>();
        persons.add(new Person("John","Male", "Married"));
        persons.add(new Person("Laura","Female", "Married"));
        persons.add(new Person("Diana","Female", "Single"));
        persons.add(new Person("Mike","Male", "Single"));
        persons.add(new Person("Bobby","Male", "Single"));
        persons.add(new Person("Robert", "Male", "Single"));

        IFilter male = new MaleFilterImp();
        IFilter female = new FemaleFilterImp();
        IFilter single = new SingleFilterImp();

        List<IFilter> filters = new ArrayList<IFilter>();
        filters.add(male);
        filters.add(single);

        IFilter singleMale = new AndFilter(filters);
        System.out.println("[ singleMale ]");
        printPersons(singleMale.meetCriteria(persons));

        filters.clear();
        filters.add(female);
        filters.add(single);
        IFilter singleOrFemal = new OrFilter(filters);
        System.out.println("\n[ single or Female ]");
        printPersons(singleOrFemal.meetCriteria(persons));
    }

    public static void printPersons(List<Person> persons){
        for (Person person:persons){
            System.out.println("Person : [ Name : " + person.getName()
            + ", Gender : " + person.getGender()
            + ", Marital Status : " + person.getMaritalStatus()
            + " ] ");
        }
    }
}
