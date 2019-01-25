package FilterPattern;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by zhaoyimeng on 2016/12/22.
 */
public class AndFilter implements IFilter{

    List<IFilter> filters = new ArrayList<IFilter>();

    public AndFilter(List<IFilter> filters) {
        this.filters = filters;
    }


    @Override
    public List<Person> meetCriteria(List<Person> persons) {

        if (persons == null || persons.isEmpty()) {
            return null;
        }

        if (filters == null || filters.isEmpty()) {
            return persons;
        }

        List<Person> tmp = persons;
//        List<Person> results = new ArrayList<Person>();

        for (IFilter filter:filters){
            tmp = filter.meetCriteria(tmp);
        }

        return tmp;
    }
}
