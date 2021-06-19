package Modelo;

public record Usuario(String username, String password) {
    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

}
