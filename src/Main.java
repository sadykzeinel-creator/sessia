public class UserManagement {
 

    private void validateData(String username, String email) {
        if (username == null || username.isEmpty()) {
            throw new IllegalArgumentException("Ошибка: имя пользователя не может быть пустым.");
        }
        if (email != null && email.isEmpty()) {
            throw new IllegalArgumentException("Ошибка: email не может быть пустым.");
        }
    }
 
    public void addUser(String username, String email) {
        validateData(username, email);
        System.out.println("Пользователь добавлен: " + username + " с email: " + email);
    }
 
    public void updateUser(String username, String email) {
        validateData(username, email);
        System.out.println("Пользователь обновлен: " + username + " с новым email: " + email);
    }
 
    public void deleteUser(String username) {
        validateData(username, null); 
        System.out.println("Пользователь удален: " + username);
    }
 
    public static void main(String[] args) {
        UserManagement manager = new UserManagement();
        try {
            manager.addUser("JohnDoe", "john.doe@example.com");
            manager.updateUser("JohnDoe", "john.new@example.com");
            manager.deleteUser("JohnDoe");
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
    }
}
