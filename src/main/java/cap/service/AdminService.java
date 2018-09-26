package cap.service;

import cap.mapper.AdminMapper;
import cap.model.Admin;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class AdminService {
    @Resource
    private AdminMapper adminMapper;

    public Admin login(Admin admin){
        return adminMapper.selectBySelective(admin);
    }
}
