package security;

import java.util.List;

public interface IUser {
  List<String>  getRolesAsStrings();
  void addRole(String roleName);
  String getUserName();
  String getPassword();
  
}
