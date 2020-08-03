package Service;

import Modelo.dao.LoginDAO;
import Modelo.entities.Users;
import java.util.List;

public class LoginService {

    private LoginDAO loginDAO;

    public LoginService() {
        loginDAO = new LoginDAO();
    }

    public Boolean login(String username, String password) {
        if (username.equals("")) {
            Util.messageWarning("Advertencia", "Username: * Requerido.");
        } else {
            Users user = getUserByUsername(username);
            if (user == null) {
                Util.messageError("Error inicio de sesión", "Username: * No encontrado");
            } else {
                if (user.getPassword().equals(password)) {
                    Util.messageInfo("Exito", "Usted ha iniciado session con exito");
                    return true;
                } else {
                    Util.messageError("Error inicio de sesión", "Password: * Incorrecto");
                }
            }
        }
        return false;
    }

    public Users AddUser(String username, String password, String passwordRepetir) {
        if (username.equals("")) {
            Util.messageError("Error", "Username: * Requerido");
            return null;
        }

        if (password.equals("")) {
            Util.messageError("Error", "Password: * Requerido");
            return null;
        }

        if (passwordRepetir.equals("")) {
            Util.messageError("Error", "Password repetir: * Requerido");
            return null;
        }

        if (getUserByUsername(username) == null) {

            if (password.equals(passwordRepetir)) {

                Users users = new Users(username, password, null);
                return loginDAO.AddUser(users);

            } else {
                Util.messageError("Agregar Usuario",
                        "Pasword: * Las contraseñas no coinciden.");
            }

        } else {
            Util.messageError("Agregar Usuario",
                    "Username: * Ya existe un usuario con el nombre. " + username);
        }
        return null;
    }

    public Users UpdateUser(String username, String password, String passwordRepetir) {
        if (password.equals("")) {
            Util.messageError("Error", "Password: * Requerido");
            return null;
        }

        if (!passwordRepetir.equals(password)) {
            Util.messageError("Error", "Password repetir: * Los password no coinciden.");
            return null;
        }

        Users user = getUserByUsername(username);
        user.setPassword(password);
        UpdateUser(user);

        return user;
    }

    public Users getUserByUsername(String username) {
        return loginDAO.getUserByUsername(username);
    }

    public List<Users> getUsers(String username) {
        return loginDAO.getUsers(username);
    }

    public void AddUser(Users user) {
        loginDAO.AddUser(user);
    }

    public void UpdateUser(Users user) {
        loginDAO.UpdateUser(user);
    }

    public void RemoveUser(Users user) {
        loginDAO.RemoveUser(user);
    }

}
