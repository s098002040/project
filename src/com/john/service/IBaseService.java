package com.john.service;

import java.util.List;
import java.util.Map;

public interface IBaseService {
  
  public void save(Object obj);

  public void update(Object obj);

  public void delete(Object obj);

  public Object get(Class obj, int id);

  public List list(String sql);

  public void bulkUpdate(String query);
  
  public int loadCount(String hql, Map<String, Object> param);
  
  public List loadParam(String hql, int from, int to, Map<String, Object> param);
}
