package com.sys.service;

import java.util.List;

public interface MainService<T> {
    
   T saveData(T data);
   T updateData(T data);
   void deleteData(long id);
   List<T> findAllData();
   T findById(long id);




}
