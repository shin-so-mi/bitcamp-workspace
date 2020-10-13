package com.eomcs.pms.listener;

import java.io.File;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import com.eomcs.pms.domain.Board;
import com.eomcs.pms.domain.Member;
import com.eomcs.pms.domain.Project;
import com.eomcs.pms.domain.Task;

public class DataHandlerListener implements ApplicationCotextListener{

  List<Board> boardList = new ArrayList<>();
  File boardFile = new File("./board.json"); // 게시글을 저장할 파일 정보

  List<Member> memberList = new LinkedList<>();
  File memberFile = new File("./member.json"); // 회원을 저장할 파일 정보

  List<Project> projectList = new LinkedList<>();
  File projectFile = new File("./project.json"); // 프로젝트를 저장할 파일 정보

  List<Task> taskList = new ArrayList<>();
  File taskFile = new File("./task.json"); // 작업을 저장할 파일 정보

  @Override
  public void contextInitialized(Map<String,Object> context) {
    // 애플리케이션의 서비스가 시작되면 먼저 파일에서 데이터를 로딩한다.
    // 파일에서 데이터 로딩
    loadData(boardList, boardFile, Board[].class);
    loadData(memberList, memberFile, Member[].class);
    loadData(projectList, projectFile, Project[].class);
    loadData(taskList, taskFile, Task[].class);

    // 옵저버가 파일에서 데이터(게시글,회원,프로젝트,작업)를 읽어
    // List 컬렉션에 저장한 다음,
    // 발행자(App 객체)가 사용할 수 있도록 맵 객체에 담아서 공유한다.
    context.put("boardList", boardList);
    context.put("memberList", memberList);
    context.put("projectList", projectList);
    context.put("taskList", taskList);
  }

}
