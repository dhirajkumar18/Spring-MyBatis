package com.spring.mybatis.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Options;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import com.spring.mybatis.entity.User;

@Mapper
public interface UserMapper {
	
	@Select("SELECT * FROM users WHERE id = #{id}")
    User findById(int id);

	@Select("select * from users")  
	List<User> findAll();
	
	 @Insert("INSERT INTO users(name, email) VALUES(#{name}, #{email})")
	@Options(useGeneratedKeys = true, keyProperty = "id")
    void insert(User user);

    @Update("UPDATE users SET name=#{name}, email=#{email} WHERE id=#{id}")
    void update(User user);

    @Delete("DELETE FROM users WHERE id=#{id}")
    void delete(int id);
}
