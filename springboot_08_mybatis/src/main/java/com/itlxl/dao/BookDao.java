package com.itlxl.dao;

import com.itlxl.domain.Book;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

@Mapper
public interface BookDao {
    @Select("select * from tb_book where id = #{id}")
    Book getById(Integer id);
}
