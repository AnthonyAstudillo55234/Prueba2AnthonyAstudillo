public class pacienteH {
    String cedula;
    int numero_historial;
    String nombre;
    String apellido;
    String telefono;
    int edad;
    String descripcion_enfermedad;

    public pacienteH() {
    }

    public pacienteH(String cedula, int numero_historial, String nombre, String apellido, String telefono, int edad, String descripcion_enfermedad) {
        this.cedula = cedula;
        this.numero_historial = numero_historial;
        this.nombre = nombre;
        this.apellido = apellido;
        this.telefono = telefono;
        this.edad = edad;
        this.descripcion_enfermedad = descripcion_enfermedad;
    }

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public int getNumero_historial() {
        return numero_historial;
    }

    public void setNumero_historial(int numero_historial) {
        this.numero_historial = numero_historial;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getDescripcion_enfermedad() {
        return descripcion_enfermedad;
    }

    public void setDescripcion_enfermedad(String descripcion_enfermedad) {
        this.descripcion_enfermedad = descripcion_enfermedad;
    }
}


