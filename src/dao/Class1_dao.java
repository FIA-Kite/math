package dao;

import java.util.List;

import org.apache.ibatis.annotations.Select;

import entity.Class1;

public interface Class1_dao {
	@Select("select * from goods")
	public List<Class1> select();

}
