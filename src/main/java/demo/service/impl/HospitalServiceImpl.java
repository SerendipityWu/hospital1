package demo.service.impl;

import com.alibaba.fastjson.JSON;
import demo.mapper.hospital.HospitalMapper;
import demo.service.HospitalService;
import demo.pojo.Hospital;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.List;

@Service
@Transactional(rollbackFor = {Exception.class})
public class HospitalServiceImpl implements HospitalService {
    @Resource
    HospitalMapper hospitalMapper;
    @Resource
    StringRedisTemplate stringRedisTemplate;
    @Override
    @Transactional(readOnly = true)
    public List<Hospital> findAll() {
      if (!stringRedisTemplate.hasKey("hs")){
          List<Hospital> list = hospitalMapper.findAll();
          stringRedisTemplate.opsForValue().set("hs",JSON.toJSONString(list));
          return list;
      }else{
          String hospital = stringRedisTemplate.opsForValue().get("hs");
          List<Hospital> list=(List<Hospital>)JSON.parse(hospital);
          return list;
      }
    }
}
