package jit.wxs.service.impl;

import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import jit.wxs.entity.Permission;
import jit.wxs.mapper.PermissionMapper;
import jit.wxs.service.IPermissionService;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author jitwxs
 * @since 2018-03-20
 */
@Service
public class PermissionServiceImpl extends ServiceImpl<PermissionMapper, Permission> implements IPermissionService {

}
