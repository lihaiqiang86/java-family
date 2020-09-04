package com.lee.pattern.structural.filter;

import java.util.List;

/**
 * @author lihaiqiang
 * @since 2020/9/4
 */
public interface Criteria {

    List<Person> meetCriteria(List<Person> persons);
}
