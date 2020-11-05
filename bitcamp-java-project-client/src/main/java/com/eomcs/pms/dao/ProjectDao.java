package com.eomcs.pms.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import com.eomcs.pms.domain.Member;
import com.eomcs.pms.domain.Project;

public interface ProjectDao {
  int insert(Project project) throws Exception;
   
  int delete(int no) throws Exception;
    
  

  Project findByNo(int no) throws Exception;

 
  List<Project> findAll() throws Exception;

   int update(Project project) throws Exception;
}
 