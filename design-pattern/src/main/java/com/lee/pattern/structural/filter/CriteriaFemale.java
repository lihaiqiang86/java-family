package com.lee.pattern.structural.filter;

import java.util.ArrayList;
import java.util.List;

/**
 * @author lihaiqiang
 * @since 2020/9/4
 */
public class CriteriaFemale implements Criteria {

    @Override
    public List<Person> meetCriteria(List<Person> persons) {
        List<Person> femalePersons = new ArrayList<Person>();
        for (Person person : persons) {
            if (person.getGender().equalsIgnoreCase("FEMALE")) {
                femalePersons.add(person);
            }
        }
        return femalePersons;
    }
}
