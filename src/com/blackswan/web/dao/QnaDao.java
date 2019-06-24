package com.blackswan.web.dao;

import java.sql.SQLException;
import java.util.List;

import com.blackswan.web.dao.oracle.QnaView;
public class QnaDao {
 List<QnaView> getList() throws ClassNotFoundException, SQLException;
 List<QnaView> getList(int page) throws ClassNotFoundException, SQLException;
 List<QnaView> getList(int page, String field, String query) throws ClassNotFoundException, SQLException;
 
 Qna get(int id) throws ClassNotFoundException, SQLException;
 Qna getPrev(int id) throws ClassNotFoundException, SQLException;
 Qna getNext(int id) throws ClassNotFoundException, SQLException;
 
 int insert(Qna qna) throws ClassNotFoundException, SQLException;
 int update(Qna qna) throws ClassNotFoundException, SQLException;
 int delete(int id) throws ClassNotFoundException, SQLException;
 int getLastId() throws ClassNotFoundException, SQLException;
}
