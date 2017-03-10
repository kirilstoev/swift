
package pkg6_oopprinciples_debugging;

public class Credentials {

private String username;
private String password;

    public Credentials(String username, String password) {
        this.username = username;
        this.password = password;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        
        this.password = password;
    }

    public String getUsername() {
        return username;
    }
   
}
