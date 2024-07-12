public class usuarioH {
    String usuario;
    String contrasenia;

    public usuarioH(String text, int his, String nombreText, String apellidoText, String telefonoText, int ed, String descripcionText) {
    }

    public usuarioH(String usuario, String contrasenia) {
        this.usuario = usuario;
        this.contrasenia = contrasenia;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getContrasenia() {
        return contrasenia;
    }

    public void setContrasenia(String contrasenia) {
        this.contrasenia = contrasenia;
    }

}
