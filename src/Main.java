import java.util.Arrays;
import java.util.HashSet;
import java.util.Optional;
import java.util.Set;
import java.util.stream.Collectors;

public class Main {

  public static boolean isUserInRole(String user, String[] rolesName) {
    if (user == null) return false;

    Set<String> userRoles = getUserRoles(user);
    for (String roleName : rolesName) {
      if (userRoles.contains(roleName)) {
        return true;
      }
    }
    return false;
  }

  private static Set<String> getUserRoles(String userRoles) {
    return Optional.ofNullable(userRoles)
        .map(
            str ->
                Arrays.stream(str.trim().split(","))
                    .map(String::trim)
                    .filter(role -> !role.isEmpty())
                    .collect(Collectors.toCollection(HashSet::new)))
        .orElseGet(HashSet::new);
  }

  public static void main(String[] args) {
    System.out.println("Hello world!");
    Set<String> userSet = getUserRoles(null);
    System.out.println(userSet);
  }
}
