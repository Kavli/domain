package com.kavli.core.base.jdbc;

/**
 * Created by Administrator on 2017/3/7.
 */
import java.util.List;
import java.util.Map;

import com.kavli.core.exception.DaoException;
import org.springframework.jdbc.core.namedparam.SqlParameterSource;
import org.springframework.jdbc.support.KeyHolder;


public interface AbstractJdbcDao {

    /**
     * @param query
     * @param paramMap
     * @return
     * @throws DaoException
     */
    public List<Map<String, Object>> executeJdbcQuery(String query, Map<String, Object> paramMap) throws DaoException;

    /**
     * @param query
     * @param paramSource
     * @param generatedKeyHolder
     * @return
     * @throws DaoException
     */
    public int executeJdbcUpdate(String query, SqlParameterSource paramSource, KeyHolder generatedKeyHolder) throws DaoException ;


    /**
     * @param query
     * @param paramMap
     * @return
     * @throws DaoException
     */
    public int executeJdbcUpdate(String query, Map<String, Object> paramMap) throws DaoException;

    /**
     * @param query
     * @param paramMap
     * @return
     * @throws DaoException
     */
    public int executeSimpleQuery(String query, Map<String, String> paramMap) throws DaoException;

    /**
     * @param query
     * @param batchValues
     * @return
     * @throws DaoException
     */
    public int[] executeJdbcBatchUpdate(String query, Map<String, ?>[] batchValues) throws DaoException;

}
