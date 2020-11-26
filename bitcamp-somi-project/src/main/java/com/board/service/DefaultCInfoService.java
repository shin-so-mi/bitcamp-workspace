package com.board.service;

import java.util.List;

import com.board.dao.CInfoDao;
import com.board.domain.CInfo;

public class DefaultCInfoService implements CInfoService {

  CInfoDao cInfoDao;

  public DefaultCInfoService(CInfoDao cInfoDao) {
    this.cInfoDao = cInfoDao;
  }

  @Override
  public int delete(int no) throws Exception {
    return cInfoDao.delete(no);
  }

  @Override
  public int add(CInfo cInfo) throws Exception {
    return cInfoDao.insert(cInfo);
  }

  @Override
  public List<CInfo> list() throws Exception {
    return cInfoDao.find();
  }

  @Override
  public int update(CInfo cInfo) throws Exception {
    return cInfoDao.update(cInfo);
  }


}