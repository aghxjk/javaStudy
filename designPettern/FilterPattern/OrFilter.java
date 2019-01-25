package FilterPattern;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by zhaoyimeng on 2016/12/22.
 */
public class OrFilter implements IFilter{

    List<IFilter> filters = new ArrayList<IFilter>();

    public OrFilter(List<IFilter> filters) {
        this.filters = filters;
    }


    @Override
    public List<Person> meetCriteria(List<Person> persons) {

        if (persons == null || persons.isEmpty()) {
            return null;
        }

        if (filters == null) {
            return persons;
        }

        List<Person> result = persons;
        for (IFilter filter:filters){
            result = filter.meetCriteria(result);
        }
        return result;
    }
}
