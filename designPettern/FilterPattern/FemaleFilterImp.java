package FilterPattern;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by zhaoyimeng on 2016/12/22.
 */
public class FemaleFilterImp implements IFilter{
    @Override
    public List<Person> meetCriteria(List<Person> persons) {
        List<Person> malePersons = new ArrayList<Person>();
        for (Person person:persons){
            if (person.getGender().equalsIgnoreCase("FEMALE")){
                malePersons.add(person);
            }
        }
        return malePersons;
    }
}
