package com.daihao.mall.member.dao;

import com.daihao.mall.member.entity.MemberEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 会员
 * 
 * @author daihao
 * @email 651433368@qq.com
 * @date 2020-04-07 21:42:45
 */
@Mapper
public interface MemberDao extends BaseMapper<MemberEntity> {
	
}
