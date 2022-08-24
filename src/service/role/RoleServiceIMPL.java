package service.role;

import model.Role;
import model.RoleName;

import java.util.ArrayList;
import java.util.List;

public class RoleServiceIMPL implements IRoleService {

    static List<Role> roleList = new ArrayList<>();

    static {
        roleList.add(new Role(1, RoleName.ADMIN));
        roleList.add(new Role(2, RoleName.USER));
    }


    @Override
    public List<Role> findAll() {
        return roleList;
    }

    @Override
    public void save(Role role) {
        roleList.add(role);
    }

    @Override
    public Role findByRoleName(RoleName roleName) {
        for (Role role : roleList) {
            if (role.getRoleName() == roleName) {
                return role;
            }
        }
        return null;
    }
}
