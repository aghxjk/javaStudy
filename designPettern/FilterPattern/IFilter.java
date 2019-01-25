package FilterPattern;

import java.util.List;

/**
 * Created by zhaoyimeng on 2016/12/22.
 */
public interface IFilter {
    public List<Person> meetCriteria(List<Person> persons);
}
