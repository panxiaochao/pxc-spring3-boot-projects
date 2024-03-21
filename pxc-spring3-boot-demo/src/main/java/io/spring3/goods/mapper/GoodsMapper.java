package io.spring3.goods.mapper;

import io.spring3.goods.po.Goods;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * <p>  持久化接口 </p>
 *
 * @author Lypxc
 * @since 2024-02-07
 */
@Mapper
public interface GoodsMapper extends BaseMapper<Goods> {

}
